package pe.movilbus.autoservicio.beans;

public class TipoMonedaSispas extends GenericBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private NacionalidadSispas nacionalidad;
	private String denominacion;
	private String unidadMonetaria;
	private String simboloMonetario;
	
	public TipoMonedaSispas(){
		
	}
	
	public TipoMonedaSispas(Integer id){
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
	 * @return the nacionalidad
	 */
	public NacionalidadSispas getNacionalidad() {
		return nacionalidad;
	}
	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(NacionalidadSispas nacionalidad) {
		this.nacionalidad = nacionalidad;
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
	 * @return the unidadMonetaria
	 */
	public String getUnidadMonetaria() {
		return unidadMonetaria;
	}
	/**
	 * @param unidadMonetaria the unidadMonetaria to set
	 */
	public void setUnidadMonetaria(String unidadMonetaria) {
		this.unidadMonetaria = unidadMonetaria;
	}
	/**
	 * @return the simboloMonetario
	 */
	public String getSimboloMonetario() {
		return simboloMonetario;
	}
	/**
	 * @param simboloMonetario the simboloMonetario to set
	 */
	public void setSimboloMonetario(String simboloMonetario) {
		this.simboloMonetario = simboloMonetario;
	}

}
