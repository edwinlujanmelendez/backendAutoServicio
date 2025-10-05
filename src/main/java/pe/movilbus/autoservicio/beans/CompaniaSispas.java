package pe.movilbus.autoservicio.beans;

import java.io.Serializable;

public class CompaniaSispas extends GenericBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer 	  id;
	private String  	  razonSocial;
	private String 		  nombreCorto;
	private String 		  direccion;
	private TipoDocumentoSispas tipoDocumento;
	private String 		  numeroDocumento;
	private String 		  repLegal;
	private String 		  sigla; // reporte 
	/**
	 * 
	 */
	public CompaniaSispas() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param id
	 * @param razonSocial
	 * @param nombreCorto
	 * @param numeroDocumento
	 * @param sigla
	 */
	public CompaniaSispas(Integer id, String razonSocial, String nombreCorto,
			String numeroDocumento, String sigla) {
		super();
		this.id = id;
		this.razonSocial = razonSocial;
		this.nombreCorto = nombreCorto;
		this.numeroDocumento = numeroDocumento;
		this.sigla = sigla;
	}
	/**
	 * @param id
	 * @param razonSocial
	 * @param nombreCorto
	 * @param sigla
	 */
	public CompaniaSispas(Integer id, String razonSocial, String nombreCorto,
			String sigla) {
		super();
		this.id = id;
		this.razonSocial = razonSocial;
		this.nombreCorto = nombreCorto;
		this.sigla = sigla;
	}
	
	/**
	 * @param id
	 */
	public CompaniaSispas(Integer id) {
		super();
		this.id = id;
	}
	
	
	
	/**
	 * @param id
	 * @param nombreCorto
	 * @param sigla
	 */
	public CompaniaSispas(Integer id, String nombreCorto, String sigla) {
		super();
		this.id = id;
		this.nombreCorto = nombreCorto;
		this.sigla = sigla;
	}
	/**
	 * @param id
	 * @param razonSocial
	 */
	public CompaniaSispas(Integer id, String razonSocial) {
		super();
		this.id = id;
		this.razonSocial = razonSocial;
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
	 * @return the razonSocial
	 */
	public String getRazonSocial() {
		return razonSocial;
	}
	/**
	 * @param razonSocial the razonSocial to set
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
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
	 * @return the tipoDocumento
	 */
	public TipoDocumentoSispas getTipoDocumento() {
		return tipoDocumento;
	}
	/**
	 * @param tipoDocumento the tipoDocumento to set
	 */
	public void setTipoDocumento(TipoDocumentoSispas tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	/**
	 * @return the numeroDocumento
	 */
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	/**
	 * @param numeroDocumento the numeroDocumento to set
	 */
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	/**
	 * @return the repLegal
	 */
	public String getRepLegal() {
		return repLegal;
	}
	/**
	 * @param repLegal the repLegal to set
	 */
	public void setRepLegal(String repLegal) {
		this.repLegal = repLegal;
	}
	/**
	 * @return the sigla
	 */
	public String getSigla() {
		return sigla;
	}
	/**
	 * @param sigla the sigla to set
	 */
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
}
