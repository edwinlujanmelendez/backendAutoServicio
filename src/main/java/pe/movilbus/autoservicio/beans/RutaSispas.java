package pe.movilbus.autoservicio.beans;

import java.util.HashSet;
import java.util.Set;

public class RutaSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private LocalidadSispas localidadOrigen;
	private LocalidadSispas localidadDestino;
	private String origen;
	private String destino;
	private Double kilometros;
	private Double horasViaje;
	private Integer puntaje;
	private CompaniaSispas empresa;
	
	private Set<VentaPasaje> ventaPasajes = new HashSet<VentaPasaje>(0);
	private Set<ItinerarioSispas> itinerarios = new HashSet<ItinerarioSispas>(0);
	private Set<TarifaSispas> tarifas = new HashSet<TarifaSispas>(0);
	
	public RutaSispas() {
	}
	
	
	
	
	public RutaSispas(String origen, String destino) {
		super();
		this.origen = origen;
		this.destino = destino;
	}




	public RutaSispas(Integer id, String origen, String destino) {
		super();
		this.id = id;
		this.origen = origen;
		this.destino = destino;
	}




	/**
	 * @param id
	 */
	public RutaSispas(Integer id) {
		super();
		this.id = id;
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
	 * @return Objeto localidadOrigen.
	 */
	public LocalidadSispas getLocalidadOrigen() {
		return localidadOrigen;
	}
	/**
	 * @param localidadOrigen	: Setea el objeto localidadOrigen.
	 */
	public void setLocalidadOrigen(LocalidadSispas localidadOrigen) {
		this.localidadOrigen = localidadOrigen;
	}
	
	/**
	 * @return Objeto localidadDestino.
	 */
	public LocalidadSispas getLocalidadDestino() {
		return localidadDestino;
	}
	/**
	 * @param localidadDestino	: Setea el objeto localidadDestino.
	 */
	public void setLocalidadDestino(LocalidadSispas localidadDestino) {
		this.localidadDestino = localidadDestino;
	}
	
	/**
	 * @return Objeto origen.
	 */
	public String getOrigen() {
		return origen;
	}
	/**
	 * @param origen	: Setea el objeto origen.
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	/**
	 * @return Objeto destino.
	 */
	public String getDestino() {
		return destino;
	}
	/**
	 * @param destino	: Setea el objeto destino.
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	/**
	 * @return Objeto kilometros.
	 */
	public Double getKilometros() {
		return kilometros;
	}
	/**
	 * @param kilometros	: Setea el objeto kilometros.
	 */
	public void setKilometros(Double kilometros) {
		this.kilometros = kilometros;
	}
	
	/**
	 * @return Objeto horasViaje.
	 */
	public Double getHorasViaje() {
		return horasViaje;
	}
	/**
	 * @param horasViaje	: Setea el objeto horasViaje.
	 */
	public void setHorasViaje(Double horasViaje) {
		this.horasViaje = horasViaje;
	}
	
	/**
	 * @return the puntaje
	 */
	public Integer getPuntaje() {
		return puntaje;
	}
	/**
	 * @param puntaje the puntaje to set
	 */
	public void setPuntaje(Integer puntaje) {
		this.puntaje = puntaje;
	}

	public Set<VentaPasaje> getVentaPasajes() {
		return this.ventaPasajes;
	}
	public void setVentaPasajes(Set<VentaPasaje> ventaPasajes) {
		this.ventaPasajes = ventaPasajes;
	}

	public Set<ItinerarioSispas> getItinerarios() {
		return this.itinerarios;
	}
	public void setItinerarios(Set<ItinerarioSispas> itinerarios) {
		this.itinerarios = itinerarios;
	}

	public Set<TarifaSispas> getTarifas() {
		return this.tarifas;
	}
	public void setTarifas(Set<TarifaSispas> tarifas) {
		this.tarifas = tarifas;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.origen+" - "+this.getDestino();
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
	
}
