package pe.movilbus.autoservicio.beans;

import java.util.HashSet;
import java.util.Set;

public class TipoAgenciaSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String denominacion;
	
	private Set<AgenciaSispas> agencias = new HashSet<AgenciaSispas>(0);

	public TipoAgenciaSispas() {
		
	}
	
	public TipoAgenciaSispas(Integer id) {
		super();
		this.id=id;
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

	public Set<AgenciaSispas> getAgencias() {
		return this.agencias;
	}
	public void setAgencias(Set<AgenciaSispas> agencias) {
		this.agencias = agencias;
	}
}
