package pe.movilbus.autoservicio.beans;

import java.io.Serializable;
import java.math.BigDecimal;

public class VentaPasaje implements Serializable, Cloneable {
	
	private static final long serialVersionUID = 1L;
	
	private BigDecimal idVenta;
	private BigDecimal idItinerario;
	private BigDecimal idRuta;	
	private Pasajero  pasajero;	
	private int idServicio;	
	private int nroAsiento;
	private int nroPiso;	
	private BigDecimal idAgenciaPartida;
	private String fechaPartida;
	private String horaPartida;
	private BigDecimal idAgenciaLlegada;
	private String fechaLlegada;
	private String horaLlegada;
	private double tarifa;
	private double descuento;
	private String namePromocion;
	private String descuentoPromocion;
	private double impPagado;
	private String emailContacto;
	private String telefonoOpcional;
	private int infoAdicional;
	private int idParentesco;
	private int tipoPasajero;
	private String dniApoderado;
	private int promocionIdSispas;
	
	public VentaPasaje() {
		super();
	}

	public VentaPasaje(BigDecimal idItinerario, BigDecimal idRuta, Cliente cliente, Pasajero pasajero, int idServicio,
			int nroAsiento, int nroPiso, BigDecimal idAgenciaPartida, String fechaPartida,
			String horaPartida, BigDecimal idAgenciaLlegada, String fechaLlegada, String horaLlegada, double tarifa,
			double descuento, String namePromocion, String descuentoPromocion, double impPagado, String emailContacto, String telefonoOpcional, int infoAdicional, 
			int idParentesco, int tipoPasajero, String dniApoderado, int promocionIdSispas) {
		super();
		this.idItinerario = idItinerario;
		this.idRuta = idRuta;
		this.pasajero = pasajero;
		this.idServicio = idServicio;
		this.nroAsiento = nroAsiento;
		this.nroPiso = nroPiso;
		this.idAgenciaPartida = idAgenciaPartida;
		this.fechaPartida = fechaPartida;
		this.horaPartida = horaPartida;
		this.idAgenciaLlegada = idAgenciaLlegada;
		this.fechaLlegada = fechaLlegada;
		this.horaLlegada = horaLlegada;
		this.tarifa = tarifa;
		this.descuento = descuento;
		this.namePromocion = namePromocion;
		this.descuentoPromocion = descuentoPromocion;
		this.impPagado = impPagado;
		this.emailContacto = emailContacto;
		this.telefonoOpcional = telefonoOpcional;
		this.infoAdicional = infoAdicional;
		this.idParentesco = idParentesco;
		this.tipoPasajero = tipoPasajero;
		this.dniApoderado = dniApoderado;
		this.promocionIdSispas = promocionIdSispas;
	}
	
	public VentaPasaje(BigDecimal idVenta,BigDecimal idItinerario, BigDecimal idRuta, Pasajero pasajero, int nroAsiento, int nroPiso,
			double impPagado) {
		super();
		
		this.idVenta = idVenta;
		this.idItinerario = idItinerario;
		this.idRuta = idRuta;
		this.pasajero = pasajero;
		this.nroAsiento = nroAsiento;
		this.nroPiso = nroPiso;
		this.impPagado = impPagado;
	}
	
	public BigDecimal getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(BigDecimal idVenta) {
		this.idVenta = idVenta;
	}

	public BigDecimal getIdItinerario() {
		return idItinerario;
	}

	public void setIdItinerario(BigDecimal idItinerario) {
		this.idItinerario = idItinerario;
	}

	public BigDecimal getIdRuta() {
		return idRuta;
	}

	public void setIdRuta(BigDecimal idRuta) {
		this.idRuta = idRuta;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public int getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}

	public int getNroAsiento() {
		return nroAsiento;
	}

	public void setNroAsiento(int nroAsiento) {
		this.nroAsiento = nroAsiento;
	}

	public int getNroPiso() {
		return nroPiso;
	}

	public void setNroPiso(int nroPiso) {
		this.nroPiso = nroPiso;
	}

	public BigDecimal getIdAgenciaPartida() {
		return idAgenciaPartida;
	}

	public void setIdAgenciaPartida(BigDecimal idAgenciaPartida) {
		this.idAgenciaPartida = idAgenciaPartida;
	}

	public String getFechaPartida() {
		return fechaPartida;
	}

	public void setFechaPartida(String fechaPartida) {
		this.fechaPartida = fechaPartida;
	}

	public String getHoraPartida() {
		return horaPartida;
	}

	public void setHoraPartida(String horaPartida) {
		this.horaPartida = horaPartida;
	}

	public BigDecimal getIdAgenciaLlegada() {
		return idAgenciaLlegada;
	}

	public void setIdAgenciaLlegada(BigDecimal idAgenciaLlegada) {
		this.idAgenciaLlegada = idAgenciaLlegada;
	}

	public String getFechaLlegada() {
		return fechaLlegada;
	}

	public void setFechaLlegada(String fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	public String getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public String getNamePromocion() {
		return namePromocion;
	}

	public void setNamePromocion(String namePromocion) {
		this.namePromocion = namePromocion;
	}

	public String getDescuentoPromocion() {
		return descuentoPromocion;
	}

	public void setDescuentoPromocion(String descuentoPromocion) {
		this.descuentoPromocion = descuentoPromocion;
	}

	public double getImpPagado() {
		return impPagado;
	}

	public void setImpPagado(double impPagado) {
		this.impPagado = impPagado;
	}

	public String getEmailContacto() {
		return emailContacto;
	}

	public void setEmailContacto(String emailContacto) {
		this.emailContacto = emailContacto;
	}

	public String getTelefonoOpcional() {
		return telefonoOpcional;
	}

	public void setTelefonoOpcional(String telefonoOpcional) {
		this.telefonoOpcional = telefonoOpcional;
	}

	public int getInfoAdicional() {
		return infoAdicional;
	}

	public void setInfoAdicional(int infoAdicional) {
		this.infoAdicional = infoAdicional;
	}

	public int getIdParentesco() {
		return idParentesco;
	}

	public void setIdParentesco(int idParentesco) {
		this.idParentesco = idParentesco;
	}

	public int getTipoPasajero() {
		return tipoPasajero;
	}

	public void setTipoPasajero(int tipoPasajero) {
		this.tipoPasajero = tipoPasajero;
	}

	public String getDniApoderado() {
		return dniApoderado;
	}

	public void setDniApoderado(String dniApoderado) {
		this.dniApoderado = dniApoderado;
	}
	
	public int getPromocionIdSispas() {
		return promocionIdSispas;
	}

	public void setPromocionIdSispas(int promocionIdSispas) {
		this.promocionIdSispas = promocionIdSispas;
	}

	@Override
	public String toString() {
		return "VentaPasaje [idVenta=" + idVenta + ", idItinerario=" + idItinerario + ", idRuta=" + idRuta
				+ ", pasajero=" + pasajero + ", idServicio=" + idServicio + ", nroAsiento=" + nroAsiento + ", nroPiso="
				+ nroPiso + ", idAgenciaPartida=" + idAgenciaPartida + ", fechaPartida=" + fechaPartida
				+ ", horaPartida=" + horaPartida + ", idAgenciaLlegada=" + idAgenciaLlegada + ", fechaLlegada="
				+ fechaLlegada + ", horaLlegada=" + horaLlegada + ", tarifa=" + tarifa + ", descuento=" + descuento
				+ ", impPagado=" + impPagado + ", emailContacto=" + emailContacto + ", telefonoOpcional="
				+ telefonoOpcional + ", infoAdicional=" + infoAdicional + ", idParentesco=" + idParentesco 
				+ ", tipoPasajero=" + tipoPasajero + ", dniApoderado=" + dniApoderado + ", promocionIdSispas=" + promocionIdSispas +"]";
	}
	
	/*@Override
	public String toString() {
		return "VentaPasaje [idVenta=" + idVenta + ", idItinerario=" + idItinerario + ", idRuta=" + idRuta
				+ ", pasajero=" + pasajero + ", idServicio=" + idServicio + ", nroAsiento=" + nroAsiento + ", nroPiso="
				+ nroPiso + ", idAgenciaPartida=" + idAgenciaPartida + ", fechaPartida=" + fechaPartida
				+ ", horaPartida=" + horaPartida + ", idAgenciaLlegada=" + idAgenciaLlegada + ", fechaLlegada="
				+ fechaLlegada + ", horaLlegada=" + horaLlegada + ", tarifa=" + tarifa + ", descuento=" + descuento
				+ ", impPagado=" + impPagado + ", emailContacto=" + emailContacto + ", telefonoOpcional="
				+ telefonoOpcional + ", infoAdicional=" + infoAdicional + "]";
	}*/

}
