package pe.movilbus.autoservicio.beans;

public class DetalleLiquidacionSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private LiquidacionSispas liquidacion;
	private Integer anio;
	private TipoFormaPagoSispas tipoFormaPago;
	private TipoMovimientoSispas tipoMovimiento;
	private TipoComprobanteSispas tipoComprobante;
	private GastoSispas gasto;
	private Double total;
	private Integer cantidad;

	public DetalleLiquidacionSispas() {
	}

	/**
	 * @return Objeto id.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id	: Setea el objeto id.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return Objeto liquidacion.
	 */
	public LiquidacionSispas getLiquidacion() {
		return liquidacion;
	}

	/**
	 * @param liquidacion	: Setea el objeto liquidacion.
	 */
	public void setLiquidacion(LiquidacionSispas liquidacion) {
		this.liquidacion = liquidacion;
	}

	/**
	 * @return Objeto anio.
	 */
	public Integer getAnio() {
		return anio;
	}

	/**
	 * @param anio	: Setea el objeto anio.
	 */
	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	/**
	 * @return Objeto tipoFormaPago.
	 */
	public TipoFormaPagoSispas getTipoFormaPago() {
		return tipoFormaPago;
	}

	/**
	 * @param tipoFormaPago	: Setea el objeto tipoFormaPago.
	 */
	public void setTipoFormaPago(TipoFormaPagoSispas tipoFormaPago) {
		this.tipoFormaPago = tipoFormaPago;
	}

	/**
	 * @return Objeto condicionVenta.
	 */
	public TipoMovimientoSispas getTipoMovimiento() {
		return tipoMovimiento;
	}

	/**
	 * @param tipoMovimiento	: Setea el objeto condicionVenta.
	 */
	public void setTipoMovimiento(TipoMovimientoSispas tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	/**
	 * @return Objeto tipoComprobante.
	 */
	public TipoComprobanteSispas getTipoComprobante() {
		return tipoComprobante;
	}

	/**
	 * @param tipoComprobante	: Setea el objeto tipoComprobante.
	 */
	public void setTipoComprobante(TipoComprobanteSispas tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}

	/**
	 * @return Objeto gasto.
	 */
	public GastoSispas getGasto() {
		return gasto;
	}

	/**
	 * @param gasto	: Setea el objeto gasto.
	 */
	public void setGasto(GastoSispas gasto) {
		this.gasto = gasto;
	}

	/**
	 * @return Objeto total.
	 */
	public Double getTotal() {
		return total;
	}

	/**
	 * @param total	: Setea el objeto total.
	 */
	public void setTotal(Double total) {
		this.total = total;
	}

	/**
	 * @return Objeto cantidad.
	 */
	public Integer getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad	: Setea el objeto cantidad.
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}	
}
