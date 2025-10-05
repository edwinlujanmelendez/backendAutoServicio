package pe.movilbus.autoservicio.beans;

public class AgenciaSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private TipoAgenciaSispas tipoAgencia;
	private ConcesionarioSispas concesionario;
	private LocalidadSispas localidad;
	private String denominacion;
	private String nombreCorto;
	private Boolean esTerminal;
	private UbigeoSispas ubigeo;
	private String direccion;
	private String codigo;
	private NacionalidadSispas nacionalidad;
	private Integer codigoConcar;
	private String  nombAgeConcar;
	
//	private TipoMoneda tipoMoneda;
	
	
	//No mapeado
	private UsuarioSispas usuario;
	private String horaPartida;		// Mapeado para las Agencias por Itinerario Itinerarios_AgPartida, Itinerarios_AgLlegada
	

	

	public AgenciaSispas() {
	}
	
	/**
	 * @param id
	 */
	public AgenciaSispas(Integer id) {
		super();
		this.id = id;
	}
	
	
	
	public AgenciaSispas(String denominacion) {
		super();
		this.denominacion = denominacion;
	}

	/**
	 * @param denominacion
	 * @param direccion
	 */
	public AgenciaSispas(String denominacion, String direccion) {
		super();
		this.denominacion = denominacion;
		this.direccion = direccion;
	}

	public AgenciaSispas(TipoAgenciaSispas tipoAgencia, ConcesionarioSispas concesionario,LocalidadSispas localidad, 
			String denominacion, String nombreCorto,Boolean esTerminal) {
		this.tipoAgencia = tipoAgencia;
		this.concesionario = concesionario;
		this.localidad = localidad;
		this.denominacion = denominacion;
		this.nombreCorto = nombreCorto;
		this.esTerminal = esTerminal;		
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
	 * @return the tipoAgencia
	 */
	public TipoAgenciaSispas getTipoAgencia() {
		return tipoAgencia;
	}
	/**
	 * @param tipoAgencia the tipoAgencia to set
	 */
	public void setTipoAgencia(TipoAgenciaSispas tipoAgencia) {
		this.tipoAgencia = tipoAgencia;
	}

	/**
	 * @return the concesionario
	 */
	public ConcesionarioSispas getConcesionario() {
		return concesionario;
	}
	/**
	 * @param concesionario the concesionario to set
	 */
	public void setConcesionario(ConcesionarioSispas concesionario) {
		this.concesionario = concesionario;
	}

	/**
	 * @return the localidad
	 */
	public LocalidadSispas getLocalidad() {
		return localidad;
	}
	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(LocalidadSispas localidad) {
		this.localidad = localidad;
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
	 * @return the esTerminal
	 */
	public Boolean getEsTerminal() {
		return esTerminal;
	}
	/**
	 * @param esTerminal the esTerminal to set
	 */
	public void setEsTerminal(Boolean esTerminal) {
		this.esTerminal = esTerminal;
	}

	/**
	 * @return the ubigeo
	 */
	public UbigeoSispas getUbigeo() {
		return ubigeo;
	}
	/**
	 * @param ubigeo the ubigeo to set
	 */
	public void setUbigeo(UbigeoSispas ubigeo) {
		this.ubigeo = ubigeo;
	}

	/**
	 * @return the horaPartida
	 */
	public String getHoraPartida() {
		return horaPartida;
	}
	/**
	 * @param horaPartida the horaPartida to set
	 */
	public void setHoraPartida(String horaPartida) {
		this.horaPartida = horaPartida;
	}
	
	@Override
	public String toString() {
		return this.getDenominacion();
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
	 * @return the usuarios
	 */
	public UsuarioSispas getUsuario() {
		return usuario;
	}

	/**
	 * @param usuarios the usuarios to set
	 */
	public void setUsuario(UsuarioSispas usuario) {
		this.usuario = usuario;
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
	 * @return the codigoConcar
	 */
	public Integer getCodigoConcar() {
		return codigoConcar;
	}

	/**
	 * @param codigoConcar the codigoConcar to set
	 */
	public void setCodigoConcar(Integer codigoConcar) {
		this.codigoConcar = codigoConcar;
	}

	/**
	 * @return the nombAgeConcar
	 */
	public String getNombAgeConcar() {
		return nombAgeConcar;
	}

	/**
	 * @param nombAgeConcar the nombAgeConcar to set
	 */
	public void setNombAgeConcar(String nombAgeConcar) {
		this.nombAgeConcar = nombAgeConcar;
	}

}
