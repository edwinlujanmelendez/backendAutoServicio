package pe.movilbus.autoservicio.beans;

import java.io.Serializable;
import java.math.BigDecimal;

public class UsuarioListSispas implements Serializable, Cloneable {
	
	private static final long serialVersionUID = 1L;
	private BigDecimal usuario_id;
	private BigDecimal personal_id;
	private BigDecimal agencia_id;
	private BigDecimal usuhard_id;
	private String c_apepat;
	private String c_apemat;
	private String c_nombre;
	private String c_codigo;
	private String c_login;
	private String c_password;
	private int n_tippas;
	private int n_tipseg;
	private String c_email;
	
	public UsuarioListSispas(BigDecimal usuario_id, BigDecimal personal_id, BigDecimal agencia_id,
			BigDecimal usuhard_id, String c_apepat, String c_apemat, String c_nombre, String c_codigo, String c_login,
			String c_password, int n_tippas, int n_tipseg, String c_email) {
		super();
		this.usuario_id = usuario_id;
		this.personal_id = personal_id;
		this.agencia_id = agencia_id;
		this.usuhard_id = usuhard_id;
		this.c_apepat = c_apepat;
		this.c_apemat = c_apemat;
		this.c_nombre = c_nombre;
		this.c_codigo = c_codigo;
		this.c_login = c_login;
		this.c_password = c_password;
		this.n_tippas = n_tippas;
		this.n_tipseg = n_tipseg;
		this.c_email = c_email;
	}
	
	public BigDecimal getUsuario_id() {
		return usuario_id;
	}
	public void setUsuario_id(BigDecimal usuario_id) {
		this.usuario_id = usuario_id;
	}
	public BigDecimal getPersonal_id() {
		return personal_id;
	}
	public void setPersonal_id(BigDecimal personal_id) {
		this.personal_id = personal_id;
	}
	public BigDecimal getAgencia_id() {
		return agencia_id;
	}
	public void setAgencia_id(BigDecimal agencia_id) {
		this.agencia_id = agencia_id;
	}
	public BigDecimal getUsuhard_id() {
		return usuhard_id;
	}
	public void setUsuhard_id(BigDecimal usuhard_id) {
		this.usuhard_id = usuhard_id;
	}
	public String getC_apepat() {
		return c_apepat;
	}
	public void setC_apepat(String c_apepat) {
		this.c_apepat = c_apepat;
	}
	public String getC_apemat() {
		return c_apemat;
	}
	public void setC_apemat(String c_apemat) {
		this.c_apemat = c_apemat;
	}
	public String getC_nombre() {
		return c_nombre;
	}
	public void setC_nombre(String c_nombre) {
		this.c_nombre = c_nombre;
	}
	public String getC_codigo() {
		return c_codigo;
	}
	public void setC_codigo(String c_codigo) {
		this.c_codigo = c_codigo;
	}
	public String getC_login() {
		return c_login;
	}
	public void setC_login(String c_login) {
		this.c_login = c_login;
	}
	public String getC_password() {
		return c_password;
	}
	public void setC_password(String c_password) {
		this.c_password = c_password;
	}
	public int getN_tippas() {
		return n_tippas;
	}
	public void setN_tippas(int n_tippas) {
		this.n_tippas = n_tippas;
	}
	public int getN_tipseg() {
		return n_tipseg;
	}
	public void setN_tipseg(int n_tipseg) {
		this.n_tipseg = n_tipseg;
	}
	public String getC_email() {
		return c_email;
	}
	public void setC_email(String c_email) {
		this.c_email = c_email;
	}
	
}
