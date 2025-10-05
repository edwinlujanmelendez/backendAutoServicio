package pe.movilbus.autoservicio.beans;

import java.util.HashSet;
import java.util.Set;

public class BusSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private TipoFlotaSispas tipoFlota;
	private NumeroFlotaSispas numeroFlota;
	private ServicioSispas servicio;
	private CompaniaSispas empresa;
	private GrupoMantenimientoSispas grupoMantenimiento;
	private String codigo;
	private Double kilRecorridoDia;
	private Double kilAcumuladoOdometro;
	private Double kilAcumuladoEstandar;
	private String numeroPlaca;
	private Integer numeroEjes;
	private String numeroChasis;
	private String numeroMotor;
	private String tarjetaPropiedad;
	private Integer capacidad;
	private Integer anioFabricacion;
	private Integer idnumeroFlota;
	private String  codigoCarsync;
	
	private DocumentoBusSispas documentoBus;
	private ProgramacionServicioSispas programacionServicio;
	
	
	
	private Set<ItinerarioSispas> itinerarios = new HashSet<ItinerarioSispas>(0);
	private Set<DocumentoBusSispas> documentoBuses = new HashSet<DocumentoBusSispas>(0);
	private Set<ManifiestoSispas> manifiestos = new HashSet<ManifiestoSispas>(0);
	private Set<PuntoControlEstadoBusSispas> puntoControlEstadoBuses = new HashSet<PuntoControlEstadoBusSispas>(0);
	private Set<LiquidacionBusSispas> liquidacionBuses = new HashSet<LiquidacionBusSispas>(0);
	private Set<ProgramacionServicioSispas> programacionServicios = new HashSet<ProgramacionServicioSispas>(0);

	
	public BusSispas() {	
		
	}
	
	public BusSispas (Integer id) {
		super();
		this.id = id;
	}
	
	
	
	public BusSispas(String codigo) {
		super();
		this.codigo = codigo;
	}

	public BusSispas (TipoFlotaSispas tipoFlota, NumeroFlotaSispas numeroFlota, ServicioSispas servicio, CompaniaSispas empresa, GrupoMantenimientoSispas grupoMantenimiento, String codigo, Double kilRecorridoDia,
			Double kilAcumuladoOdometro, Double kilAcumuladoEstandar, String numeroPlaca, Integer numeroEjes, String numeroChasis, String numeroMotor, String tarjetaPropiedad,
			Integer capacidad, Integer anioFabricacion,
			Set<ItinerarioSispas> itinerarios,
			Set<DocumentoBusSispas> documentoBuses,
			Set<ManifiestoSispas> manifiestos,
			Set<PuntoControlEstadoBusSispas> puntoControlEstadoBuses,
			Set<LiquidacionBusSispas> liquidacionBuses,
			Set<ProgramacionServicioSispas> programacionServicios){
		this.tipoFlota = tipoFlota;
		this.numeroFlota = numeroFlota;
		this.servicio = servicio;
		this.empresa = empresa;
		this.grupoMantenimiento = grupoMantenimiento;
		this.codigo = codigo;
		this.kilRecorridoDia = kilRecorridoDia;
		this.kilAcumuladoOdometro = kilAcumuladoOdometro;
		this.kilAcumuladoEstandar = kilAcumuladoEstandar;
		this.numeroPlaca = numeroPlaca;
		this.numeroEjes = numeroEjes;
		this.numeroChasis = numeroChasis;
		this.numeroMotor = numeroMotor;
		this.tarjetaPropiedad = tarjetaPropiedad;
		this.capacidad = capacidad;
		this.anioFabricacion = anioFabricacion;
		this.itinerarios = itinerarios;
		this.documentoBuses = documentoBuses;
		this.manifiestos = manifiestos;
		this.puntoControlEstadoBuses = puntoControlEstadoBuses;
		this.liquidacionBuses = liquidacionBuses;
		this.programacionServicios = programacionServicios;
		
		
		
	}
	
	
	
	
	public BusSispas(String codigo, String numeroPlaca) {
		super();
		this.codigo = codigo;
		this.numeroPlaca = numeroPlaca;
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
	
	/**
	 * @return Objeto tipoFlota.
	 */
	public TipoFlotaSispas getTipoFlota() {
		return tipoFlota;
	}	
	/**
	 * @param tipoFlota	: Setea el objeto tipoFlota.
	 */
	public void setTipoFlota(TipoFlotaSispas tipoFlota) {
		this.tipoFlota = tipoFlota;
	}
	
	/**
	 * @return Objeto numeroFlota.
	 */
	public NumeroFlotaSispas getNumeroFlota() {
		return numeroFlota;
	}
	/**
	 * @param numeroFlota	: Setea el objeto numeroFlota.
	 */
	public void setNumeroFlota(NumeroFlotaSispas numeroFlota) {
		this.numeroFlota = numeroFlota;
	}
	
	/**
	 * @return Objeto servicio.
	 */
	public ServicioSispas getServicio() {
		return servicio;
	}
	/**
	 * @param servicio	: Setea el objeto servicio.
	 */
	public void setServicio(ServicioSispas servicio) {
		this.servicio = servicio;
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

	/**
	 * @return Objeto grupoMantenimiento.
	 */
	public GrupoMantenimientoSispas getGrupoMantenimiento() {
		return grupoMantenimiento;
	}
	/**
	 * @param grupoMantenimiento	: Setea el objeto grupoMantenimiento.
	 */
	public void setGrupoMantenimiento(GrupoMantenimientoSispas grupoMantenimiento) {
		this.grupoMantenimiento = grupoMantenimiento;
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
	 * @return Objeto kilRecorridoDia.
	 */
	public Double getKilRecorridoDia() {
		return kilRecorridoDia;
	}
	/**
	 * @param kilRecorridoDia	: Setea el objeto kilRecorridoDia.
	 */
	public void setKilRecorridoDia(Double kilRecorridoDia) {
		this.kilRecorridoDia = kilRecorridoDia;
	}
	
	/**
	 * @return Objeto kilAcumuladoOdometro.
	 */
	public Double getKilAcumuladoOdometro() {
		return kilAcumuladoOdometro;
	}
	/**
	 * @param kilAcumuladoOdometro	: Setea el objeto kilAcumuladoOdometro.
	 */
	public void setKilAcumuladoOdometro(Double kilAcumuladoOdometro) {
		this.kilAcumuladoOdometro = kilAcumuladoOdometro;
	}
	
	/**
	 * @return Objeto kilAcumuladoEstandar.
	 */
	public Double getKilAcumuladoEstandar() {
		return kilAcumuladoEstandar;
	}
	/**
	 * @param kilAcumuladoEstandar	: Setea el objeto kilAcumuladoEstandar.
	 */
	public void setKilAcumuladoEstandar(Double kilAcumuladoEstandar) {
		this.kilAcumuladoEstandar = kilAcumuladoEstandar;
	}
	
	/**
	 * @return Objeto numeroPlaca.
	 */
	public String getNumeroPlaca() {
		return numeroPlaca;
	}
	/**
	 * @param numeroPlaca	: Setea el objeto numeroPlaca.
	 */
	public void setNumeroPlaca(String numeroPlaca) {
		this.numeroPlaca = numeroPlaca;
	}
	
	/**
	 * @return Objeto numeroEjes.
	 */
	public Integer getNumeroEjes() {
		return numeroEjes;
	}
	/**
	 * @param numeroEjes	: Setea el objeto numeroEjes.
	 */
	public void setNumeroEjes(Integer numeroEjes) {
		this.numeroEjes = numeroEjes;
	}
	
	/**
	 * @return Objeto numeroChasis.
	 */
	public String getNumeroChasis() {
		return numeroChasis;
	}
	/**
	 * @param numeroChasis	: Setea el objeto numeroChasis.
	 */
	public void setNumeroChasis(String numeroChasis) {
		this.numeroChasis = numeroChasis;
	}
	
	/**
	 * @return Objeto numeroMotor.
	 */
	public String getNumeroMotor() {
		return numeroMotor;
	}
	/**
	 * @param numeroMotor	: Setea el objeto numeroMotor.
	 */
	public void setNumeroMotor(String numeroMotor) {
		this.numeroMotor = numeroMotor;
	}
	
	/**
	 * @return Objeto tarjetaPropiedad.
	 */
	public String getTarjetaPropiedad() {
		return tarjetaPropiedad;
	}
	/**
	 * @param tarjetaPropiedad	: Setea el objeto tarjetaPropiedad.
	 */
	public void setTarjetaPropiedad(String tarjetaPropiedad) {
		this.tarjetaPropiedad = tarjetaPropiedad;
	}
	
	/**
	 * @return Objeto capacidad.
	 */
	public Integer getCapacidad() {
		return capacidad;
	}
	/**
	 * @param capacidad	: Setea el objeto capacidad.
	 */
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}
	
	/**
	 * @return Objeto anioFabricacion.
	 */
	public Integer getAnioFabricacion() {
		return anioFabricacion;
	}
	/**
	 * @param anioFabricacion	: Setea el objeto anioFabricacion.
	 */
	public void setAnioFabricacion(Integer anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	
	public Integer getIdnumeroFlota (){
		return idnumeroFlota;
	}
	
	public void setIdnumeroFlota (Integer idnumeroFlota){
		this.idnumeroFlota=idnumeroFlota;
	}
	
	public DocumentoBusSispas getDocumentoBus(){
		return  documentoBus;
	}

	public void setDocumentoBus (DocumentoBusSispas documentoBus){
		this.documentoBus=documentoBus;
	}
	
	public ProgramacionServicioSispas getProgramacionServicio(){
		return programacionServicio;
	}
	
	public void setProgramacionServicio (ProgramacionServicioSispas programacionServicio){
		this.programacionServicio=programacionServicio;
	}
	
	
	/*=======================================================================*/
	
	public Set<ItinerarioSispas> getItinerarios() {
		return this.itinerarios;
	}
	public void setItinerarios(Set<ItinerarioSispas> itinerarios) {
		this.itinerarios = itinerarios;
	}

	public Set<DocumentoBusSispas> getDocumentoBuses() {
		return this.documentoBuses;
	}
	public void setDocumentoBuses(Set<DocumentoBusSispas> documentoBuses) {
		this.documentoBuses = documentoBuses;
	}

	public Set<ManifiestoSispas> getManifiestos() {
		return this.manifiestos;
	}
	public void setManifiestos(Set<ManifiestoSispas> manifiestos) {
		this.manifiestos = manifiestos;
	}

	public Set<PuntoControlEstadoBusSispas> getPuntoControlEstadoBuses() {
		return this.puntoControlEstadoBuses;
	}
	public void setPuntoControlEstadoBuses(Set<PuntoControlEstadoBusSispas> puntoControlEstadoBuses) {
		this.puntoControlEstadoBuses = puntoControlEstadoBuses;
	}

	public Set<LiquidacionBusSispas> getLiquidacionBuses() {
		return this.liquidacionBuses;
	}
	public void setLiquidacionBuses(Set<LiquidacionBusSispas> liquidacionBuses) {
		this.liquidacionBuses = liquidacionBuses;
	}

	public Set<ProgramacionServicioSispas> getProgramacionServicios() {
		return this.programacionServicios;
	}
	public void setProgramacionServicios(Set<ProgramacionServicioSispas> programacionServicios) {
		this.programacionServicios = programacionServicios;
	}

	public String getCodigoCarsync() {
		return codigoCarsync;
	}

	public void setCodigoCarsync(String codigoCarsync) {
		this.codigoCarsync = codigoCarsync;
	}
	
}
