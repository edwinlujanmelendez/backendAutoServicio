package pe.movilbus.autoservicio.dao;

import java.util.List;

import pe.movilbus.autoservicio.beans.Agencia;
import pe.movilbus.autoservicio.beans.BodyPdfCorreo;
import pe.movilbus.autoservicio.beans.DatoSalidasEmbarque;
import pe.movilbus.autoservicio.beans.DatoTarifario;
import pe.movilbus.autoservicio.beans.MensajeConfirmacionResult;
import pe.movilbus.autoservicio.beans.ReimprimirBoleto;
import pe.movilbus.autoservicio.beans.RptPromocion;
import pe.movilbus.autoservicio.beans.VentasGeneral;
import pe.movilbus.autoservicio.service.xml.XmlVentaPasaje;

public interface MainDao {
	
	public String generarVentaSispas(VentasGeneral venta);
	
	public String consumirServicio();
	
	public List<Agencia> getAgencias();
	
	public List<String> getUsuariosSispas(int idAgencia);
	
	public int validarUsuarioSispas(String usuario, String password);
	
	public List<DatoSalidasEmbarque> getSalidasEmbarque(int agenciaIdOrigen);
	
	public List<DatoTarifario> getTarifario(String rutas_id);
	
	public int getIdUsuarioSispas(String usuario);
	
	public MensajeConfirmacionResult getVerificarCajaAbierta(int idUsuario, int idAgencia);
	
	public List<RptPromocion> getPromocionesSispas(int itinerarioIda, int rutaIda, String fechaRutaIda, int itinerarioVuelta, int rutaVuelta, String fechaRutaVuelta);
	
	public List<ReimprimirBoleto> getReimprimirBoleto(String nroDocumento);
	
	public String getDescargarPdf(int venpas_id);
	
	public int enviarPdfCorreo(BodyPdfCorreo datos);
}