package pe.movilbus.autoservicio.beans;

import java.io.Serializable;
import java.util.Date;

public class DetalleItinerarioSispas extends GenericBean implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private Long       id;
	private ItinerarioSispas itinerario;
	private RutaSispas 	   ruta;	
	private AgenciaSispas    agenciaPartida;
	private Date 	   fechaPartida;
	private String 	   horaPartida;	
	private AgenciaSispas    agenciaLlegada;
	private Date       fechaLlegada;
	private String     horaLlegada;
	private Double     tarifa;
	private Double     tarifaLista;
	private Integer    estadoVenta;
	
	// NO MAPEADO
		private String  asiento;				
		private String  piso;				
		private Boolean esIda;					
		private TarifaFechaAbiertaSispas tarifaFechaAbierta;
		
		// 05/08/2016 -- TIPOS DE TARIFAS
		private String C_INSUPERABLE;
		private String C_OCASION;
		private String C_REGULAR;
		private String C_REGULAR120;
		private String C_VIP;
		private String C_VIP1;
		// 01/09/2016 -- SI CONSIDERA EL TARIFARIO O NO. ( QUERY ) --
		private boolean query_itinerario;
		// 14/09/2016 -- TARIFA REGULAR 
		private Double   tarifaRegular;
		// 12/11/2016 -- 	TARIFA X NIVEL
		private TipoTarifaSispas  tipoTarifa1;
		private Double  	tarifa1;		
		private TipoTarifaSispas  tipoTarifa2;
		private Double  	tarifa2;
		private CanalVentaSispas 	canalVenta;
		// AC -- 01122016
		private Integer   idTipoTarifaPromo;
		
		// Listado de canales para la Tarifa x nivel
		
		private String 		listadocanales;
		private Integer 	nivel;
		
		
	public DetalleItinerarioSispas() {
		
	}
	
	

	/**
	 * @param itinerario
	 * @param ruta
	 */
	public DetalleItinerarioSispas(ItinerarioSispas itinerario, RutaSispas ruta) {
		super();
		this.itinerario = itinerario;
		this.ruta = ruta;
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
	 * @return Objeto itinerario.
	 */
	public ItinerarioSispas getItinerario() {
		return itinerario;
	}
	/**
	 * @param itinerario	: Setea el objeto itinerario.
	 */
	public void setItinerario(ItinerarioSispas itinerario) {
		this.itinerario = itinerario;
	}

	/**
	 * @return Objeto ruta.
	 */
	public RutaSispas getRuta() {
		return ruta;
	}
	/**
	 * @param ruta	: Setea el objeto ruta.
	 */
	public void setRuta(RutaSispas ruta) {
		this.ruta = ruta;
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
	 * @return Objeto horaLllegada.
	 */
	public String getHoraLlegada() {
		return horaLlegada;
	}
	/**
	 * @param horaLllegada	: Setea el objeto horaLllegada.
	 */
	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	/**
	 * @return Objeto tarifa.
	 */
	public Double getTarifa() {
		return tarifa;
	}
	/**
	 * @param tarifa	: Setea el objeto tarifa.
	 */
	public void setTarifa(Double tarifa) {
		this.tarifa = tarifa;
	}

	/**
	 * @return Objeto asiento.
	 */
	public String getAsiento() {
		return asiento;
	}

	/**
	 * @param asiento	: Setea el objeto asiento.
	 */
	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}

	/**
	 * @return the piso
	 */
	public String getPiso() {
		return piso;
	}
	/**
	 * @param piso the piso to set
	 */
	public void setPiso(String piso) {
		this.piso = piso;
	}

	/**
	 * @return the esIda
	 */
	public Boolean getEsIda() {
		return esIda;
	}
	/**
	 * @param esIda the esIda to set
	 */
	public void setEsIda(Boolean esIda) {
		this.esIda = esIda;
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
	 * @return the tarifaFechaAbierta
	 */
	public TarifaFechaAbiertaSispas getTarifaFechaAbierta() {
		return tarifaFechaAbierta;
	}

	/**
	 * @param tarifaFechaAbierta the tarifaFechaAbierta to set
	 */
	public void setTarifaFechaAbierta(TarifaFechaAbiertaSispas tarifaFechaAbierta) {
		this.tarifaFechaAbierta = tarifaFechaAbierta;
	}

	/**
	 * @return the tarifaLista
	 */
	public Double getTarifaLista() {
		return tarifaLista;
	}

	/**
	 * @param tarifaLista the tarifaLista to set
	 */
	public void setTarifaLista(Double tarifaLista) {
		this.tarifaLista = tarifaLista;
	}

	// NO MAPEADO -- 05/08/2016 :: TIPO DE TARIFAS
	
	/**
	 * @return the c_INSUPERABLE
	 */
	public String getC_INSUPERABLE() {
		return C_INSUPERABLE;
	}

	/**
	 * @param c_INSUPERABLE the c_INSUPERABLE to set
	 */
	public void setC_INSUPERABLE(String c_INSUPERABLE) {
		C_INSUPERABLE = c_INSUPERABLE;
	}

	/**
	 * @return the c_OCASION
	 */
	public String getC_OCASION() {
		return C_OCASION;
	}

	/**
	 * @param c_OCASION the c_OCASION to set
	 */
	public void setC_OCASION(String c_OCASION) {
		C_OCASION = c_OCASION;
	}

	/**
	 * @return the c_REGULAR
	 */
	public String getC_REGULAR() {
		return C_REGULAR;
	}

	/**
	 * @param c_REGULAR the c_REGULAR to set
	 */
	public void setC_REGULAR(String c_REGULAR) {
		C_REGULAR = c_REGULAR;
	}

	/**
	 * @return the c_VIP
	 */
	public String getC_VIP() {
		return C_VIP;
	}

	/**
	 * @param c_VIP the c_VIP to set
	 */
	public void setC_VIP(String c_VIP) {
		C_VIP = c_VIP;
	}

	/**
	 * @return the query_itinerario
	 */
	public boolean isQuery_itinerario() {
		return query_itinerario;
	}

	/**
	 * @param query_itinerario the query_itinerario to set
	 */
	public void setQuery_itinerario(boolean query_itinerario) {
		this.query_itinerario = query_itinerario;
	}

	/**
	 * @return the tarifaRegular
	 */
	public Double getTarifaRegular() {
		return tarifaRegular;
	}

	/**
	 * @param tarifaRegular the tarifaRegular to set
	 */
	public void setTarifaRegular(Double tarifaRegular) {
		this.tarifaRegular = tarifaRegular;
	}

	/**
	 * @return the c_VIP1
	 */
	public String getC_VIP1() {
		return C_VIP1;
	}

	/**
	 * @param c_VIP1 the c_VIP1 to set
	 */
	public void setC_VIP1(String c_VIP1) {
		C_VIP1 = c_VIP1;
	}

	/**
	 * @return the tipoTarifa1
	 */
	public TipoTarifaSispas getTipoTarifa1() {
		return tipoTarifa1;
	}

	/**
	 * @param tipoTarifa1 the tipoTarifa1 to set
	 */
	public void setTipoTarifa1(TipoTarifaSispas tipoTarifa1) {
		this.tipoTarifa1 = tipoTarifa1;
	}

	/**
	 * @return the tarifa1
	 */
	public Double getTarifa1() {
		return tarifa1;
	}

	/**
	 * @param tarifa1 the tarifa1 to set
	 */
	public void setTarifa1(Double tarifa1) {
		this.tarifa1 = tarifa1;
	}

	/**
	 * @return the tipoTarifa2
	 */
	public TipoTarifaSispas getTipoTarifa2() {
		return tipoTarifa2;
	}

	/**
	 * @param tipoTarifa2 the tipoTarifa2 to set
	 */
	public void setTipoTarifa2(TipoTarifaSispas tipoTarifa2) {
		this.tipoTarifa2 = tipoTarifa2;
	}

	/**
	 * @return the tarifa2
	 */
	public Double getTarifa2() {
		return tarifa2;
	}

	/**
	 * @param tarifa2 the tarifa2 to set
	 */
	public void setTarifa2(Double tarifa2) {
		this.tarifa2 = tarifa2;
	}

	/**
	 * @return the canalVenta
	 */
	public CanalVentaSispas getCanalVenta() {
		return canalVenta;
	}

	/**
	 * @param canalVenta the canalVenta to set
	 */
	public void setCanalVenta(CanalVentaSispas canalVenta) {
		this.canalVenta = canalVenta;
	}

	/**
	 * @return the idTipoTarifaPromo
	 */
	public Integer getIdTipoTarifaPromo() {
		return idTipoTarifaPromo;
	}

	/**
	 * @param idTipoTarifaPromo the idTipoTarifaPromo to set
	 */
	public void setIdTipoTarifaPromo(Integer idTipoTarifaPromo) {
		this.idTipoTarifaPromo = idTipoTarifaPromo;
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

	/**
	 * @return the listadocanales
	 */
	public String getListadocanales() {
		return listadocanales;
	}

	/**
	 * @param listadocanales the listadocanales to set
	 */
	public void setListadocanales(String listadocanales) {
		this.listadocanales = listadocanales;
	}

	/**
	 * @return the nivel
	 */
	public Integer getNivel() {
		return nivel;
	}

	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}


	

	public String getC_REGULAR120() {
		return C_REGULAR120;
	}



	public void setC_REGULAR120(String c_REGULAR120) {
		C_REGULAR120 = c_REGULAR120;
	}



	@Override
	public String toString() {
		return "DetalleItinerario [id=" + id + ", itinerario=" + itinerario + ", ruta=" + ruta + ", agenciaPartida="
				+ agenciaPartida + ", fechaPartida=" + fechaPartida + ", horaPartida=" + horaPartida
				+ ", agenciaLlegada=" + agenciaLlegada + ", fechaLlegada=" + fechaLlegada + ", horaLlegada="
				+ horaLlegada + ", tarifa=" + tarifa + ", tarifaLista=" + tarifaLista + ", estadoVenta=" + estadoVenta
				+ ", asiento=" + asiento + ", piso=" + piso + ", esIda=" + esIda + ", tarifaFechaAbierta="
				+ tarifaFechaAbierta + ", C_INSUPERABLE=" + C_INSUPERABLE + ", C_OCASION=" + C_OCASION + ", C_REGULAR="
				+ C_REGULAR + ", C_VIP=" + C_VIP + ", C_VIP1=" + C_VIP1 + ", query_itinerario=" + query_itinerario
				+ ", tarifaRegular=" + tarifaRegular + ", tipoTarifa1=" + tipoTarifa1 + ", tarifa1=" + tarifa1
				+ ", tipoTarifa2=" + tipoTarifa2 + ", tarifa2=" + tarifa2 + ", canalVenta=" + canalVenta
				+ ", idTipoTarifaPromo=" + idTipoTarifaPromo + ", listadocanales=" + listadocanales + ", nivel=" + nivel
				+ "]";
	}			

}
