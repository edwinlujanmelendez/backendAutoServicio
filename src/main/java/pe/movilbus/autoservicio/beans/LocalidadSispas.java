package pe.movilbus.autoservicio.beans;

import java.util.HashSet;
import java.util.Set;

public class LocalidadSispas extends GenericBean implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String denominacion;	
	private Set<AgenciaSispas> agencias = new HashSet<AgenciaSispas>(0);
	private Set<Ruta> rutasForLocalidadIddestino = new HashSet<Ruta>(0);
	private Set<Ruta> rutasForLocalidadIdorigen = new HashSet<Ruta>(0);
	private String iata;	
	
	
	public LocalidadSispas() {
		
	}
	/**
	 * @param id
	 */
	public LocalidadSispas(Integer id) {
		super();
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

	public Set<AgenciaSispas> getAgencias() {
		return this.agencias;
	}
	public void setAgencias(Set<AgenciaSispas> agencias) {
		this.agencias = agencias;
	}

	public Set<Ruta> getRutasForLocalidadIddestino() {
		return this.rutasForLocalidadIddestino;
	}
	public void setRutasForLocalidadIddestino(
			Set<Ruta> rutasForLocalidadIddestino) {
		this.rutasForLocalidadIddestino = rutasForLocalidadIddestino;
	}

	public Set<Ruta> getRutasForLocalidadIdorigen() {
		return this.rutasForLocalidadIdorigen;
	}
	public void setRutasForLocalidadIdorigen(Set<Ruta> rutasForLocalidadIdorigen) {
		this.rutasForLocalidadIdorigen = rutasForLocalidadIdorigen;
	}
	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	
}
