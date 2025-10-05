package pe.movilbus.autoservicio.beans;

import java.io.Serializable;

public class NumeroHREIDSispas implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String idNumeroHRE;
	private Integer idEmpresa;

	
	public NumeroHREIDSispas(){
		super();
	}
	
	public NumeroHREIDSispas(String idNumeroHRE, Integer idEmpresa){
		super();
		this.setIdNumeroHRE(idNumeroHRE);
		this.setIdEmpresa(idEmpresa);
	}

	/**
	 * @return the idNumeroHojaRuta
	 */
	public String getIdNumeroHRE() {
		return idNumeroHRE;
	}
	/**
	 * @param idNumeroHRE the idNumeroHRE to set
	 */
	public void setIdNumeroHRE(String idNumeroHRE) {
		this.idNumeroHRE = idNumeroHRE;
	}

	/**
	 * @return the idEmpresa
	 */
	public Integer getIdEmpresa() {
		return idEmpresa;
	}
	/**
	 * @param idEmpresa the idEmpresa to set
	 */
	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
}
