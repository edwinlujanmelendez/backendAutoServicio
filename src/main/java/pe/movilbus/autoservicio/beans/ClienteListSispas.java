package pe.movilbus.autoservicio.beans;

import java.io.Serializable;
import java.math.BigDecimal;

public class ClienteListSispas implements Serializable, Cloneable {
	
	private static final long serialVersionUID = 1L;
	private BigDecimal cliente_id;
	private BigDecimal agencia_id;
	private BigDecimal ubigeo_id;
	private String c_numdoc;
	private String c_razsoc;
	private String c_rubro;
	private int n_cantrab;
	private String c_direccion;
	private String c_contacto;
	private String c_confin;
	private String c_telfijo1;
	private String c_telfijo2;
	private String c_movil1;
	private String c_movil2;
	private String c_origen;
	private String c_email;
	private Double n_kilometros;
	
	public ClienteListSispas(BigDecimal cliente_id, BigDecimal agencia_id, BigDecimal ubigeo_id, String c_numdoc,
			String c_razsoc, String c_rubro, int n_cantrab, String c_direccion, String c_contacto, String c_confin,
			String c_telfijo1, String c_telfijo2, String c_movil1, String c_movil2, String c_origen, String c_email,
			Double n_kilometros) {
		super();
		this.cliente_id = cliente_id;
		this.agencia_id = agencia_id;
		this.ubigeo_id = ubigeo_id;
		this.c_numdoc = c_numdoc;
		this.c_razsoc = c_razsoc;
		this.c_rubro = c_rubro;
		this.n_cantrab = n_cantrab;
		this.c_direccion = c_direccion;
		this.c_contacto = c_contacto;
		this.c_confin = c_confin;
		this.c_telfijo1 = c_telfijo1;
		this.c_telfijo2 = c_telfijo2;
		this.c_movil1 = c_movil1;
		this.c_movil2 = c_movil2;
		this.c_origen = c_origen;
		this.c_email = c_email;
		this.n_kilometros = n_kilometros;
	}
	
	public BigDecimal getCliente_id() {
		return cliente_id;
	}
	public void setCliente_id(BigDecimal cliente_id) {
		this.cliente_id = cliente_id;
	}
	public BigDecimal getAgencia_id() {
		return agencia_id;
	}
	public void setAgencia_id(BigDecimal agencia_id) {
		this.agencia_id = agencia_id;
	}
	public BigDecimal getUbigeo_id() {
		return ubigeo_id;
	}
	public void setUbigeo_id(BigDecimal ubigeo_id) {
		this.ubigeo_id = ubigeo_id;
	}
	public String getC_numdoc() {
		return c_numdoc;
	}
	public void setC_numdoc(String c_numdoc) {
		this.c_numdoc = c_numdoc;
	}
	public String getC_razsoc() {
		return c_razsoc;
	}
	public void setC_razsoc(String c_razsoc) {
		this.c_razsoc = c_razsoc;
	}
	public String getC_rubro() {
		return c_rubro;
	}
	public void setC_rubro(String c_rubro) {
		this.c_rubro = c_rubro;
	}
	public int getN_cantrab() {
		return n_cantrab;
	}
	public void setN_cantrab(int n_cantrab) {
		this.n_cantrab = n_cantrab;
	}
	public String getC_direccion() {
		return c_direccion;
	}
	public void setC_direccion(String c_direccion) {
		this.c_direccion = c_direccion;
	}
	public String getC_contacto() {
		return c_contacto;
	}
	public void setC_contacto(String c_contacto) {
		this.c_contacto = c_contacto;
	}
	public String getC_confin() {
		return c_confin;
	}
	public void setC_confin(String c_confin) {
		this.c_confin = c_confin;
	}
	public String getC_telfijo1() {
		return c_telfijo1;
	}
	public void setC_telfijo1(String c_telfijo1) {
		this.c_telfijo1 = c_telfijo1;
	}
	public String getC_telfijo2() {
		return c_telfijo2;
	}
	public void setC_telfijo2(String c_telfijo2) {
		this.c_telfijo2 = c_telfijo2;
	}
	public String getC_movil1() {
		return c_movil1;
	}
	public void setC_movil1(String c_movil1) {
		this.c_movil1 = c_movil1;
	}
	public String getC_movil2() {
		return c_movil2;
	}
	public void setC_movil2(String c_movil2) {
		this.c_movil2 = c_movil2;
	}
	public String getC_origen() {
		return c_origen;
	}
	public void setC_origen(String c_origen) {
		this.c_origen = c_origen;
	}
	public String getC_email() {
		return c_email;
	}
	public void setC_email(String c_email) {
		this.c_email = c_email;
	}
	public Double getN_kilometros() {
		return n_kilometros;
	}
	public void setN_kilometros(Double n_kilometros) {
		this.n_kilometros = n_kilometros;
	}
}
