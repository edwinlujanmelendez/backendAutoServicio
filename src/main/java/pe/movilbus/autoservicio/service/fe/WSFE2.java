package pe.movilbus.autoservicio.service.fe;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Optional;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.datacontract.schemas._2004._07.feservice.ArrayOfDetalleCuota;
import org.datacontract.schemas._2004._07.feservice.ArrayOfDetalleVenta;
import org.datacontract.schemas._2004._07.feservice.ArrayOfInformacionAdicionalPropiedadAdicional;
import org.datacontract.schemas._2004._07.feservice.ArrayOfInformacionAdicionalTotalMonedaAdicional;
import org.datacontract.schemas._2004._07.feservice.Cliente;
import org.datacontract.schemas._2004._07.feservice.DetalleCuota;
import org.datacontract.schemas._2004._07.feservice.DetalleVenta;
import org.datacontract.schemas._2004._07.feservice.DocumentoReferencia;
import org.datacontract.schemas._2004._07.feservice.InformacionAdicional;
import org.datacontract.schemas._2004._07.feservice.InformacionAdicionalPropiedadAdicional;
import org.datacontract.schemas._2004._07.feservice.InformacionAdicionalTotalMonedaAdicional;
import org.datacontract.schemas._2004._07.feservice.Result;
import org.datacontract.schemas._2004._07.feservice.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
//import org.tempuri.IMEFEService;
//import org.tempuri.MEFEService;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import pe.movilbus.autoservicio.beans.AgenciaSispas;
import pe.movilbus.autoservicio.beans.CompaniaSispas;
import pe.movilbus.autoservicio.beans.ItinerarioAgenciaPartidaIDSispas;
import pe.movilbus.autoservicio.beans.OperadorTarjetaCreditoSispas;
import pe.movilbus.autoservicio.beans.VentaPasajeSispas;
import pe.movilbus.autoservicio.beans.VentaPasajeros;
import pe.movilbus.autoservicio.beans.VentasGeneral;
import pe.movilbus.autoservicio.daoImpl.MainDaoImpl;
import pe.movilbus.autoservicio.service.xml.XmlCliente;
import pe.movilbus.autoservicio.service.xml.XmlDetalleVentaPasajes;
import pe.movilbus.autoservicio.service.xml.XmlItem;
import pe.movilbus.autoservicio.service.xml.XmlPasajero;
import pe.movilbus.autoservicio.service.xml.XmlVenta;
import pe.movilbus.autoservicio.service.xml.XmlVentaPasaje;
import pe.movilbus.autoservicio.util.Constantes;
import pe.movilbus.autoservicio.util.ConvertirNumeroString;
import pe.movilbus.autoservicio.util.Util;
import sun.misc.BASE64Encoder;

/**
 *
 * @author eneyra
 */
public class WSFE2 implements Serializable{
        /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String TOKEN="#MAOE13579ZCBMKHFAQETUIP12W4R6Y8U9O#...";
	private static String NAMESPACE="http://schemas.datacontract.org/2004/07/FEService.Input";
	private static final DateFormat FORMAT_DATE = new SimpleDateFormat ("yyyy-MM-dd");
	private static String FE_TIPCOM_FACTURA="01";
	private static String FE_TIPCOM_BOLETA="03";
	private static String FE_TIPCOM_NOTA_CREDITO="07";
	private static String FE_TIPCOM_NOTA_DEBITO="08";
	public static String FE_TIPDOC_RUC="6";
	public static String FE_TIPDOC_DNI="1";
	public static String FE_TIPDOC_CARNET_EXTRANEJERIA="4";
	public static String FE_TIPDOC_PASAPORTE="7";
	public static String FE_TIPDOC_CEDULA_DIPLOMATICA_IDENTIDAD="A";
	public static Integer FE_TIPO_VENTA_CONTADO=20;
	public static Integer FE_TIPO_VENTA_CREDITO=21;
	public static Integer FE_TIPO_VENTA_CORTESIA=22;
	
	//PRD
	private static String archivos_temp = "//opt//tomcat9//webapps//backendAutoservicio//archivos_temp//";
	private static String directorio_formatTicket = "//opt//tomcat9//webapps//backendAutoservicio//formatTicket//";
	//DEV
	//private static String archivos_temp = "//opt//tomcat9//webapps//backendAutoservicioQA//archivos_temp//";
	//private static String directorio_formatTicket = "//opt//tomcat9//webapps//backendAutoservicioQA//formatTicket//";
	//LOCAL
	//private static String archivos_temp = "D:\\Proyecto MovilBus\\backend_autoservicio\\src\\main\\webapp\\archivos_temp\\";
	//private static String directorio_formatTicket = "D:\\Proyecto MovilBus\\backend_autoservicio\\src\\main\\webapp\\formatTicket\\";
	
	/*public static IMEFEService iMEFEService;
		
	private static IMEFEService getSoap()throws Exception{
		try {
				//DEV
                //System.setProperty("http.proxyHost", "192.168.10.24");
		        //System.setProperty("http.proxyPort", "8086");
				//PRD
				System.setProperty("http.proxyHost", "192.168.10.25");
	        	System.setProperty("http.proxyPort", "8085");
			
			if(iMEFEService==null){
	            MEFEService mefeservice= new MEFEService();
	            iMEFEService = mefeservice.getBasicHttpBindingIMEFEService();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return iMEFEService;
	}*/
	
//	/**
//	 * Realiza le envio de la venta al WebService FE.
//	 * @param ventaPasaje : Instancia del Object VentaPasaje
//	 * @throws Exception
//	 */
//	public String sendVenta(Connection conx, List<VentaPasajeSispas> listVentaPasaje, VentasGeneral ventaEcommerce)throws Exception{
//		String val = "";
//		try {
//			List<VentaPasajeSispas> ventasEnviadas = new ArrayList<VentaPasajeSispas>();
//			
//			Result result=null;
//			for(VentaPasajeSispas oVentaPasajeFE: listVentaPasaje){
//				
//				for(VentaPasajeros ventaPasajeros: ventaEcommerce.getVentaPasajeros()){
//					if(oVentaPasajeFE.getId() == ventaPasajeros.getVentaIda().getIdVenta().longValue()){
//						if(ventaPasajeros.getVentaIda().getTipoPasajero() != 3 && ventaPasajeros.getVentaIda().getIdParentesco() != 4){
//							// crea el objeto venta
//				            Venta oventa = createVenta(oVentaPasajeFE);
//				            
//				            if(oventa==null) System.out.println(" metodo SendVenta : No genero el objeto VENTA ");
//					        
//				            // Envia la venta a nuestro ws
//				            result= getSoap().setVenta(TOKEN, oventa);
//				            
//				            // Agrega a la lista para la impresion
//				            if(result!=null && result.getBarcode().getValue()!=null){
//				            	new MainDaoImpl().actualizarVentaPasaje(oVentaPasajeFE);
//				            }
//				            
//							if(result!=null){
//								oVentaPasajeFE.setResult(result);
//								ventasEnviadas.add(oVentaPasajeFE);
//							}
//						}
//					}else if(ventaPasajeros.getVentaVuelta() != null){
//						if(oVentaPasajeFE.getId() == ventaPasajeros.getVentaVuelta().getIdVenta().longValue()){
//							if(ventaPasajeros.getVentaVuelta().getTipoPasajero() != 3 && ventaPasajeros.getVentaVuelta().getIdParentesco() != 4){
//								// crea el objeto venta
//					            Venta oventa = createVenta(oVentaPasajeFE);
//					            
//					            if(oventa==null) System.out.println(" metodo SendVenta : No genero el objeto VENTA ");
//						            
//					            // Envia la venta a nuestro ws
//					            result= getSoap().setVenta(TOKEN, oventa);
//					            
//					            // Agrega a la lista para la impresion
//					            if(result!=null && result.getBarcode().getValue()!=null){
//					            	new MainDaoImpl().actualizarVentaPasaje(oVentaPasajeFE);
//					            }
//					            
//								if(result!=null){
//									oVentaPasajeFE.setResult(result);
//									ventasEnviadas.add(oVentaPasajeFE);	
//								}
//							}
//						}
//					}
//				}
//			}
//						
//			//Realiza la impresion del Ticket
//			if(result!=null && result.getBarcode().getValue()!=null){
//				//Crea el objet xmlVentaPasaje, para crear el archivo xml para la impresion del Ticket
//				XmlVentaPasaje filexmlprint = createXmlVenta(ventasEnviadas);
//				if(filexmlprint!=null){
//					val = descargarFileXml(filexmlprint);
//				}
//			}
//						
//			return val;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		return val;
//	}
	
	public String sendVenta2(Connection conx, List<VentaPasajeSispas> listVentaPasaje, VentasGeneral ventaEcommerce)throws Exception{
		String val = "";
		try {
			List<VentaPasajeSispas> ventasEnviadas = new ArrayList<VentaPasajeSispas>();
			
			for(VentaPasajeSispas oVentaPasajeFE: listVentaPasaje){
				
				for(VentaPasajeros ventaPasajeros: ventaEcommerce.getVentaPasajeros()){					
					if(oVentaPasajeFE.getId() == ventaPasajeros.getVentaIda().getIdVenta().longValue()){
						if(ventaPasajeros.getVentaIda().getTipoPasajero() != 3 && ventaPasajeros.getVentaIda().getIdParentesco() != 4){
							// crea el objeto venta
				            Venta oventa = createVenta(oVentaPasajeFE);
				            
				            if(oventa==null) System.out.println(" metodo SendVenta2 : No genero el objeto VENTA ");
					        
				            //ACTUALIZAR VENTA
				            //new MainDaoImpl().actualizarVentaPasaje(oVentaPasajeFE);
				            
							ventasEnviadas.add(oVentaPasajeFE);
						}
					}else if(ventaPasajeros.getVentaVuelta() != null){
						if(oVentaPasajeFE.getId() == ventaPasajeros.getVentaVuelta().getIdVenta().longValue()){
							if(ventaPasajeros.getVentaVuelta().getTipoPasajero() != 3 && ventaPasajeros.getVentaVuelta().getIdParentesco() != 4){
								// crea el objeto venta
					            Venta oventa = createVenta(oVentaPasajeFE);
					            
					            if(oventa==null) System.out.println(" metodo SendVenta2 : No genero el objeto VENTA ");
						        
					            //ACTUALIZAR VENTA
					            //new MainDaoImpl().actualizarVentaPasaje(oVentaPasajeFE);
					            
								ventasEnviadas.add(oVentaPasajeFE);	
							}
						}
					}
				}
			}
			
			//long startTime = System.currentTimeMillis();
			
			//Crea el objet xmlVentaPasaje, para crear el archivo xml para la impresion del Ticket
			XmlVentaPasaje filexmlprint = createXmlVentaSinFE(ventasEnviadas);
			
			if(filexmlprint!=null){ val = descargarFileXml(filexmlprint); }
			
			//long endTime = System.currentTimeMillis();
			//System.out.println("FIN 2: "+(double) ((endTime-startTime)/1000));
			
			return val;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return val;
	}
	
	public String sendVenta3(Connection conx, List<VentaPasajeSispas> listVentaPasaje)throws Exception{
		String val = "";
		try {
			List<VentaPasajeSispas> ventasEnviadas = new ArrayList<VentaPasajeSispas>();
			
			for(VentaPasajeSispas oVentaPasajeFE: listVentaPasaje){
	            Venta oventa = createVenta(oVentaPasajeFE);
	            
	            if(oventa==null) System.out.println(" metodo SendVenta3 : No genero el objeto VENTA ");
				ventasEnviadas.add(oVentaPasajeFE);
			}
			
			XmlVentaPasaje filexmlprint = createXmlVentaSinFE(ventasEnviadas);
			
			if(filexmlprint!=null){ val = descargarFileXml(filexmlprint); }
			
			return val;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return val;
	}
			
//	private static void createQRImage(File qrFile, String qrCodeText, int size, String fileType) throws WriterException, IOException {
//		// Create the ByteMatrix for the QR-Code that encodes the given String
//		Hashtable<EncodeHintType, ErrorCorrectionLevel> hintMap = new Hashtable<>();
//		hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
//		QRCodeWriter qrCodeWriter = new QRCodeWriter();
//		BitMatrix byteMatrix = qrCodeWriter.encode(qrCodeText, BarcodeFormat.QR_CODE, size, size, hintMap);
//		// Make the BufferedImage that are to hold the QRCode
//		int matrixWidth = byteMatrix.getWidth();
//		BufferedImage image = new BufferedImage(matrixWidth, matrixWidth, BufferedImage.TYPE_INT_RGB);
//		image.createGraphics();
//
//		Graphics2D graphics = (Graphics2D) image.getGraphics();
//		graphics.setColor(Color.WHITE);
//		graphics.fillRect(0, 0, matrixWidth, matrixWidth);
//		// Paint and save the image using the ByteMatrix
//		graphics.setColor(Color.BLACK);
//
//		for (int i = 0; i < matrixWidth; i++) {
//			for (int j = 0; j < matrixWidth; j++) {
//				if (byteMatrix.get(i, j)) {
//					graphics.fillRect(i, j, 1, 1);
//				}
//			}
//		}
//		
//		ImageIO.write(image, fileType, qrFile);
//	}
		
	private String descargarFileXml(XmlVentaPasaje xmlVentaPasaje){
		String nameFile="";
		try {
			//Crea el archivo xml
			nameFile="4C608A6BF-";
						
			String carpetaEliminar = "";
			if(xmlVentaPasaje.getVenta()!=null){
				nameFile+=xmlVentaPasaje.getVenta().get(0).getV1_NumeroComprobante();
				carpetaEliminar = archivos_temp+nameFile;
			}else if(xmlVentaPasaje.getLiqTuentrada()!=null){
				DateFormat FORMAT_DATE_TIME_24H = new SimpleDateFormat ("yyyyMMdd HHmmss");
				nameFile+="LIQ-TUENTRADA "+FORMAT_DATE_TIME_24H.format(new Date());
				carpetaEliminar = archivos_temp+nameFile;
			}
			
			String pZipFile=archivos_temp+nameFile+".zip";
			String pathSavedXml=archivos_temp+nameFile;
			
			//Creando un directorio con el nombre del archivo
			File directory=new File(pathSavedXml);
			directory.mkdir();
			pathSavedXml=directory.getAbsolutePath()+Util.separator+nameFile+".xml";
			
			JAXBContext context = JAXBContext.newInstance(XmlVentaPasaje.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			FileOutputStream fos = new FileOutputStream(pathSavedXml);
			/**guardamos el objeto serializado en un documento XML*/
			try {
				marshaller.marshal(xmlVentaPasaje, fos);
				fos.close();
			} catch (Exception e) {
				fos.close();
			}
			
			/*Zipeamos el xml (Basicamente para reducir el tamanio)*/
			Util.Zippear(pathSavedXml, pZipFile, nameFile);			
			fos.flush();
			
			/* Convierte a Byte[] */
			byte[] ba = java.nio.file.Files.readAllBytes(Paths.get(pZipFile));
			
			/*Elimina el file.zip y la carpeta despues de 5 segundos*/
			Thread.sleep(500);
			FileUtils.deleteDirectory(new File(carpetaEliminar));
			File file_pZipFile = new File(pZipFile);
			file_pZipFile.delete();
			
			/* Convierte a Base64 y lo devuelve al Frontend */
			return new String(Base64.getEncoder().encodeToString(ba));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * Crea el objeto Venta para enviarla al WebService FE.
	 * @param ventaPasaje	: Instancia del Object VentaPasaje
	 * @return
	 * @throws Exception
	 */
	private static Venta createVenta(VentaPasajeSispas ventaPasaje)throws Exception{
		try {
			String serie=ventaPasaje.getNumeroBoleto().split("-")[0].toString();
			String correlativo=ventaPasaje.getNumeroBoleto().split("-")[1].toString();
			String fechaEmision="";
			
			Date date=new Date();
			fechaEmision=FORMAT_DATE.format(date);	
			
			Boolean isCortesia=ventaPasaje.getFormaPago().getId().intValue()==Constantes.ID_FORPAG_CORTESIA;
			// Datos del cliente pasajero
			String cliente_tipoDocumentoID = null;
			String cliente_nombres = null;
			String cliente_nroDocumento = null;
			String cliente_direccion = null;
			if(ventaPasaje.getCliente() != null){
				cliente_tipoDocumentoID=FE_TIPDOC_RUC;
				cliente_nombres=ventaPasaje.getCliente().getRazonSocial();
				cliente_nroDocumento=ventaPasaje.getCliente().getNumeroDocumento();
				cliente_direccion=ventaPasaje.getCliente().getDireccion();
			}else{
				switch (ventaPasaje.getPasajero().getTipoDocumento().getId().intValue()) {
				case Constantes.ID_TIPDOC_DNI:
					cliente_tipoDocumentoID=FE_TIPDOC_DNI;
					break;
				case Constantes.ID_TIPDOC_CARNET_EXTRANJERIA:
					cliente_tipoDocumentoID=FE_TIPDOC_CARNET_EXTRANEJERIA;
					break;
				case Constantes.ID_TIPDOC_PASAPORTE:
					cliente_tipoDocumentoID=FE_TIPDOC_PASAPORTE;
					break;
				case Constantes.ID_TIPDOC_CEDULA_IDENTIDAD:
					cliente_tipoDocumentoID=FE_TIPDOC_CEDULA_DIPLOMATICA_IDENTIDAD;
					break;
				default:
					break;
				}
				cliente_nombres=ventaPasaje.getPasajero().toString();
				cliente_nroDocumento=ventaPasaje.getPasajero().getNumeroDocumento();
			}
			// Tipo de comprobante
			String tipoComprobanteID=null;
			switch (ventaPasaje.getTipoComprobante().getId().intValue()) {
			case Constantes.ID_TIPCOM_BOLETA_VENTA:
				tipoComprobanteID=FE_TIPCOM_BOLETA;
				break;
			case Constantes.ID_TIPCOM_FACTURA:
				tipoComprobanteID=FE_TIPCOM_FACTURA;
				break;
			default:
				break;
			}
				
			Cliente cliente= new Cliente();
			cliente.setNombres(new JAXBElement<String>(new QName(NAMESPACE,"nombres"), String.class, cliente_nombres));
			cliente.setTipoDocumentoID(new JAXBElement<String>(new QName(NAMESPACE,"tipoDocumentoID"), String.class, cliente_tipoDocumentoID));
			cliente.setNumeroDocumento(new JAXBElement<String>(new QName(NAMESPACE,"numeroDocumento"), String.class, cliente_nroDocumento));
			cliente.setDireccion(new JAXBElement<String>(new QName(NAMESPACE,"direccion"), String.class, cliente_direccion));
			
			CompaniaSispas empresa = new MainDaoImpl().buscarCompaniaById(ventaPasaje.getEmpresa().getId().longValue());
			Venta venta= new Venta();
			venta.setRucEmpresa(new JAXBElement<String>(new QName(NAMESPACE, "rucEmpresa"), String.class, empresa.getNumeroDocumento()));
			venta.setTipoComprobanteID(new JAXBElement<String>(new QName(NAMESPACE,"tipoComprobanteID"), String.class, tipoComprobanteID));
			venta.setNumeroSerie(new JAXBElement<String>(new QName(NAMESPACE,"numeroSerie"), String.class, serie));
			venta.setNumeroCorrelativo(new JAXBElement<String>(new QName(NAMESPACE,"numeroCorrelativo"), String.class, autoCompletCorrelativo(correlativo)));
			venta.setTipoMonedaSoles(true);// dolares
			venta.setFechaEmision(new JAXBElement<String>(new QName(NAMESPACE,"fechaEmision"), String.class, fechaEmision));		
			// Validando si es una cortesia
			if(!(isCortesia)){
				if(ventaPasaje.getIgv() != null && ventaPasaje.getIgv().doubleValue()>0.00){
					venta.setIgv(ventaPasaje.getIgv());
					venta.setMontoSubTotal(ventaPasaje.getImportePagado()-ventaPasaje.getIgv());
					venta.setMontoTotal(ventaPasaje.getImportePagado());
				}else{
					venta.setMontoTotal(ventaPasaje.getImportePagado());
					venta.setMontoSubTotal(ventaPasaje.getImportePagado());	
				}
			}else{
				venta.setMontoTotal(0.00);
				venta.setIgv(0.00);
				venta.setMontoSubTotal(0.00);				
			}
			venta.setMontoTotalDescuento(0.00);
			venta.setCliente(new JAXBElement<Cliente>(new QName(NAMESPACE,"cliente"), Cliente.class, cliente));
			venta.setAgenciaID(ventaPasaje.getAgencia().getId().longValue());
			venta.setUsuarioID(ventaPasaje.getUsuario().getId().longValue());
			venta.setUsuarioInsercion(new JAXBElement<String>(new QName(NAMESPACE,"usuarioInsercion"), String.class, ventaPasaje.getUsuarioInsercion()));
			venta.setUsuarioModificacion(new JAXBElement<String>(new QName(NAMESPACE,"usuarioModificacion"), String.class, ventaPasaje.getUsuarioInsercion()));
			switch (ventaPasaje.getFormaPago().getId().intValue()) {
			case Constantes.ID_FORPAG_CONTADO:
				venta.setTipoVenta(FE_TIPO_VENTA_CONTADO);
				break;
			case Constantes.ID_FORPAG_CREDITO:
				if(ventaPasaje.getRucClienteCredito().equals("20547391501")
				|| ventaPasaje.getRucClienteCredito().equals("20555893052"))
					venta.setTipoVenta(FE_TIPO_VENTA_CONTADO);
				else {
					venta.setTipoVenta(FE_TIPO_VENTA_CREDITO);
					
					DetalleCuota detalleCuota = new DetalleCuota();
					detalleCuota.setNumeroCuota(1);
					detalleCuota.setAliasCuota(new JAXBElement<String>(new QName(NAMESPACE,"aliasCuota"), String.class, "Cuota001"));
					detalleCuota.setImporteCuota(ventaPasaje.getImportePagado());
					Calendar cal30days = Calendar.getInstance();
					cal30days.setTime(ventaPasaje.getFechaInsercion()); 
					cal30days.add(Calendar.DAY_OF_YEAR, 30); 
					detalleCuota.setFechaVencimiento(new JAXBElement<String>(new QName(NAMESPACE,"fechaVencimiento"), String.class,  new SimpleDateFormat ("yyyy-MM-dd").format(cal30days.getTime())));
				
					ArrayOfDetalleCuota arrayOfDetalleCuota = new ArrayOfDetalleCuota();
					arrayOfDetalleCuota.getDetalleCuota().add(detalleCuota);
					venta.setListDetalleCuota(new JAXBElement<ArrayOfDetalleCuota>(new QName(NAMESPACE,"listDetalleCuota"), ArrayOfDetalleCuota.class, arrayOfDetalleCuota));
				}
				
				break;
			case Constantes.ID_FORPAG_CORTESIA:
				venta.setTipoVenta(FE_TIPO_VENTA_CORTESIA);
				String observaciones="***CORTESIA POR "+ventaPasaje.getTipoFormaPago().getDenominacion()+"***";
				venta.setObservaciones(new JAXBElement<String>(new QName(NAMESPACE,"observaciones"), String.class, observaciones));
				break;
			default:
				venta.setTipoVenta(99);
			}
			
			// Valida si tiene centro de costo
			if(ventaPasaje.getCentroCosto()!=null){
				String centroCosto=ventaPasaje.getCentroCosto().getCodigo()+" - "+ventaPasaje.getCentroCosto().getDenominacion();
				venta.setCentroCosto(new JAXBElement<String>(new QName(NAMESPACE,"centroCosto"), String.class, centroCosto));
			}
			// Comprobante referencial
			if(ventaPasaje.getNumeroBoletoAnterior()!=null){
				DocumentoReferencia documentoReferencia= new DocumentoReferencia();
				documentoReferencia.setNumeroDocumento(new JAXBElement<String>(new QName(NAMESPACE,"NumeroDocumento"), String.class, ventaPasaje.getNumeroBoletoAnterior()));
				venta.setDocumentoReferencia(new JAXBElement<DocumentoReferencia>(new QName(NAMESPACE,"documentoReferencia"), DocumentoReferencia.class, documentoReferencia));
			}
			// Direccion de embarque			
			if(ventaPasaje.getAgenciaPartida()!=null){
				AgenciaSispas agenciaPartida=ventaPasaje.getAgenciaPartida();
				if(agenciaPartida.getDireccion()==null)
					agenciaPartida = new MainDaoImpl().buscarAgenciaById(agenciaPartida.getId().longValue());
				if(agenciaPartida.getDireccion()!=null)
					venta.setDireccionEmbarque(new JAXBElement<String>(new QName(NAMESPACE,"direccionEmbarque"), String.class, agenciaPartida.getDireccion()+" - "+(agenciaPartida.getUbigeo()!=null?agenciaPartida.getUbigeo().getNombreUbigeo():" ")));
				else
					venta.setDireccionEmbarque(new JAXBElement<String>(new QName(NAMESPACE,"direccionEmbarque"), String.class, "--"));
			}			
			
			/*=======================================================*/
			/*DETALLE DE LA VENTA*/
			/*=======================================================*/
//			Double totalOpGratuitas=.00;
			// acespedes 20/06/2019 autorizado por valeria darle mas detalles en el pdf FE
			DetalleVenta detalleVenta = createDetalleVenta(ventaPasaje, isCortesia,true);
			
			ArrayOfDetalleVenta arrayOfDetalleVenta= new ArrayOfDetalleVenta();
			arrayOfDetalleVenta.getDetalleVenta().add(detalleVenta);
			venta.setListDetalleVenta(new JAXBElement<ArrayOfDetalleVenta>(new QName(NAMESPACE,"listDetalleVenta"), ArrayOfDetalleVenta.class,arrayOfDetalleVenta));
			
			/*======================================================*/
	        /*-->Otros conceptos tributarios. (Cat. 14)*/
	        /*======================================================*/
			//Operaciones inafectas
			ArrayOfInformacionAdicionalTotalMonedaAdicional arrayTotalMonedaAdicional= new ArrayOfInformacionAdicionalTotalMonedaAdicional();
			InformacionAdicionalTotalMonedaAdicional totalMonedaAdicional= new InformacionAdicionalTotalMonedaAdicional();
			if(venta.getIgv()!=null && venta.getIgv().doubleValue()>0.00){
				totalMonedaAdicional.setCodigo(new JAXBElement<String>(new QName(NAMESPACE,"codigo"), String.class, "1001")); /*Segun catalogo 14*/
				totalMonedaAdicional.setNombre(new JAXBElement<String>(new QName(NAMESPACE,"nombre"), String.class, "TOTAL VALOR DE VENTA - OPERACIONES GRAVADAS"));
			}else{
				totalMonedaAdicional.setCodigo(new JAXBElement<String>(new QName(NAMESPACE,"codigo"), String.class, "1003")); /*Segun catalogo 14*/
				totalMonedaAdicional.setNombre(new JAXBElement<String>(new QName(NAMESPACE,"nombre"), String.class, "TOTAL VALOR DE VENTA - OPERACIONES EXONERADAS"));
			}
			totalMonedaAdicional.setValor(new JAXBElement<String>(new QName(NAMESPACE,"valor"), String.class, Util.toNumberFormat(venta.getMontoSubTotal(),2))); /*(no incluye impuesto)*/
			arrayTotalMonedaAdicional.getInformacionAdicionalTotalMonedaAdicional().add(totalMonedaAdicional);
			
			//Si es cortesia
			if(isCortesia){
				totalMonedaAdicional= new InformacionAdicionalTotalMonedaAdicional();
				totalMonedaAdicional.setCodigo(new JAXBElement<String>(new QName(NAMESPACE,"codigo"), String.class, "1004")); /*Segun catalogo 14*/
				totalMonedaAdicional.setNombre(new JAXBElement<String>(new QName(NAMESPACE,"nombre"), String.class, "TOTAL VALOR DE VENTA - OPERACIONES GRATUITAS"));
				totalMonedaAdicional.setValor(new JAXBElement<String>(new QName(NAMESPACE,"valor"), String.class, Util.toNumberFormat(ventaPasaje.getTarifa(),2))); // 17/06/2019 cambios x giovanna
				arrayTotalMonedaAdicional.getInformacionAdicionalTotalMonedaAdicional().add(totalMonedaAdicional);
			}
			
			/*========================================================================*/
	        /*-->Elementos adicionales de la Factura y/o Boleta electronica. (Cat. 15)*/
	        /*========================================================================*/
			ArrayOfInformacionAdicionalPropiedadAdicional arrayPropiedadAdicional= new ArrayOfInformacionAdicionalPropiedadAdicional();
			if(!(isCortesia)){
				InformacionAdicionalPropiedadAdicional propiedadAdicional= new InformacionAdicionalPropiedadAdicional();
				propiedadAdicional.setCodigo(new JAXBElement<String>(new QName(NAMESPACE,"codigo"), String.class, "1000")); //Segun catalogo 15 (monto en letras)
				propiedadAdicional.setNombre(new JAXBElement<String>(new QName(NAMESPACE,"nombre"), String.class, "MONTO EN LETRAS"));
				propiedadAdicional.setValue(new JAXBElement<String>(new QName(NAMESPACE,"value"), String.class, getMontoLetras(venta.getMontoTotal())));
				arrayPropiedadAdicional.getInformacionAdicionalPropiedadAdicional().add(propiedadAdicional);
			}else{
				InformacionAdicionalPropiedadAdicional propiedadAdicional= new InformacionAdicionalPropiedadAdicional();
				propiedadAdicional.setCodigo(new JAXBElement<String>(new QName(NAMESPACE,"codigo"), String.class, "1002")); //Segun catalogo 15 (monto en letras)
				propiedadAdicional.setNombre(new JAXBElement<String>(new QName(NAMESPACE,"nombre"), String.class, "TRANSFERENCIA GRATUITA"));
				propiedadAdicional.setValue(new JAXBElement<String>(new QName(NAMESPACE,"value"), String.class, "TRANSFERENCIA GRATUITA DE UN BIEN Y/O SERVICIO PRESTADO GRATUITAMENTE"));
				arrayPropiedadAdicional.getInformacionAdicionalPropiedadAdicional().add(propiedadAdicional);
			}
			
			InformacionAdicional informacionAdicional= new InformacionAdicional();
			informacionAdicional.setTotalesMonedaAdicional(new JAXBElement<ArrayOfInformacionAdicionalTotalMonedaAdicional>(new QName(NAMESPACE,"TotalesMonedaAdicional"), ArrayOfInformacionAdicionalTotalMonedaAdicional.class, arrayTotalMonedaAdicional));
			informacionAdicional.setPropiedadesAdicionales(new JAXBElement<ArrayOfInformacionAdicionalPropiedadAdicional>(new QName(NAMESPACE,"PropiedadesAdicionales"), ArrayOfInformacionAdicionalPropiedadAdicional.class, arrayPropiedadAdicional));
			
			venta.setInformacionAdicional(new JAXBElement<InformacionAdicional>(new QName(NAMESPACE,"informacionAdicional"), InformacionAdicional.class,informacionAdicional));
			
			return venta;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private static String getMontoLetras(Double importe)throws Exception{
		/*Monto en letras*/
		String strImportePagado = Util.toNumberFormat(importe, 2);
		int indice = strImportePagado.lastIndexOf(".");
		ConvertirNumeroString num = new ConvertirNumeroString();
		String strEnLetras = num.convertirLetras(importe.intValue()).toUpperCase()+" CON " + strImportePagado.substring(indice+1) + "/100 SOLES";
		
		return strEnLetras;
	}
	
	/**
	 * Completa el numero de digitos del correlativo a 8 digitos.
	 * @param correlativo	: NÃºmere de correlativo.
	 * @return	Correlativo formateado a 8 digitos.
	 * @throws Exception
	 */
	private static String autoCompletCorrelativo(String correlativo)throws Exception{
		String _correlativo= "00000000" + correlativo;
		_correlativo = _correlativo.substring(correlativo.toString().length(), _correlativo.length());

    	return _correlativo;
	}
	
	/**
	 * Obtiene la hora real del embarque del pasajero
	 * @param ventaPasaje : Intancia de la clase VentaPasaje
	 * @return
	 */
	private static String getHoraRealEmbarque(VentaPasajeSispas ventaPasaje){
		/*Obtiene la hora real de embarque del pasajero*/
		String horaRealEmbarque=null;
		if(ventaPasaje.getFechaPartida()==null)
			horaRealEmbarque = "";
		else{
			if(ventaPasaje.getItinerario()!=null)
				horaRealEmbarque = obtenerHoraEmbarque(ventaPasaje.getItinerario().getId(), ventaPasaje.getRuta().getId(), ventaPasaje.getAgenciaPartida().getId());
			else
				horaRealEmbarque = ventaPasaje.getHoraEmbarque();
		}
		String strHoraPartida = (horaRealEmbarque == null?ventaPasaje.getHoraPartida():horaRealEmbarque);
		
		return strHoraPartida;
	}
	
	/**
	 * Busca la hora de embarque segun el itinerario y agencia de partida.
	 * @param idItinerario	: Identificador del Itienrario
	 * @param idAgencia     : Identificador de la agencia de partida. 
	 * @return
	 */
	private static String obtenerHoraEmbarque(Long idItinerario, Integer idRuta, Integer idAgencia){
		String result = null;
		try{
			ItinerarioAgenciaPartidaIDSispas itinerarioAgenciaPartidaID = new ItinerarioAgenciaPartidaIDSispas();
			itinerarioAgenciaPartidaID.setIdItinerario(idItinerario);
			itinerarioAgenciaPartidaID.setIdAgencia(idAgencia);
			result = new MainDaoImpl().obtenerHoraEmbarque(itinerarioAgenciaPartidaID, idRuta);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return result;
	}
	
//	@Transactional
//	private XmlVentaPasaje createXmlVenta(List<VentaPasajeSispas> listVentaPasaje)throws Exception{
//		try {
//			XmlVentaPasaje xmlVentaPasaje= null;
//			
//			List<XmlVenta> listXmlVenta= new ArrayList<XmlVenta>();
//			for(VentaPasajeSispas ventaPasaje: listVentaPasaje){
//				int tipoComprobanteId=ventaPasaje.getTipoComprobante().getId();
//				if(tipoComprobanteId==Constantes.ID_TIPCOM_BOLETA_VENTA || tipoComprobanteId==Constantes.ID_TIPCOM_FACTURA || tipoComprobanteId==Constantes.ID_TIPCOM_VOUCHER_AGENCIA_VIAJES){
//						// Valida el tipo de comprobante
//						String cryptoBarcodeSunat=null;
//						String cryptoRptFormat=null;
//						String cryptoCodeQR=null;
//						if(tipoComprobanteId!=Constantes.ID_TIPCOM_VOUCHER_AGENCIA_VIAJES){
//							//Encripta el los bytes del codigo de barras - Sunat;
//							Result resultVenta=ventaPasaje.getResult();
//							if(resultVenta.getBarcodeQR() != null){
//								cryptoCodeQR = new BASE64Encoder().encode(resultVenta.getBarcodeQR().getValue());
//							}
//							//Encripta en bytes del .rpt;
//							
//							String comPl=null;
//							if(ventaPasaje.getEmpresa().getId().intValue()==Constantes.ID_EMPRESA_MOVIL_BUS)
//								comPl="_MB.rpt";
//							else if (ventaPasaje.getEmpresa().getId().intValue()==Constantes.ID_EMPRESA_MOVIL_TOURS)
//								comPl="_MT.rpt";
//							else
//								break;
//							
//							String pathRpt=null;
//							String directorio = "//opt//tomcat9//webapps//backendAutoservicio//formatTicket//";
//							
//							Path path = null;
//							
//							if(tipoComprobanteId==Constantes.ID_TIPCOM_BOLETA_VENTA){
//								if(ventaPasaje.getTipoMovimiento().getId().intValue()==Constantes.ID_TIPMOV_GASTOS_ADMINISTRATIVOS)
//									path = Paths.get(directorio+"GABoleta"+comPl);
//								else
//									path = Paths.get(directorio+"Boleta"+comPl);
//							}else{
//								if(ventaPasaje.getTipoMovimiento().getId().intValue()==Constantes.ID_TIPMOV_GASTOS_ADMINISTRATIVOS)
//									path = Paths.get(directorio+"GAFactura"+comPl);
//								else
//									path = Paths.get(directorio+"Factura"+comPl);
//							}
//							
//							byte[] contenido = java.nio.file.Files.readAllBytes(path);
//							cryptoRptFormat=new BASE64Encoder().encode(contenido);
//						}
//											
//						//  Pasajero
//						XmlPasajero xmlPasajero= new XmlPasajero();
//						xmlPasajero.setV1_TipoDocumento(ventaPasaje.getPasajero().getTipoDocumento().getDenominacion());
//						xmlPasajero.setV2_NumeroDocumento(ventaPasaje.getPasajero().getNumeroDocumento());
//						xmlPasajero.setV3_NombresApellidos(ventaPasaje.getPasajero().toString());
//						
//						// Cliente
//						XmlCliente xmlCliente= null;
//						if(ventaPasaje.getCliente()!=null){
//							xmlCliente= new XmlCliente(); 
//							xmlCliente.setV1_Ruc(ventaPasaje.getCliente().getNumeroDocumento());
//							xmlCliente.setV2_RazonSozial(ventaPasaje.getCliente().toString());
//							xmlCliente.setV3_DireccionLegal(ventaPasaje.getCliente().getDireccion());
//						}
//						
//						// VentaPasaje
//						XmlVenta xmlVenta= new XmlVenta();
//						xmlVenta.setV1_NumeroComprobante(ventaPasaje.getNumeroBoleto());
//						xmlVenta.setV2_Origen(ventaPasaje.getRuta().getOrigen());
//						xmlVenta.setV3_Destino(ventaPasaje.getRuta().getDestino());
//						
//						if(ventaPasaje.getAgenciaPartida()!=null){
//							AgenciaSispas agenciaPartida=ventaPasaje.getAgenciaPartida();
//							if(agenciaPartida.getDireccion()==null)
//								agenciaPartida=new MainDaoImpl().buscarAgenciaById(agenciaPartida.getId().longValue());
//							xmlVenta.setV4_Embarque(agenciaPartida.getDireccion()+" - "+(agenciaPartida.getUbigeo()!=null?agenciaPartida.getUbigeo().getNombreUbigeo():""));	
//						}
//						
//						if(ventaPasaje.getAgenciaLlegada()!=null){
//							AgenciaSispas agenciaLlegada=ventaPasaje.getAgenciaLlegada();
//							if(agenciaLlegada.getDireccion()==null)
//								agenciaLlegada=new MainDaoImpl().buscarAgenciaById(agenciaLlegada.getId().longValue());
//							xmlVenta.setV5_Desembarque(agenciaLlegada.getDireccion());
//						}
//						
//						xmlVenta.setV6_FechaPartida(ventaPasaje.getFechaPartida()!=null?Constantes.FORMAT_DATE.format(ventaPasaje.getFechaPartida()):null);
//						xmlVenta.setV7_HoraPartida(getHoraRealEmbarque(ventaPasaje));					
//						xmlVenta.setV8_Asiento(ventaPasaje.getNumeroAsiento()!=null?ventaPasaje.getNumeroAsiento().toString():null);					
//						xmlVenta.setV90_Piso(ventaPasaje.getNumeroPiso()!=null?ventaPasaje.getNumeroPiso().intValue()<=0?"1":"2":null);		
//						xmlVenta.setV91_Pasajero(xmlPasajero);
//						xmlVenta.setV92_Cliente(xmlCliente);
//						xmlVenta.setV96_OpInafecta("0.00");
//						// Valida si es cortesia
//						if(ventaPasaje.getFormaPago().getId().intValue()==Constantes.ID_FORPAG_CORTESIA){
//							xmlVenta.setV94_OpGratuita(Util.toNumberFormat(ventaPasaje.getTarifa(),2));
//							xmlVenta.setV95_OpExonerada("0.00");
//							xmlVenta.setV97_OpGravada("0.00");
//							xmlVenta.setV98_Igv("0.00");
//							xmlVenta.setV991_ImporteTotalLetras("TRANSFERENCIA GRATUITA DE UN BIEN Y/O SERVICIO PRESTADO GRATUITAMENTE");						
//							xmlVenta.setV990_ImporteTotal("0.00");
//						}else{						
//								xmlVenta.setV94_OpGratuita("0.00");
//								//  gravada
//								if(ventaPasaje.getIgv() != null &&  ventaPasaje.getIgv().doubleValue()>0.00){
//									xmlVenta.setV95_OpExonerada("0.00");
//									xmlVenta.setV97_OpGravada(Util.toNumberFormat((ventaPasaje.getImportePagado()-ventaPasaje.getIgv()),2));
//									xmlVenta.setV98_Igv(Util.toNumberFormat(ventaPasaje.getIgv(),2));								
//								}else{ // exonerada
//									   xmlVenta.setV95_OpExonerada(Util.toNumberFormat(ventaPasaje.getImportePagado(),2));
//									   xmlVenta.setV97_OpGravada("0.00");
//									   xmlVenta.setV98_Igv("0.00");
//								}
//								
//								xmlVenta.setV990_ImporteTotal(Util.toNumberFormat(ventaPasaje.getImportePagado(),2));
//								xmlVenta.setV991_ImporteTotalLetras(getMontoLetras(ventaPasaje.getImportePagado()));
//						}
//						
//						
//						if(ventaPasaje.getFormaPago().getId().intValue()==Constantes.ID_FORPAG_CONTADO && ventaPasaje.getTipoFormaPago().getId().intValue()==Constantes.ID_TIPFORPAG_TARJETA){
//							OperadorTarjetaCreditoSispas operadorTarjetaCredito=new MainDaoImpl().buscarOpeTarCreById(ventaPasaje.getTarjetaCredito().getOperadorTarjetaCredito().getId().longValue());
//							String formaPago="TARJETA " + ventaPasaje.getTarjetaCredito().getDenominacion()+" - "+operadorTarjetaCredito.getDenominacion();
//							xmlVenta.setV992_PartPage4("PAGO CON : "+formaPago);
//						}else if (ventaPasaje.getFormaPago().getId().intValue()==Constantes.ID_FORPAG_CONTADO)
//							xmlVenta.setV992_PartPage4("PAGO CON : "+ventaPasaje.getTipoFormaPago().getDenominacion());
//						else if (ventaPasaje.getFormaPago().getId().intValue()==Constantes.ID_FORPAG_CREDITO){
//							if(ventaPasaje.getCanalVenta().getId().intValue()==Constantes.ID_CANVEN_AGENCIA_VIAJES ||
//									ventaPasaje.getCanalVenta().getId().intValue()==Constantes.ID_CANVEN_WEB)
//								xmlVenta.setV992_PartPage4("FORMA PAGO : CONTADO");
//							else
//								xmlVenta.setV992_PartPage4("FORMA PAGO : CREDITO");
//						}else{
//							xmlVenta.setV992_PartPage4("***CORTESIA POR "+ventaPasaje.getTipoFormaPago().getDenominacion()+"***");
//							xmlVenta.setV0_ObserImport("***CORTESIA POR "+ventaPasaje.getTipoFormaPago().getDenominacion()+"***");
//						}
//						
//						/*Centro de costo del cliente*/
//						if(ventaPasaje.getCentroCosto()!=null)
//							xmlVenta.setV992_CentroCosto(ventaPasaje.getCentroCosto().getCodigo()+" - "+ventaPasaje.getCentroCosto().getDenominacion());
//						
//						/*Numero de comprobante referencial*/
//						if(ventaPasaje.getNumeroBoletoAnterior()!=null){
//							String at=xmlVenta.getV992_PartPage4();
//							xmlVenta.setV992_PartPage4(at+"\n"+"COMP. REF.: "+ventaPasaje.getNumeroBoletoAnterior().toUpperCase());
//						}
//	
//						if(ventaPasaje.getFechaInsercion()==null)
//							ventaPasaje.setFechaInsercion(new Date());
//						xmlVenta.setV993_FechaEmision(Constantes.FORMAT_DATE_TIME_24H.format(ventaPasaje.getFechaInsercion()));
//						xmlVenta.setV994_AgenciaEmison(ventaPasaje.getAgencia().getDenominacion());
//						xmlVenta.setV995_UsuarioEmision(ventaPasaje.getUsuario().toString());
//						xmlVenta.setZ_CodigoBarraSunat(cryptoBarcodeSunat);
//						xmlVenta.setZ_ticket(cryptoRptFormat);
//						xmlVenta.setZ_QR(cryptoCodeQR);
//						
//						/*Armando el detalle*/
//						Boolean isCortesia=ventaPasaje.getFormaPago().getId().intValue()==Constantes.ID_FORPAG_CORTESIA;
//						List<XmlItem> xmlItems= new ArrayList<XmlItem>();
//						DetalleVenta detalleVenta=createDetalleVenta(ventaPasaje, isCortesia,false);
//						
//						XmlItem xmlItem= new XmlItem();
//						xmlItem.setV1_DetalleServicio(detalleVenta.getDescripcion().getValue());
//						xmlItem.setV2_Cantidad(Integer.valueOf(detalleVenta.getCantidad().intValue()).toString());
//						xmlItem.setV3_Tarifa(Util.toNumberFormat(detalleVenta.getTarifa(), 2));
//						xmlItems.add(xmlItem);
//						XmlDetalleVentaPasajes detalleVentaPasajes= new XmlDetalleVentaPasajes();
//						detalleVentaPasajes.setItem(xmlItems);
//						
//						xmlVenta.setV93_DetalleVentaPasajes(detalleVentaPasajes);
//						
//						listXmlVenta.add(xmlVenta);
//				}
//			}
//			
//			if(listXmlVenta.size()>0){
//				xmlVentaPasaje= new XmlVentaPasaje();
//				xmlVentaPasaje.setVenta(listXmlVenta);				
//			}
//				
//			return xmlVentaPasaje;
//		} catch (Exception e) {
//			e.printStackTrace();			
//			return null;
//		}
//	}
	
	@Transactional
	private XmlVentaPasaje createXmlVentaSinFE(List<VentaPasajeSispas> listVentaPasaje)throws Exception{
		try {
			XmlVentaPasaje xmlVentaPasaje= null;
			
			List<XmlVenta> listXmlVenta= new ArrayList<XmlVenta>();
			for(VentaPasajeSispas ventaPasaje: listVentaPasaje){
				int tipoComprobanteId=ventaPasaje.getTipoComprobante().getId();
				if(tipoComprobanteId==Constantes.ID_TIPCOM_BOLETA_VENTA || tipoComprobanteId==Constantes.ID_TIPCOM_FACTURA || tipoComprobanteId==Constantes.ID_TIPCOM_VOUCHER_AGENCIA_VIAJES){
						// Valida el tipo de comprobante
						String cryptoBarcodeSunat=null;
						String cryptoRptFormat=null;
						String cryptoCodeQR=null;
						String qrCodeText=null;
						if(tipoComprobanteId!=Constantes.ID_TIPCOM_VOUCHER_AGENCIA_VIAJES){
							//Encripta el los bytes del codigo de barras - Sunat;
							
							/**************************** CREAR IMG QR ****************************/							
							//Timestamp stamp = new Timestamp(Long.valueOf(ventaPasaje.getFechaInsercion()));
							//Date date = new Date(stamp.getTime());
							Date date = new Date();
						    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
						    String fechaInsercion = formatter.format(date);
							
							//ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
							//String json = ow.writeValueAsString(ventaPasaje);
							//System.out.println(json);
						    
						    String tipo_documento_sunat = "";
						    if(ventaPasaje.getCliente() != null){
						    	tipo_documento_sunat = "01";
						    }else{
						    	tipo_documento_sunat = "03";
						    }
							
							//String qrCodeText = "20555901179|03|BB80|00585421|0|125.00|2024-10-22|1|76373579|";
							qrCodeText = Constantes.RUC_MOVIL_BUS+"|"+tipo_documento_sunat+"|"+ventaPasaje.getNumeroBoleto().replaceAll("-", "|")+"|0|"+ventaPasaje.getImportePagado()+"|"+fechaInsercion+"|1|"+ventaPasaje.getPasajero().getNumeroDocumento()+"|";
							
							//String filePath = "D:\\Proyecto MovilBus\\backend_autoservicio\\src\\main\\webapp\\archivos_temp\\QR_TEMP.jpg";
							//String filePath = "//opt//tomcat9//webapps//backendAutoservicio//archivos_temp//QR_TEMP.jpg";							//@elujan --
							
							/*int size = 205;
							String fileType = "jpg";
							File qrFile = new File(filePath);
							createQRImage(qrFile, qrCodeText, size, fileType);
							
							BufferedImage originalImage=ImageIO.read(new File(filePath));
							ByteArrayOutputStream baos=new ByteArrayOutputStream();
							ImageIO.write(originalImage, "jpg", baos);
							byte[] imageInByte = baos.toByteArray();
							
							cryptoCodeQR = new BASE64Encoder().encode(imageInByte);
							
							Thread.sleep(500);
							
							File file_pZipFile = new File(filePath);
							file_pZipFile.delete();*/
							/**************************** CREAR IMG QR ****************************/
							//Encripta en bytes del .rpt;
							
							String comPl=null;
							if(ventaPasaje.getEmpresa().getId().intValue()==Constantes.ID_EMPRESA_MOVIL_BUS)
								comPl="_MB.rpt";
							else if (ventaPasaje.getEmpresa().getId().intValue()==Constantes.ID_EMPRESA_MOVIL_TOURS)
								comPl="_MT.rpt";
							else
								break;
																					
							Path path = null;
							
							if(tipoComprobanteId==Constantes.ID_TIPCOM_BOLETA_VENTA){
								if(ventaPasaje.getTipoMovimiento().getId().intValue()==Constantes.ID_TIPMOV_GASTOS_ADMINISTRATIVOS)
									path = Paths.get(directorio_formatTicket+"GABoleta"+comPl);
								else
									path = Paths.get(directorio_formatTicket+"Boleta"+comPl);
							}else{
								if(ventaPasaje.getTipoMovimiento().getId().intValue()==Constantes.ID_TIPMOV_GASTOS_ADMINISTRATIVOS)
									path = Paths.get(directorio_formatTicket+"GAFactura"+comPl);
								else
									path = Paths.get(directorio_formatTicket+"Factura"+comPl);
							}
							
							byte[] contenido = java.nio.file.Files.readAllBytes(path);
							cryptoRptFormat=new BASE64Encoder().encode(contenido);
						}
											
						//  Pasajero
						XmlPasajero xmlPasajero= new XmlPasajero();
						xmlPasajero.setV1_TipoDocumento(ventaPasaje.getPasajero().getTipoDocumento().getDenominacion());
						xmlPasajero.setV2_NumeroDocumento(ventaPasaje.getPasajero().getNumeroDocumento());
						xmlPasajero.setV3_NombresApellidos(ventaPasaje.getPasajero().toString());
						
						// Cliente
						XmlCliente xmlCliente= null;
						if(ventaPasaje.getCliente()!=null){
							xmlCliente= new XmlCliente(); 
							xmlCliente.setV1_Ruc(ventaPasaje.getCliente().getNumeroDocumento());
							xmlCliente.setV2_RazonSozial(ventaPasaje.getCliente().toString());
							xmlCliente.setV3_DireccionLegal(ventaPasaje.getCliente().getDireccion());
						}
						
						// VentaPasaje
						XmlVenta xmlVenta= new XmlVenta();
						xmlVenta.setV1_NumeroComprobante(ventaPasaje.getNumeroBoleto());
						xmlVenta.setV2_Origen(ventaPasaje.getRuta().getOrigen());
						xmlVenta.setV3_Destino(ventaPasaje.getRuta().getDestino());
						
						if(ventaPasaje.getAgenciaPartida()!=null){
							AgenciaSispas agenciaPartida=ventaPasaje.getAgenciaPartida();
							if(agenciaPartida.getDireccion()==null)
								agenciaPartida=new MainDaoImpl().buscarAgenciaById(agenciaPartida.getId().longValue());
							xmlVenta.setV4_Embarque(agenciaPartida.getDireccion()+" - "+(agenciaPartida.getUbigeo()!=null?agenciaPartida.getUbigeo().getNombreUbigeo():""));	
						}
						
						if(ventaPasaje.getAgenciaLlegada()!=null){
							AgenciaSispas agenciaLlegada=ventaPasaje.getAgenciaLlegada();
							if(agenciaLlegada.getDireccion()==null)
								agenciaLlegada=new MainDaoImpl().buscarAgenciaById(agenciaLlegada.getId().longValue());
							xmlVenta.setV5_Desembarque(agenciaLlegada.getDireccion());
						}
						
						xmlVenta.setV6_FechaPartida(ventaPasaje.getFechaPartida()!=null?Constantes.FORMAT_DATE.format(ventaPasaje.getFechaPartida()):null);
						xmlVenta.setV7_HoraPartida(getHoraRealEmbarque(ventaPasaje));					
						xmlVenta.setV8_Asiento(ventaPasaje.getNumeroAsiento()!=null?ventaPasaje.getNumeroAsiento().toString():null);					
						xmlVenta.setV90_Piso(ventaPasaje.getNumeroPiso()!=null?ventaPasaje.getNumeroPiso().intValue()<=0?"1":"2":null);		
						xmlVenta.setV91_Pasajero(xmlPasajero);
						xmlVenta.setV92_Cliente(xmlCliente);
						xmlVenta.setV96_OpInafecta("0.00");
						// Valida si es cortesia
						if(ventaPasaje.getFormaPago().getId().intValue()==Constantes.ID_FORPAG_CORTESIA){
							xmlVenta.setV94_OpGratuita(Util.toNumberFormat(ventaPasaje.getTarifa(),2));
							xmlVenta.setV95_OpExonerada("0.00");
							xmlVenta.setV97_OpGravada("0.00");
							xmlVenta.setV98_Igv("0.00");
							xmlVenta.setV991_ImporteTotalLetras("TRANSFERENCIA GRATUITA DE UN BIEN Y/O SERVICIO PRESTADO GRATUITAMENTE");						
							xmlVenta.setV990_ImporteTotal("0.00");
						}else{						
								xmlVenta.setV94_OpGratuita("0.00");
								//  gravada
								if(ventaPasaje.getIgv() != null &&  ventaPasaje.getIgv().doubleValue()>0.00){
									xmlVenta.setV95_OpExonerada("0.00");
									xmlVenta.setV97_OpGravada(Util.toNumberFormat((ventaPasaje.getImportePagado()-ventaPasaje.getIgv()),2));
									xmlVenta.setV98_Igv(Util.toNumberFormat(ventaPasaje.getIgv(),2));								
								}else{ // exonerada
									   xmlVenta.setV95_OpExonerada(Util.toNumberFormat(ventaPasaje.getImportePagado(),2));
									   xmlVenta.setV97_OpGravada("0.00");
									   xmlVenta.setV98_Igv("0.00");
								}
								
								xmlVenta.setV990_ImporteTotal(Util.toNumberFormat(ventaPasaje.getImportePagado(),2));
								xmlVenta.setV991_ImporteTotalLetras(getMontoLetras(ventaPasaje.getImportePagado()));
						}
						
						
						if(ventaPasaje.getFormaPago().getId().intValue()==Constantes.ID_FORPAG_CONTADO && ventaPasaje.getTipoFormaPago().getId().intValue()==Constantes.ID_TIPFORPAG_TARJETA){
							OperadorTarjetaCreditoSispas operadorTarjetaCredito=new MainDaoImpl().buscarOpeTarCreById(ventaPasaje.getTarjetaCredito().getOperadorTarjetaCredito().getId().longValue());
							String formaPago="TARJETA " + ventaPasaje.getTarjetaCredito().getDenominacion()+" - "+operadorTarjetaCredito.getDenominacion();
							xmlVenta.setV992_PartPage4("PAGO CON : "+formaPago);
						}else if (ventaPasaje.getFormaPago().getId().intValue()==Constantes.ID_FORPAG_CONTADO)
							xmlVenta.setV992_PartPage4("PAGO CON : "+ventaPasaje.getTipoFormaPago().getDenominacion());
						else if (ventaPasaje.getFormaPago().getId().intValue()==Constantes.ID_FORPAG_CREDITO){
							if(ventaPasaje.getCanalVenta().getId().intValue()==Constantes.ID_CANVEN_AGENCIA_VIAJES ||
									ventaPasaje.getCanalVenta().getId().intValue()==Constantes.ID_CANVEN_WEB)
								xmlVenta.setV992_PartPage4("FORMA PAGO : CONTADO");
							else
								xmlVenta.setV992_PartPage4("FORMA PAGO : CREDITO");
						}else{
							xmlVenta.setV992_PartPage4("***CORTESIA POR "+ventaPasaje.getTipoFormaPago().getDenominacion()+"***");
							xmlVenta.setV0_ObserImport("***CORTESIA POR "+ventaPasaje.getTipoFormaPago().getDenominacion()+"***");
						}
						
						/*Centro de costo del cliente*/
						if(ventaPasaje.getCentroCosto()!=null)
							xmlVenta.setV992_CentroCosto(ventaPasaje.getCentroCosto().getCodigo()+" - "+ventaPasaje.getCentroCosto().getDenominacion());
						
						/*Numero de comprobante referencial*/
						if(ventaPasaje.getNumeroBoletoAnterior()!=null){
							String at=xmlVenta.getV992_PartPage4();
							xmlVenta.setV992_PartPage4(at+"\n"+"COMP. REF.: "+ventaPasaje.getNumeroBoletoAnterior().toUpperCase());
						}
	
						if(ventaPasaje.getFechaInsercion()==null)
							ventaPasaje.setFechaInsercion(new Date());
						xmlVenta.setV993_FechaEmision(Constantes.FORMAT_DATE_TIME_24H.format(ventaPasaje.getFechaInsercion()));
						xmlVenta.setV994_AgenciaEmison(ventaPasaje.getAgencia().getDenominacion());
						xmlVenta.setV995_UsuarioEmision(ventaPasaje.getUsuario().toString());
						xmlVenta.setZ_CodigoBarraSunat(cryptoBarcodeSunat);
						xmlVenta.setZ_ticket(cryptoRptFormat);
						//xmlVenta.setZ_QR(cryptoCodeQR);
						xmlVenta.setZ_QrValue(qrCodeText);
						
						/*Armando el detalle*/
						Boolean isCortesia=ventaPasaje.getFormaPago().getId().intValue()==Constantes.ID_FORPAG_CORTESIA;
						List<XmlItem> xmlItems= new ArrayList<XmlItem>();
						DetalleVenta detalleVenta=createDetalleVenta(ventaPasaje, isCortesia,false);
						
						XmlItem xmlItem= new XmlItem();
						xmlItem.setV1_DetalleServicio(detalleVenta.getDescripcion().getValue());
						xmlItem.setV2_Cantidad(Integer.valueOf(detalleVenta.getCantidad().intValue()).toString());
						xmlItem.setV3_Tarifa(Util.toNumberFormat(detalleVenta.getTarifa(), 2));
						xmlItems.add(xmlItem);
						XmlDetalleVentaPasajes detalleVentaPasajes= new XmlDetalleVentaPasajes();
						detalleVentaPasajes.setItem(xmlItems);
						
						xmlVenta.setV93_DetalleVentaPasajes(detalleVentaPasajes);
						
						listXmlVenta.add(xmlVenta);
				}
			}
			
			if(listXmlVenta.size()>0){
				xmlVentaPasaje= new XmlVentaPasaje();
				xmlVentaPasaje.setVenta(listXmlVenta);				
			}
				
			return xmlVentaPasaje;
		} catch (Exception e) {
			e.printStackTrace();			
			return null;
		}
	}
	
	private static DetalleVenta createDetalleVenta(VentaPasajeSispas ventaPasaje, boolean isCortesia, boolean isMasDetallado) throws Exception {
		String descripMovi="";
		if(ventaPasaje.getTipoMovimiento().getId().intValue()==Constantes.ID_TIPMOV_EFECTIVO)		
			descripMovi="VTA. PASAJE:";
		else
			descripMovi=ventaPasaje.getTipoMovimiento().getDenominacion().trim();
		
		String pasajero=ventaPasaje.getPasajero().toString().trim();
		if(pasajero.length()>30)
			pasajero=pasajero.substring(0, 30);
		String tipoDocumento=ventaPasaje.getPasajero().getTipoDocumento().getNombreCorto().trim();
		//String tipoDocumento=ventaPasaje.getPasajero().getTipoDocumento().getDenominacion().trim();
		if(tipoDocumento.length()>10)
			tipoDocumento=tipoDocumento.substring(0, 10);
		
		/*la Descripcion del Detalle*/
		String descripcionPrincipal="";
		if(ventaPasaje.getTipoMovimiento().getId().intValue()!=Constantes.ID_TIPMOV_GASTOS_ADMINISTRATIVOS){
			String servicio=ventaPasaje.getServicio().getNombreCorto().trim();
			/*Obtiene la hora real del embarque*/
			String strHoraPartida=getHoraRealEmbarque(ventaPasaje);
			
			descripcionPrincipal= descripMovi+"\n"+
					 "[PAX:"+pasajero+"] ["+tipoDocumento+":"+ventaPasaje.getPasajero().getNumeroDocumento().trim()+"]\n"+
					 "[RUTA:"+ventaPasaje.getRuta().toString().trim()+"]\n"+
					 "[SERV:"+servicio+"]\n"+
					 "[ASIENTO:"+(ventaPasaje.getNumeroAsiento()!=null?ventaPasaje.getNumeroAsiento():"")+"]\n"+
					 "[FECHA:"+(ventaPasaje.getFechaPartida()!=null?Constantes.FORMAT_DATE.format(ventaPasaje.getFechaPartida()):"")+"] [HORA:"+strHoraPartida+"]";
				
			if(isMasDetallado){
				descripcionPrincipal += "\n";
				// descripcion del embarque
				if(ventaPasaje.getAgenciaPartida()!=null){

					AgenciaSispas agPartida=ventaPasaje.getAgenciaPartida();
					if(agPartida.getDireccion()==null)
						agPartida = new MainDaoImpl().buscarAgenciaById(agPartida.getId().longValue());
					
					descripcionPrincipal += "[EMBARQUE:"+agPartida.getDireccion()+" - "
														+(agPartida.getUbigeo()!=null?agPartida.getUbigeo().getNombreUbigeo():"")+"]\n";
				}else descripcionPrincipal += "[EMBARQUE:]\n";

				if(ventaPasaje.getAgenciaLlegada()!=null){
					
					AgenciaSispas agLlegada=ventaPasaje.getAgenciaLlegada();
					if(agLlegada.getDireccion()==null)
						agLlegada = new MainDaoImpl().buscarAgenciaById(agLlegada.getId().longValue());
					
					descripcionPrincipal += "[DESEMBARQUE:"+agLlegada.getDireccion()+"]\n";
				}else descripcionPrincipal += "[DESEMBARQUE:]\n";
			}
		}else{
			descripcionPrincipal= descripMovi+(ventaPasaje.getObservaciones()!=null?" - "+ventaPasaje.getObservaciones():"");
		}
		
		/* AGREGADO: 19/06/2025 */
		String servicio = ventaPasaje.getServicio().getNombreCorto().trim();
		
		descripcionPrincipal = "SERVICIO DE PASAJEROS\n";
		descripcionPrincipal += "INTERPROVINCIAL\n";
		descripcionPrincipal += "[SERV:"+servicio+"]";
		
		DetalleVenta detalleVenta= new DetalleVenta();
		
		detalleVenta.setItem(1);
		detalleVenta.setUnidadMedida(new JAXBElement<String>(new QName(NAMESPACE,"unidadMedida"), String.class, "NIU"));
		detalleVenta.setDescripcion(new JAXBElement<String>(new QName(NAMESPACE,"descripcion"), String.class, descripcionPrincipal));
		detalleVenta.setCantidad(1.0);
		
		if(!(isCortesia)){
			detalleVenta.setTarifa(ventaPasaje.getImportePagado());
			
			if(ventaPasaje.getIgv()!=null && ventaPasaje.getIgv()>0.00){				
				// Venta grabada
				Double igv_x=Constantes.IGV/100; //(0.18)
				Double igv_y=igv_x+1; //(1.18)
				
				detalleVenta.setValorUnitario(Double.valueOf(Util.toNumberFormat(ventaPasaje.getImportePagado() / igv_y,2))); //Precio o tarifa, pero sin igv
				detalleVenta.setIgv(Double.valueOf(Util.toNumberFormat((ventaPasaje.getImportePagado() / igv_y) * igv_x,2))); //Igv del presio unitario
				detalleVenta.setTotal(Double.valueOf(Util.toNumberFormat((ventaPasaje.getImportePagado()/ igv_y)*detalleVenta.getCantidad(), 2)));//total de la linea del detalle (Pero sin impuestos)
				detalleVenta.setCodigoAfectacionIgv(new JAXBElement<String>(new QName(NAMESPACE,"codigoAfectacionIgv"), String.class, "10")); //-->Gravado - Operacion onerosa - Afectacion al igv (Cat. 7)
				detalleVenta.setCodigoTipoPrecio(new JAXBElement<String>(new QName(NAMESPACE,"codigoTipoPrecio"), String.class, "01")); // Precio Unitario (incluye Igv) -Tipo de precio de venta unitario (Cat. 16)
			}else{
				// Venta Exonerada
				detalleVenta.setValorUnitario(detalleVenta.getTarifa()); //Precio o tarifa, pero sin igv 
				detalleVenta.setIgv(0.00); //No esta afento al IGV
				detalleVenta.setTotal(detalleVenta.getTarifa()*detalleVenta.getCantidad());//total de la linea del detalle (Pero sin impuestos)
				detalleVenta.setCodigoAfectacionIgv(new JAXBElement<String>(new QName(NAMESPACE,"codigoAfectacionIgv"), String.class, "20")); //Exonerado - Operacion Onerosa - Afectacion al igv (Cat. 7)
				detalleVenta.setCodigoTipoPrecio(new JAXBElement<String>(new QName(NAMESPACE,"codigoTipoPrecio"), String.class, "01")); // Precio Unitario (incluye Igv) -Tipo de precio de venta unitario (Cat. 16)
			}			
		}else{
			detalleVenta.setTarifa(ventaPasaje.getTarifa());
			// Si es CORTESIA
			detalleVenta.setValorUnitario(0.00); //Precio o tarifa, sin igv
			detalleVenta.setIgv(0.00); //No esta afento al IGV
			detalleVenta.setTotal(0.00);//total de la linea del detalle (Pero sin impuestos)
			detalleVenta.setCodigoAfectacionIgv(new JAXBElement<String>(new QName(NAMESPACE,"codigoAfectacionIgv"), String.class, "20")); //Exonerado - Operacion Onerosa - Afectacion al igv (Cat. 7)
			detalleVenta.setCodigoTipoPrecio(new JAXBElement<String>(new QName(NAMESPACE,"codigoTipoPrecio"), String.class, "02")); // Valor referencial unitario en operaciones no onerosas - Tipo de precio de venta unitario (Cat. 16)
		}
		
		return detalleVenta;
	}
	
}
