package pe.movilbus.autoservicio.beans;

import java.io.Serializable;
import java.math.BigDecimal;

public class CompaniaListSispas implements Serializable, Cloneable {
	
	private static final long serialVersionUID = 1L;
	private BigDecimal empresa_id;
	private String c_razsoc;
	private String c_nomcor;
	private String c_direccion;
	private BigDecimal tipdoc_id;
	private String c_numdoc;
	private String c_repleg;
	private String c_sigla;
	
	public CompaniaListSispas(BigDecimal empresa_id, String c_razsoc, String c_nomcor, String c_direccion,
			BigDecimal tipdoc_id, String c_numdoc, String c_repleg, String c_sigla) {
		super();
		this.empresa_id = empresa_id;
		this.c_razsoc = c_razsoc;
		this.c_nomcor = c_nomcor;
		this.c_direccion = c_direccion;
		this.tipdoc_id = tipdoc_id;
		this.c_numdoc = c_numdoc;
		this.c_repleg = c_repleg;
		this.c_sigla = c_sigla;
	}
	
	public BigDecimal getEmpresa_id() {
		return empresa_id;
	}
	public void setEmpresa_id(BigDecimal empresa_id) {
		this.empresa_id = empresa_id;
	}
	public String getC_razsoc() {
		return c_razsoc;
	}
	public void setC_razsoc(String c_razsoc) {
		this.c_razsoc = c_razsoc;
	}
	public String getC_nomcor() {
		return c_nomcor;
	}
	public void setC_nomcor(String c_nomcor) {
		this.c_nomcor = c_nomcor;
	}
	public String getC_direccion() {
		return c_direccion;
	}
	public void setC_direccion(String c_direccion) {
		this.c_direccion = c_direccion;
	}
	public BigDecimal getTipdoc_id() {
		return tipdoc_id;
	}
	public void setTipdoc_id(BigDecimal tipdoc_id) {
		this.tipdoc_id = tipdoc_id;
	}
	public String getC_numdoc() {
		return c_numdoc;
	}
	public void setC_numdoc(String c_numdoc) {
		this.c_numdoc = c_numdoc;
	}
	public String getC_repleg() {
		return c_repleg;
	}
	public void setC_repleg(String c_repleg) {
		this.c_repleg = c_repleg;
	}
	public String getC_sigla() {
		return c_sigla;
	}
	public void setC_sigla(String c_sigla) {
		this.c_sigla = c_sigla;
	}

}
