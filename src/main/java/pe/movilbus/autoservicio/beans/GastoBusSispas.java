package pe.movilbus.autoservicio.beans;

import java.util.Date;

public class GastoBusSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private LiquidacionBusSispas liquidacionBus;
	private TipoGastoSispas tipoGasto;
	private Double monto;
	private Integer operacion;
	private Date fechaOperacion;
	private String observacion;

	public GastoBusSispas() {
	}

	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public TipoGastoSispas getTipoGasto() {
		return this.tipoGasto;
	}
	public void setTipoGasto(TipoGastoSispas tipoGasto) {
		this.tipoGasto = tipoGasto;
	}

	public LiquidacionBusSispas getLiquidacionBus() {
		return this.liquidacionBus;
	}
	public void setLiquidacionBus(LiquidacionBusSispas liquidacionBus) {
		this.liquidacionBus = liquidacionBus;
	}

	public Double getMonto() {
		return this.monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	/**
	 * @return Objeto operacion.
	 */
	public Integer getOperacion() {
		return operacion;
	}
	/**
	 * @param operacion	: Setea el objeto operacion.
	 */
	public void setOperacion(Integer operacion) {
		this.operacion = operacion;
	}

	public Date getFechaOperacion() {
		return this.fechaOperacion;
	}
	public void setFechaOperacion(Date fechaOperacion) {
		this.fechaOperacion = fechaOperacion;
	}

	public String getObservacion() {
		return this.observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
}
