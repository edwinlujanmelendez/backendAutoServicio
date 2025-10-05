package pe.movilbus.autoservicio.beans;

public class TipoComprobanteSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String denominacion;
	private String abreviatura;
	private Integer rubro;
	
	public static final int RUBRO_PASAJES = 1;
	public static final int RUBRO_CARGA = 2;
	public static final int RUBRO_AMBOS = 3;

	public TipoComprobanteSispas() {
	}

	public TipoComprobanteSispas(Integer id) {
		super();
		this.id = id;
	}
	


	public TipoComprobanteSispas(String denominacion) {
		super();
		this.denominacion = denominacion;
	}

	/**
	 * @param id
	 * @param denominacion
	 * @param abreviatura
	 */
	public TipoComprobanteSispas(Integer id, String denominacion, String abreviatura) {
		super();
		this.id = id;
		this.denominacion = denominacion;
		this.abreviatura = abreviatura;
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

	public String getAbreviatura() {
		return this.abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	/**
	 * @return Objeto rubro.
	 */
	public Integer getRubro() {
		return rubro;
	}

	/**
	 * @param rubro	: Setea el objeto rubro.
	 */
	public void setRubro(Integer rubro) {
		this.rubro = rubro;
	}
}
