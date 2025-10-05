package pe.movilbus.autoservicio.beans;

public class FormaPagoSispas extends GenericBean implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String denominacion;
	private Integer esPromocion;
	
	public static final Integer N_ESPROMOCION = 1;
	
	public FormaPagoSispas() {
		super();
	}
	
	
	public FormaPagoSispas(Integer id){
		this.id=id;
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
	 * @return the esPromocion
	 */
	public Integer getEsPromocion() {
		return esPromocion;
	}
	/**
	 * @param esPromocion the esPromocion to set
	 */
	public void setEsPromocion(Integer esPromocion) {
		this.esPromocion = esPromocion;
	}
}
