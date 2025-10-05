package pe.movilbus.autoservicio.beans;

public class TipoCentroCostoSispas extends GenericBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private ConcesionarioSispas concesionario;
	private String denominacion;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the concesionario
	 */
	public ConcesionarioSispas getConcesionario() {
		return concesionario;
	}
	/**
	 * @param concesionario the concesionario to set
	 */
	public void setConcesionario(ConcesionarioSispas concesionario) {
		this.concesionario = concesionario;
	}
	/**
	 * @return the denominacion
	 */
	public String getDenominacion() {
		return denominacion;
	}
	/**
	 * @param denominacion the denominacion to set
	 */
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "["+this.id+"]"+" --> "+this.denominacion;
	}
}
