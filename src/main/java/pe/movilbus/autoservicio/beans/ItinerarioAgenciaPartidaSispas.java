package pe.movilbus.autoservicio.beans;

import java.io.Serializable;

public class ItinerarioAgenciaPartidaSispas extends GenericBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private ItinerarioAgenciaPartidaIDSispas itinerarioAgenciaPartidaID;
	private ItinerarioSispas itinerario;
	private AgenciaSispas agencia;
	private String horaPartida;
	
	public ItinerarioAgenciaPartidaSispas() {
		
	}
	
	/**
	 * @return Objeto itinerarioAgenciaPartidaID.
	 */
	public ItinerarioAgenciaPartidaIDSispas getItinerarioAgenciaPartidaID() {
		return itinerarioAgenciaPartidaID;
	}
	/**
	 * @param itinerarioAgenciaPartidaID	: Setea el objeto itinerarioAgenciaPartidaID.
	 */
	public void setItinerarioAgenciaPartidaID(ItinerarioAgenciaPartidaIDSispas itinerarioAgenciaPartidaID) {
		this.itinerarioAgenciaPartidaID = itinerarioAgenciaPartidaID;
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
	 * @return Objeto agencia.
	 */
	public AgenciaSispas getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia	: Setea el objeto agencia.
	 */
	public void setAgencia(AgenciaSispas agencia) {
		this.agencia = agencia;
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
}
