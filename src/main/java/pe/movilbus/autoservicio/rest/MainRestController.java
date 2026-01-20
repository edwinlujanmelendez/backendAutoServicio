package pe.movilbus.autoservicio.rest;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.movilbus.autoservicio.beans.Agencia;
import pe.movilbus.autoservicio.beans.BodyPdfCorreo;
import pe.movilbus.autoservicio.beans.DatoSalidasEmbarque;
import pe.movilbus.autoservicio.beans.DatoTarifario;
import pe.movilbus.autoservicio.beans.MensajeConfirmacionResult;
import pe.movilbus.autoservicio.beans.ReimprimirBoleto;
import pe.movilbus.autoservicio.beans.RptPromocion;
import pe.movilbus.autoservicio.beans.VentasGeneral;
import pe.movilbus.autoservicio.service.MainService;
import pe.movilbus.autoservicio.service.xml.XmlVentaPasaje;

@RestController
@RequestMapping("/Home")
public class MainRestController {
	
	@Autowired
	private MainService mainService;
	
	@PostMapping("/generarVentaSispas")
	public String generarVentaSispas(@RequestBody VentasGeneral venta){
		return mainService.generarVentaSispas(venta);
	}
	
	@GetMapping("/consumirServicio")
	public String consumirServicio(){
		//return "sirve";
		return mainService.consumirServicio();
	}
	
	@GetMapping("/getAgencias")
	public List<Agencia> getAgencias(){
		return mainService.getAgencias();
	}
	
	@GetMapping("/getUsuariosSispas/{idAgencia}")
	public List<String> getUsuariosSispas(@PathVariable int idAgencia){
		return mainService.getUsuariosSispas(idAgencia);
	}
	
	@GetMapping("/validarUsuarioSispas/{usuario}/{password}")
	public int validarUsuarioSispas(@PathVariable String usuario, @PathVariable String password){
		return mainService.validarUsuarioSispas(usuario, password);
	}
	
	@GetMapping("/getSalidasEmbarque/{localidad_origen}")
	public List<DatoSalidasEmbarque> getSalidasEmbarque(@PathVariable int localidad_origen){
		return mainService.getSalidasEmbarque(localidad_origen);
	}
	
	@GetMapping("/getTarifario/{rutas_id}")
	public List<DatoTarifario> getTarifario(@PathVariable String rutas_id){
		return mainService.getTarifario(rutas_id);
	}
	
	@GetMapping("/getIdUsuarioSispas/{usuario}")
	public int getIdUsuarioSispas(@PathVariable String usuario){
		return mainService.getIdUsuarioSispas(usuario);
	}
	
	@GetMapping("/getVerificarCajaAbierta/{idUsuario}/{idAgencia}")
	public MensajeConfirmacionResult getVerificarCajaAbierta(@PathVariable int idUsuario, @PathVariable int idAgencia){
		return mainService.getVerificarCajaAbierta(idUsuario, idAgencia);
	}
	
	@GetMapping("/getPromocionesSispas/{itinerarioIda}/{rutaIda}/{fechaRutaIda}/{itinerarioVuelta}/{rutaVuelta}/{fechaRutaVuelta}")
	public List<RptPromocion> getPromocionesSispas(@PathVariable int itinerarioIda, @PathVariable int rutaIda, @PathVariable String fechaRutaIda, @PathVariable int itinerarioVuelta, @PathVariable int rutaVuelta, @PathVariable String fechaRutaVuelta){
		return mainService.getPromocionesSispas(itinerarioIda, rutaIda, fechaRutaIda, itinerarioVuelta, rutaVuelta, fechaRutaVuelta);
	}
	
	@GetMapping("/getReimprimirBoleto/{nroDocumento}")
	public List<ReimprimirBoleto> getReimprimirBoleto(@PathVariable String nroDocumento){
		return mainService.getReimprimirBoleto(nroDocumento);
	}
	
	@GetMapping("/getDescargarPdf/{venpas_id}")
	public String getDescargarPdf(@PathVariable int venpas_id){
		return mainService.getDescargarPdf(venpas_id);
	}
	
	@PostMapping("/enviarPdfCorreo")
	public int enviarPdfCorreo(@RequestBody BodyPdfCorreo datos){
		return mainService.enviarPdfCorreo(datos);
	}
}