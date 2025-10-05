package pe.movilbus.autoservicio.beans;

import java.io.Serializable;
import java.util.Date;

public class HistoricoMembresiaSispas extends GenericBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private PasajeroFrecuenteSispas pasajeroFrecuente;
	private Date fechaActivacionAnterior;
	private Date fechaCaducidadAnterior;
	private Date fechaSuspensionAnterior;
	private Date nuevaFechaActivacion;
	private Date nuevaFechaCaducidad;
	
	
	public HistoricoMembresiaSispas(){
		
	}
	
	public HistoricoMembresiaSispas(Long id){
		super();
		this.id=id;
	}
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the pasajeroFrecuente
	 */
	public PasajeroFrecuenteSispas getPasajeroFrecuente() {
		return pasajeroFrecuente;
	}
	/**
	 * @param pasajeroFrecuente the pasajeroFrecuente to set
	 */
	public void setPasajeroFrecuente(PasajeroFrecuenteSispas pasajeroFrecuente) {
		this.pasajeroFrecuente = pasajeroFrecuente;
	}
	/**
	 * @return the fechaActivacionAnterior
	 */
	public Date getFechaActivacionAnterior() {
		return fechaActivacionAnterior;
	}
	/**
	 * @param fechaActivacionAnterior the fechaActivacionAnterior to set
	 */
	public void setFechaActivacionAnterior(Date fechaActivacionAnterior) {
		this.fechaActivacionAnterior = fechaActivacionAnterior;
	}
	/**
	 * @return the fechaCaducidadAnterior
	 */
	public Date getFechaCaducidadAnterior() {
		return fechaCaducidadAnterior;
	}
	/**
	 * @param fechaCaducidadAnterior the fechaCaducidadAnterior to set
	 */
	public void setFechaCaducidadAnterior(Date fechaCaducidadAnterior) {
		this.fechaCaducidadAnterior = fechaCaducidadAnterior;
	}
	/**
	 * @return the fechaSuspensionAnterior
	 */
	public Date getFechaSuspensionAnterior() {
		return fechaSuspensionAnterior;
	}
	/**
	 * @param fechaSuspensionAnterior the fechaSuspensionAnterior to set
	 */
	public void setFechaSuspensionAnterior(Date fechaSuspensionAnterior) {
		this.fechaSuspensionAnterior = fechaSuspensionAnterior;
	}
	/**
	 * @return the nuevaFechaActivacion
	 */
	public Date getNuevaFechaActivacion() {
		return nuevaFechaActivacion;
	}
	/**
	 * @param nuevaFechaActivacion the nuevaFechaActivacion to set
	 */
	public void setNuevaFechaActivacion(Date nuevaFechaActivacion) {
		this.nuevaFechaActivacion = nuevaFechaActivacion;
	}
	/**
	 * @return the nuevaFechaCaducidad
	 */
	public Date getNuevaFechaCaducidad() {
		return nuevaFechaCaducidad;
	}
	/**
	 * @param nuevaFechaCaducidad the nuevaFechaCaducidad to set
	 */
	public void setNuevaFechaCaducidad(Date nuevaFechaCaducidad) {
		this.nuevaFechaCaducidad = nuevaFechaCaducidad;
	}

}
