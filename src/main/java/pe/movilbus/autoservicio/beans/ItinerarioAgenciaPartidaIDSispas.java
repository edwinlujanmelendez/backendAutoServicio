package pe.movilbus.autoservicio.beans;

import java.io.Serializable;

public class ItinerarioAgenciaPartidaIDSispas extends GenericBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long idItinerario;
	private Integer idAgencia;
	
	/**
	 * @param idItinerario
	 * @param idAgencia
	 */
	public ItinerarioAgenciaPartidaIDSispas(Long idItinerario, Integer idAgencia) {
		super();
		this.idItinerario = idItinerario;
		this.idAgencia = idAgencia;
	}
	
	/**
	 * 
	 */
	public ItinerarioAgenciaPartidaIDSispas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdItinerario() {
		return idItinerario;
	}

	public void setIdItinerario(Long idItinerario) {
		this.idItinerario = idItinerario;
	}

	public Integer getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(Integer idAgencia) {
		this.idAgencia = idAgencia;
	}
}
