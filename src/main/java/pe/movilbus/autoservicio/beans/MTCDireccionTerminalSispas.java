package pe.movilbus.autoservicio.beans;

public class MTCDireccionTerminalSispas extends GenericBean {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private CompaniaSispas empresa;
	private Integer codigo;
	private String direccion;
	private AgenciaSispas agencia;
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
	 * @return the codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}
	/**
	 * @param codigio the codigio to set
	 */
	public void setCodigo(Integer codigio) {
		this.codigo = codigio;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the agencia
	 */
	public AgenciaSispas getAgencia() {
		return agencia;
	}
	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(AgenciaSispas agencia) {
		this.agencia = agencia;
	}
	
	@Override
	public String toString(){
		return this.direccion;
	}
	/**
	 * @return the empresa
	 */
	public CompaniaSispas getEmpresa() {
		return empresa;
	}
	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(CompaniaSispas empresa) {
		this.empresa = empresa;
	}
}
