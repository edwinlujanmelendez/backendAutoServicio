package pe.movilbus.autoservicio.beans;

import java.util.HashSet;
import java.util.Set;

public class TipoFlotaSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String codigo;
	private String denominacion;
	private String nombreCorto;
	
	private Set<BusSispas> buses = new HashSet<BusSispas>(0);

	public TipoFlotaSispas() {
	}

	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return this.codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDenominacion() {
		return this.denominacion;
	}
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public String getNombreCorto() {
		return this.nombreCorto;
	}
	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}

	public Set<BusSispas> getBuses() {
		return this.buses;
	}
	public void setBuses(Set<BusSispas> buses) {
		this.buses = buses;
	}
}
