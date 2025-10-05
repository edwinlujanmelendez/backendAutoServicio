package pe.movilbus.autoservicio.beans;

import java.util.HashSet;
import java.util.Set;

public class ManifiestoSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private ItinerarioSispas itinerario;
	private BusSispas bus;
	private String numeroManifiesto;
	private String codigoBus;
	private String piloto;
	private String copiloto;
	private String certificadoHabilitacion;
	private String placa;
	private String autorizacionSunat;
	private String copilotoAuxiliar;
	private String tripulante;
	private Integer mee;
	private AgenciaSispas agencia;
	
	private Set<VentaPasaje> ventaPasajes = new HashSet<VentaPasaje>(0);

	public ManifiestoSispas() {
	}
	
	public ManifiestoSispas(Long id) {
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
	 * @return Objeto numeroManifiesto.
	 */
	public String getNumeroManifiesto() {
		return numeroManifiesto;
	}
	/**
	 * @param numeroManifiesto	: Setea el objeto numeroManifiesto.
	 */
	public void setNumeroManifiesto(String numeroManifiesto) {
		this.numeroManifiesto = numeroManifiesto;
	}
	
	/**
	 * @return Objeto codigoBus.
	 */
	public String getCodigoBus() {
		return codigoBus;
	}
	/**
	 * @param codigoBus	: Setea el objeto codigoBus.
	 */
	public void setCodigoBus(String codigoBus) {
		this.codigoBus = codigoBus;
	}
	
	/**
	 * @return Objeto piloto.
	 */
	public String getPiloto() {
		return piloto;
	}
	/**
	 * @param piloto	: Setea el objeto piloto.
	 */
	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
	
	/**
	 * @return Objeto copiloto.
	 */
	public String getCopiloto() {
		return copiloto;
	}
	/**
	 * @param copiloto	: Setea el objeto copiloto.
	 */
	public void setCopiloto(String copiloto) {
		this.copiloto = copiloto;
	}
	
	/**
	 * @return Objeto certificadoHabilitacion.
	 */
	public String getCertificadoHabilitacion() {
		return certificadoHabilitacion;
	}
	/**
	 * @param certificadoHabilitacion	: Setea el objeto certificadoHabilitacion.
	 */
	public void setCertificadoHabilitacion(String certificadoHabilitacion) {
		this.certificadoHabilitacion = certificadoHabilitacion;
	}
	
	/**
	 * @return Objeto placa.
	 */
	public String getPlaca() {
		return placa;
	}
	/**
	 * @param placa	: Setea el objeto placa.
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public Set<VentaPasaje> getVentaPasajes() {
		return this.ventaPasajes;
	}
	public void setVentaPasajes(Set<VentaPasaje> ventaPasajes) {
		this.ventaPasajes = ventaPasajes;
	}

	/**
	 * @return the autorizacionSunat
	 */
	public String getAutorizacionSunat() {
		return autorizacionSunat;
	}

	/**
	 * @param autorizacionSunat the autorizacionSunat to set
	 */
	public void setAutorizacionSunat(String autorizacionSunat) {
		this.autorizacionSunat = autorizacionSunat;
	}

	/**
	 * @return the copilotoAuxiliar
	 */
	public String getCopilotoAuxiliar() {
		return copilotoAuxiliar;
	}

	/**
	 * @param copilotoAuxiliar the copilotoAuxiliar to set
	 */
	public void setCopilotoAuxiliar(String copilotoAuxiliar) {
		this.copilotoAuxiliar = copilotoAuxiliar;
	}

	/**
	 * @return the tripulante
	 */
	public String getTripulante() {
		return tripulante;
	}

	/**
	 * @param tripulante the tripulante to set
	 */
	public void setTripulante(String tripulante) {
		this.tripulante = tripulante;
	}

	/**
	 * @return the mee
	 */
	public Integer getMee() {
		return mee;
	}

	/**
	 * @param mee the mee to set
	 */
	public void setMee(Integer mee) {
		this.mee = mee;
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

	
}
