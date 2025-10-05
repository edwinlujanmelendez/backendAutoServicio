package pe.movilbus.autoservicio.beans;

import java.io.Serializable;

public class TipoZonaSispas extends GenericBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String denominacion;
	private String abreviatura;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDenominacion() {
		return denominacion;
	}
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}	
}
