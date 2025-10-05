package pe.movilbus.autoservicio.beans;

import java.util.HashSet;
import java.util.Set;

public class OperadorTarjetaCreditoSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String denominacion;
	
	private Set<TarjetaCreditoSispas> tarjetaCreditos = new HashSet<TarjetaCreditoSispas>(0);

	public OperadorTarjetaCreditoSispas() {
		super();
	}
	
	public OperadorTarjetaCreditoSispas(Integer id, String denominacion) {
		super();
		this.id = id;
		this.denominacion = denominacion;
	}

	public OperadorTarjetaCreditoSispas(Integer id){
		this.id=id;
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

	public Set<TarjetaCreditoSispas> getTarjetaCreditos() {
		return this.tarjetaCreditos;
	}
	public void setTarjetaCreditos(Set<TarjetaCreditoSispas> tarjetaCreditos) {
		this.tarjetaCreditos = tarjetaCreditos;
	}

}
