package pe.movilbus.autoservicio.beans;

import java.io.Serializable;

public class CentroCostoSispas extends GenericBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private ConcesionarioSispas concesionario;
	private String responsable;
	private String codigo;
	private String denominacion;	
	private TipoCentroCostoSispas tipoCentroCosto;
	
	
	/**
	 * Constructor
	 */
	public CentroCostoSispas() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param id	: Identificador del centro de costo.
	 */
	public CentroCostoSispas(Integer id) {
		super();
		this.id = id;
	}

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
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	/**
	 * @return the responsable
	 */
	public String getResponsable() {
		return responsable;
	}
	/**
	 * @param responsable the responsable to set
	 */
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "["+this.id+"]"+this.codigo+" --> "+this.denominacion;
	}

	/**
	 * @return the tipoCentroCosto
	 */
	public TipoCentroCostoSispas getTipoCentroCosto() {
		return tipoCentroCosto;
	}

	/**
	 * @param tipoCentroCosto the tipoCentroCosto to set
	 */
	public void setTipoCentroCosto(TipoCentroCostoSispas tipoCentroCosto) {
		this.tipoCentroCosto = tipoCentroCosto;
	}	
}
