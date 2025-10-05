package pe.movilbus.autoservicio.beans;

import java.io.Serializable;
import java.util.List;

public class VentasGeneral implements Serializable{

	private static final long serialVersionUID = 1L;
	private List<VentaPasajeros> ventaPasajeros;
	private int tiempoPasarelaPago;
	private String ipLocal;
	private Cliente cliente;
	private int idTipForPago;
	private double montoTotal;
	private String codePaisPhone;
	private String numOperacion;
	private int idAgencia;
	private int idUsuarioSispas;
	private String fechaLiquidacion;
	private int tarcreId;
	
	public VentasGeneral(){
		super();
	}
	
	public VentasGeneral(List<VentaPasajeros> ventaPasajeros, int tiempoPasarelaPago, String ipLocal, Cliente cliente,
			int idTipForPago, double montoTotal, String codePaisPhone, String numOperacion, int idAgencia, int idUsuarioSispas, 
			String fechaLiquidacion, int tarcreId){
		super();
		this.ventaPasajeros = ventaPasajeros;
		this.tiempoPasarelaPago = tiempoPasarelaPago;
		this.ipLocal = ipLocal;
		this.cliente = cliente;
		this.idTipForPago = idTipForPago;
		this.montoTotal = montoTotal;
		this.codePaisPhone = codePaisPhone;
		this.numOperacion = numOperacion;
		this.idAgencia = idAgencia;
		this.idUsuarioSispas = idUsuarioSispas;
		this.fechaLiquidacion = fechaLiquidacion;
		this.tarcreId = tarcreId;
	}
	
	public List<VentaPasajeros> getVentaPasajeros(){
		return ventaPasajeros;
	}
	
	public void setVentaPasajeros(List<VentaPasajeros> ventaPasajeros){
		this.ventaPasajeros = ventaPasajeros;
	}
	
	public int getTiempoPasarelaPago(){
		return tiempoPasarelaPago;
	}
	
	public void setTiempoPasarelaPago(int tiempoPasarelaPago){
		this.tiempoPasarelaPago = tiempoPasarelaPago;
	}
	
	public String getIpLocal(){
		return ipLocal;
	}
	
	public void setIpLocal(String ipLocal){
		this.ipLocal = ipLocal;
	}
	
	public Cliente getCliente(){
		return cliente;
	}
	
	public void setCliente(Cliente cliente){
		this.cliente = cliente;
	}

	public int getIdTipForPago(){
		return idTipForPago;
	}

	public void setIdTipForPago(int idTipForPago){
		this.idTipForPago = idTipForPago;
	}

	public double getMontoTotal(){
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal){
		this.montoTotal = montoTotal;
	}

	public String getCodePaisPhone(){
		return codePaisPhone;
	}

	public void setCodePaisPhone(String codePaisPhone){
		this.codePaisPhone = codePaisPhone;
	}

	public String getNumOperacion(){
		return numOperacion;
	}

	public void setNumOperacion(String numOperacion){
		this.numOperacion = numOperacion;
	}
	
	public int getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}

	public int getIdUsuarioSispas() {
		return idUsuarioSispas;
	}

	public void setIdUsuarioSispas(int idUsuarioSispas) {
		this.idUsuarioSispas = idUsuarioSispas;
	}
	
	public String getFechaLiquidacion() {
		return fechaLiquidacion;
	}

	public void setFechaLiquidacion(String fechaLiquidacion) {
		this.fechaLiquidacion = fechaLiquidacion;
	}

	public int getTarcreId() {
		return tarcreId;
	}

	public void setTarcreId(int tarcreId) {
		this.tarcreId = tarcreId;
	}

	@Override
	public String toString(){
		return "VentasGeneral [ventaPasajeros=" + ventaPasajeros + ", tiempoPasarelaPago=" + tiempoPasarelaPago
				+ ", ipLocal=" + ipLocal + ", cliente=" + cliente + ", idTipForPago=" + idTipForPago + ", montoTotal=" + montoTotal 
				+ ", codePaisPhone=" + codePaisPhone + ", numOperacion=" + numOperacion + ", idAgencia=" + idAgencia 
				+ ", idUsuarioSispas=" + idUsuarioSispas + ", fechaLiquidacion=" + fechaLiquidacion + ", tarcreId=" + tarcreId + "]";
	}
}
