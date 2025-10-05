package pe.movilbus.autoservicio.beans;

import java.io.Serializable;
import java.util.Date;

public class PersonalSispas extends GenericBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private TipoPersonalSispas tipoPersonal;
	private TipoDocumentoSispas tipoDocumento;
	private UbigeoSispas ubigeo;
	private String codigo;
	private String nroDocumento;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private Date fechaNacimiento;
	private String lugarNacimiento;
	private EstadoCivilSispas estadoCivil;
	private SexoSispas sexo;
	private NacionalidadSispas nacionalidad;
	private String telefono;
	private String email;
	private String licencia;
	private String categoria;
	private TipoViaSispas tipoVia;
	private String nombreVia;
	private TipoZonaSispas tipoZona;
	private String nombreZona;
	private String direccion;
	private CompaniaSispas empresa;
	private String  codigoCarsync;
	
	private Integer tipoConductor; //No mapeado
	private String  nombreCompleto;
	
	public PersonalSispas() {
	}

	public PersonalSispas(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public TipoPersonalSispas getTipoPersonal() {
		return this.tipoPersonal;
	}
	public void setTipoPersonal(TipoPersonalSispas tipoPersonal) {
		this.tipoPersonal = tipoPersonal;
	}

	public TipoDocumentoSispas getTipoDocumento() {
		return this.tipoDocumento;
	}
	public void setTipoDocumento(TipoDocumentoSispas tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public UbigeoSispas getUbigeo() {
		return ubigeo;
	}
	public void setUbigeo(UbigeoSispas ubigeo) {
		this.ubigeo = ubigeo;
	}

	public String getCodigo() {
		return this.codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNroDocumento() {
		return this.nroDocumento;
	}
	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return this.apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return this.apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getLugarNacimiento() {
		return this.lugarNacimiento;
	}
	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public EstadoCivilSispas getEstadoCivil() {
		return this.estadoCivil;
	}
	public void setEstadoCivil(EstadoCivilSispas estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public SexoSispas getSexo() {
		return this.sexo;
	}
	public void setSexo(SexoSispas sexo) {
		this.sexo = sexo;
	}

	public String getNombreZona() {
		return this.nombreZona;
	}
	public void setNombreZona(String nombreZona) {
		this.nombreZona = nombreZona;
	}

	public NacionalidadSispas getNacionalidad() {
		return this.nacionalidad;
	}
	public void setNacionalidad(NacionalidadSispas nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getTelefono() {
		return this.telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getLicencia() {
		return this.licencia;
	}
	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public String getCategoria() {
		return this.categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public TipoViaSispas getTipoVia() {
		return this.tipoVia;
	}
	public void setTipoVia(TipoViaSispas tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNombreVia() {
		return this.nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}

	public TipoZonaSispas getTipoZona() {
		return this.tipoZona;
	}
	public void setTipoZona(TipoZonaSispas tipoZona) {
		this.tipoZona = tipoZona;
	}

	public String getDireccion() {
		return this.direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String toString(){
		return apellidoPaterno + (apellidoMaterno==null?"":" " + apellidoMaterno) + ", " + nombre;
	}

	/**
	 * @return the tipoConductor
	 */
	public Integer getTipoConductor() {
		return tipoConductor;
	}

	/**
	 * @param tipoConductor the tipoConductor to set
	 */
	public void setTipoConductor(Integer tipoConductor) {
		this.tipoConductor = tipoConductor;
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

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getCodigoCarsync() {
		return codigoCarsync;
	}

	public void setCodigoCarsync(String codigoCarsync) {
		this.codigoCarsync = codigoCarsync;
	}
	
}
