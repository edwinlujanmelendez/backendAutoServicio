package pe.movilbus.autoservicio.beans;

public class MTCRutaSispas extends GenericBean{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private CompaniaSispas empresa;
	private String codigo;
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

	@Override
	public String toString(){
		return this.denominacion;
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
