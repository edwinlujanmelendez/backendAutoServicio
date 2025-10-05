package pe.movilbus.autoservicio.beans;

import java.util.Date;

public class PasajeroFrecuenteSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Pasajero pasajero;
	private AgenciaSispas agencia;
	private Integer puntosAcumulados;
	private Integer puntosUtilizados;
	private String numeroTarjeta;
	private Date fechaIngreso;
	private Date fechaActivacion;
	private Date fechaCaducidad;
	private Date fechaSuspension;
	private Integer estado;
	
	private HistoricoMembresiaSispas historicoMembresia;			//No mapeado.

	public PasajeroFrecuenteSispas() {
	}

	/**
	 * @return Objeto id.
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id	: Setea el objeto id.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return Objeto pasajero.
	 */
	public Pasajero getPasajero() {
		return pasajero;
	}
	/**
	 * @param pasajero	: Setea el objeto pasajero.
	 */
	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	/**
	 * @return the agencia
	 */
	public AgenciaSispas getAgencia() {
		return agencia;
	}
	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(AgenciaSispas agencia) {
		this.agencia = agencia;
	}

	/**
	 * @return Objeto puntoAcumulado.
	 */
	public Integer getPuntosAcumulados() {
		return puntosAcumulados;
	}
	/**
	 * @param puntoAcumulado	: Setea el objeto puntoAcumulado.
	 */
	public void setPuntosAcumulados(Integer puntosAcumulados) {
		this.puntosAcumulados = puntosAcumulados;
	}

	/**
	 * @return Objeto puntoUtilizado.
	 */
	public Integer getPuntosUtilizados() {
		return puntosUtilizados;
	}
	/**
	 * @param puntoUtilizado	: Setea el objeto puntoUtilizado.
	 */
	public void setPuntosUtilizados(Integer puntosUtilizados) {
		this.puntosUtilizados = puntosUtilizados;
	}

	/**
	 * @return Objeto numeroTarjeta.
	 */
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	/**
	 * @param numeroTarjeta	: Setea el objeto numeroTarjeta.
	 */
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	/**
	 * @return Objeto fechaIngreso.
	 */
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	/**
	 * @param fechaIngreso	: Setea el objeto fechaIngreso.
	 */
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * @return Objeto fechaActivacion.
	 */
	public Date getFechaActivacion() {
		return fechaActivacion;
	}
	/**
	 * @param fechaActivacion	: Setea el objeto fechaActivacion.
	 */
	public void setFechaActivacion(Date fechaActivacion) {
		this.fechaActivacion = fechaActivacion;
	}

	/**
	 * @return Objeto fechaCaducidad.
	 */
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}
	/**
	 * @param fechaCaducidad	: Setea el objeto fechaCaducidad.
	 */
	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	/**
	 * @return Objeto fechaSuspension.
	 */
	public Date getFechaSuspension() {
		return fechaSuspension;
	}
	/**
	 * @param fechaSuspension	: Setea el objeto fechaSuspension.
	 */
	public void setFechaSuspension(Date fechaSuspension) {
		this.fechaSuspension = fechaSuspension;
	}

	/**
	 * @return the estado
	 */
	public Integer getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	/**
	 * @return the historicoMembresia
	 */
	public HistoricoMembresiaSispas getHistoricoMembresia() {
		return historicoMembresia;
	}
	/**
	 * @param historicoMembresia the historicoMembresia to set
	 */
	public void setHistoricoMembresia(HistoricoMembresiaSispas historicoMembresia) {
		this.historicoMembresia = historicoMembresia;
	}
}
