package pe.movilbus.autoservicio.beans;

import java.io.Serializable;
import java.math.BigDecimal;

public class AgenciaListSispas implements Serializable, Cloneable {
	
	private static final long serialVersionUID = 1L;
	private BigDecimal agencia_id;
	private BigDecimal tipage_id;
	private BigDecimal localidad_id;
	private BigDecimal concesionario_id;
	private BigDecimal ubigeo_id;
	private BigDecimal zoncom_id;
	private String c_denominacion;
	private String c_nomcor;
	private Boolean n_esterminal;
	private String c_codigo;
	private String c_direccion;
	private BigDecimal nacionalidad_id;
	private int codigo_concar;
	private String c_nombre_concar;
	
	public AgenciaListSispas(BigDecimal agencia_id, BigDecimal tipage_id, BigDecimal localidad_id,
			BigDecimal concesionario_id, BigDecimal ubigeo_id, BigDecimal zoncom_id, String c_denominacion,
			String c_nomcor, Boolean n_esterminal, String c_codigo, String c_direccion, BigDecimal nacionalidad_id,
			int codigo_concar, String c_nombre_concar) {
		super();
		this.agencia_id = agencia_id;
		this.tipage_id = tipage_id;
		this.localidad_id = localidad_id;
		this.concesionario_id = concesionario_id;
		this.ubigeo_id = ubigeo_id;
		this.zoncom_id = zoncom_id;
		this.c_denominacion = c_denominacion;
		this.c_nomcor = c_nomcor;
		this.n_esterminal = n_esterminal;
		this.c_codigo = c_codigo;
		this.c_direccion = c_direccion;
		this.nacionalidad_id = nacionalidad_id;
		this.codigo_concar = codigo_concar;
		this.c_nombre_concar = c_nombre_concar;
	}
	
	public BigDecimal getAgencia_id() {
		return agencia_id;
	}
	public void setAgencia_id(BigDecimal agencia_id) {
		this.agencia_id = agencia_id;
	}
	public BigDecimal getTipage_id() {
		return tipage_id;
	}
	public void setTipage_id(BigDecimal tipage_id) {
		this.tipage_id = tipage_id;
	}
	public BigDecimal getLocalidad_id() {
		return localidad_id;
	}
	public void setLocalidad_id(BigDecimal localidad_id) {
		this.localidad_id = localidad_id;
	}
	public BigDecimal getConcesionario_id() {
		return concesionario_id;
	}
	public void setConcesionario_id(BigDecimal concesionario_id) {
		this.concesionario_id = concesionario_id;
	}
	public BigDecimal getUbigeo_id() {
		return ubigeo_id;
	}
	public void setUbigeo_id(BigDecimal ubigeo_id) {
		this.ubigeo_id = ubigeo_id;
	}
	public BigDecimal getZoncom_id() {
		return zoncom_id;
	}
	public void setZoncom_id(BigDecimal zoncom_id) {
		this.zoncom_id = zoncom_id;
	}
	public String getC_denominacion() {
		return c_denominacion;
	}
	public void setC_denominacion(String c_denominacion) {
		this.c_denominacion = c_denominacion;
	}
	public String getC_nomcor() {
		return c_nomcor;
	}
	public void setC_nomcor(String c_nomcor) {
		this.c_nomcor = c_nomcor;
	}
	public Boolean getN_esterminal() {
		return n_esterminal;
	}
	public void setN_esterminal(Boolean n_esterminal) {
		this.n_esterminal = n_esterminal;
	}
	public String getC_codigo() {
		return c_codigo;
	}
	public void setC_codigo(String c_codigo) {
		this.c_codigo = c_codigo;
	}
	public String getC_direccion() {
		return c_direccion;
	}
	public void setC_direccion(String c_direccion) {
		this.c_direccion = c_direccion;
	}
	public BigDecimal getNacionalidad_id() {
		return nacionalidad_id;
	}
	public void setNacionalidad_id(BigDecimal nacionalidad_id) {
		this.nacionalidad_id = nacionalidad_id;
	}
	public int getCodigo_concar() {
		return codigo_concar;
	}
	public void setCodigo_concar(int codigo_concar) {
		this.codigo_concar = codigo_concar;
	}
	public String getC_nombre_concar() {
		return c_nombre_concar;
	}
	public void setC_nombre_concar(String c_nombre_concar) {
		this.c_nombre_concar = c_nombre_concar;
	}

}
