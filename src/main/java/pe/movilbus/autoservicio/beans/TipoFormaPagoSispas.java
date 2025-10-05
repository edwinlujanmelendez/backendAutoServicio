package pe.movilbus.autoservicio.beans;

public class TipoFormaPagoSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private FormaPagoSispas formaPago;
	private String denominacion;
	private String nombreCorto;
	private Integer tipoIngresoLiquidacion;
	private Integer esPromocion;
	
	public static final String TIPO_TARJETA = "TARJETA";
	public static final String TIPO_TRANSFERENCIA = "DEPOSITO";
	public static final String TIPO_PAGOLINK = "PAGOLINK";
	public static final String TIPO_ORBIS = "ORBIS";
	public static final String TIPO_CREDITO = "CREDITO";
	public static final String TIPO_MIGRACION =   "BT-CONFIRM. FA";
	public static final String TIPO_MIGRACION_1 = "BT-EDICION VTA.";
	public static final Integer N_ESPROMOCION = 1;
	
	public TipoFormaPagoSispas() {
		super();
	}

	public TipoFormaPagoSispas(Integer id){
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
	 * @return the formaPago
	 */
	public FormaPagoSispas getFormaPago() {
		return formaPago;
	}
	/**
	 * @param formaPago the formaPago to set
	 */
	public void setFormaPago(FormaPagoSispas formaPago) {
		this.formaPago = formaPago;
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
	 * @return the nombreCorto
	 */
	public String getNombreCorto() {
		return nombreCorto;
	}
	/**
	 * @param nombreCorto the nombreCorto to set
	 */
	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}

	/**
	 * @return the tipoIngresoLiquidacion
	 */
	public Integer getTipoIngresoLiquidacion() {
		return tipoIngresoLiquidacion;
	}
	/**
	 * @param tipoIngresoLiquidacion the tipoIngresoLiquidacion to set
	 */
	public void setTipoIngresoLiquidacion(Integer tipoIngresoLiquidacion) {
		this.tipoIngresoLiquidacion = tipoIngresoLiquidacion;
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
