package pe.movilbus.autoservicio.beans;

public class TarjetaCreditoSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private OperadorTarjetaCreditoSispas operadorTarjetaCredito;
	private String denominacion;
	
	public TarjetaCreditoSispas() {
		super();
	}
	
	public TarjetaCreditoSispas(Integer id){
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
	 * @return the operadorTarjetaCredito
	 */
	public OperadorTarjetaCreditoSispas getOperadorTarjetaCredito() {
		return operadorTarjetaCredito;
	}
	/**
	 * @param operadorTarjetaCredito the operadorTarjetaCredito to set
	 */
	public void setOperadorTarjetaCredito(OperadorTarjetaCreditoSispas operadorTarjetaCredito) {
		this.operadorTarjetaCredito = operadorTarjetaCredito;
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
		// TODO Auto-generated method stub
		return this.denominacion;
	}
}
