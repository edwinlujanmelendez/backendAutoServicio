package pe.movilbus.autoservicio.beans;

public class ProgramacionServicioSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private ItinerarioSispas itinerario;
	private BusSispas bus;
	private PersonalSispas piloto;
	private PersonalSispas copiloto;
	private PersonalSispas tripulante;
	private PersonalSispas copilotoAuxiliar;
	
	private HRESispas hojaRuta; //No mapeado
	private Boolean MEE; //No mapeado (determina si el manifiesto electronico ya fue emitido) 
//	private MTCDetalleRuta mtcDetalleRuta; //No mapeado. (Utilizado en la impresion de la HRE)
//	private MTCDireccionTerminal mtcDireccionTerminalPart; //No mapeado. (Utilizado en la impresion de la HRE)
//	private MTCDireccionTerminal mtcDireccionTerminalLleg; //No mapeado. (Utilizado en la impresion de la HRE)
	

	public ProgramacionServicioSispas() {
		
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
	 * @return Objeto piloto.
	 */
	public PersonalSispas getPiloto() {
		return piloto;
	}
	/**
	 * @param piloto	: Setea el objeto piloto.
	 */
	public void setPiloto(PersonalSispas piloto) {
		this.piloto = piloto;
	}

	/**
	 * @return Objeto copiloto.
	 */
	public PersonalSispas getCopiloto() {
		return copiloto;
	}
	/**
	 * @param copiloto	: Setea el objeto copiloto.
	 */
	public void setCopiloto(PersonalSispas copiloto) {
		this.copiloto = copiloto;
	}

	/**
	 * @return Objeto tripulante.
	 */
	public PersonalSispas getTripulante() {
		return tripulante;
	}
	/**
	 * @param tripulante	: Setea el objeto tripulante.
	 */
	public void setTripulante(PersonalSispas tripulante) {
		this.tripulante = tripulante;
	}

	/**
	 * @return the copilotoAuxiliar
	 */
	public PersonalSispas getCopilotoAuxiliar() {
		return copilotoAuxiliar;
	}

	/**
	 * @param copilotoAuxiliar the copilotoAuxiliar to set
	 */
	public void setCopilotoAuxiliar(PersonalSispas copilotoAuxiliar) {
		this.copilotoAuxiliar = copilotoAuxiliar;
	}

	/**
	 * @return the hojaRuta
	 */
	public HRESispas getHojaRuta() {
		return hojaRuta;
	}

	/**
	 * @param hojaRuta the hojaRuta to set
	 */
	public void setHojaRuta(HRESispas hojaRuta) {
		this.hojaRuta = hojaRuta;
	}

	/**
	 * @return the mEE
	 */
	public Boolean isMEE() {
		return MEE;
	}

	/**
	 * @param mEE the mEE to set
	 */
	public void setMEE(Boolean mEE) {
		MEE = mEE;
	}

//	/**
//	 * @return the mtcDetalleRuta
//	 */
//	public MTCDetalleRuta getMtcDetalleRuta() {
//		return mtcDetalleRuta;
//	}
//
//	/**
//	 * @param mtcDetalleRuta the mtcDetalleRuta to set
//	 */
//	public void setMtcDetalleRuta(MTCDetalleRuta mtcDetalleRuta) {
//		this.mtcDetalleRuta = mtcDetalleRuta;
//	}

//	/**
//	 * @return the mtcDireccionTerminalPart
//	 */
//	public MTCDireccionTerminal getMtcDireccionTerminalPart() {
//		return mtcDireccionTerminalPart;
//	}
//
//	/**
//	 * @param mtcDireccionTerminalPart the mtcDireccionTerminalPart to set
//	 */
//	public void setMtcDireccionTerminalPart(MTCDireccionTerminal mtcDireccionTerminalPart) {
//		this.mtcDireccionTerminalPart = mtcDireccionTerminalPart;
//	}
//
//	/**
//	 * @return the mtcDireccionTerminalLleg
//	 */
//	public MTCDireccionTerminal getMtcDireccionTerminalLleg() {
//		return mtcDireccionTerminalLleg;
//	}
//
//	/**
//	 * @param mtcDireccionTerminalLleg the mtcDireccionTerminalLleg to set
//	 */
//	public void setMtcDireccionTerminalLleg(MTCDireccionTerminal mtcDireccionTerminalLleg) {
//		this.mtcDireccionTerminalLleg = mtcDireccionTerminalLleg;
//	}

}
