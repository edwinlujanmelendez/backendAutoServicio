package pe.movilbus.autoservicio.beans;

import java.io.Serializable;

public class TipoPersonalSispas extends GenericBean implements Serializable {
	private static final long serialVersionUID=1L;
	private Integer id;
	private String denominacion;
	
	public TipoPersonalSispas() {
	}

	public TipoPersonalSispas(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getDenominacion() {
		return this.denominacion;
	}
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
}
