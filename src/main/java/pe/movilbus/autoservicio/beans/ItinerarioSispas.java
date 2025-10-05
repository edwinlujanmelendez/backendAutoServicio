package pe.movilbus.autoservicio.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItinerarioSispas extends GenericBean implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private TipoItinerarioSispas tipoItinerario;
	private BusSispas bus;
	private Ruta ruta;
	private ServicioSispas servicio;
	private AgenciaSispas agenciaPartida;
	private AgenciaSispas agenciaLlegada;
	private Date fechaPartida;
	private String horaPartida;
	private Date fechaLlegada;
	private String horaLlegada;
	private Integer esAnulado;
	private String secuenciaTramo;
	private Date fechaRealPartida;
	private CompaniaSispas empresa;
	private String  adicional;
	
	//No mapeado
	private List<SecuenciaTramo> listSecuenciaTramo;
	private Integer  estadocomp; // 1 :: comprimido  , 2 :: descomprimido
	private String  lst_itinerarios; // ac -- 17/11/2016 listado de itinerarios para su configuracion de precios especifico masivo
	private Integer    estadoVenta; // parte del detalle del itinerario
	
	
	
	
	public ItinerarioSispas() {
	}
	
	
	
	/**
	 * @param id
	 * @param bus
	 */
	public ItinerarioSispas(Long id, BusSispas bus) {
		super();
		this.id = id;
		this.bus = bus;
	}



	/**
	 * @param id
	 */
	public ItinerarioSispas(Long id) {
		super();
		this.id = id;
	}

	/**
	 * @return Objeto id.
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id	: Setea el objeto id.
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * @return Objeto tipoItinerario.
	 */
	public TipoItinerarioSispas getTipoItinerario() {
		return tipoItinerario;
	}
	/**
	 * @param tipoItinerario	: Setea el objeto tipoItinerario.
	 */
	public void setTipoItinerario(TipoItinerarioSispas tipoItinerario) {
		this.tipoItinerario = tipoItinerario;
	}
	
	/**
	 * @return Objeto bus.
	 */
	public BusSispas getBus() {
		return bus;
	}
	/**
	 * @param bus	: Setea el objeto bus.
	 */
	public void setBus(BusSispas bus) {
		this.bus = bus;
	}
	
	/**
	 * @return Objeto ruta.
	 */
	public Ruta getRuta() {
		return ruta;
	}
	/**
	 * @param ruta	: Setea el objeto ruta.
	 */
	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
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
	 * @return Objeto agenciaPartida.
	 */
	public AgenciaSispas getAgenciaPartida() {
		return agenciaPartida;
	}
	/**
	 * @param agenciaPartida	: Setea el objeto agenciaPartida.
	 */
	public void setAgenciaPartida(AgenciaSispas agenciaPartida) {
		this.agenciaPartida = agenciaPartida;
	}
	
	/**
	 * @return Objeto agenciaLlegada.
	 */
	public AgenciaSispas getAgenciaLlegada() {
		return agenciaLlegada;
	}
	/**
	 * @param agenciaLlegada	: Setea el objeto agenciaLlegada.
	 */
	public void setAgenciaLlegada(AgenciaSispas agenciaLlegada) {
		this.agenciaLlegada = agenciaLlegada;
	}
	
	/**
	 * @return Objeto fechaPartida.
	 */
	public Date getFechaPartida() {
		return fechaPartida;
	}
	/**
	 * @param fechaPartida	: Setea el objeto fechaPartida.
	 */
	public void setFechaPartida(Date fechaPartida) {
		this.fechaPartida = fechaPartida;
	}
	
	/**
	 * @return Objeto horaPartida.
	 */
	public String getHoraPartida() {
		return horaPartida;
	}
	/**
	 * @param horaPartida	: Setea el objeto horaPartida.
	 */
	public void setHoraPartida(String horaPartida) {
		this.horaPartida = horaPartida;
	}
	
	/**
	 * @return Objeto fechaLlegada.
	 */
	public Date getFechaLlegada() {
		return fechaLlegada;
	}
	/**
	 * @param fechaLlegada	: Setea el objeto fechaLlegada.
	 */
	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}
	
	/**
	 * @return Objeto horaLlegada.
	 */
	public String getHoraLlegada() {
		return horaLlegada;
	}
	/**
	 * @param horaLlegada	: Setea el objeto horaLlegada.
	 */
	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}
	
	/**
	 * @return Objeto esAnulado.
	 */
	public Integer getEsAnulado() {
		return esAnulado;
	}
	/**
	 * @param esAnulado	: Setea el objeto esAnulado.
	 */
	public void setEsAnulado(Integer esAnulado) {
		this.esAnulado = esAnulado;
	}

	/**
	 * @return Objeto secuenciaTramo.
	 */
	public String getSecuenciaTramo() {
		return secuenciaTramo;
	}
	/**
	 * @param secuenciaTramo	: Setea el objeto secuenciaTramo.
	 */
	public void setSecuenciaTramo(String secuenciaTramo) {
		this.secuenciaTramo = secuenciaTramo;
		setListSecuenciaTramo(obtenerSecuencia(secuenciaTramo));
	}

	/**
	 * @return Objeto listSecuenciaTramo.
	 */
	public List<SecuenciaTramo> getListSecuenciaTramo() {
		return listSecuenciaTramo;
	}
	/**
	 * @param listSecuenciaTramo	: Setea el objeto listSecuenciaTramo.
	 */
	public void setListSecuenciaTramo(List<SecuenciaTramo> listSecuenciaTramo) {
		this.listSecuenciaTramo = listSecuenciaTramo;
	}
	
	/**
	 * @return the fechaRealPartida
	 */
	public Date getFechaRealPartida() {
		return fechaRealPartida;
	}
	/**
	 * @param fechaRealPartida the fechaRealPartida to set
	 */
	public void setFechaRealPartida(Date fechaRealPartida) {
		this.fechaRealPartida = fechaRealPartida;
	}

	private List<SecuenciaTramo> obtenerSecuencia(String secuencia){
		String[] sArray = secuencia.split(";");
		List<SecuenciaTramo> lstResult = new ArrayList<SecuenciaTramo>();
		for(String obj : sArray){
			SecuenciaTramo secuenciaTramo = new SecuenciaTramo();
			String[] buffer = obj.split("-");
			secuenciaTramo.setOrigen(Integer.valueOf(buffer[0]));
			secuenciaTramo.setDestino(Integer.valueOf(buffer[1]));
			secuenciaTramo.setOrden(Integer.valueOf(buffer[2]));
			lstResult.add(secuenciaTramo);
		}
		return lstResult;
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
	 * @return the adicional
	 */
	public String getAdicional() {
		return adicional;
	}

	/**
	 * @param adicional the adicional to set
	 */
	public void setAdicional(String adicional) {
		this.adicional = adicional;
	}

	/**
	 * @return the estadocomp
	 */
	public Integer getEstadocomp() {
		return estadocomp;
	}

	/**
	 * @param estadocomp the estadocomp to set
	 */
	public void setEstadocomp(Integer estadocomp) {
		this.estadocomp = estadocomp;
	}

	/**
	 * @return the lst_itinerarios
	 */
	public String getLst_itinerarios() {
		return lst_itinerarios;
	}

	/**
	 * @param lst_itinerarios the lst_itinerarios to set
	 */
	public void setLst_itinerarios(String lst_itinerarios) {
		this.lst_itinerarios = lst_itinerarios;
	}

	/**
	 * @return the estadoVenta
	 */
	public Integer getEstadoVenta() {
		return estadoVenta;
	}

	/**
	 * @param estadoVenta the estadoVenta to set
	 */
	public void setEstadoVenta(Integer estadoVenta) {
		this.estadoVenta = estadoVenta;
	}
	
}
