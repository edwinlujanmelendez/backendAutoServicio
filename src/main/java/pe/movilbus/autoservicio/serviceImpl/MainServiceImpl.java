package pe.movilbus.autoservicio.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.movilbus.autoservicio.beans.Agencia;
import pe.movilbus.autoservicio.beans.BodyPdfCorreo;
import pe.movilbus.autoservicio.beans.DatoSalidasEmbarque;
import pe.movilbus.autoservicio.beans.DatoTarifario;
import pe.movilbus.autoservicio.beans.MensajeConfirmacionResult;
import pe.movilbus.autoservicio.beans.ReimprimirBoleto;
import pe.movilbus.autoservicio.beans.RptPromocion;
import pe.movilbus.autoservicio.beans.VentasGeneral;
import pe.movilbus.autoservicio.dao.MainDao;
import pe.movilbus.autoservicio.service.MainService;
import pe.movilbus.autoservicio.service.xml.XmlVentaPasaje;

@Service("mainService")
public class MainServiceImpl implements MainService{
	
	@Autowired
	private MainDao mainDao;
	
	@Override
	public String generarVentaSispas(VentasGeneral venta){
		return mainDao.generarVentaSispas(venta);
	}
	
	@Override
	public String consumirServicio(){
		return mainDao.consumirServicio();
	}
	
	@Override
	public List<Agencia> getAgencias(){
		return mainDao.getAgencias();
	}
	
	@Override
	public List<String> getUsuariosSispas(int idAgencia){
		return mainDao.getUsuariosSispas(idAgencia);
	}
	
	@Override
	public int validarUsuarioSispas(String usuario, String password){
		return mainDao.validarUsuarioSispas(usuario, password);
	}
	
	@Override
	public List<DatoSalidasEmbarque> getSalidasEmbarque(int agenciaIdOrigen){
		return mainDao.getSalidasEmbarque(agenciaIdOrigen);
	}
	
	@Override
	public List<DatoTarifario> getTarifario(String rutas_id){
		return mainDao.getTarifario(rutas_id);
	}
	
	@Override
	public int getIdUsuarioSispas(String usuario){
		return mainDao.getIdUsuarioSispas(usuario);
	}
	
	@Override
	public MensajeConfirmacionResult getVerificarCajaAbierta(int idUsuario, int idAgencia){
		return mainDao.getVerificarCajaAbierta(idUsuario, idAgencia);
	}
	
	@Override
	public List<RptPromocion> getPromocionesSispas(int itinerarioIda, int rutaIda, String fechaRutaIda, int itinerarioVuelta, int rutaVuelta, String fechaRutaVuelta){
		return mainDao.getPromocionesSispas(itinerarioIda, rutaIda, fechaRutaIda, itinerarioVuelta, rutaVuelta, fechaRutaVuelta);
	}
	
	@Override
	public List<ReimprimirBoleto> getReimprimirBoleto(String nroDocumento){
		return mainDao.getReimprimirBoleto(nroDocumento);
	}
	
	@Override
	public String getDescargarPdf(int venpas_id){
		return mainDao.getDescargarPdf(venpas_id);
	}
	
	@Override
	public int enviarPdfCorreo(BodyPdfCorreo datos){
		return mainDao.enviarPdfCorreo(datos);
	}
}