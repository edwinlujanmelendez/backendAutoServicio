package pe.movilbus.autoservicio.beans;

import java.util.HashSet;
import java.util.Set;

public class EstadoBusSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String denominacion;
	private Integer tipoEstado;
	private String color;
	
	private Set<PuntoControlEstadoBusSispas> puntoControlEstadoBuses = new HashSet<PuntoControlEstadoBusSispas>(0);

	public EstadoBusSispas() {
	}

	/**
	 * @return Objeto id.
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id	: Setea el objeto id.
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return Objeto denominacion.
	 */
	public String getDenominacion() {
		return denominacion;
	}
	/**
	 * @param denominacion	: Setea el objeto denominacion.
	 */
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	/**
	 * @return Objeto tipoEstado.
	 */
	public Integer getTipoEstado() {
		return tipoEstado;
	}
	/**
	 * @param tipoEstado	: Setea el objeto tipoEstado.
	 */
	public void setTipoEstado(Integer tipoEstado) {
		this.tipoEstado = tipoEstado;
	}

	/**
	 * @return Objeto color.
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color	: Setea el objeto color.
	 */
	public void setColor(String color) {
		this.color = color;
	}

	public Set<PuntoControlEstadoBusSispas> getPuntoControlEstadoBuses() {
		return this.puntoControlEstadoBuses;
	}
	public void setPuntoControlEstadoBuses(
			Set<PuntoControlEstadoBusSispas> puntoControlEstadoBuses) {
		this.puntoControlEstadoBuses = puntoControlEstadoBuses;
	}


}
