package pe.movilbus.autoservicio.beans;

import java.io.Serializable;
import java.util.List;

public class UsuarioSispas extends GenericBean implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	public static final int TIPPAS_ALEATORIO = 0;
	public static final int TIPPAS_USUARIO = 1;
	private Integer  id;
	private PersonalSispas personal;
	private AgenciaSispas  agencia;
	private UsuarioHardwareSispas usuarioHardware;
	private String  apellidoPaterno;
	private String  apellidoMaterno;
	private String  nombre;
	private String  codigo;
	private String  login;
	private String  password;
	private Integer tipoPassword;
	private Integer tipoSeguridad;
	private String  emailFuncionario;
	
	//No mapeados
	private String emailInfo;			// No mapeado.
	private String pwdNormal;			//No mapeado
	private CanalVentaSispas canalventa;
	
	//no mapeados(Para el reporte ventas por punto de venta)
	private List<RptVentaUsuarioSispas> ventasUsuarios;
	
	public UsuarioSispas(Integer id) {
		super();
		this.id = id;
	}
	
	/**
	 * 
	 */
	public UsuarioSispas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsuarioSispas(Integer id, String login) {
		super();
		this.id = id;
		this.login = login;
	}

	public UsuarioSispas(Integer id, PersonalSispas personal, AgenciaSispas agencia,
			UsuarioHardwareSispas usuarioHardware, String apellidoPaterno, String apellidoMaterno, String nombre,
			String codigo, String login, String password, Integer tipoPassword, Integer tipoSeguridad,
			String emailFuncionario) {
		super();
		this.id = id;
		this.personal = personal;
		this.agencia = agencia;
		this.usuarioHardware = usuarioHardware;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.nombre = nombre;
		this.codigo = codigo;
		this.login = login;
		this.password = password;
		this.tipoPassword = tipoPassword;
		this.tipoSeguridad = tipoSeguridad;
		this.emailFuncionario = emailFuncionario;
	}

	/**
	 * @return Objeto id.
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id	: Setea el objeto id.
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	public UsuarioSispas(String login){
		this.login=login;
	}
	/**
	 * @return Objeto personal.
	 */
	public PersonalSispas getPersonal() {
		return personal;
	}
	/**
	 * @param personal	: Setea el objeto personal.
	 */
	public void setPersonal(PersonalSispas personal) {
		this.personal = personal;
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

	/**
	 * @return the usuarioHardware
	 */
	public UsuarioHardwareSispas getUsuarioHardware() {
		return usuarioHardware;
	}
	/**
	 * @param usuarioHardware the usuarioHardware to set
	 */
	public void setUsuarioHardware(UsuarioHardwareSispas usuarioHardware) {
		this.usuarioHardware = usuarioHardware;
	}

	/**
	 * @return Objeto apellidoPaterno.
	 */
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	/**
	 * @param apellidoPaterno	: Setea el objeto apellidoPaterno.
	 */
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	
	/**
	 * @return Objeto apellidoMaterno.
	 */
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	/**
	 * @param apellidoMaterno	: Setea el objeto apellidoMaterno.
	 */
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	
	/**
	 * @return Objeto nombre.
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre	: Setea el objeto nombre.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return Objeto codigo.
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo	: Setea el objeto codigo.
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * @return Objeto login.
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login	: Setea el objeto login.
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	
	/**
	 * @return Objeto password.
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password	: Setea el objeto password.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the tipoPassword
	 */
	public Integer getTipoPassword() {
		return tipoPassword;
	}
	/**
	 * @param tipoPassword the tipoPassword to set
	 */
	public void setTipoPassword(Integer tipoPassword) {
		this.tipoPassword = tipoPassword;
	}

	/**
	 * @return the tipoSeguridad
	 */
	public Integer getTipoSeguridad() {
		return tipoSeguridad;
	}
	/**
	 * @param tipoSeguridad the tipoSeguridad to set
	 */
	public void setTipoSeguridad(Integer tipoSeguridad) {
		this.tipoSeguridad = tipoSeguridad;
	}

	/**
	 * @return the emailFuncionario
	 */
	public String getEmailFuncionario() {
		return emailFuncionario;
	}
	/**
	 * @param emailFuncionario the emailFuncionario to set
	 */
	public void setEmailFuncionario(String emailFuncionario) {
		this.emailFuncionario = emailFuncionario;
	}

	/**
	 * @return the emailInfo
	 */
	public String getEmailInfo() {
		return emailInfo;
	}
	/**
	 * @param emailInfo the emailInfo to set
	 */
	public void setEmailInfo(String emailInfo) {
		this.emailInfo = emailInfo;
	}

	/**
	 * @return the pwdNormal
	 */
	public String getPwdNormal() {
		return pwdNormal;
	}
	/**
	 * @param pwdNormal the pwdNormal to set
	 */
	public void setPwdNormal(String pwdNormal) {
		this.pwdNormal = pwdNormal;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return apellidoPaterno + (apellidoMaterno==null?"":" " + apellidoMaterno) + ", " + nombre;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	/**
	 * @return the ventasUsuarios
	 */
	public List<RptVentaUsuarioSispas> getVentasUsuarios() {
		return ventasUsuarios;
	}

	/**
	 * @param ventasUsuarios the ventasUsuarios to set
	 */
	public void setVentasUsuarios(List<RptVentaUsuarioSispas> ventasUsuarios) {
		this.ventasUsuarios = ventasUsuarios;
	}

	/**
	 * @return the canalventa
	 */
	public CanalVentaSispas getCanalventa() {
		return canalventa;
	}

	/**
	 * @param canalventa the canalventa to set
	 */
	public void setCanalventa(CanalVentaSispas canalventa) {
		this.canalventa = canalventa;
	}

}
