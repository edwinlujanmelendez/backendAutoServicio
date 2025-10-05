package pe.movilbus.autoservicio.beans;

import java.io.Serializable;
import java.util.Date;

public class CarteraClienteSispas extends GenericBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private UsuarioSispas usuario;
	private Cliente cliente;
	private SolicitudCarteraSispas solicitudCartera;
	private double baseHistorica;
	private Date fechaAsignacion;
	private Date fechaSuspension; 
	private String estadoCartera;
	
	private LineaCreditoClienteSispas lineaCreditoCliente; //No mapeado
	
	
	
	
	/**
	 * 
	 */
	public CarteraClienteSispas() {
		super();
	}
	/**
	 * @param id
	 */
	public CarteraClienteSispas(Long id) {
		super();
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public UsuarioSispas getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioSispas usuario) {
		this.usuario = usuario;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public SolicitudCarteraSispas getSolicitudCartera() {
		return solicitudCartera;
	}
	public void setSolicitudCartera(SolicitudCarteraSispas solicitudCartera) {
		this.solicitudCartera = solicitudCartera;
	}
	public double getBaseHistorica() {
		return baseHistorica;
	}
	public void setBaseHistorica(double baseHistorica) {
		this.baseHistorica = baseHistorica;
	}
	public Date getFechaAsignacion() {
		return fechaAsignacion;
	}
	public void setFechaAsignacion(Date fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}
	public Date getFechaSuspension() {
		return fechaSuspension;
	}
	public void setFechaSuspension(Date fechaSuspension) {
		this.fechaSuspension = fechaSuspension;
	}
	public String getEstadoCartera() {
		return estadoCartera;
	}
	public void setEstadoCartera(String estadoCartera) {
		this.estadoCartera = estadoCartera;
	}
	/**
	 * @return the lineaCreditoCliente
	 */
	public LineaCreditoClienteSispas getLineaCreditoCliente() {
		return lineaCreditoCliente;
	}
	/**
	 * @param lineaCreditoCliente the lineaCreditoCliente to set
	 */
	public void setLineaCreditoCliente(LineaCreditoClienteSispas lineaCreditoCliente) {
		this.lineaCreditoCliente = lineaCreditoCliente;
	}
	
}
