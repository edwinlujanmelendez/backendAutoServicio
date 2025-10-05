package pe.movilbus.autoservicio.beans;

import java.io.Serializable;
import java.util.Date;

public class SolicitudCarteraSispas extends GenericBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private UsuarioSispas usuario;
	private Cliente cliente;
	private UsuarioAprobadorSispas usuarioAprobador;
	private Date fechaSolicitud;
	private String estadoSolicitud;
	private Integer nivelAprobacion;
	private Date fechaAprobacion;
	private Date fechaAnulacion;
	private double descuentoAlta=.00;
	private double descuentoBaja=.00;
	private double baseHistorica=.00;
	
	/*No mapeado*/
	private String esComisionable;
	private SolicitudClienteCreditoSispas solicitudClienteCredito;
	
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
	public UsuarioAprobadorSispas getUsuarioAprobador() {
		return usuarioAprobador;
	}
	public void setUsuarioAprobador(UsuarioAprobadorSispas usuarioAprobador) {
		this.usuarioAprobador = usuarioAprobador;
	}
	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	public String getEstadoSolicitud() {
		return estadoSolicitud;
	}
	public void setEstadoSolicitud(String estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}
	public Integer getNivelAprobacion() {
		return nivelAprobacion;
	}
	public void setNivelAprobacion(Integer nivelAprobacion) {
		this.nivelAprobacion = nivelAprobacion;
	}
	public Date getFechaAprobacion() {
		return fechaAprobacion;
	}
	public void setFechaAprobacion(Date fechaAprobacion) {
		this.fechaAprobacion = fechaAprobacion;
	}
	public Date getFechaAnulacion() {
		return fechaAnulacion;
	}
	public void setFechaAnulacion(Date fechaAnulacion) {
		this.fechaAnulacion = fechaAnulacion;
	}
	public double getDescuentoAlta() {
		return descuentoAlta;
	}
	public void setDescuentoAlta(double descuentoAlta) {
		this.descuentoAlta = descuentoAlta;
	}
	public double getDescuentoBaja() {
		return descuentoBaja;
	}
	public void setDescuentoBaja(double descuentoBaja) {
		this.descuentoBaja = descuentoBaja;
	}
	public double getBaseHistorica() {
		return baseHistorica;
	}
	public void setBaseHistorica(double baseHistorica) {
		this.baseHistorica = baseHistorica;
	}
	public SolicitudClienteCreditoSispas getSolicitudClienteCredito() {
		return solicitudClienteCredito;
	}
	public void setSolicitudClienteCredito(SolicitudClienteCreditoSispas solicitudClienteCredito) {
		this.solicitudClienteCredito = solicitudClienteCredito;
	}
	public String getEsComisionable() {
		return esComisionable;
	}
	public void setEsComisionable(String esComisionable) {
		this.esComisionable = esComisionable;
	}
	
}
