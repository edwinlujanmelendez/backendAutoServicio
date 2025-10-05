package pe.movilbus.autoservicio.daoImpl;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Pattern;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.imageio.ImageIO;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.datacontract.schemas._2004._07.feservice.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import oracle.jdbc.pool.OracleDataSource;
import pe.movilbus.autoservicio.beans.AgenciaListSispas;
import pe.movilbus.autoservicio.beans.AgenciaSispas;
import pe.movilbus.autoservicio.beans.AsientoOcupado;
import pe.movilbus.autoservicio.beans.BodyMailFormat;
import pe.movilbus.autoservicio.beans.BodyPdfCorreo;
import pe.movilbus.autoservicio.beans.CanalVentaSispas;
import pe.movilbus.autoservicio.beans.CentroCostoSispas;
import pe.movilbus.autoservicio.beans.Cliente;
import pe.movilbus.autoservicio.beans.ClienteListSispas;
import pe.movilbus.autoservicio.beans.ClienteSispas;
import pe.movilbus.autoservicio.beans.CompaniaListSispas;
import pe.movilbus.autoservicio.beans.CompaniaSispas;
import pe.movilbus.autoservicio.beans.ConcesionarioSispas;
import pe.movilbus.autoservicio.beans.DatoSalidasEmbarque;
import pe.movilbus.autoservicio.beans.DatoTarifario;
import pe.movilbus.autoservicio.beans.FormaPagoSispas;
import pe.movilbus.autoservicio.beans.ItinerarioAgenciaPartidaIDSispas;
import pe.movilbus.autoservicio.beans.ItinerarioSispas;
import pe.movilbus.autoservicio.beans.JsonRest;
import pe.movilbus.autoservicio.beans.Liquidacion;
import pe.movilbus.autoservicio.beans.LiquidacionSispas;
import pe.movilbus.autoservicio.beans.LocalidadSispas;
import pe.movilbus.autoservicio.beans.ManifiestoSispas;
import pe.movilbus.autoservicio.beans.MensajeConfirmacionResult;
import pe.movilbus.autoservicio.beans.NacionalidadSispas;
import pe.movilbus.autoservicio.beans.OperadorTarjetaCreditoSispas;
import pe.movilbus.autoservicio.beans.Pasajero;
import pe.movilbus.autoservicio.beans.PasajeroSispas;
import pe.movilbus.autoservicio.beans.PersonalSispas;
import pe.movilbus.autoservicio.beans.PreferenciaAlimentariaSispas;
import pe.movilbus.autoservicio.beans.PromocionSispas;
import pe.movilbus.autoservicio.beans.ReimprimirBoleto;
import pe.movilbus.autoservicio.beans.RequestApiWS;
import pe.movilbus.autoservicio.beans.RptPromocion;
import pe.movilbus.autoservicio.beans.Ruta;
import pe.movilbus.autoservicio.beans.RutaSispas;
import pe.movilbus.autoservicio.beans.Secuencia;
import pe.movilbus.autoservicio.beans.SecuenciaTramo;
import pe.movilbus.autoservicio.beans.ServicioSispas;
import pe.movilbus.autoservicio.beans.TarjetaCreditoSispas;
import pe.movilbus.autoservicio.beans.TipoAgenciaSispas;
import pe.movilbus.autoservicio.beans.TipoComprobanteSispas;
import pe.movilbus.autoservicio.beans.TipoDocumentoSispas;
import pe.movilbus.autoservicio.beans.TipoFormaPagoSispas;
import pe.movilbus.autoservicio.beans.TipoMonedaSispas;
import pe.movilbus.autoservicio.beans.TipoMovimientoSispas;
import pe.movilbus.autoservicio.beans.UbigeoSispas;
import pe.movilbus.autoservicio.beans.UsuarioHardwareSispas;
import pe.movilbus.autoservicio.beans.UsuarioListSispas;
import pe.movilbus.autoservicio.beans.UsuarioSispas;
import pe.movilbus.autoservicio.beans.VentaPasaje;
import pe.movilbus.autoservicio.beans.VentaPasajeListSispas;
import pe.movilbus.autoservicio.beans.VentaPasajeSispas;
import pe.movilbus.autoservicio.beans.VentaPasajeros;
import pe.movilbus.autoservicio.beans.VentasGeneral;
import pe.movilbus.autoservicio.dao.MainDao;
import pe.movilbus.autoservicio.service.fe.VentaPasajeFE;
import pe.movilbus.autoservicio.service.fe.WSFE2;
import pe.movilbus.autoservicio.service.xml.XmlVentaPasaje;
import pe.movilbus.autoservicio.util.Constantes;
import pe.movilbus.autoservicio.util.Encriptar;
import pe.movilbus.autoservicio.util.Util;
import sun.misc.BASE64Encoder;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.BufferedReader;
import org.json.JSONObject;
import java.io.FileOutputStream;

@Repository
public class MainDaoImpl implements MainDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static String url_api = "";
	private static String userpassBase64 = "";
	
	//PRD
	//private static String archivos_temp = "//opt//tomcat9//webapps//backendAutoservicio//archivos_temp//";
	//private static String archivo_bioseguridad = "//opt//tomcat9//webapps//backendAutoservicio//archivo_bioseguridad//MOVIL BUS - PROTOCOLOS DE VIAJE.pdf";
	//DEV
	//private static String archivos_temp = "//opt//tomcat9//webapps//backendAutoservicioQA//archivos_temp//";
	//private static String archivo_bioseguridad = "//opt//tomcat9//webapps//backendAutoservicioQA//archivo_bioseguridad//MOVIL BUS - PROTOCOLOS DE VIAJE.pdf";
	//LOCAL
	private static String archivos_temp = "D:\\Proyectos MovilBus\\backend_autoservicio\\src\\main\\webapp\\archivos_temp\\";
	private static String archivo_bioseguridad = "D:\\Proyectos MovilBus\\backend_autoservicio\\src\\main\\webapp\\archivo_bioseguridad\\MOVIL BUS - PROTOCOLOS DE VIAJE.pdf";
	
	public static Connection connection(){
	    Connection conn = null;
	    try {
	      OracleDataSource ds = new OracleDataSource();
	      //ds.setURL("jdbc:oracle:thin:@192.168.10.224:1521:MOVIL");				//PRD SISPAS
	      //conn = ds.getConnection("pasajes", "movil16");						//PRD SISPAS
	      ds.setURL("jdbc:oracle:thin:@192.168.10.21:1521:movildev");			//DEV
	      conn = ds.getConnection("pasajes", "PsjMB$252");					//DEV
	      return conn;
	    } catch (SQLException e) {
	      e.printStackTrace();
	      return conn;
	    }
	}
	
	public static void ConseguirConstantes(){
		try{
			String sql = " select t1.c_valor, t2.c_valor, t3.c_valor "+
						 " from "+
						 " (select vrm1.c_valor from vrmflag vrm1 where vrm1.c_codigo='FEAPI_URL') t1, "+
						 " (select vrm2.c_valor from vrmflag vrm2 where vrm2.c_codigo='FEAPI_USER') t2, "+
						 " (select vrm3.c_valor from vrmflag vrm3 where vrm3.c_codigo='FEAPI_PASSWD') t3 ";
			
			Connection conx = connection();
			Statement stmt = conx.createStatement();
			ResultSet rs1 = stmt.executeQuery(sql);
			
			while(rs1.next()){
				url_api = rs1.getString(1);
				userpassBase64 = new String(org.apache.commons.codec.binary.Base64.encodeBase64((rs1.getString(2)+":"+rs1.getString(3)).getBytes()));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Override
	public List<DatoSalidasEmbarque> getSalidasEmbarque(int localidad_origen){
		List<DatoSalidasEmbarque> datoSalidasEmbarque = new ArrayList<DatoSalidasEmbarque>();
		
		try{
			int cont = 300;
	    	
		    do {
		        cont += 60;
				String sql = " SELECT * FROM ( "+
							 " SELECT i.itinerario_id, b.c_codigo, "+
							 "   CASE "+
							 "     WHEN SUBSTR(S.C_DENOMINACION,0,5) = 'EJECU' THEN 'EJECUTIVO VIP' "+
							 "     WHEN SUBSTR(S.C_DENOMINACION,0,5) = 'PRESI' THEN 'PRESIDENCIAL' "+
							 "     WHEN SUBSTR(S.C_DENOMINACION,0,5) = 'PREMI' THEN 'PREMIER' "+
							 "     WHEN SUBSTR(S.C_DENOMINACION,0,5) = 'ECONO' THEN 'ECONÓMICO' "+
							 "   END AS TIPO_SERVICIO, "+
							 "   r.c_origen origen, ao.c_nomcor age_partida, to_char(di.d_fecpar, 'DD/MM/YYYY') fecha_partida, di.c_horpar, "+
							 "   r.c_destino destino, ad.c_nomcor age_llegada, to_char(di.d_feclle, 'DD/MM/YYYY') fecha_llegada, di.c_horlle, "+
							 "   i.c_sectra, "+
							 "   CASE "+
							 "     WHEN i.c_desc_escalas IS NULL THEN '-' "+
							 "     ELSE i.c_desc_escalas "+
							 "   END AS escalas, "+
							 " di.d_fecsalida, di.c_horsalida, di.n_puerta, itiagepar.c_horsalida horasalidaagencia, itiagepar.n_puerta puertaagencia "+
							 " FROM vrtitinerario i "+
							 " INNER JOIN vrtdetiti di ON di.itinerario_id = i.itinerario_id "+
							 " LEFT JOIN vrmbus b ON b.bus_id = i.bus_id "+
							 " INNER JOIN vrmservicio s ON s.servicio_id = i.servicio_id "+
							 " INNER JOIN vrmruta r ON r.ruta_id = di.ruta_id "+
							 " INNER JOIN vrmagencia ao ON ao.agencia_id = di.agencia_idpartida "+
							 " INNER JOIN vrmagencia ad ON ad.agencia_id = di.agencia_idllegada "+
							 " INNER JOIN vrtitiagepar itiagepar ON itiagepar.itinerario_id = i.itinerario_id and itiagepar.agencia_id = di.agencia_idpartida "+
							 " WHERE "+
							 "   r.localidad_idorigen = "+localidad_origen+
							 "   AND r.c_destino = NVL(NULL, r.c_destino) "+
							 "   AND s.c_denominacion = NVL(NULL, s.c_denominacion) "+
							 "   AND i.N_EsAnulado = 0 "+
							 "   AND i.C_EstReg = 'A' "+
							 "   AND TO_DATE(TO_CHAR(di.d_fecpar,'dd/mm/yyyy') || ' ' || di.c_horpar, 'dd/MM/yyyy hh24:mi:ss') "+
							 "       BETWEEN SYSDATE - (30/1440) AND SYSDATE + ("+cont+"/1440) "+																//entre 30 minutos antes y 1 hora después
							 "   AND i.ruta_idmayor = di.ruta_id "+
							 " ORDER BY di.d_fecpar, TO_DATE(di.c_horpar,'HH24:MI'), di.d_feclle, TO_DATE(di.c_horlle,'HH24:MI') "+
							" ) "+
							" WHERE ROWNUM <= 15";
							
				datoSalidasEmbarque = jdbcTemplate.query(sql, new DatoSalidasEmbarqueRowMapper());
		    } while (datoSalidasEmbarque.size() != 15 && cont <= 720);
			
			return datoSalidasEmbarque;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return datoSalidasEmbarque;
	}
	
	
	@Override
	public List<DatoTarifario> getTarifario(String rutas_id){
		List<DatoTarifario> datoTarifario = new ArrayList<DatoTarifario>();
		
		try{		
			String sql = " SELECT * FROM ( "+
						 " SELECT di.itinerario_id, di.ruta_id, b.c_codigo, "+
						 "   CASE "+
						 "     WHEN SUBSTR(S.C_DENOMINACION,0,5) = 'EJECU' THEN 'EJECUTIVO VIP' "+
						 "     WHEN SUBSTR(S.C_DENOMINACION,0,5) = 'PRESI' THEN 'PRESIDENCIAL' "+
						 "     WHEN SUBSTR(S.C_DENOMINACION,0,5) = 'PREMI' THEN 'PREMIER' "+
						 "     WHEN SUBSTR(S.C_DENOMINACION,0,5) = 'ECONO' THEN 'ECONÓMICO' "+
						 "   END AS TIPO_SERVICIO, "+
						 "   r.c_origen origen, ao.c_nomcor age_partida, to_char(di.d_fecpar, 'DD/MM/YYYY') fecha_partida, di.c_horpar, "+
						 "   r.c_destino destino, ad.c_nomcor age_llegada, to_char(di.d_feclle, 'DD/MM/YYYY') fecha_llegada, di.c_horlle, "+
						 "   i.c_sectra, "+
						 "   CASE "+
						 "     WHEN i.c_desc_escalas IS NULL THEN '-' "+
						 "     ELSE i.c_desc_escalas "+
						 "   END AS escalas, "+
						 "   S.N_NUMPIS nropiso, "+
						 "   vtip1.c_denominacion as tipo_tarifa1, vtx.n_tarifa1, NVL(vtip2.c_denominacion,'NO TIENE') as tipo_tarifa2, vtx.n_tarifa2 "+
						 " FROM vrtitinerario i "+
						 " INNER JOIN vrtdetiti di ON di.itinerario_id = i.itinerario_id "+
						 " LEFT JOIN vrmbus b ON b.bus_id = i.bus_id "+
						 " INNER JOIN vrmservicio s ON s.servicio_id = i.servicio_id "+
						 " INNER JOIN vrmruta r ON r.ruta_id = di.ruta_id "+
						 " INNER JOIN vrmagencia ao ON ao.agencia_id = di.agencia_idpartida "+
						 " INNER JOIN vrmagencia ad ON ad.agencia_id = di.agencia_idllegada "+
						 " LEFT JOIN vrttarifaxnivel vtx ON vtx.itinerario_id = di.itinerario_id and vtx.ruta_id = di.ruta_id and vtx.canven_id = 3 "+
						 " LEFT JOIN vrmtiptar vtip1 ON vtip1.tiptar_id = vtx.tiptar_id1 "+
						 " LEFT JOIN vrmtiptar vtip2 ON vtip2.tiptar_id = vtx.tiptar_id2 "+
						 " WHERE "+
						 "   r.ruta_id in ("+rutas_id+") "+
						 "   AND r.c_destino = NVL(NULL, r.c_destino) "+
						 "   AND s.c_denominacion = NVL(NULL, s.c_denominacion) "+
						 "   AND i.N_EsAnulado = 0 "+
						 "   AND i.C_EstReg = 'A' "+
						 "   AND TO_DATE(TO_CHAR(di.d_fecpar,'dd/mm/yyyy') || ' ' || di.c_horpar, 'dd/MM/yyyy hh24:mi:ss') "+
						 "       BETWEEN SYSDATE AND SYSDATE + 1 "+
						 "   AND vtx.n_tarifa1 IS NOT NULL "+
						 " AND (s.n_numasipis1+NVL(s.n_numasipis2,0) - ( "+
						 " (SELECT COUNT(*) "+
						 "  FROM vrtvenpas vp "+
						 "  WHERE vp.itinerario_id = I.ITINERARIO_ID "+
						 "    AND vp.D_FECPAR = di.d_fecpar "+
						 "    AND (vp.n_esfe = 1 OR vp.c_estdoc = 'PAG') "+
						 "    AND vp.tipmov_id NOT IN (5,6,13,14) "+
						 "    AND vp.n_tarifa <> 0 "+
						 " ) "+
						 " - "+
						 " (SELECT COUNT(*) "+
						 "  FROM vrtvenpas vp "+
						 "  WHERE vp.itinerario_id = I.ITINERARIO_ID "+
						 "    AND vp.D_FECPAR = di.d_fecpar "+
						 "    AND (vp.n_esfe = 1 OR vp.c_estdoc = 'PAG') "+
						 "    AND vp.tipmov_id IN (5,6,13,14) "+
						 "    AND vp.n_tarifa <> 0 "+
						 " ) "+
						 " )) > 0 "+
						 " ORDER BY di.d_fecpar, TO_DATE(di.c_horpar,'HH24:MI'), di.d_feclle, TO_DATE(di.c_horlle,'HH24:MI') "+
						" ) "+
						" WHERE ROWNUM <= 15";
			
			datoTarifario = jdbcTemplate.query(sql, new DatoTarifarioRowMapper());
			
			return datoTarifario;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return datoTarifario;
	}
	
	@Override
	public List<ReimprimirBoleto> getReimprimirBoleto(String nroDocumento){
		List<ReimprimirBoleto> reimprimirBoleto = new ArrayList<ReimprimirBoleto>();
		
		try{
			String sql = " SELECT vp.venpas_id, r.c_origen, r.c_destino, p.c_apepat, p.c_apemat, p.c_nombre, p.c_nomape, vs.c_nomcor, vp.d_fecpar, vp.c_horpar, "+
						 " vp.c_horlle, vp.n_numasiento, agp.c_direccion, agl.c_direccion, vp.tipmov_id, tm.c_denominacion, vp.c_numboleto , (vp.n_tarifa+vp.n_recargo-vp.n_descuento) importe, "+
						 " vp.venpas_idoriginal, e.empresa_id, e.c_razsoc "+
						 " FROM vrtvenpas vp "+
						 " INNER JOIN vrmpasajero p ON p.pasajero_id=vp.pasajero_id "+
						 " INNER JOIN vrmruta r ON r.ruta_id=vp.ruta_id "+
						 " INNER JOIN vrmtipmov tm ON tm.tipmov_id=vp.tipmov_id "+
						 " INNER JOIN vrmempresa e ON e.empresa_id=vp.empresa_id "+
						 " INNER JOIN vrmservicio vs ON vs.servicio_id=vp.servicio_id "+
						 " INNER JOIN vrmagencia agp ON agp.agencia_id =vp.agencia_idpartida "+
						 " INNER JOIN vrmagencia agl ON agl.agencia_id =vp.agencia_idllegada "+
						 " WHERE vp.tipcom_id IN (2,7)  AND vp.tipmov_id NOT IN(5,6,13,14) "+
						 " AND vp.c_tiptra='1' "+
						 " AND p.c_numdoc LIKE '"+nroDocumento+"%' "+
						 " AND vp.d_fecpar>=trunc(sysdate) "+
						 " AND vp.venpas_id = any(SELECT MAX(vrt2.venpas_id) venpas_id  FROM vrtvenpas vrt2 where vrt2.c_numcontrol=vp.c_numcontrol)  ORDER BY p.c_nomape";
			
			reimprimirBoleto = jdbcTemplate.query(sql, new ReimprimirBoletoRowMapper());
			
			return reimprimirBoleto;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return reimprimirBoleto;
	}
	
	@Override
	public String getDescargarPdf(int venpas_id){
		String val = "";
		
		try{
			VentaPasajeSispas ventaPasajeRETORNO;
			
			List<VentaPasajeSispas> ventasIdaRetorno = new ArrayList<VentaPasajeSispas>();
			
			ventaPasajeRETORNO = buscarVentaById(new Long(venpas_id));
			ventasIdaRetorno.add(ventaPasajeRETORNO);
			
			val = new WSFE2().sendVenta3(connection(), ventasIdaRetorno);
			
			return val;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return val;
	}
	
	@Override
	public int enviarPdfCorreo(BodyPdfCorreo datos){
		int val = 0;
		
		try{
			ConseguirConstantes();
			
			List<String> lista_boletos_facturas = new ArrayList<String>();
			
			for(int ab=0; ab<datos.getBoleto_factura().size(); ab++){
				lista_boletos_facturas.add(datos.getBoleto_factura().get(ab));
			}
			
			val = descargarPdfApi(lista_boletos_facturas, 0, datos.getCorreo());
			
			return val;
		}catch(Exception e){
			e.printStackTrace();
			return val;
		}
	}
	
	public int buscarCantidadPasajesComprados(int idPromocion, int idItinerario){
		int val1 = 0;
		int val2 = 0;
		
		String sql = " select count(*) from vrtvenpas vp "+
			" where vp.itinerario_id="+idItinerario+" AND vp.tipcom_id in (2,7) AND vp.c_tiptra=1 "+                    
				     " and vp.venpas_id = any(SELECT MAX(vrt2.venpas_id) venpas_id FROM "+ 
				                                  " vrtvenpas vrt2 where vrt2.c_numcontrol=vp.c_numcontrol) "+
				    "  and vp.tipmov_id not in (5,6,13,14) "+
					 " and vp.promocion_id in ("+
					 				" select promocion_id from vrmpromocion where grupo_cupones=(select grupo_cupones from vrmpromocion where promocion_id="+idPromocion+")) ";
				
		val1 = jdbcTemplate.queryForObject(sql, Integer.class);
		
		/********************************* SISPAS *********************************/
		
		/********************************* ECOMMERCE *********************************/
		sql = " select count(vp.venpas_id) from vrtvenpas vp "+
			  " where vp.itinerario_id="+idItinerario+" and vp.result_ws_id=3 and vp.name_promocion is not null "+
			  " and vp.name_promocion in (select nombre from vrmpromociones WHERE grupo_cupones=(select grupo_cupones from vrmpromocion where promocion_id="+idPromocion+") group by nombre)";
		//System.out.println(sql);
		val2 = jdbcTemplate.queryForObject(sql, Integer.class);
		/********************************* ECOMMERCE *********************************/
		
		return val1 + val2;
	}
	
	public int buscarStockPorBus(int idPromocion){
		int val = 0;
		
		String sql = " select CASE WHEN vg.stock is null "+
				     " THEN 99 "+
				     " ELSE vg.stock END AS stockMaximo from vrmpromocion vp "+
				     " left join vrmgrupocupones vg on vg.grupocupones_id=vp.grupo_cupones where vp.promocion_id="+idPromocion;
		
		val = jdbcTemplate.queryForObject(sql, Integer.class);
		
		return val;
	}
	
	@Override
	public List<RptPromocion> getPromocionesSispas(int itinerarioIda, int rutaIda, String fechaRutaIda, int itinerarioVuelta, int rutaVuelta, String fechaRutaVuelta){
		List<RptPromocion> rptPromocion = new ArrayList<RptPromocion>();
		
		try{
			String sql = "";
			
			sql = " select promocion_id, c_denominacion, c_rutas, c_servicios, c_punven, c_canven, c_pasnue, c_canviapas, c_asientos, c_edapas, c_cliente, c_idavue, "+
				  " n_valdes, c_tipdes, n_porimp, c_forpag, c_tippag, c_tarcre, c_entemp, c_paxfre, d_fecini, d_fecfin, c_expresion, c_beneficio, n_esacumulable, n_estarifa, "+
				  " c_horpar, c_tiptar, c_tipasi, grupo_cupones from vrmpromocion where c_denominacion like '%IBK%' and c_rutas like '%"+rutaIda+"%' and d_fecini<=to_date('"+fechaRutaIda+"','yyyy-mm-dd') and d_fecfin>=to_date('"+fechaRutaIda+"','yyyy-mm-dd') and c_canven like '%3%' and c_estreg='A' and tipo_sistema=2";
			//System.out.println(sql);
			List<PromocionSispas> promocionSispas1 = jdbcTemplate.query(sql, new PromocionSispasRowMapper());
			
			if(promocionSispas1.size() > 0){
				for(int a=0; a<promocionSispas1.size(); a++){
					int cantidadPasajesComprados = buscarCantidadPasajesComprados(promocionSispas1.get(a).getId().intValue(), itinerarioIda);
					int stockPorBus = buscarStockPorBus(promocionSispas1.get(a).getId().intValue());
					
					int stockDisponible = 0;
					if(cantidadPasajesComprados >= stockPorBus){
						stockDisponible = stockPorBus;
					}else{
						stockDisponible = stockPorBus - cantidadPasajesComprados;
					}
					
					RptPromocion subRptPromocion = new RptPromocion();
					subRptPromocion.setIdaVuelta("IDA");
					subRptPromocion.setPromocion_id(new BigDecimal(promocionSispas1.get(a).getId()));
					subRptPromocion.setC_denominacion(promocionSispas1.get(a).getDenominacion());
					subRptPromocion.setC_tarcre(promocionSispas1.get(a).getTarjetaCredito());
					subRptPromocion.setN_valdes(promocionSispas1.get(a).getValorDescuento());
					subRptPromocion.setStock(stockDisponible);
					rptPromocion.add(subRptPromocion);
				}
			}
			
			if(itinerarioVuelta != 0){
				sql = " select promocion_id, c_denominacion, c_rutas, c_servicios, c_punven, c_canven, c_pasnue, c_canviapas, c_asientos, c_edapas, c_cliente, c_idavue, "+
					  " n_valdes, c_tipdes, n_porimp, c_forpag, c_tippag, c_tarcre, c_entemp, c_paxfre, d_fecini, d_fecfin, c_expresion, c_beneficio, n_esacumulable, n_estarifa, "+
					  " c_horpar, c_tiptar, c_tipasi, grupo_cupones from vrmpromocion where c_denominacion like '%IBK%' and c_rutas like '%"+rutaVuelta+"%' and d_fecini<=to_date('"+fechaRutaVuelta+"','yyyy-mm-dd') and d_fecfin>=to_date('"+fechaRutaVuelta+"','yyyy-mm-dd') and c_canven like '%3%' and c_estreg='A'";
				
				List<PromocionSispas> promocionSispas2 = jdbcTemplate.query(sql, new PromocionSispasRowMapper());
				
				if(promocionSispas2.size() > 0){
					for(int a=0; a<promocionSispas2.size(); a++){
						int cantidadPasajesComprados = buscarCantidadPasajesComprados(promocionSispas2.get(a).getId().intValue(), itinerarioVuelta);
						int stockPorBus = buscarStockPorBus(promocionSispas2.get(a).getId().intValue());
						
						int stockDisponible = 0;
						if(cantidadPasajesComprados >= stockPorBus){
							stockDisponible = stockPorBus;
						}else{
							stockDisponible = stockPorBus - cantidadPasajesComprados;
						}
						
						RptPromocion subRptPromocion = new RptPromocion();
						subRptPromocion.setIdaVuelta("VUELTA");
						subRptPromocion.setPromocion_id(new BigDecimal(promocionSispas2.get(a).getId()));
						subRptPromocion.setC_denominacion(promocionSispas2.get(a).getDenominacion());
						subRptPromocion.setC_tarcre(promocionSispas2.get(a).getTarjetaCredito());
						subRptPromocion.setN_valdes(promocionSispas2.get(a).getValorDescuento());
						subRptPromocion.setStock(stockDisponible);
						rptPromocion.add(subRptPromocion);
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return rptPromocion;
	}
	
	@Override
	public String consumirServicio(){
		try{
			/*String path = this.getClass().getClassLoader().getResource("").getPath();
			String fullPath = URLDecoder.decode(path, "UTF-8");
			String url1 = new File(fullPath).getPath();
			
			File currDir = new File(".");
			String url2 = currDir.getAbsolutePath();
			
			return url1+"  ------  "+url2;*/
			
			/***********************************************************************************************/			
			String fecha1 = "Tue Oct 22 15:16:42 COT 2024";
			String fecha2 = "1729626213000";
			
			SimpleDateFormat conver = new SimpleDateFormat("yyyy-MM-dd");
			Date fecha;
				        
	        
			//String strDate = "2015-08-04";
			//LocalDate aLD = LocalDate.parse(fecha1);
			//DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd MMM uuuu");
			//System.out.println(aLD + " formats as " + dTF.format(aLD));
			
			/***********************************************************************************************/
			
			Date date = new Date();
			System.out.println(date);
			
		    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
		    String strDate = formatter.format(date);  
		    System.out.println("Date Format with yyyy-MM-dd : "+strDate);
			
			/***********************************************************************************************/
			
//			String sql = "SELECT to_char(sysdate,'dd/mm/yyyy hh24:mi:ss') DateSystem FROM dual";
//			
//			Statement stmt = connection().createStatement();
//			ResultSet rs  = stmt.executeQuery(sql);
//			String fecha = "";
//			
//			while(rs.next()){
//				fecha = rs.getString(1);
//			}
//			
//			rs.close();
//			stmt.close();
//			
//			return fecha.substring(1, fecha.length()-1);
			
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public MensajeConfirmacionResult getVerificarCajaAbierta(int idUsuario, int idAgencia){
		try{
			String sql = " select liquidacion_id, n_anio, agencia_id, usuario_id, c_nomusu, d_fecliq, n_moning, n_estliq, liqofi_id from vrtliquidacion where usuario_id="+idUsuario+
						 " and agencia_id="+idAgencia+" and n_estliq="+Constantes.LIQUI_ESTA_ABIERTO+" and c_estreg='"+Constantes.ACTIVO+"'";
			
			List<Liquidacion> liquidacion = jdbcTemplate.query(sql, new LiquidacionRowMapper());
			
			if(liquidacion.size() > 0){
				return new MensajeConfirmacionResult(Constantes.RESULT_TRUE, liquidacion.get(0).getD_fecliq().toString());
			}else{
				return new MensajeConfirmacionResult(Constantes.RESULT_FALSE, "No hay liquidación.");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new MensajeConfirmacionResult(Constantes.RESULT_FALSE, "No hay liquidación.");
	}
	
	@Override
	public List<String> getUsuariosSispas(int idAgencia){
		try{
			String sql = " select vmusu.c_login from vrmusuario vmusu"+
						 " inner join vrtusuhard vtusu on vtusu.usuhard_id=vmusu.usuhard_id"+
						 " inner join vrmagencia vmage on vmage.agencia_id=vtusu.agencia_id"+
						 " where vmage.localidad_id="+idAgencia+" and vmage.n_esterminal=1 and vmusu.c_codigo='AUTOSERVI.'";
			
			List<String> ltsUsuarios = jdbcTemplate.query(sql, new StringRowMapper());
			
			return ltsUsuarios;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public int validarUsuarioSispas(String usuario, String password){
		try{
			String sql = " select c_password from vrmusuario where c_login='"+usuario+"'";
			String c_password = jdbcTemplate.queryForObject(sql, new StringRowMapper());
			
			String pass = Encriptar.decodifica(c_password, usuario);
			
			if(pass.equals(password)){
				sql = " select vmage.agencia_id from vrmusuario vmusu"+
					  " inner join vrtusuhard vtusu on vtusu.usuhard_id=vmusu.usuhard_id"+
					  " inner join vrmagencia vmage on vmage.agencia_id=vtusu.agencia_id"+
					  " where vmage.n_esterminal=1 and vmusu.c_login='"+usuario+"' and ROWNUM = 1";
				
				return jdbcTemplate.queryForObject(sql, new IntegerRowMapper());
			}else{
				return 0;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return 0;
	}
	
	@Override
	public int getIdUsuarioSispas(String usuario){
		try{
			String sql = " select usuario_id from vrmusuario where c_login='"+usuario+"'";
			return jdbcTemplate.queryForObject(sql, new IntegerRowMapper());
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return 0;
	}
	
	@Override
	public String generarVentaSispas(VentasGeneral venta){
		String sql = "";
		String val = "";
		
		//long startTime1 = System.currentTimeMillis();
				
		/*------------------------ Evitar Duplicidad de Pasajeros -----------------------*/
		List<String> lstPasajero = new ArrayList<String>();
		String numDocPasajero = new String();
		
		for(VentaPasajeros obj : venta.getVentaPasajeros()){
			numDocPasajero = new String();
			numDocPasajero = obj.getVentaIda().getPasajero().getNumDocumento();
			lstPasajero.add(numDocPasajero);
			
			if(obj.getVentaVuelta() != null ) {
				numDocPasajero = new String();
				numDocPasajero = obj.getVentaVuelta().getPasajero().getNumDocumento();
				lstPasajero.add(numDocPasajero);
			}
		}
		
		Set<String> s= new HashSet<String>();
	    s.addAll(lstPasajero);
	    lstPasajero = new ArrayList<String>();
	    lstPasajero.addAll(s);
	    						
		for(VentaPasajeros obj : venta.getVentaPasajeros()){
			for(int a=0; a<lstPasajero.size(); a++){
				int cont = 0;
				
		    	if(obj.getVentaIda().getPasajero().getNumDocumento().equals(lstPasajero.get(a))){
		    		actualizarPasajero(obj.getVentaIda().getPasajero());
		    		actualizarTelefonoPasajero(obj.getVentaIda().getPasajero(), obj.getVentaIda().getTelefonoOpcional());
		    		cont = 1;
		    	}
		    	
		    	if(obj.getVentaVuelta() != null && cont==0) {
					if(obj.getVentaVuelta().getPasajero().getNumDocumento().equals(lstPasajero.get(a))){
						actualizarPasajero(obj.getVentaVuelta().getPasajero());
						actualizarTelefonoPasajero(obj.getVentaVuelta().getPasajero(), obj.getVentaVuelta().getTelefonoOpcional());
			    	}
				}
		    }
		}
		/*------------------------ Evitar Duplicidad de Pasajeros -----------------------*/
				
//		// Verificar que no tenga asientos vendidos o reservados (Ventas de Ida y Vuelta)
//		for(VentaPasajeros obj : venta.getVentaPasajeros()){
//			// Validacion de un pasajero en Venta-Ida
//			if(obj.getVentaIda() != null){
//				// Validar que el itinerario este disponible
//				sql = " SELECT  c_sectra FROM pasajes.VRTITINERARIO "+
//							  " WHERE ITINERARIO_ID="+obj.getVentaIda().getIdItinerario()+
//							    " AND N_ESANULADO="+Constantes.ACTIVO_ITINERARIO;
//				List<String> ItiActivoTramo = jdbcTemplate.query(sql, new StringRowMapper());
//				if(ItiActivoTramo.size() > 0){
//					// Validando que el asiento no esta utilizado
//					sql = " select to_char(NVL(tmp.n_asiento,0),'99') asiento, tmp.n_numpiso piso, "+ 
//							   "      r.LOCALIDAD_IDORIGEN, r.LOCALIDAD_IDDESTINO    "+     
//							   " 		    FROM pasajes.VRTTMPOCUASI TMP     "+    				   		  
//							   " 	    inner join pasajes.vrmruta r on r.ruta_id=tmp.ruta_id   "+      
//							   " 	    where tmp.itinerario_id = "+obj.getVentaIda().getIdItinerario()+
//							   			" and tmp.ruta_id = "+obj.getVentaIda().getIdRuta()+
//							   			" and tmp.N_ASIENTO ="+obj.getVentaIda().getNroAsiento()+
//							   			" and tmp.N_NUMPISO ="+obj.getVentaIda().getNroPiso()+
//							   			" and tmp.d_fecexpblo <= sysdate "+ 
//							   " union all "+ 
//							   " select to_char(nvl(vp.n_numasiento,0),'99') asiento, vp.n_numpiso piso, "+ 
//							   "     r.LOCALIDAD_IDORIGEN, r.LOCALIDAD_IDDESTINO "+ 
//							   "  FROM pasajes.VRTVENPAS VP    				 "+ 
//							   "   INNER JOIN ( SELECT MAX(VENPAS_ID) VENPAS_ID,C_NUMCONTROL  FROM pasajes.VRTVENPAS    "+      				  
//							   "   WHERE itinerario_id = "+obj.getVentaIda().getIdItinerario()+" GROUP BY C_NUMCONTROL) VENTAPJ ON VENTAPJ.VENPAS_ID=VP.VENPAS_ID    "+  
//							   "  inner join pasajes.vrmruta r on r.ruta_id=vp.ruta_id      "+ 
//							   "   WHERE VP.ITINERARIO_ID = "+obj.getVentaIda().getIdItinerario()+
//							   	   " AND VP.TIPMOV_ID NOT IN ("+Constantes.ID_TIPMOV_ANULACION_SISTEMA+","+
//										   	+Constantes.ID_TIPMOV_DEVOLUCION+","+
//										   	 Constantes.ID_TIPMOV_ANULACION+","+Constantes.ID_TIPMOV_DEV_EMPRESA+") "+
//								   " AND VP.N_NUMASIENTO = "+obj.getVentaIda().getNroAsiento()+" AND VP.N_NUMPISO = "+obj.getVentaIda().getNroPiso();
//					
//					List<AsientoOcupado> lstAsientoOcupado = jdbcTemplate.query(sql, new AsientoOcupadoRowMapper());
//					
//					if(lstAsientoOcupado.size() > 0) {
//						sql="SELECT r.localidad_idorigen, localidad_iddestino FROM pasajes.VRMRUTA r "+
//							" WHERE r.ruta_id="+obj.getVentaIda().getIdRuta();
//						List<Ruta> lstRuta = jdbcTemplate.query(sql, new RutaRowMapper());
//						
//						if(lstRuta.size() > 0){
//							List<SecuenciaTramo> listaTramo = obtenerSecuencia(ItiActivoTramo.get(0));
//							// Obtenemos el subconjunto que queremos buscar segun la ruta seleccionada				
//							List<Integer> subConjuntoBuscar = obtenerSubconjunto(listaTramo, lstRuta.get(0).getIdLocOrigen(),lstRuta.get(0).getIdLocDestino());						
//							lstAsientoOcupado = obtenerConjuntos(lstAsientoOcupado, listaTramo);
//							
//							if(validacionAsientoBloqueado(obj.getVentaIda().getNroAsiento()+"-"+obj.getVentaIda().getNroPiso(),lstAsientoOcupado,subConjuntoBuscar)) 
//								return null; 			//System.out.pritln("EL ASIENTO DE IDA  NO ESTA DISPONIBLE.")
//						} else return null; 			//System.out.pritln("LA RUTA DE IDA  SELECCIONADA NO EXISTE.")
//					}
//				} else return null; 					//System.out.pritln("EL ITINERARIO DE IDA NO ESTA DISPONIBLE.")
//			} else return null; 						//System.out.pritln("NO HAY VENTA DE IDA.")
//			
//			// Validacion de un pasajero en Venta-Vuelta
//			if(obj.getVentaVuelta() != null){
//				// Validar que el itinerario este disponible
//				sql = " SELECT  c_sectra FROM pasajes.VRTITINERARIO "+
//							  " WHERE ITINERARIO_ID="+obj.getVentaVuelta().getIdItinerario()+
//							    " AND N_ESANULADO="+Constantes.ACTIVO_ITINERARIO;
//				List<String> ItiActivoTramoVuelta = jdbcTemplate.query(sql, new StringRowMapper());
//				if(ItiActivoTramoVuelta.size() > 0){
//					// Validando que el asiento no esta utilizado
//					sql = " select to_char(NVL(tmp.n_asiento,0),'99') asiento, tmp.n_numpiso piso, "+ 
//							   "      r.LOCALIDAD_IDORIGEN, r.LOCALIDAD_IDDESTINO    "+     
//							   " 		    FROM pasajes.VRTTMPOCUASI TMP     "+    				   		  
//							   " 	    inner join pasajes.vrmruta r on r.ruta_id=tmp.ruta_id   "+      
//							   " 	    where tmp.itinerario_id = "+obj.getVentaVuelta().getIdItinerario()+
//							   			" and tmp.ruta_id = "+obj.getVentaVuelta().getIdRuta()+
//							   			" and tmp.N_ASIENTO ="+obj.getVentaVuelta().getNroAsiento()+
//							   			" and tmp.N_NUMPISO ="+obj.getVentaVuelta().getNroPiso()+
//							   			" and tmp.d_fecexpblo <= sysdate "+ 
//							   " union all "+ 
//							   " select to_char(nvl(vp.n_numasiento,0),'99') asiento, vp.n_numpiso piso, "+ 
//							   "     r.LOCALIDAD_IDORIGEN, r.LOCALIDAD_IDDESTINO "+ 
//							   "  FROM pasajes.VRTVENPAS VP    				 "+ 
//							   "   INNER JOIN ( SELECT MAX(VENPAS_ID) VENPAS_ID,C_NUMCONTROL  FROM pasajes.VRTVENPAS    "+      				  
//							   "   WHERE itinerario_id = "+obj.getVentaVuelta().getIdItinerario()+" GROUP BY C_NUMCONTROL) VENTAPJ ON VENTAPJ.VENPAS_ID=VP.VENPAS_ID    "+  
//							   "  inner join pasajes.vrmruta r on r.ruta_id=vp.ruta_id      "+ 
//							   "   WHERE VP.ITINERARIO_ID = "+obj.getVentaVuelta().getIdItinerario()+
//							   	   " AND VP.TIPMOV_ID NOT IN ("+Constantes.ID_TIPMOV_ANULACION_SISTEMA+","+
//										   	+Constantes.ID_TIPMOV_DEVOLUCION+","+
//										   	 Constantes.ID_TIPMOV_ANULACION+","+Constantes.ID_TIPMOV_DEV_EMPRESA+") "+
//								   " AND VP.N_NUMASIENTO = "+obj.getVentaVuelta().getNroAsiento()+" AND VP.N_NUMPISO = "+obj.getVentaVuelta().getNroPiso();
//					
//					List<AsientoOcupado> lstAsientoOcupadoVuelta = jdbcTemplate.query(sql, new AsientoOcupadoRowMapper());
//					
//					if(lstAsientoOcupadoVuelta.size() > 0) {
//						sql="SELECT r.localidad_idorigen, localidad_iddestino FROM pasajes.VRMRUTA r "+
//							" WHERE r.ruta_id="+obj.getVentaVuelta().getIdRuta();
//						List<Ruta> lstRutaVuelta = jdbcTemplate.query(sql, new RutaRowMapper());
//						
//						if(lstRutaVuelta.size() > 0) {
//							List<SecuenciaTramo> listaTramoVuelta = obtenerSecuencia(ItiActivoTramoVuelta.get(0));
//							// Obtenemos el subconjunto que queremos buscar segun la ruta seleccionada				
//							List<Integer> subConjuntoBuscarVuelta = obtenerSubconjunto(listaTramoVuelta, lstRutaVuelta.get(0).getIdLocOrigen(),lstRutaVuelta.get(0).getIdLocDestino());						
//							lstAsientoOcupadoVuelta = obtenerConjuntos(lstAsientoOcupadoVuelta, listaTramoVuelta);
//							
//							if (validacionAsientoBloqueado(obj.getVentaVuelta().getNroAsiento()+"-"+obj.getVentaVuelta().getNroPiso(),
//									   lstAsientoOcupadoVuelta,subConjuntoBuscarVuelta)) 
//								return null;		//System.out.pritln("EL ASIENTO DE VUELTA NO ESTA DISPONIBLE.")
//						} else return null;		//System.out.pritln("LA RUTA DE VUELTA SELECCIONADA NO EXISTE.")
//					}
//				} else return null;				//System.out.pritln("EL ITINERARIO DE VUELTA NO ESTA DISPONIBLE.")
//			}
//		}
		
		/*********************** ELIMINAR RESERVA DE ASIENTO ***********************/			
		for(VentaPasajeros obj : venta.getVentaPasajeros()){
			if(obj.getVentaIda() != null){
				String sql_asientos_ida = " delete from pasajes.VRTTMPOCUASI TMP "+
			   			" where tmp.itinerario_id = "+obj.getVentaIda().getIdItinerario()+
			   			" and tmp.ruta_id = "+obj.getVentaIda().getIdRuta()+
			   			" and tmp.N_ASIENTO ="+obj.getVentaIda().getNroAsiento()+
			   			" and tmp.N_NUMPISO ="+obj.getVentaIda().getNroPiso()+
			   			" AND tmp.usuario_id="+Constantes.ID_USUARIO_MOVIL_WEB+
			   			" AND tmp.usuhard_id="+Constantes.ID_HARDWARE_MOVIL_WEB;
									
				jdbcTemplate.update(sql_asientos_ida);
			}
			
			if(obj.getVentaVuelta() != null){
				String sql_asientos_vuelta = " delete from pasajes.VRTTMPOCUASI TMP "+
			   			" where tmp.itinerario_id = "+obj.getVentaVuelta().getIdItinerario()+
			   			" and tmp.ruta_id = "+obj.getVentaVuelta().getIdRuta()+
			   			" and tmp.N_ASIENTO ="+obj.getVentaVuelta().getNroAsiento()+
			   			" and tmp.N_NUMPISO ="+obj.getVentaVuelta().getNroPiso()+
			   			" AND tmp.usuario_id="+Constantes.ID_USUARIO_MOVIL_WEB+
			   			" AND tmp.usuhard_id="+Constantes.ID_HARDWARE_MOVIL_WEB;
	
				jdbcTemplate.update(sql_asientos_vuelta);
			}
		}
		/*********************** ELIMINAR RESERVA DE ASIENTO ***********************/
				
		int cont_factura = 0;
		
		// Actualizar el cliente por cada Venta 
		if(venta.getCliente() != null){
			actualizarCliente(venta.getCliente());
			cont_factura = 1;
		}
		
		int tipcom_val = 0;
		
		//System.out.println("cont_factura: "+cont_factura);
		
		if(cont_factura == 1){
			tipcom_val = 2;
		}else{
			tipcom_val = 7;
		}
		
		//System.out.println("tipcom_val: "+tipcom_val);
		
		//double montoTotal = 0.0;
		
		/****************** SECUENCIA ******************/
		sql = "select c_corseq, c_serie from vrmespval where agencia_id="+venta.getIdAgencia()+" and tipcom_id="+tipcom_val+" and empresa_id=1 and c_estreg='"+Constantes.ACTIVO+"'";
		List<Secuencia> lstSecuencia = jdbcTemplate.query(sql, new SecuenciaRowMapper());
		/****************** SECUENCIA ******************/
		
		//long endTime1 = System.currentTimeMillis();
		//System.out.println("FIN 0: "+(double) ((endTime1-startTime1)/1000));
		
		//long startTime = System.currentTimeMillis();
		
		List<VentaPasajeSispas> ventasIdaRetorno = new ArrayList<VentaPasajeSispas>();
		
		for(VentaPasajeros obj : venta.getVentaPasajeros()){			
			// Registro de Ventas de IDA
			sql = "SELECT SEQ_VRTVENPAS_ID.NEXTVAL FROM DUAL";
			List<Long> idVentaIda = jdbcTemplate.query(sql, new LongRowMapper());
			
			if(idVentaIda.size() > 0){
				if(lstSecuencia.size() > 0){
					sql = "SELECT "+lstSecuencia.get(0).getC_corseq()+".NEXTVAL FROM DUAL";
					String correlativo = jdbcTemplate.queryForObject(sql, String.class);
					
					correlativo = String.format("%08d", Integer.valueOf(correlativo));
					
					String c_numboleto = lstSecuencia.get(0).getC_serie()+"-"+correlativo.trim();
					String c_numcontrol = generateControlNumber(decimalToHexadecimal(idVentaIda.get(0)));
					int nroPos = 0;
					try{nroPos = getNroPOS(venta.getIdAgencia());}catch(Exception e){e.printStackTrace();}
					BigDecimal idPasajero = buscarIdPasajero(obj.getVentaIda().getPasajero());
					
					//Registrar la Venta
					registraVentasVrtVenpas(idVentaIda.get(0), venta.getCliente(), c_numboleto, c_numcontrol, obj.getVentaIda(), venta.getIdAgencia(), venta.getIdUsuarioSispas(), 
											(obj.getVentaVuelta() != null), idVentaIda.get(0), venta.getIpLocal(), nroPos, venta.getFechaLiquidacion(), obj.getVentaIda().getEmailContacto(), 
											idPasajero, tipcom_val, venta.getTarcreId(), venta.getNumOperacion());
					
					//Agregando monto IDa
					//montoTotal += obj.getVentaIda().getImpPagado();
					 
					//Colocando Venpas ID a cada pasajero
					obj.getVentaIda().setIdVenta(new BigDecimal(idVentaIda.get(0)));
				}
			}else return null;	//System.out.pritln("PROBLEMAS CON NRO ID DE VENTAS.");
			
			VentaPasajeSispas ventaPasajeIDA;
			try {
				//System.out.println("idVentaIda.get(0): "+idVentaIda.get(0));
				ventaPasajeIDA = buscarVentaById(idVentaIda.get(0));
				ventasIdaRetorno.add(ventaPasajeIDA);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			// Registro de Ventas de VUELTA
			if(obj.getVentaVuelta() != null){
				sql = "SELECT SEQ_VRTVENPAS_ID.NEXTVAL  FROM DUAL";
				List<Long> idVentaVuelta = jdbcTemplate.query(sql, new LongRowMapper());
				
				if(idVentaVuelta.size() > 0){
					if(lstSecuencia.size() > 0){
						sql = "SELECT "+lstSecuencia.get(0).getC_corseq()+".NEXTVAL FROM DUAL";
						String correlativo = jdbcTemplate.queryForObject(sql, String.class);
						correlativo = String.format("%08d", Integer.valueOf(correlativo));
						
						String c_numboleto = lstSecuencia.get(0).getC_serie()+"-"+correlativo.trim();
						String c_numcontrol = generateControlNumber(decimalToHexadecimal(idVentaVuelta.get(0)));
						int nroPos = 0;
						try{nroPos = getNroPOS(venta.getIdAgencia());}catch(Exception e){e.printStackTrace();}
						BigDecimal idPasajero = buscarIdPasajero(obj.getVentaVuelta().getPasajero());
						
						//Registrar la Venta
						registraVentasVrtVenpas(idVentaVuelta.get(0), venta.getCliente(), c_numboleto, c_numcontrol, obj.getVentaVuelta(), venta.getIdAgencia(), venta.getIdUsuarioSispas(), 
												(obj.getVentaVuelta() != null), idVentaIda.get(0), venta.getIpLocal(), nroPos, venta.getFechaLiquidacion(), obj.getVentaVuelta().getEmailContacto(), 
												idPasajero, tipcom_val, venta.getTarcreId(), venta.getNumOperacion());
						
						//Agregando monto IDa
						//montoTotal += obj.getVentaVuelta().getImpPagado();
						
						//Colocando Venpas ID a cada pasajero
						obj.getVentaVuelta().setIdVenta(new BigDecimal(idVentaVuelta.get(0)));
					}
				}else return null;	//System.out.pritln("PROBLEMAS CON NRO ID DE VENTAS.");
				
				VentaPasajeSispas ventaPasajeRETORNO;
				try {
					ventaPasajeRETORNO = buscarVentaById(idVentaVuelta.get(0));
					ventasIdaRetorno.add(ventaPasajeRETORNO);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
				
		//ACTUALIZAR VENPAS_IDPARENTS | RELACION PADRE - HIJO
		List<Integer> list_idventas = new ArrayList<>();
		
		for(VentaPasajeros obj : venta.getVentaPasajeros()){
			if(obj.getVentaIda().getIdParentesco() == 4 || obj.getVentaIda().getIdParentesco() == 5){									// SI ES HIJO O CARTA APODERADO
				for(VentaPasajeros obj2 : venta.getVentaPasajeros()){
					if(obj2.getVentaIda().getPasajero().getNumDocumento().equals(obj.getVentaIda().getDniApoderado())){					// COMPARA CON EL DNI DE LOS PADRES-MADRES Y APODERADOS
						String sql_update = " UPDATE pasajes.VRTVENPAS set VENPAS_IDPARENTS = "+obj2.getVentaIda().getIdVenta()+" where VENPAS_ID = "+obj.getVentaIda().getIdVenta();
						jdbcTemplate.update(sql_update);
						
						list_idventas.add(Integer.valueOf(obj2.getVentaIda().getIdVenta().intValue()));
					}
				}
			}
			
			if(obj.getVentaVuelta() != null) {
				if(obj.getVentaVuelta().getIdParentesco() == 4 || obj.getVentaVuelta().getIdParentesco() == 5){							// SI ES HIJO O CARTA APODERADO
					for(VentaPasajeros obj2 : venta.getVentaPasajeros()){
						if(obj2.getVentaVuelta().getPasajero().getNumDocumento().equals(obj.getVentaVuelta().getDniApoderado())){		// COMPARA CON EL DNI DE LOS PADRES-MADRES Y APODERADOS
							String sql_update = " UPDATE pasajes.VRTVENPAS set VENPAS_IDPARENTS = "+obj2.getVentaVuelta().getIdVenta()+" where VENPAS_ID = "+obj.getVentaVuelta().getIdVenta();
							jdbcTemplate.update(sql_update);
						}
					}
				}
			}
		}
									
		if(list_idventas.size() > 0){
			//ACTUALIZAR VENPAS_IDTX | RELACION PADRE - HIJO
			Integer menorValor = list_idventas.stream().min(Comparator.comparing( v->v)).orElseThrow(NoSuchElementException::new);
			
			for(VentaPasajeros obj : venta.getVentaPasajeros()){
				if(obj.getVentaIda() != null) {
					String sql_update = " UPDATE pasajes.VRTVENPAS set VENPAS_IDTX = "+menorValor+" where VENPAS_ID = "+obj.getVentaIda().getIdVenta();
					jdbcTemplate.update(sql_update);
				}
				
				if(obj.getVentaVuelta() != null) {
					String sql_update = " UPDATE pasajes.VRTVENPAS set VENPAS_IDTX = "+menorValor+" where VENPAS_ID = "+obj.getVentaVuelta().getIdVenta();
					jdbcTemplate.update(sql_update);
				}
			}
		}
				
		//long endTime = System.currentTimeMillis();
		//System.out.println("FIN 1: "+(double) ((endTime-startTime)/1000));
		
//		try{
//			ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
//			String json1 = ow.writeValueAsString(ventasIdaRetorno);
//			String json2 = ow.writeValueAsString(venta);
//			
//			System.out.println("*********************************");
//			System.out.println(json1);
//			System.out.println("*********************************");
//			System.out.println(json2);
//			System.out.println("*********************************");
//		}catch(Exception e){
//			e.printStackTrace();
//		}
		
		try{
			val = new WSFE2().sendVenta2(connection(), ventasIdaRetorno, venta);
			
			return val;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return val;
	}
		
 	public String getDateSystem() throws Exception{
		try{
			String sql = "SELECT to_char(sysdate,'dd/mm/yyyy hh24:mi:ss') DateSystem FROM dual";
			
			Statement stmt = connection().createStatement();
			ResultSet rs  = stmt.executeQuery(sql);
			String fecha = "";
			
			while(rs.next()){
				fecha = rs.getString(1);
			}
			
			rs.close();
			stmt.close();
			
			return fecha.substring(1, fecha.length()-1);
		}catch (Exception ex) {
			throw new Exception(ex);
		}
    }
 	
 	public int getNroPOS(int idAgencia) throws Exception{
 		try{
 			String sql = "select pos_id from vrmpos where agencia_id="+idAgencia+" and opetarcre_id=2 and tipo='AUTOSERVICIO'";
			
			Statement stmt = connection().createStatement();
			ResultSet rs  = stmt.executeQuery(sql);
			int agencia_id = 0;
			
			while(rs.next()){
				agencia_id = rs.getInt(1);
			}
			
			rs.close();
			stmt.close();
			
			return agencia_id;
 		}catch(Exception e){
 			e.printStackTrace();
 		}
 		
		return 0;
 	}
	
	private void registraVentasVrtVenpas(Long ventaId, Cliente cliente, String c_numboleto, String c_numcontrol, VentaPasaje venta, int idAgencia, int idUsuarioSispas, boolean FlagVuelta, Long idMacthVenta, String ipLocal, int nroPos, String fechaLiquidacion, String emailContacto, BigDecimal idPasajero, Integer tipcom_val, Integer tarcreId, String NumOperacion){
		
		//REVISAR N_IMPPAGEQU, 
		
		String insert = " INSERT INTO PASAJES.VRTVENPAS (venpas_id, venpas_idoriginal, itinerario_id, ruta_id, cliente_id, pasajero_id, "+	//1
						" forpag_id, servicio_id, tipcom_id, tipmov_id, tipforpag_id, tarcre_id, "+	//2
						" c_numboleto, n_numasiento, n_numpiso, "+	//3
						" c_numcontrol, agencia_idpartida, d_fecpar, c_horpar, agencia_idllegada, d_feclle, c_horlle, n_secuencial, n_tarifa, "+	//4
						" n_recargo, n_descuento, n_penalidad, n_acuenta, n_imppag, n_imppagefe, n_imppagtar, c_tiptra, d_feccad, liquidacion_id, d_fecliq, "+	//5
						" agencia_id, usuario_id, canven_id, manifiesto_id, n_numopeban, d_fecexpres, c_horexpres, preali_id, n_idaret, "+	//6
						" c_rucclicre, n_esfecabi,c_observaciones, promocion_id, n_ididaret, c_estreg, audipinse, audipmodi, c_estdoc, tipmon_id, "+	//7
						" empresa_id, d_fecvent, c_email_contacto, n_diftar, pos_id, n_migracion, correo_enviado, venpas_idtx, parentesco_id, n_tipo_pasajero) "+	//8
						
						" VALUES ("+ventaId+", "+ventaId+", "+venta.getIdItinerario()+", "+venta.getIdRuta()+", "+(cliente!=null?cliente.getIdcliente():null)+", "+idPasajero+	//1
						" , "+Constantes.TIPO_COMPROBANTE_BOLETO_DE_VIAJE+", "+venta.getIdServicio()+", "+tipcom_val+", "+Constantes.ID_TIPMOV_EFECTIVO+", "+Constantes.ID_TIP_FORMA_PAGO_TARJETA+", "+tarcreId+	//2
						" , '"+c_numboleto+"', "+venta.getNroAsiento()+", "+venta.getNroPiso()+	//3
						" , '"+c_numcontrol+"', "+venta.getIdAgenciaPartida()+", '"+venta.getFechaPartida()+"', '"+venta.getHoraPartida()+"', "+venta.getIdAgenciaLlegada()+", '"+venta.getFechaLlegada()+"', '"+venta.getHoraLlegada()+"', 0, "+venta.getTarifa()+	//4
						" , 0, "+venta.getDescuento()+", 0, 0, "+venta.getImpPagado()+", 0, 0, 1, sysdate+180, null, '"+fechaLiquidacion+"'"+	//5
						" , "+idAgencia+", "+idUsuarioSispas+", 3, null, '"+NumOperacion+"', null, null, 1, "+(FlagVuelta?1:0)+	//6
						" , null, 0, null, "+(venta.getPromocionIdSispas()!=0?venta.getPromocionIdSispas():null)+", "+(FlagVuelta?idMacthVenta:null)+", '"+Constantes.ACTIVO+"', '"+ipLocal+"', '"+ipLocal+"', 'PAG', 1 "+	//7
						" , 1, sysdate, '"+emailContacto+"',"+venta.getImpPagado()+", "+nroPos+", 0, 0, "+idMacthVenta+", "+venta.getIdParentesco()+", "+venta.getTipoPasajero()+	//8
						" )";
		 
		jdbcTemplate.update(insert);
	}
	
	public TipoDocumentoSispas buscarTipoDocumentoById(Long idTipoDocumento) throws Exception{
		
		String sql = " SELECT tipdoc_id, c_denominacion, n_alerta1, c_colaler1, n_alerta2, c_colaler2, c_mask, c_nomcor, n_tipo FROM vrmtipdoc"+
				 	 " WHERE tipdoc_id="+idTipoDocumento;
		
		//TipoDocumentoSispas tipoDocumento = this.jdbcTemplate.queryForObject(sql, new TipoDocumentoSispasRowMapper());
		Statement stmt = connection().createStatement();
		ResultSet rs  = stmt.executeQuery(sql);
		TipoDocumentoSispas tipoDocumento = new TipoDocumentoSispas();
		while(rs.next()){
			tipoDocumento.setId(rs.getInt(1));
			tipoDocumento.setDenominacion(rs.getString(2));
			tipoDocumento.setAlerta1(rs.getInt(3));
			tipoDocumento.setColorAlerta1(rs.getString(4));
			tipoDocumento.setAlerta2(rs.getInt(5));
			tipoDocumento.setColorAlerta2(rs.getString(6));
			tipoDocumento.setMaskerade(rs.getString(7));
			tipoDocumento.setNombreCorto(rs.getString(8));
			tipoDocumento.setTipo(rs.getInt(9));
		}
		
		rs.close();
		stmt.close();
		
		return tipoDocumento;
	}
	
	public ClienteSispas buscarClienteById(Long idCliente) throws Exception{
		
		String sql = "SELECT cliente_id, agencia_id, ubigeo_id, c_numdoc, c_razsoc, c_rubro, n_cantrab, c_direccion, c_contacto, c_confin, "+
					 " c_telfijo1, c_telfijo2, c_movil1, c_movil2, c_origen, c_email, n_kilometros FROM vrmcliente "+
					 " WHERE opetarcre_id="+idCliente;
		
		ClienteListSispas obj = jdbcTemplate.queryForObject(sql, new ClienteListSispasRowMapper());
		ClienteSispas cliente = new ClienteSispas();
		
		if(obj != null){
			cliente.setId(obj.getCliente_id().longValue());
			cliente.setAgencia(new AgenciaSispas(obj.getAgencia_id().intValue()));
			cliente.setRazonSocial(obj.getC_razsoc());
			cliente.setDireccion(obj.getC_direccion());
			cliente.setUbigeo(new UbigeoSispas(obj.getUbigeo_id().toString()));
			cliente.setContacto(obj.getC_contacto());
			cliente.setTelefonoFijo(obj.getC_telfijo1());
			cliente.setTelefonoFijo2(obj.getC_telfijo2());
			cliente.setEmail(obj.getC_email());
			cliente.setKilometros(obj.getN_kilometros());
			cliente.setOrigen(obj.getC_origen());
			cliente.setDireccionFacturacion(obj.getC_direccion());
			cliente.setRubro(obj.getC_rubro());
			cliente.setCantidadTrabajadores(obj.getN_cantrab());
			cliente.setContactoFinaciero(obj.getC_confin());
			cliente.setMovil1(obj.getC_movil1());
			cliente.setMovil2(obj.getC_movil2());
		}
		
		return cliente;
	}
	
	public String obtenerHoraEmbarque(ItinerarioAgenciaPartidaIDSispas itinerarioAgenciaPartidaID, Integer idRuta) throws Exception{
		
		String sql = " SELECT c_horpar FROM vrtitiagepar "+
				 	 " WHERE itinerario_id="+itinerarioAgenciaPartidaID.getIdItinerario()+" and agencia_id="+itinerarioAgenciaPartidaID.getIdAgencia();
		
		String result = "";
		Statement stmt = connection().createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()){
			result = rs.getString(1);
		}
		
		if(result.equals("")){
			sql = " select c_horpar from vrtdetiti where itinerario_id="+itinerarioAgenciaPartidaID.getIdItinerario()+" and ruta_id="+idRuta+" and agencia_idpartida="+itinerarioAgenciaPartidaID.getIdAgencia();
			
			stmt = connection().createStatement();
			ResultSet rs2 = stmt.executeQuery(sql);
			while(rs2.next()){
				result = rs2.getString(1);
			}
			
			rs2.close();
		}
		
		rs.close();
		stmt.close();
		
		return result;
	}
	
	public void actualizarVentaPasaje(VentaPasajeSispas ventaPasaje) throws Exception{
		
	    try{ 
			//Para realiza una consulta
			Statement sentencia = connection().createStatement();                
			sentencia.executeUpdate(" update vrtvenpas set   N_ESFE="+Constantes.TRUE_VALUE+", D_ESFE= SYSDATE where venpas_id="+ventaPasaje.getId().intValue());
        
			//Cerramos la sentencia
			sentencia.close();
       }catch( Exception e ){ e.printStackTrace(); }
	}
	
	public UsuarioSispas buscarUsuarioById(Long idUsuario) throws Exception{
		
		String sql = "SELECT usuario_id, personal_id, agencia_id, usuhard_id, c_apepat, c_apemat, c_nombre, c_codigo, c_login, c_password, "+
					 " n_tippas, n_tipseg, c_email FROM vrmusuario "+
					 " WHERE usuario_id="+idUsuario;
		
		//UsuarioListSispas obj = jdbcTemplate.queryForObject(sql, new UsuarioListSispasRowMapper());
		Statement stmt = connection().createStatement();
		ResultSet rs  = stmt.executeQuery(sql);
		UsuarioSispas usuario = new UsuarioSispas();
		
		//if(obj != null){
		while(rs.next()){
			usuario.setId(rs.getInt(1));
			usuario.setPersonal(new PersonalSispas(rs.getLong(2)));
			usuario.setAgencia(new AgenciaSispas(rs.getInt(3)));
			usuario.setUsuarioHardware(new UsuarioHardwareSispas(rs.getInt(4)));
			usuario.setApellidoPaterno(rs.getString(5));
			usuario.setApellidoMaterno(rs.getString(6));
			usuario.setNombre(rs.getString(7));
			usuario.setCodigo(rs.getString(8));
			usuario.setLogin(rs.getString(9));
			usuario.setPassword(rs.getString(10));
			usuario.setTipoPassword(rs.getInt(11));
			usuario.setTipoSeguridad(rs.getInt(12));
			usuario.setEmailFuncionario(rs.getString(13));
		}
		
		rs.close();
		stmt.close();
		
		return usuario;
	}
	
	public OperadorTarjetaCreditoSispas buscarOpeTarCreById(Long idOpeTarCre) throws Exception{
		
		String sql = "SELECT opetarcre_id, c_denominacion FROM vrmopetarcre "+
					 " WHERE opetarcre_id="+idOpeTarCre;
		
		//OperadorTarjetaCreditoSispas opeTarCre = jdbcTemplate.queryForObject(sql, new OperadorTarjetaCreditoSispasRowMapper());
		Statement stmt = connection().createStatement();
		ResultSet rs  = stmt.executeQuery(sql);
		OperadorTarjetaCreditoSispas opeTarCre = new OperadorTarjetaCreditoSispas();
		
		while(rs.next()){
			opeTarCre.setId(rs.getInt(1));
			opeTarCre.setDenominacion(rs.getString(2));
		}
		
		rs.close();
		stmt.close();
		
		return opeTarCre;
	}
	
	public CompaniaSispas buscarCompaniaById(Long idCompania) throws Exception{
		String sql = " SELECT empresa_id, c_razsoc, c_nomcor, c_direccion, tipdoc_id, c_numdoc, c_repleg, c_sigla FROM vrmempresa "+
				 	 " WHERE empresa_id="+idCompania;
	
		//CompaniaListSispas obj = jdbcTemplate.queryForObject(sql, new CompaniaListSispasRowMapper());
		Statement stmt = connection().createStatement();
		ResultSet rs  = stmt.executeQuery(sql);
		CompaniaSispas compania = new CompaniaSispas();
		
		while(rs.next()){
			compania.setId(rs.getInt(1));
			compania.setRazonSocial(rs.getString(2));
			compania.setNombreCorto(rs.getString(3));
			compania.setDireccion(rs.getString(4));
			compania.setTipoDocumento(new TipoDocumentoSispas(rs.getInt(5)));
			compania.setNumeroDocumento(rs.getString(6));
			compania.setRepLegal(rs.getString(7));
			compania.setSigla(rs.getString(8));
		}
		
		rs.close();
		stmt.close();
		
		return compania;
	}
	
	public AgenciaSispas buscarAgenciaById(Long idAgencia) throws Exception{
		
		String sql = " SELECT agencia_id, tipage_id, localidad_id, concesionario_id, ubigeo_id, zoncom_id, c_denominacion, c_nomcor, n_esterminal, c_codigo, "+
					 " c_direccion, nacionalidad_id, codigo_concar, c_nombre_concar FROM vrmagencia "+
					 " WHERE agencia_id="+idAgencia;
		
		//AgenciaListSispas obj = jdbcTemplate.queryForObject(sql, new AgenciaListSispasRowMapper());
		Statement stmt = connection().createStatement();
		ResultSet rs  = stmt.executeQuery(sql);
		AgenciaSispas agencia = new AgenciaSispas();
		
		while(rs.next()){
			agencia.setId(rs.getInt(1));
			agencia.setTipoAgencia(new TipoAgenciaSispas(rs.getInt(2)));
			agencia.setConcesionario(new ConcesionarioSispas(rs.getInt(3)));
			agencia.setLocalidad(new LocalidadSispas(rs.getInt(4)));
			agencia.setDenominacion(rs.getString(5));
			agencia.setNombreCorto(rs.getString(6));
			agencia.setEsTerminal(rs.getBoolean(7));
			agencia.setUbigeo(new UbigeoSispas(rs.getString(8)));
			agencia.setDireccion(rs.getString(9));
			agencia.setCodigo(rs.getString(10));
			agencia.setNacionalidad(new NacionalidadSispas(rs.getInt(11)));
			agencia.setCodigoConcar(rs.getInt(12));
			agencia.setNombAgeConcar(rs.getString(13));
		}
		
		rs.close();
		stmt.close();
		
		return agencia;
	}
	
	public int descargarPdfApi(List<String> lstvp, int intentos, String correo){
		int val = 0;
		
		try{
			int cont = 0;
			
			for(String boleto_factura : lstvp){
				String tipo_documento = "03";
								
				if(boleto_factura.contains("FB")){
					tipo_documento = "01";
				}
								
				String bodyWs="{"+
						  	  " \"rubro\": 1, "+
						  	  " \"tipoArchivo\": 1, "+
						  	  " \"tipoDocumento\": \""+tipo_documento+"\", "+
						  	  " \"numeroDocumento\": \""+boleto_factura+"\" "+
						  	  "}";
								
				RequestApiWS rqSession = new RequestApiWS(url_api+"descargarArchivo", bodyWs, "Basic "+userpassBase64, "POST");
				JsonRest jsBase = consumoWs(rqSession, 2);
				
				if(jsBase.getRspCode().equals("200")){
		          	JSONObject obj = new JSONObject(jsBase.getResponse().toString());
		          	
		          	if(obj.getString("archivo") != ""){
						byte[] decoder = Base64.getDecoder().decode(obj.getString("archivo"));
						File file = new File(archivos_temp+boleto_factura+".pdf");
						FileOutputStream fop = new FileOutputStream(file);
						
						fop.write(decoder);
						fop.flush();
						fop.close();
		          	}else{ cont++; }
				}else{ cont++; }
			}
			
			if(cont == 0){
				val = enviarPdf(lstvp, intentos, correo);
			}
			
			try{
			    Thread.sleep(1000);
			    eliminarArchivosFolder(lstvp);
			    
			    return val;
			}catch(InterruptedException e){
			    e.printStackTrace();
			    return val;
			}
		}catch(Exception e){
			e.printStackTrace();
			return val;
		}
	}
	
	public static void eliminarArchivosFolder(List<String> lstvp){	    
	    for(String boleto_factura : lstvp){
	    	String nombre_archivo = archivos_temp+boleto_factura+".pdf";
	    	new File(nombre_archivo).delete();
	    }
	}
	
	public static BodyMailFormat buscarporId(int bodymailformat_id) {
	    BodyMailFormat bodyMailFormat = new BodyMailFormat();
	    try {
	      Statement stmt = connection().createStatement();
	      ResultSet rs = stmt.executeQuery("select * from VRMBODYMAILFORMAT where bodymailformat_id=" + bodymailformat_id);
	      rs.next();
	      bodyMailFormat = new BodyMailFormat();
	      bodyMailFormat.setId(Integer.valueOf(rs.getInt(1)));
	      bodyMailFormat.setC_cabecera(rs.getString(2));
	      bodyMailFormat.setC_footer(rs.getString(3));
	      bodyMailFormat.setC_titulo(rs.getString(4));
	      bodyMailFormat.setCc_correo(rs.getString(5));
	      bodyMailFormat.setCo_correo(rs.getString("co_correo"));
	      bodyMailFormat.setArchivos_adic(rs.getString("archivos_adic"));
	      stmt.close();
	      rs.close();
	    } catch (SQLException e) {
	      e.printStackTrace();
	    } 
	    return bodyMailFormat;
	}
	
	public int enviarPdf(List<String> lstvp, int intentos, String correo_a_enviar) throws IOException, Exception {
        int val = 0;
        
    	try{
    		BodyMailFormat bodyMailFormat = buscarporId(1);
    		//System.out.println("ID: "+lstvp.get(0).getVENPAS_ID());
        	Properties props = new Properties();
            // Nombre del host de correo, es smtp.gmail.com
            props.setProperty("mail.smtp.host", Constantes.mail_stmp_host);                
            props.setProperty("mail.smtp.starttls.enable", Constantes.mail_stmp_starttls);                     
            props.setProperty("mail.smtp.port",Constantes.mail_stmp_port);     
            props.setProperty("mail.smtp.user",Constantes.correo_remitente);
            // Si requiere o no usuario y password para conectarse.
            props.setProperty("mail.smtp.auth", Constantes.mail_stmp_auth); 
            props.setProperty("mail.smtp.ssl.trust", Constantes.mail_stmp_host);
            
            // Conexion al Servidor de correo
            Session session = Session.getDefaultInstance(props);
            
            //Se crea destino y origen del mensaje
             MimeMessage mimemessage = new MimeMessage(session);  

            // origen
            mimemessage.setFrom(new InternetAddress(Constantes.correo_remitente));
                        
            correo_a_enviar = correo_a_enviar.trim();
            correo_a_enviar = correo_a_enviar.toLowerCase();
            
            //Validar correos destino
            if(correo_a_enviar==null){return val;}
            
            if(!isValidEmailFinal(correo_a_enviar)){return val;}
             
            //destino                
            mimemessage.addRecipient(Message.RecipientType.TO, new InternetAddress(correo_a_enviar));
            mimemessage.addRecipient(Message.RecipientType.CC, new InternetAddress("confirmacionpasajes@movilbus.pe"));

             // Motivo del mensaje                 
            mimemessage.setSubject("MOVIL BUS - Boleto(s) de Facturación Electrónica"); //Asunto real
            //mimemessage.setSubject("MOVIL BUS - Boleto(s) de FacturaciÃ³n ElectrÃ³nica Prueba");  //Asunto Prueba 

            // para adjuntar el archivo
            Multipart multipart = new MimeMultipart();
            
            for(String boleto_factura : lstvp  ){
                BodyPart adjunto = new MimeBodyPart();
                String nombArchivo = "";
                             	
            	nombArchivo = archivos_temp+boleto_factura+".pdf";
            	adjunto.setDataHandler(new DataHandler(new FileDataSource(nombArchivo)));
            	
            	adjunto.setFileName(boleto_factura+".pdf");
                
                multipart.addBodyPart(adjunto);
            }
            
            // AGREGAR PROTOCOLOS DE BIOSEGURIDAD MOVIL BUS
            BodyPart adjunto = new MimeBodyPart();
            adjunto.setDataHandler(new DataHandler(new FileDataSource(archivo_bioseguridad)));
            adjunto.setFileName("MOVILBUS - PROTOCOLOS DE VIAJE.pdf");
            multipart.addBodyPart(adjunto);
            
            // Se crea el contenido del mensaje
            MimeBodyPart mimebodypart = new MimeBodyPart();
            //mimebodypart.setContent(cuerpoHtmlMsj(lstvp.get(0)),"text/html"); // Aqui el formato sera en html
            mimebodypart.setContent(String.valueOf(bodyMailFormat.getC_cabecera()) + bodyMailFormat.getC_footer(),"text/html; charset=UTF-8"); // Aqui el formato sera en html
            
            multipart.addBodyPart(mimebodypart);
            
            mimemessage.setContent(multipart);
            mimemessage.setSentDate(new Date());

            // Para enviar el mensaje usamos la clase Transport
            Transport t = session.getTransport("smtp");
            t.connect(Constantes.correo_remitente, Constantes.password_remitente);
            t.sendMessage(mimemessage,mimemessage.getAllRecipients());
            t.close();
            
            return 1;
    	}catch(SendFailedException sfex){
   	    	System.out.println("Error SendFailedException");
   	    	sfex.printStackTrace();
   	    	return val;
   	    }catch(MessagingException mex){
   	    	System.out.println("Error MessagingException");
   	    	mex.printStackTrace();
   	    	return val;
   	    }catch(Exception ex){
   	    	ex.printStackTrace();
   	    	return val;
   	    }
    }
	
	public static boolean isValidEmailFinal(String email){
        boolean result = true;
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                       "[a-zA-Z0-9_+&*-]+)*@" + 
                       "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                       "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(regex);      
        if(email.substring(email.length()-3).equals(".om")){
            result = false;
        }else if(email.substring(email.length()-2).equals(".m")){
            result = false;
        }else if(email.substring(email.length()-2).equals(".e")){
            result = false;
        }else if(email.substring(email.length()-2).equals(".s")){
            result = false;
        }else if(email.substring(email.length()-4).equals(".cpm")){
            result = false;
        }else if(email.substring(email.length()-4).equals(".con")){
            result = false;
        }else if(email.substring(email.length()-5).equals(".ccom")){
            result = false;
        }else if(email.substring(email.length()-4).equals(".clm")){
            result = false;
        }else if(email.substring(email.length()-9).equals("hmail.com")){
            result = false;
        }else if(email.substring(email.length()-10).equals("hotmai.com")){
            result = false;
        }else if(email.substring(email.length()-8).equals("gmal.com")){
            result = false;
        }else if(email.substring(email.length()-9).equals("gamil.com")){
            result = false;
        }else if(!pat.matcher(email).matches()){
            result = false;
        }
        
        /*else if(email.substring(email.length()-3).equals(".co")){
            result = false;
        }*/
        
        return result;
    }
	
	public static JsonRest consumoWs(RequestApiWS request, int consulta){
		try{
			System.setProperty("https.protocols", "TLSv1.2");
			// https
			URL endpoint = new URL(request.getUrl());
			HttpURLConnection postConnection = (HttpURLConnection) endpoint.openConnection();
			postConnection.setRequestProperty("Authorization", request.getAutorizacion());
			postConnection.setRequestMethod(request.getTipometodo());
			if(consulta == 1){
				postConnection.setRequestProperty("Content-Type","text/plain");
				
			}else{
				postConnection.setRequestProperty("Content-Type","application/json");
			}
			postConnection.setDoOutput(true);
			
			// cuerpo
			if(!request.getBody().equals("")) {
			        OutputStream os = postConnection.getOutputStream();
			        os.write(request.getBody().getBytes());
			        os.flush();
			        os.close();
			}
			
			int code = postConnection.getResponseCode();
			
			BufferedReader in =null;
			if( code == HttpURLConnection.HTTP_CREATED || code == HttpURLConnection.HTTP_OK ){ 			// 201 creado o 200 ok
			    in = new BufferedReader(new InputStreamReader(postConnection.getInputStream()));
			}else
			    in = new BufferedReader(new InputStreamReader(postConnection.getErrorStream()));
			
			String inputLn;
			StringBuffer response = new StringBuffer();
			while( (inputLn = in.readLine()) != null){
			    response.append(inputLn);
			}
			in.close();
			
			JsonRest logJSON = new JsonRest(String.valueOf(code),response.toString());
			
			return logJSON;
	    }catch(Exception io){
	    	io.printStackTrace();
	        return null;
	    }
	}
	
	public static VentaPasajeFE CrearVentaFExIdNiubiz(Connection conx , BigDecimal idventa){
		 VentaPasajeFE ovpfe = null;
		 try {  //Para realiza una consulta
              Statement sentenciaFE = conx.createStatement();             
              // consultar obtener la  venta por id.                              
              ResultSet rsFE = sentenciaFE.executeQuery( "  SELECT vp.venpas_id, i.itinerario_id, r.ruta_id, r.c_origen, r.c_destino, c.cliente_id, c.c_numdoc doccli, \n" +
                                                           "       c.c_razsoc, c.c_direccion, p.pasajero_id, p.c_apepat, p.c_apemat, p.c_nombre, td.tipdoc_id, td.c_denominacion tipdoc, p.c_numdoc docpax, \n" +
                                                           "       p.c_fecnac, fp.forpag_id, fp.c_denominacion formaPago, s.servicio_id, s.c_denominacion servicio, tc.tipcom_id, \n" +
                                                           "       tc.c_denominacion tipoComprobante, tm.tipmov_id, tm.c_denominacion tipoMovimiento, tfp.tipforpag_id, tfp.c_denominacion tipoformaPago, \n" +
                                                           "       tcr.tarcre_id, tcr.c_denominacion tarjetacredito, vp.c_numboleto, vp.n_numasiento, vp.n_numpiso, \n" +
                                                           "       to_char(vp.d_fecpar, 'dd/mm/yyyy') fecpar, vp.c_horpar, to_char(vp.d_feclle, 'dd/mm/yyyy') feclle, vp.c_horlle, \n" +
                                                           "       vp.n_tarifa, vp.n_recargo, vp.n_descuento, vp.n_penalidad, vp.n_imppag, vp.n_acuenta, vp.c_tiptra, \n" +
                                                           "       to_char(vp.d_fecliq, 'dd/mm/yyyy') fecliq, a.agencia_id, a.c_denominacion agencia, u.usuario_id, u.c_login, cv.canven_id, \n" +
                                                           "       cv.c_denominacion canalVenta, pa.preali_id, pa.c_denominacion alimentacion, ao.agencia_id idAgePartida, ao.c_denominacion partida, ad.agencia_id idAgeLlegada, \n" +
                                                           "       ad.c_denominacion agDestino, vp.c_numcontrol, vp.c_estreg, otc.opetarcre_id, otc.c_denominacion opetarcre, vp.c_numbolant, \n" +
                                                           "       p.c_nomape, vp.c_observaciones, vp.venpas_idoriginal, VP.n_imppagefe, vp.n_imppagtar, vp.promocion_id, vp.n_ididaret, tmn.tipmon_id, tmn.c_unimon, tmn.c_simmon, \n" +
                                                           "       ao.c_nomcor nombreCortoAgenciaPartida, vp.N_TARIFAEQU,vp.N_DESEQU,vp.N_TIPCAM, e.empresa_id, e.c_razsoc razon , ao.c_direccion dirpartida,ad.c_direccion dirllegada, \n" +
                                                           "       e.C_NOMCOR empnombcor,e.C_SIGLA empsigla, e.c_numdoc,td.c_nomcor nomcordoc, \n" +
                                                           "       vp.n_igv, vp.C_EMAIL_CONTACTO ,vp.C_EMAIL_TARJETA \n"+                    
                                                           "       ,to_char(to_date(vp.c_horpar,'hh24:mi')-1/24,'hh24:mi') c_horemb "+ // 1 HORA ANTES                                                            
                                                           "       ,vp.d_fecpar,vp.d_feclle, (vp.n_tarifa - vp.n_descuento) as tardes"+
                                                           "       ,ubiorg.c_nombreubigeo ubigeoori, ubidest.c_nombreubigeo ubigeodes "+
                                                           "       ,vp.nro_operation_niubiz "+
                                                            " FROM vrtvenpas vp \n" +
                                                       " INNER JOIN vrtitinerario i ON i.itinerario_id=vp.itinerario_id \n" +
                                                       " INNER JOIN vrmruta r ON r.ruta_id=vp.ruta_id \n" +                                                                                                             
                                                        " LEFT JOIN vrmcliente c ON c.cliente_id=vp.cliente_id \n" +
                                                       " INNER JOIN vrmpasajero p ON p.pasajero_id=vp.pasajero_id \n" +
                                                       " INNER JOIN vrmtipdoc td ON td.tipdoc_id=p.tipdoc_id \n" +
                                                        " LEFT JOIN vrmforpag fp ON fp.forpag_id=vp.forpag_id \n" +
                                                       " INNER JOIN vrmservicio s ON s.servicio_id=vp.servicio_id \n" +
                                                       " INNER JOIN vrmtipcom tc ON tc.tipcom_id=vp.tipcom_id \n" +
                                                       " INNER JOIN vrmtipmov tm ON tm.tipmov_id=vp.tipmov_id \n" +
                                                        " LEFT JOIN vrmtipforpag tfp ON tfp.tipforpag_id=vp.tipforpag_id \n" +
                                                        " LEFT JOIN vrmtarcre tcr ON tcr.tarcre_id=vp.tarcre_id \n" +
                                                        " LEFT JOIN vrmopetarcre otc ON otc.opetarcre_id=tcr.opetarcre_id \n" +
                                                       " INNER JOIN vrmagencia a ON a.agencia_id=vp.agencia_id \n" +
                                                       " INNER JOIN vrmusuario u ON u.usuario_id=vp.usuario_id \n" +
                                                       " INNER JOIN vrmcanven cv ON cv.canven_id=vp.canven_id \n" +
                                                        " LEFT JOIN vrmpreali pa ON pa.preali_id=vp.preali_id \n" +
                                                        " LEFT JOIN vrmagencia ao ON ao.agencia_id=vp.agencia_idpartida \n" +
                                                        " LEFT join VRMUBIGEO ubiorg  on ubiorg.UBIGEO_ID = ao.UBIGEO_ID "+                                                        
                                                        " LEFT JOIN vrmagencia ad ON ad.agencia_id = vp.agencia_idllegada \n" +
                                                        " LEFT join VRMUBIGEO ubidest on ubidest.UBIGEO_ID = ad.UBIGEO_ID "+    
                                                        " LEFT JOIN vrmcencos cc ON (cc.cencos_id=vp.cencos_id) \n" +
                                                        " LEFT JOIN vrmtipmon tmn ON (tmn.tipmon_id=vp.tipmon_id) \n" +
                                                       " INNER JOIN vrmempresa e ON e.empresa_id=vp.empresa_id "+
                                                            " WHERE (vp.n_tipo_pasajero<>3 or vp.n_tipo_pasajero is null) and vp.venpas_id="+idventa);
              
               while ( rsFE.next() ){
                       ovpfe = new VentaPasajeFE();                        
                       ovpfe.setVENPAS_ID(rsFE.getString(1));
                       ovpfe.setITINERARIO_ID(rsFE.getString(2));
                       ovpfe.setRUTA_ID(rsFE.getString(3));
                       ovpfe.setC_ORIGEN(rsFE.getString(4));
                       ovpfe.setC_DESTINO(rsFE.getString(5));
                       ovpfe.setCLIENTE_ID(rsFE.getString(6));
                       ovpfe.setDOCCLI(rsFE.getString(7));
                       ovpfe.setC_RAZSOC(rsFE.getString(8));
                       ovpfe.setC_DIRECCION(rsFE.getString(9));
                       ovpfe.setPASAJERO_ID(rsFE.getString(10));
                       ovpfe.setC_APEPAT(rsFE.getString(11));
                       ovpfe.setC_APEMAT(rsFE.getString(12));
                       ovpfe.setC_NOMBRE(rsFE.getString(13));
                       ovpfe.setTIPDOC_ID(rsFE.getString(14));
                       ovpfe.setTIPDOC(rsFE.getString(15));
                       ovpfe.setDOCPAX(rsFE.getString(16));
                       ovpfe.setC_FECNAC(rsFE.getString(17));
                       ovpfe.setFORPAG_ID(rsFE.getString(18));
                       ovpfe.setFORMAPAGO(rsFE.getString(19));
                       ovpfe.setSERVICIO_ID(rsFE.getString(20));
                       ovpfe.setSERVICIO(rsFE.getString(21));
                       ovpfe.setTIPCOM_ID(rsFE.getString(22));
                       ovpfe.setTIPOCOMPROBANTE(rsFE.getString(23));
                       ovpfe.setTIPMOV_ID(rsFE.getString(24));
                       ovpfe.setTIPOMOVIMIENTO(rsFE.getString(25));
                       ovpfe.setTIPFORPAG_ID(rsFE.getString(26));
                       ovpfe.setTIPOFORMAPAGO(rsFE.getString(27));
                       ovpfe.setTARCRE_ID(rsFE.getString(28));
                       ovpfe.setTARJETACREDITO(rsFE.getString(29));
                       ovpfe.setC_NUMBOLETO(rsFE.getString(30));
                       ovpfe.setN_NUMASIENTO(rsFE.getString(31));
                       ovpfe.setN_NUMPISO(rsFE.getString(32));
                       ovpfe.setFECPAR(rsFE.getString(33));
                       ovpfe.setC_HORPAR(rsFE.getString(34));
                       ovpfe.setFECLLE(rsFE.getString(35));
                       ovpfe.setC_HORLLE(rsFE.getString(36));
                       ovpfe.setN_TARIFA(rsFE.getString(37));
                       ovpfe.setN_RECARGO(rsFE.getString(38));
                       ovpfe.setN_DESCUENTO(rsFE.getString(39));
                       ovpfe.setN_PENALIDAD(rsFE.getString(40));
                       ovpfe.setN_IMPPAG(rsFE.getString(41));
                       ovpfe.setN_ACUENTA(rsFE.getString(42));
                       ovpfe.setC_TIPTRA(rsFE.getString(43));
                       ovpfe.setFECLIQ(rsFE.getString(44));
                       ovpfe.setAGENCIA_ID(rsFE.getString(45));
                       ovpfe.setAGENCIA(rsFE.getString(46));
                       ovpfe.setUSUARIO_ID(rsFE.getString(47));
                       ovpfe.setC_LOGIN(rsFE.getString(48));
                       ovpfe.setCANVEN_ID(rsFE.getString(49));
                       ovpfe.setCANALVENTA(rsFE.getString(50));
                       ovpfe.setPREALI_ID(rsFE.getString(51));
                       ovpfe.setALIMENTACION(rsFE.getString(52));
                       ovpfe.setIDAGEPARTIDA(rsFE.getString(53));                        
                       ovpfe.setPARTIDA(rsFE.getString(54));
                       ovpfe.setIDAGELLEGADA(rsFE.getString(55));
                       ovpfe.setAGDESTINO(rsFE.getString(56));
                       ovpfe.setC_NUMCONTROL(rsFE.getString(57));
                       ovpfe.setC_ESTREG(rsFE.getString(58));
                       ovpfe.setOPETARCRE_ID(rsFE.getString(59));
                       ovpfe.setOPETARCRE(rsFE.getString(60));
                       ovpfe.setC_NUMBOLANT(rsFE.getString(61));
                       ovpfe.setC_NOMAPE(rsFE.getString(62));
                       ovpfe.setC_OBSERVACIONES(rsFE.getString(63));
                       ovpfe.setVENPAS_IDORIGINAL(rsFE.getString(64));
                       ovpfe.setN_IMPPAGEFE(rsFE.getString(65));
                       ovpfe.setN_IMPPAGTAR(rsFE.getString(66));
                       ovpfe.setPROMOCION_ID(rsFE.getString(67));
                       ovpfe.setN_IDIDARET(rsFE.getString(68));
                       ovpfe.setTIPMON_ID(rsFE.getString(69));
                       ovpfe.setC_UNIMON(rsFE.getString(70));
                       ovpfe.setC_SIMMON(rsFE.getString(71));
                       ovpfe.setNOMBRECORTOAGENCIAPARTIDA(rsFE.getString(72));//
                       ovpfe.setN_TARIFAEQU(rsFE.getString(73));
                       ovpfe.setN_DESEQU(rsFE.getString(74));
                       ovpfe.setN_TIPCAM(rsFE.getString(75));
                       ovpfe.setEMPRESA_ID(rsFE.getString(76));
                       ovpfe.setRAZON(rsFE.getString(77));
                       
                       ovpfe.setDIRPARTIDA(rsFE.getString(78));                        
                       ovpfe.setDIRLLEGADA(rsFE.getString(79));
                       
                       ovpfe.setEMPNOMBCOR(rsFE.getString(80));
                       ovpfe.setEMPSIGLA(rsFE.getString(81));
                       ovpfe.setC_NUMDOC(rsFE.getString(82));   
                       ovpfe.setNomcordoc(rsFE.getString(83));                        
                       ovpfe.setN_igv(rsFE.getString(84)); 
                       ovpfe.setC_EMAIL_CONTACTO(rsFE.getString(85)); 
                       ovpfe.setC_EMAIL_TARJETA(rsFE.getString(86));  
                       ovpfe.setC_HOREMB(rsFE.getString(87));                                             
                       ovpfe.setD_FECPAR(rsFE.getDate(88));
                       ovpfe.setD_FECLLEG(rsFE.getDate(89));
                       ovpfe.setN_TAR_DES(rsFE.getString(90));
                       ovpfe.setUBIGEO_ORI(rsFE.getString(91));
                       ovpfe.setUBIGEO_DES(rsFE.getString(92));
                       ovpfe.setNROOPERACIONCOMPRA(rsFE.getString(93));
                       break;
               }
              
              
           //Cerramos la sentencia
           sentenciaFE.close();
           rsFE.close();
         }catch( Exception e ){ e.printStackTrace(); }
        
        return ovpfe;
	}
	
	public VentaPasajeSispas buscarVentaById(Long idVenta) throws Exception{
		
		String sql = " SELECT vp.venpas_id, vp.venpas_idref, i.itinerario_id, r.ruta_id, r.c_origen, r.c_destino, c.cliente_id, c.c_numdoc doccli, " +
					 " c.c_razsoc, p.pasajero_id, p.c_apepat, p.c_apemat, p.c_nombre, td.tipdoc_id, td.c_denominacion tipdoc, p.c_numdoc docpax, p.c_fecnac, " +
					 " fp.forpag_id, fp.c_denominacion formaPago, s.servicio_id, s.c_denominacion servicio, tc.tipcom_id, tc.c_denominacion tipoComprobante, " +
					 " tm.tipmov_id, tm.c_denominacion tipoMovimiento, tfp.tipforpag_id, tfp.c_denominacion tipoformaPago, tcr.tarcre_id, " +
					 " tcr.c_denominacion tarjetacredito, vp.c_numboleto, vp.n_numasiento, vp.n_numpiso, to_char(vp.d_fecpar, 'dd/mm/yyyy') fecpar, " +
					 " vp.c_horpar, to_char(vp.d_feclle, 'dd/mm/yyyy') feclle, vp.c_horlle, vp.n_secuencial, vp.n_tarifa, vp.n_recargo, vp.n_descuento, " +
					 " vp.n_penalidad, vp.n_imppag, vp.n_acuenta, vp.c_tiptra, vp.d_feccad, to_char(vp.d_fecliq, 'dd/mm/yyyy') fecliq, a.agencia_id, " +
					 " a.c_denominacion agencia, u.usuario_id, u.c_login, cv.canven_id, cv.c_denominacion canalVenta, vp.manifiesto_id, vp.n_numopeban, " +
					 " to_char(vp.d_fecexpres, 'dd/mm/yyyy') fecexpres, vp.c_horexpres, pa.preali_id, pa.c_denominacion alimentacion, ao.agencia_id idAgeLlegada, " +
					 " ao.c_denominacion partida, ad.agencia_id idAgePartida, ad.c_denominacion agDestino, vp.c_numcontrol, vp.liquidacion_id, vp.c_estreg, " +
					 " to_char(vp.audfecins,'dd/mm/yyyy HH24:mi:ss') audfecins, vp.audusuins, vp.audipinse, otc.opetarcre_id, otc.c_denominacion opetarcre, " +
					 " vp.c_numbolant, vp.n_idaret, vp.c_rucclicre, vp.n_esfecabi, p.c_nomape, vp.c_observaciones, vp.venpas_idoriginal, " +
					 " VP.n_imppagefe, vp.n_imppagtar, vp.promocion_id, vp.n_ididaret, " +
					 " cc.cencos_id, cc.c_codigo, cc.c_denominacion, " +
					 " vp.c_estdoc, tmn.tipmon_id, tmn.c_unimon, tmn.c_simmon, vp.n_imppagequ,ao.c_nomcor nombreCortoAgenciaPartida, " +
					 " vp.n_tarifaequ, vp.n_desequ, vp.n_tipcam, e.empresa_id, e.c_razsoc razon ,"+
					 " ao.c_direccion dirpartida,ad.c_direccion dirllegada,  "+
					 " e.c_nomcor empnombcor,e.c_sigla empsigla,vp.c_stateos, "+
					 " vp.cancelacionvt_id, vp.c_statecvt,c.c_direccion rdireccionCliente, td.c_nomcor as tipodocnomcor,e.c_numdoc docempresa, "+
					 " s.c_nomcor as nombserviciog, "+
					 " u.c_apepat usuapepat, u.c_apemat usuapemat, u.c_nombre usunombre,vp.c_codref "+
				     " FROM vrtvenpas vp " +
					 " INNER JOIN vrtitinerario i ON i.itinerario_id=vp.itinerario_id " +
					 " INNER JOIN vrmruta r      ON r.ruta_id=vp.ruta_id " +
					 " LEFT JOIN vrmcliente c 	ON c.cliente_id=vp.cliente_id " +
					 " INNER JOIN vrmpasajero p 	ON p.pasajero_id=vp.pasajero_id " +
					 " INNER JOIN vrmtipdoc td 	ON td.tipdoc_id=p.tipdoc_id " +
					 " LEFT JOIN vrmforpag fp 	ON fp.forpag_id=vp.forpag_id " +
					 " INNER JOIN vrmservicio s 	ON s.servicio_id=vp.servicio_id " +
					 " INNER JOIN vrmtipcom tc 	ON tc.tipcom_id=vp.tipcom_id " +
					 " INNER JOIN vrmtipmov tm 	ON tm.tipmov_id=vp.tipmov_id " +
					 " LEFT JOIN vrmtipforpag tfp ON tfp.tipforpag_id=vp.tipforpag_id " +
					 " LEFT JOIN vrmtarcre tcr 	ON tcr.tarcre_id=vp.tarcre_id " +
					 " LEFT JOIN vrmopetarcre otc ON otc.opetarcre_id=tcr.opetarcre_id " +
					 " INNER JOIN vrmagencia a ON a.agencia_id=vp.agencia_id " +
					 " INNER JOIN vrmusuario u ON u.usuario_id=vp.usuario_id " +
					 " INNER JOIN vrmcanven cv ON cv.canven_id=vp.canven_id " +
					 " LEFT JOIN vrmpreali pa  ON pa.preali_id=vp.preali_id " +
					 " LEFT JOIN vrmagencia ao ON ao.agencia_id=vp.agencia_idpartida " +
					 " LEFT JOIN vrmagencia ad ON ad.agencia_id=vp.agencia_idllegada " +
					 " LEFT JOIN vrmcencos cc  ON (cc.cencos_id=vp.cencos_id) " +
					 " LEFT JOIN vrmtipmon tmn ON (tmn.tipmon_id=vp.tipmon_id) " +
					 " INNER JOIN vrmempresa e ON e.empresa_id=vp.empresa_id "+
				     " WHERE vp.venpas_id="+idVenta;
				
		//VentaPasajeListSispas obj = jdbcTemplate.queryForObject(sql, new VentaPasajeListSispasRowMapper());
		Statement stmt = connection().createStatement();
		ResultSet rs  = stmt.executeQuery(sql);
		VentaPasajeSispas ventaPasaje = new VentaPasajeSispas();
		
		while(rs.next()){
			ventaPasaje.setId(rs.getBigDecimal(1).longValue());
			ventaPasaje.setVentaPasaje(new VentaPasajeSispas(rs.getBigDecimal(2)!=null?rs.getBigDecimal(2).longValue():null));
			ventaPasaje.setItinerario(new ItinerarioSispas(rs.getBigDecimal(3).longValue()));
			
			RutaSispas ruta = new RutaSispas();
			ruta.setId(rs.getBigDecimal(4).intValue());
			ruta.setOrigen(rs.getString(5));
			ruta.setDestino(rs.getString(6));
			ventaPasaje.setRuta(ruta);
			
			if(rs.getBigDecimal(7) != null){
				ClienteSispas cliente = new ClienteSispas();
				cliente.setId(rs.getBigDecimal(7).longValue());
				cliente.setNumeroDocumento(rs.getString(8));
				cliente.setRazonSocial(rs.getString(9));
				cliente.setDireccion(rs.getString(103)!=null?rs.getString(103):null);
				ventaPasaje.setCliente(cliente);
			}
			
			PasajeroSispas pasajero = new PasajeroSispas();
			pasajero.setId(rs.getBigDecimal(10).longValue());
			pasajero.setApellidoPaterno(rs.getString(11));
			pasajero.setApellidoMaterno(rs.getString(12));
			pasajero.setNombre(rs.getString(13));
			TipoDocumentoSispas tipoDocumento = new TipoDocumentoSispas();
			tipoDocumento.setId(rs.getBigDecimal(14).intValue());
			tipoDocumento.setDenominacion(rs.getString(15));
			tipoDocumento.setNombreCorto(rs.getString(104));
			pasajero.setTipoDocumento(tipoDocumento);
			pasajero.setNumeroDocumento(rs.getString(16));
			pasajero.setFechaNacimiento(rs.getString(17));
			ventaPasaje.setPasajero(pasajero);
			
			if(rs.getBigDecimal(18) != null){
				FormaPagoSispas formaPago = new FormaPagoSispas();
				formaPago.setId(rs.getBigDecimal(18).intValue());
				formaPago.setDenominacion(rs.getString(19));
				ventaPasaje.setFormaPago(formaPago);
			}
			
			ServicioSispas servicio = new ServicioSispas();
			servicio.setId(rs.getBigDecimal(20).intValue());
			servicio.setDenominacion(rs.getString(21));
			servicio.setNombreCorto(rs.getString(106)!= null?rs.getString(106):"");
			ventaPasaje.setServicio(servicio);
			
			TipoComprobanteSispas tipoComprobante = new TipoComprobanteSispas();
			tipoComprobante.setId(rs.getBigDecimal(22).intValue());
			tipoComprobante.setDenominacion(rs.getString(23));
			ventaPasaje.setTipoComprobante(tipoComprobante);
			
			TipoMovimientoSispas tipoMovimiento = new TipoMovimientoSispas();
			tipoMovimiento.setId(rs.getBigDecimal(24).intValue());
			tipoMovimiento.setDenominacion(rs.getString(25));
			ventaPasaje.setTipoMovimiento(tipoMovimiento);
			
			if(rs.getBigDecimal(26) != null){
				TipoFormaPagoSispas tipoFormaPago = new TipoFormaPagoSispas();
				tipoFormaPago.setId(rs.getBigDecimal(26).intValue());
				tipoFormaPago.setDenominacion(rs.getString(27));
				ventaPasaje.setTipoFormaPago(tipoFormaPago);
			}
			
			if(rs.getBigDecimal(28) != null){
				TarjetaCreditoSispas tarjetaCredito = new TarjetaCreditoSispas();
				tarjetaCredito.setId(rs.getBigDecimal(28).intValue());
				tarjetaCredito.setDenominacion(rs.getString(29));
				ventaPasaje.setTarjetaCredito(tarjetaCredito);
			}
			
			ventaPasaje.setNumeroBoleto(rs.getString(30)==null?null:rs.getString(30));
			ventaPasaje.setNumeroAsiento(rs.getInt(31));
			ventaPasaje.setNumeroPiso(rs.getInt(32));
			ventaPasaje.setFechaPartida(rs.getString(33)==null?null:Util.StringtoDate(rs.getString(33), Constantes.DATE_FORMAT));
			ventaPasaje.setHoraPartida(rs.getString(34)==null?null:rs.getString(34));
			ventaPasaje.setFechaLlegada(rs.getString(35)==null?null:Util.StringtoDate(rs.getString(35), Constantes.DATE_FORMAT));
			ventaPasaje.setHoraLllegada(rs.getString(36)==null?null:rs.getString(36));
			ventaPasaje.setSecuencial(rs.getInt(37));
			ventaPasaje.setTarifa(rs.getDouble(38));
			ventaPasaje.setRecargo(rs.getDouble(39));
			ventaPasaje.setDescuento(rs.getDouble(40));
			ventaPasaje.setPenalidad(rs.getDouble(41));
			ventaPasaje.setImportePagado(rs.getDouble(42));
			ventaPasaje.setAcuenta(rs.getDouble(43));
			ventaPasaje.setTipoTransaccion(rs.getString(44));
			ventaPasaje.setFechaCaducidad(rs.getDate(45));
			ventaPasaje.setFechaLiquidacion(rs.getString(46)==null?null:Util.StringtoDate(rs.getString(46), Constantes.DATE_FORMAT));
			
			AgenciaSispas agencia = new AgenciaSispas();
			agencia.setId(rs.getBigDecimal(47).intValue());
			agencia.setDenominacion(rs.getString(48));
			ventaPasaje.setAgencia(agencia);
			
			UsuarioSispas usuario = new UsuarioSispas();
			usuario.setId(rs.getBigDecimal(49).intValue());
			usuario.setLogin(rs.getString(50));
			usuario.setApellidoPaterno(rs.getString(107));
			usuario.setApellidoMaterno(rs.getString(108)==null?"":rs.getString(108));
			usuario.setNombre(rs.getString(109));
			ventaPasaje.setUsuario(usuario);
			
			CanalVentaSispas canalVenta = new CanalVentaSispas();
			canalVenta.setId(rs.getBigDecimal(51).intValue());
			canalVenta.setDenominacion(rs.getString(52));
			ventaPasaje.setCanalVenta(canalVenta);
			
			ventaPasaje.setManifiesto(rs.getBigDecimal(53)==null?null:new ManifiestoSispas(rs.getBigDecimal(53).longValue()));
			ventaPasaje.setNumeroOperacionBancaria(rs.getString(54));
			ventaPasaje.setFechaExpiracionReserva(rs.getDate(55));
			ventaPasaje.setHoraExpiracionReserva(rs.getString(56));
			
			if(rs.getBigDecimal(57) != null){
				PreferenciaAlimentariaSispas preferenciaAlimentaria = new PreferenciaAlimentariaSispas();
				preferenciaAlimentaria.setId(rs.getBigDecimal(57).intValue());
				preferenciaAlimentaria.setDenominacion(rs.getString(58));
				ventaPasaje.setPreferenciaAlimentaria(preferenciaAlimentaria);
			}
			
			if(rs.getBigDecimal(59) != null){
				AgenciaSispas agenciaPartida = new AgenciaSispas();
				agenciaPartida.setId(rs.getBigDecimal(59).intValue());
				agenciaPartida.setDenominacion(rs.getString(60));
				agenciaPartida.setNombreCorto(rs.getString(90)!=null?rs.getString(90):rs.getString(60));
				agenciaPartida.setDireccion(rs.getString(96)==null?"":rs.getString(96));
				ventaPasaje.setAgenciaPartida(agenciaPartida);
			}
			
			if(rs.getBigDecimal(61) != null){
				AgenciaSispas agenciaLlegada = new AgenciaSispas();
				agenciaLlegada.setId(rs.getBigDecimal(61).intValue());
				agenciaLlegada.setDenominacion(rs.getString(62));
				agenciaLlegada.setDireccion(rs.getString(97)==null?"":rs.getString(97));
				ventaPasaje.setAgenciaLlegada(agenciaLlegada);
			}
			
			ventaPasaje.setNumeroControl(rs.getString(63));
			ventaPasaje.setLiquidacion(rs.getBigDecimal(64) ==null?null:new LiquidacionSispas(rs.getBigDecimal(64).intValue()));
			ventaPasaje.setEstadoRegistro(rs.getString(65));
			ventaPasaje.setFechaInsercion(Util.StringtoDate(rs.getString(66), Constantes.DATE_TIME_FORMAT));
			ventaPasaje.setUsuarioInsercion(rs.getString(67)==null?null:rs.getString(67));
			ventaPasaje.setIpInsercion(rs.getString(68)==null?null:rs.getString(68));
			
			if(rs.getBigDecimal(28) != null){
				OperadorTarjetaCreditoSispas operadorTarjetaCredito = new OperadorTarjetaCreditoSispas();
				operadorTarjetaCredito.setId(rs.getBigDecimal(69).intValue());
				operadorTarjetaCredito.setDenominacion(rs.getString(70));
				ventaPasaje.getTarjetaCredito().setOperadorTarjetaCredito(operadorTarjetaCredito);
			}
			
			ventaPasaje.setNumeroBoletoAnterior(rs.getString(71)==null?null:rs.getString(71));
			ventaPasaje.setIdaRetorno((rs.getBigDecimal(72)).intValue());
			ventaPasaje.setRucClienteCredito(rs.getString(73)==null?null:rs.getString(73));
			ventaPasaje.setEsFechaAbierta((rs.getBigDecimal(74)).intValue());
			pasajero.setNombresApellidos(rs.getString(75)==null?" ":rs.getString(75));
			ventaPasaje.setObservaciones(rs.getString(76)==null?null:rs.getString(76));
			
			if(rs.getBigDecimal(77) != null){
				ventaPasaje.setVentaOriginal(rs.getBigDecimal(77).longValue());
			}
			
			ventaPasaje.setImportePagadoEfectivo(rs.getBigDecimal(78).doubleValue());
			ventaPasaje.setImportePagadoTarjeta(rs.getBigDecimal(79).doubleValue());
			
			if(rs.getBigDecimal(80) != null){
				PromocionSispas promocion = new PromocionSispas();
				promocion.setId(rs.getBigDecimal(80).longValue());
				ventaPasaje.setPromocion(promocion);
			}
			
			ventaPasaje.setIdentificadorIdaRetorno(rs.getBigDecimal(81)==null?null:rs.getBigDecimal(81).longValue());
			
			if(rs.getBigDecimal(82)!=null){
				CentroCostoSispas centroCosto=new CentroCostoSispas();
				centroCosto.setId(rs.getBigDecimal(82).intValue());
				centroCosto.setCodigo(rs.getString(83));
				centroCosto.setDenominacion(rs.getString(84));
				ventaPasaje.setCentroCosto(centroCosto);
			}
			
			ventaPasaje.setEstadoDocumento(rs.getString(85)!=null?rs.getString(85):null);
			
			if(rs.getBigDecimal(86)!=null){
				TipoMonedaSispas tipoMoneda=new TipoMonedaSispas();
				tipoMoneda.setId((rs.getBigDecimal(86)).intValue());
				tipoMoneda.setUnidadMonetaria(rs.getString(87)!=null?rs.getString(87):"");
				tipoMoneda.setSimboloMonetario(rs.getString(88)!=null?rs.getString(88):"");			
				ventaPasaje.setImportePagadoEquibalente(rs.getBigDecimal(89)==null?null:rs.getBigDecimal(89).doubleValue());
				ventaPasaje.setTipoMoneda(tipoMoneda);
				
				ventaPasaje.setTarifaEquibalente(rs.getBigDecimal(91)!=null?rs.getBigDecimal(91).doubleValue():null);
				ventaPasaje.setDescuentoEquibalente(rs.getBigDecimal(92)!=null?rs.getBigDecimal(92).doubleValue():null);
				ventaPasaje.setTipoCambio(rs.getBigDecimal(93)!=null?rs.getBigDecimal(93).doubleValue():null);
			}
			
			CompaniaSispas empresa = new CompaniaSispas();
			empresa.setId(rs.getBigDecimal(94).intValue());
			empresa.setRazonSocial(rs.getString(95));
			empresa.setNombreCorto(rs.getString(98));
			empresa.setSigla(rs.getString(99));
			empresa.setNumeroDocumento(rs.getString(105));
			ventaPasaje.setEmpresa(empresa);
			
			ventaPasaje.setEstadoordenser(rs.getString(100)!=null?rs.getString(100):null);
			ventaPasaje.setIdcancelacionvt(rs.getBigDecimal(101) != null?rs.getBigDecimal(101).intValue():null);
			ventaPasaje.setStcancelacionvt(rs.getString(102) != null?rs.getString(102):null);		
			ventaPasaje.setCodigoReferencia(rs.getString(110)==null?null:rs.getString(110));
		}
		
		rs.close();
		stmt.close();
		
		return ventaPasaje;
	}
	
	private String generateControlNumber(String valor) {
		String nControl = "000000000000000";
		nControl = nControl.concat(valor);
		nControl = "T" + nControl.substring(nControl.length() - 15);
		return nControl;
	}
	
	private  String decimalToHexadecimal(long valor) {
		return Long.toHexString(valor).toUpperCase();
	}
	
	private BigDecimal actualizarPasajero(Pasajero pasajero){
		
		String sqlpasajero = "";
		
		if(pasajero.getIdpasajero() != null){
			sqlpasajero = " SELECT PASAJERO_ID,tipdoc_id,c_numdoc,C_NOMBRE,C_APEPAT,c_apemat,c_fecnac,flag_ws FROM PASAJES.VRMPASAJERO "+
  				  		   " WHERE PASAJERO_ID="+pasajero.getIdpasajero();
			
		}else{ 
			sqlpasajero = " SELECT PASAJERO_ID,tipdoc_id,c_numdoc,C_NOMBRE,C_APEPAT,c_apemat,c_fecnac,flag_ws FROM PASAJES.VRMPASAJERO "+
            				" WHERE TRIM(C_NUMDOC) = '"+pasajero.getNumDocumento()+"' and C_ESTREG ='"+Constantes.ACTIVO+"' and TIPDOC_ID="+pasajero.getIdTipoDocumento();
			
		}
		
		List<Pasajero> listPasajero = jdbcTemplate.query(sqlpasajero, new PasajeroPr5RowMapper());
		
		if(listPasajero.size() > 0) {
			// Actualizacion
			sqlpasajero = " UPDATE VRMPASAJERO VP SET C_APEPAT ='"+pasajero.getApePaterno()+"',c_apemat='"+pasajero.getApeMaterno()+"',"+
							     " C_NOMBRE = '"+pasajero.getNombre()+"',"+
							     " c_fecnac = '"+pasajero.getFechanacimiento()+"',"+
							     " c_nomape ='"+pasajero.getNombre()+" "+pasajero.getApePaterno()+" "+pasajero.getApeMaterno()+"',AUDUSUMOD ='"+Constantes.USUARIO_INSER_MODIFICACION+"'"+ 							
					          " WHERE PASAJERO_ID="+listPasajero.get(0).getIdpasajero();	
			
			jdbcTemplate.update(sqlpasajero);

			return listPasajero.get(0).getIdpasajero();
		}else {
			// Registrar El pasajero
			sqlpasajero = " select pasajes.SEQ_VRMPASAJERO_ID.NEXTVAL from dual";
			BigDecimal idpasajero = jdbcTemplate.queryForObject(sqlpasajero, BigDecimal.class);
			
			sqlpasajero = " INSERT INTO pasajes.VRMPASAJERO ( PASAJERO_ID, AGENCIA_ID, c_apepat, " + 
		                    " c_apemat, c_nombre, c_nomape, "+
		                    " TIPDOC_ID,c_numdoc,N_KILOMETROS, "+
		                    " SEXO_ID,C_FECNAC,UBIGEO_ID, "+
		                    " N_INDESEABLE,AUDUSUINS, "+
		                    " AUDUSUMOD ,FLAG_WS  ) VALUES ( "+
							idpasajero+","+Constantes.ID_AGENCIA_MOVIL_WEB+",'"+pasajero.getApePaterno()+"','"+
							pasajero.getApeMaterno()+"','"+pasajero.getNombre()+"','"+pasajero.getNombre()+" "+pasajero.getApePaterno()+" "+pasajero.getApeMaterno()+"',"+
							pasajero.getIdTipoDocumento()+",'"+pasajero.getNumDocumento()+"',"+BigDecimal.ZERO+","+
							BigDecimal.ONE+",'"+pasajero.getFechanacimiento()+"','"+Constantes.ID_UBIGEO_BUS_PORTAL+"',"+
							BigDecimal.ZERO+",'"+Constantes.USUARIO_INSER_MODIFICACION+"','"+
							Constantes.USUARIO_INSER_MODIFICACION+"',"+Constantes.N_FLAG_NO_ACTUALIZADO+")";
			
			jdbcTemplate.update(sqlpasajero);
			
			return idpasajero;
		}
	}
	
	private void actualizarCliente(Cliente cliente) {
		
		String sqlcliente = "";
		
		if(cliente.getIdcliente() != null){
			sqlcliente = " SELECT CLIENTE_ID,c_direccion FROM PASAJES.VRMCLIENTE "+
  				  		   " WHERE CLIENTE_ID="+cliente.getIdcliente();
		}else{
			sqlcliente = " SELECT CLIENTE_ID,c_direccion FROM PASAJES.VRMCLIENTE "+
            				" WHERE TRIM(C_NUMDOC) = '"+cliente.getNroDoc()+"' and C_ESTREG ='"+Constantes.ACTIVO+"'";
		}
		
		List<Cliente> listCliente = jdbcTemplate.query(sqlcliente, new Cliente2RowMapper());
		
		if(listCliente.size() > 0){
			// Actualizar si es diferente de direccion
			if(!(cliente.getDireccion()).equals(listCliente.get(0).getDireccion())){
				// Actualizacion
				sqlcliente = " UPDATE pasajes.VRMCLIENTE SET c_direccion ='"+cliente.getDireccion()+"',"+
											" AUDUSUMOD ='"+Constantes.USUARIO_INSER_MODIFICACION+"'"+ 
						          " WHERE CLIENTE_ID="+listCliente.get(0).getIdcliente();
				
				jdbcTemplate.update(sqlcliente);
			}
		}else{
			// Registrar El cliente
			sqlcliente = " select pasajes.SEQ_VRMCLIENTE_ID.NEXTVAL from dual";
			BigDecimal idcliente = jdbcTemplate.queryForObject(sqlcliente, BigDecimal.class);
			
			sqlcliente =  " INSERT INTO pasajes.VRMCLIENTE ( CLIENTE_ID, AGENCIA_ID, UBIGEO_ID, " +
                    " C_NUMDOC, C_RAZSOC, " + 
                    " N_CANTRAB, C_DIRECCION, N_KILOMETROS, "+
                    " AUDUSUINS,AUDUSUMOD ,FLAG_WS  ) VALUES ( "+
                    idcliente+","+Constantes.ID_AGENCIA_MOVIL_WEB+",'"+Constantes.ID_UBIGEO_BUS_PORTAL+"',"+
                    "'"+cliente.getNroDoc()+"','"+cliente.getRazonSocial()+"',"+BigDecimal.TEN+",'"+cliente.getDireccion()+"',"+
                    BigDecimal.TEN+",'"+Constantes.USUARIO_INSER_MODIFICACION+"','"+
                    Constantes.USUARIO_INSER_MODIFICACION+"',"+Constantes.N_FLAG_NO_ACTUALIZADO+")";
			
			jdbcTemplate.update(sqlcliente);
			cliente.setIdcliente(idcliente);
		}
	}
	
	private BigDecimal buscarIdPasajero(Pasajero pasajero){
		String sqlpasajero = "";
		
		if(pasajero.getIdpasajero() != null && pasajero.getIdpasajero().intValue() != 0){ 
			sqlpasajero = " SELECT PASAJERO_ID,tipdoc_id,c_numdoc,C_NOMBRE,C_APEPAT,c_apemat,c_fecnac,flag_ws FROM PASAJES.VRMPASAJERO "+
  				  		   " WHERE PASAJERO_ID="+pasajero.getIdpasajero();
		}else{ 
			sqlpasajero = " SELECT PASAJERO_ID,tipdoc_id,c_numdoc,C_NOMBRE,C_APEPAT,c_apemat,c_fecnac,flag_ws FROM PASAJES.VRMPASAJERO "+
            				" WHERE TRIM(C_NUMDOC) = '"+pasajero.getNumDocumento()+"' and C_ESTREG ='"+Constantes.ACTIVO+"' and TIPDOC_ID="+pasajero.getIdTipoDocumento();
		}
		
		List<Pasajero> listPasajero = jdbcTemplate.query(sqlpasajero, new PasajeroPr5RowMapper());
		
		return listPasajero.get(0).getIdpasajero();
	}
	
	private void actualizarTelefonoPasajero(Pasajero pasajero, String telefono){
		String sqlpasajero = "";
		
		if(pasajero.getIdpasajero() != null){
			sqlpasajero = " SELECT PASAJERO_ID,tipdoc_id,c_numdoc,C_NOMBRE,C_APEPAT,c_apemat,c_fecnac,c_telefono,flag_ws FROM PASAJES.VRMPASAJERO "+
  				  		   " WHERE PASAJERO_ID="+pasajero.getIdpasajero();
		}else{ 
			sqlpasajero = " SELECT PASAJERO_ID,tipdoc_id,c_numdoc,C_NOMBRE,C_APEPAT,c_apemat,c_fecnac,c_telefono,flag_ws FROM PASAJES.VRMPASAJERO "+
            				" WHERE TRIM(C_NUMDOC) = '"+pasajero.getNumDocumento()+"' and C_ESTREG ='"+Constantes.ACTIVO+"' and TIPDOC_ID="+pasajero.getIdTipoDocumento();
		}
		
		List<Pasajero> listPasajero = jdbcTemplate.query(sqlpasajero, new PasajeroPr9RowMapper());
		
		if(listPasajero.size() > 0) {
			if(pasajero.getTelefono() == null || pasajero.getTelefono().length() < 9){
				sqlpasajero = " UPDATE VRMPASAJERO VP SET  C_TELEFONO = '"+telefono+"',"+"AUDUSUMOD ='"+Constantes.USUARIO_INSER_MODIFICACION+"'"+
						  " WHERE PASAJERO_ID="+listPasajero.get(0).getIdpasajero();

				jdbcTemplate.update(sqlpasajero);
			}
		}
	}
	
	private List<SecuenciaTramo> obtenerSecuencia(String secuencia){
		String[] sArray = secuencia.split(";");
		List<SecuenciaTramo> lstResult = new ArrayList<SecuenciaTramo>();
		for(String obj : sArray){
			SecuenciaTramo secuenciaTramo = new SecuenciaTramo();
			String[] buffer = obj.split("-");
			secuenciaTramo.setOrigen(Integer.valueOf(buffer[0]));
			secuenciaTramo.setDestino(Integer.valueOf(buffer[1]));
			secuenciaTramo.setOrden(Integer.valueOf(buffer[2]));
			lstResult.add(secuenciaTramo);
		}
		return lstResult;
	}
	
	public List<Integer> obtenerSubconjunto(List<SecuenciaTramo> lstSecuencias, int idOrigen, int idDestino){
		List<Integer> lstSubconjunto = new ArrayList<Integer>();
		//	Recorremos la secuencia de tramos del itinerario
		for(int j=0; j<lstSecuencias.size(); j++){
			SecuenciaTramo secuencia = lstSecuencias.get(j);
			//	Validamos si el origen de la secuencia coincide con el origen de la ruta	
			if(secuencia.getOrigen().intValue()==idOrigen){
				//	Recorremos la secuencia de tramos desde la posicion j	
				for(int k=j; k<lstSecuencias.size(); k++){
					secuencia = lstSecuencias.get(k);
					lstSubconjunto.add(secuencia.getOrden());
					//	Validamos si el destino de la secuencia coincide con el destino de la ruta	
					if(secuencia.getDestino().intValue()==idDestino)
						break;
				}
				break;
			}
		}
		return lstSubconjunto;
	}
	
	public boolean validacionAsientoBloqueado(String claveAsiento,List<AsientoOcupado> listado,List<Integer> subConjunto){
		boolean resultado = false;
		
		try {
			if (listado.size() > 0) {
				for (AsientoOcupado asientoOcupado : listado){
					for(Integer orden : subConjunto){
						if(claveAsiento.equals(asientoOcupado.getAsiento() + "-" + asientoOcupado.getPiso())
								&& asientoOcupado.getSubConjunto().contains(orden) ) { 											
							resultado = true;
							break;
						}
					}
				}
			}
		}catch(Exception e){
			resultado = false;
		}
		
		return resultado;
	}
	
	public List<AsientoOcupado> obtenerConjuntos(List<AsientoOcupado> lista, List<SecuenciaTramo> lstSecuencias){

		for(AsientoOcupado obj : lista){
			List<Integer> subConjunto = obtenerSubconjunto(lstSecuencias, obj.getIdorigen().intValue() , obj.getIddestino().intValue() );
			obj.setSubConjunto(subConjunto);
		}
		return lista;
	}
	
	/*private final class VentaPasajeListSispasRowMapper implements RowMapper<VentaPasajeListSispas> {
		
		@Override
		public VentaPasajeListSispas mapRow(ResultSet rs, int rowNum) throws SQLException {			
			return new VentaPasajeListSispas(rs.getBigDecimal(1), rs.getBigDecimal(2), rs.getBigDecimal(3), rs.getBigDecimal(4), rs.getString(5), rs.getString(6), rs.getBigDecimal(7), rs.getString(8), rs.getString(9), 
					rs.getBigDecimal(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getBigDecimal(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getBigDecimal(18), rs.getString(19), 
					rs.getBigDecimal(20), rs.getString(21), rs.getBigDecimal(22), rs.getString(23), rs.getBigDecimal(24), rs.getString(25), rs.getBigDecimal(26), rs.getString(27), rs.getBigDecimal(28), rs.getString(29), 
					rs.getString(30), rs.getInt(31), rs.getInt(32), rs.getString(33), rs.getString(34), rs.getString(35), rs.getString(36), rs.getBigDecimal(37), rs.getBigDecimal(38), rs.getBigDecimal(39), rs.getBigDecimal(40), 
					rs.getBigDecimal(41), rs.getBigDecimal(42), rs.getBigDecimal(43), rs.getString(44), rs.getDate(45), rs.getString(46), rs.getBigDecimal(47), rs.getString(48), rs.getBigDecimal(49), rs.getString(50), 
					rs.getBigDecimal(51), rs.getString(52), rs.getBigDecimal(53), rs.getString(54), rs.getDate(55), rs.getString(56), rs.getBigDecimal(57), rs.getString(58), rs.getBigDecimal(59), rs.getString(60), 
					rs.getBigDecimal(61), rs.getString(62), rs.getString(63), rs.getBigDecimal(64), rs.getString(65), rs.getString(66), rs.getString(67), rs.getString(68), rs.getBigDecimal(69), rs.getString(70), rs.getString(71), 
					rs.getBigDecimal(72), rs.getString(73), rs.getBigDecimal(74), rs.getString(75), rs.getString(76), rs.getBigDecimal(77), rs.getBigDecimal(78), rs.getBigDecimal(79), rs.getBigDecimal(80), rs.getBigDecimal(81), 
					rs.getBigDecimal(82), rs.getString(83), rs.getString(84), rs.getString(85), rs.getBigDecimal(86), rs.getString(87), rs.getString(88), rs.getBigDecimal(89), rs.getString(90), rs.getBigDecimal(91), rs.getBigDecimal(92), 
					rs.getBigDecimal(93), rs.getBigDecimal(94), rs.getString(95), rs.getString(96), rs.getString(97), rs.getString(98), rs.getString(99), rs.getString(100), rs.getBigDecimal(101), rs.getString(102), rs.getString(103), 
					rs.getString(104), rs.getString(105), rs.getString(106), rs.getString(107), rs.getString(108), rs.getString(109), rs.getString(110));
			}	
	}
	
	private final class TipoDocumentoSispasRowMapper implements RowMapper<TipoDocumentoSispas> {
		
		@Override
		public TipoDocumentoSispas mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new TipoDocumentoSispas(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9));
			}
	}
	
	private final class UsuarioListSispasRowMapper implements RowMapper<UsuarioListSispas> {
		
		@Override
		public UsuarioListSispas mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new UsuarioListSispas(rs.getBigDecimal(1), rs.getBigDecimal(2), rs.getBigDecimal(3), rs.getBigDecimal(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), 
					 rs.getInt(11), rs.getInt(12), rs.getString(13));
			}
	}
	
	private final class AgenciaListSispasRowMapper implements RowMapper<AgenciaListSispas> {
		
		@Override
		public AgenciaListSispas mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new AgenciaListSispas(rs.getBigDecimal(1), rs.getBigDecimal(2), rs.getBigDecimal(3), rs.getBigDecimal(4), rs.getBigDecimal(5), rs.getBigDecimal(6), rs.getString(7), rs.getString(8), 
					rs.getBoolean(9), rs.getString(10), rs.getString(11), rs.getBigDecimal(12), rs.getInt(13), rs.getString(14));
			}	
	}
	
	private final class CompaniaListSispasRowMapper implements RowMapper<CompaniaListSispas> {
		
		@Override
		public CompaniaListSispas mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new CompaniaListSispas(rs.getBigDecimal(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBigDecimal(5), rs.getString(6), rs.getString(7), rs.getString(8));
			}
	}
	
	private final class OperadorTarjetaCreditoSispasRowMapper implements RowMapper<OperadorTarjetaCreditoSispas> {
		
		@Override
		public OperadorTarjetaCreditoSispas mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new OperadorTarjetaCreditoSispas(rs.getInt(1), rs.getString(2));
			}
	}*/
	
	private final class ClienteListSispasRowMapper implements RowMapper<ClienteListSispas> {
		
		@Override
		public ClienteListSispas mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new ClienteListSispas(rs.getBigDecimal(1), rs.getBigDecimal(2), rs.getBigDecimal(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getString(10), 
					 rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getDouble(17));
			}
	}
	
	private final class SecuenciaRowMapper implements RowMapper<Secuencia>{
		@Override
		public Secuencia mapRow(ResultSet rs, int rowNum) throws SQLException {			
			return new Secuencia(rs.getString(1),rs.getString(2));
		}
	}
	
	private final class LongRowMapper implements RowMapper<Long> {
		
		@Override
		public Long mapRow(ResultSet rs, int rowNum) throws SQLException {			
			return rs.getLong(1);
		}
	}
	
	private final class Cliente2RowMapper implements RowMapper<Cliente> {
		
		@Override
		public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {			
			return new Cliente(rs.getBigDecimal(1), rs.getString(2));
		}	
	}
	
	private class PasajeroPr5RowMapper implements RowMapper<Pasajero>{
		
		@Override
		public Pasajero mapRow(ResultSet rs, int rowNum) throws SQLException {			
			return new Pasajero(rs.getBigDecimal(1),rs.getInt(2), rs.getString(5), rs.getString(4), rs.getString(7));
		}
	}
	
	private final class PasajeroPr9RowMapper implements RowMapper<Pasajero>{
		
		@Override
		public Pasajero mapRow(ResultSet rs, int rowNum) throws SQLException {			
			return new Pasajero(rs.getBigDecimal(1),rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6) ,rs.getString(7) , rs.getString(8), rs.getInt(9));
		}
	}
	
	private final class StringRowMapper implements RowMapper<String> {
		
		@Override
		public String mapRow(ResultSet rs, int rowNum) throws SQLException {			
			return rs.getString(1);
		}
	}
	
	private final class IntegerRowMapper implements RowMapper<Integer> {
		
		 @Override
		 public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {			
				return rs.getInt(1);
			}
	}
	
	private final class AsientoOcupadoRowMapper implements RowMapper<AsientoOcupado>{
		
		@Override
		public AsientoOcupado mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new AsientoOcupado(rs.getInt(1),rs.getInt(2), rs.getInt(3),rs.getInt(4));
		}
	}
	
	private final class RutaRowMapper implements RowMapper<Ruta> {
		
		@Override
		public Ruta mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Ruta(rs.getInt(1),rs.getInt(2));
		}
	}
		
	private static final class ReimprimirBoletoRowMapper implements RowMapper<ReimprimirBoleto> {
		
		@Override
		public ReimprimirBoleto mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new ReimprimirBoleto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), 
					rs.getString(11), rs.getInt(12), rs.getString(13), rs.getString(14), rs.getInt(15), rs.getString(16), rs.getString(17), rs.getInt(18), rs.getInt(19), rs.getInt(20), rs.getString(21));
		}
	}
	
	private static final class DatoSalidasEmbarqueRowMapper implements RowMapper<DatoSalidasEmbarque> {
		
		@Override
		public DatoSalidasEmbarque mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new DatoSalidasEmbarque(rs.getBigDecimal(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), 
					rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18));
		}
	}
	
	private static final class DatoTarifarioRowMapper implements RowMapper<DatoTarifario> {
		
		@Override
		public DatoTarifario mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new DatoTarifario(rs.getBigDecimal(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), 
					rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getInt(15), rs.getString(16), rs.getInt(17), rs.getString(18), rs.getInt(19));
		}
	}
	
	private static final class PromocionSispasRowMapper implements RowMapper<PromocionSispas> {
		
		@Override
		public PromocionSispas mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new PromocionSispas(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), 
					rs.getString(11), rs.getString(12), rs.getDouble(13), rs.getString(14), rs.getDouble(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getDate(21), 
					rs.getDate(22), rs.getString(23), rs.getString(24), rs.getInt(25), rs.getInt(26), rs.getString(27), rs.getString(28), rs.getString(29), rs.getInt(30));
		}
	}
	
	private static final class LiquidacionRowMapper implements RowMapper<Liquidacion> {
		
		@Override
		public Liquidacion mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Liquidacion(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getDate(6), rs.getString(7), rs.getInt(8), rs.getInt(9));
		}
	}
}