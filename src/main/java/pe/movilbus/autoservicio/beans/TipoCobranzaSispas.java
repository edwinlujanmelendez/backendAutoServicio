package pe.movilbus.autoservicio.beans;

import java.io.Serializable;

public class TipoCobranzaSispas extends GenericBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String denominacion;
	
	
	
	
	/**
	 * 
	 */
	public TipoCobranzaSispas() {
		super();
	}
	/**
	 * @param id
	 */
	public TipoCobranzaSispas(Integer id) {
		super();
		this.id = id;
	}
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
	

}
