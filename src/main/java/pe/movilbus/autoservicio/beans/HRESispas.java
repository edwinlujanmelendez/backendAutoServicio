package pe.movilbus.autoservicio.beans;

import java.util.Date;

public class HRESispas extends GenericBean{
	private static final long serialVersionUID = 1L;
	
//	private String numeroHRE;
	private NumeroHREIDSispas numeroHREID;
	private Ruta ruta;
	private String numeroPlaca;
	private String numeroBus;
	private Integer mtcCodigoTerminalSalida;
	private AgenciaSispas agenciaSalida;
	private Integer mtcCodigoTerminalLlegada;
	private AgenciaSispas agenciaLlegada;
	private Date fechaSalida;
	private String horaSalida;
	private Date fechaEstimacionLlegada;
	private String horaEstimacionLlegada;
	private Date fechaLlegadaReal;
	private String horaLlegadaReal;
	private String mtcCodigoRuta;
	private MTCDireccionTerminalSispas mtcTerminalSalida;
	private MTCDireccionTerminalSispas mtcTerminalLlegada;
	private MTCRutaSispas mtcRuta;
	private ItinerarioSispas itinerario;
	private CompaniaSispas empresa;
	
	private ProgramacionServicioSispas programacionServicio; //No mapeado
	
	
	public HRESispas(){
		super();
	}
	
	public HRESispas(NumeroHREIDSispas numeroHREID){
		this.numeroHREID=numeroHREID;
	}
	
	/**
	 * @return the ruta
	 */
	public Ruta getRuta() {
		return ruta;
	}
	/**
	 * @param ruta the ruta to set
	 */
	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}
	/**
	 * @return the numeroPlaca
	 */
	public String getNumeroPlaca() {
		return numeroPlaca;
	}
	/**
	 * @param numeroPlaca the numeroPlaca to set
	 */
	public void setNumeroPlaca(String numeroPlaca) {
		this.numeroPlaca = numeroPlaca;
	}
	/**
	 * @return the numeroBus
	 */
	public String getNumeroBus() {
		return numeroBus;
	}
	/**
	 * @param numeroBus the numeroBus to set
	 */
	public void setNumeroBus(String numeroBus) {
		this.numeroBus = numeroBus;
	}
	
	/**
	 * @return the agenciaSalida
	 */
	public AgenciaSispas getAgenciaSalida() {
		return agenciaSalida;
	}
	/**
	 * @param agenciaSalida the agenciaSalida to set
	 */
	public void setAgenciaSalida(AgenciaSispas agenciaSalida) {
		this.agenciaSalida = agenciaSalida;
	}
	
	/**
	 * @return the agenciaLlegada
	 */
	public AgenciaSispas getAgenciaLlegada() {
		return agenciaLlegada;
	}
	/**
	 * @param agenciaLlegada the agenciaLlegada to set
	 */
	public void setAgenciaLlegada(AgenciaSispas agenciaLlegada) {
		this.agenciaLlegada = agenciaLlegada;
	}
	/**
	 * @return the fechaSalida
	 */
	public Date getFechaSalida() {
		return fechaSalida;
	}
	/**
	 * @param fechaSalida the fechaSalida to set
	 */
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	/**
	 * @return the horaSalida
	 */
	public String getHoraSalida() {
		return horaSalida;
	}
	/**
	 * @param horaSalida the horaSalida to set
	 */
	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}
	/**
	 * @return the fechaEstimacionLlegada
	 */
	public Date getFechaEstimacionLlegada() {
		return fechaEstimacionLlegada;
	}
	/**
	 * @param fechaEstimacionLlegada the fechaEstimacionLlegada to set
	 */
	public void setFechaEstimacionLlegada(Date fechaEstimacionLlegada) {
		this.fechaEstimacionLlegada = fechaEstimacionLlegada;
	}
	/**
	 * @return the horaEstimacionllegada
	 */
	public String getHoraEstimacionLlegada() {
		return horaEstimacionLlegada;
	}
	/**
	 * @param horaEstimacionllegada the horaEstimacionllegada to set
	 */
	public void setHoraEstimacionLlegada(String horaEstimacionllegada) {
		this.horaEstimacionLlegada = horaEstimacionllegada;
	}
	/**
	 * @return the fechaLlegadaReal
	 */
	public Date getFechaLlegadaReal() {
		return fechaLlegadaReal;
	}
	/**
	 * @param fechaLlegadaReal the fechaLlegadaReal to set
	 */
	public void setFechaLlegadaReal(Date fechaLlegadaReal) {
		this.fechaLlegadaReal = fechaLlegadaReal;
	}
	/**
	 * @return the horaLlegadaReal
	 */
	public String getHoraLlegadaReal() {
		return horaLlegadaReal;
	}
	/**
	 * @param horaLlegadaReal the horaLlegadaReal to set
	 */
	public void setHoraLlegadaReal(String horaLlegadaReal) {
		this.horaLlegadaReal = horaLlegadaReal;
	}	
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return this.numeroHREID.getIdNumeroHRE();
	}
	/**
	 * @return the numeroHojaRutaID
	 */
	public NumeroHREIDSispas getNumeroHREID() {
		return numeroHREID;
	}
	/**
	 * @param numeroHojaRutaID the numeroHojaRutaID to set
	 */
	public void setNumeroHREID(NumeroHREIDSispas numeroHREID) {
		this.numeroHREID = numeroHREID;
	}
	
	/**
	 * @return the programacionServicio
	 */
	public ProgramacionServicioSispas getProgramacionServicio() {
		return programacionServicio;
	}
	/**
	 * @param programacionServicio the programacionServicio to set
	 */
	public void setProgramacionServicio(ProgramacionServicioSispas programacionServicio) {
		this.programacionServicio = programacionServicio;
	}

	
	/**
	 * @return the mtcRuta
	 */
	public MTCRutaSispas getMtcRuta() {
		return mtcRuta;
	}

	/**
	 * @param mtcRuta the mtcRuta to set
	 */
	public void setMtcRuta(MTCRutaSispas mtcRuta) {
		this.mtcRuta = mtcRuta;
	}

	/**
	 * @return the mtcTerminalSalida
	 */
	public MTCDireccionTerminalSispas getMtcTerminalSalida() {
		return mtcTerminalSalida;
	}

	/**
	 * @param mtcTerminalSalida the mtcTerminalSalida to set
	 */
	public void setMtcTerminalSalida(MTCDireccionTerminalSispas mtcTerminalSalida) {
		this.mtcTerminalSalida = mtcTerminalSalida;
	}

	/**
	 * @return the mtcTerminalLlegada
	 */
	public MTCDireccionTerminalSispas getMtcTerminalLlegada() {
		return mtcTerminalLlegada;
	}

	/**
	 * @param mtcTerminalLlegada the mtcTerminalLlegada to set
	 */
	public void setMtcTerminalLlegada(MTCDireccionTerminalSispas mtcTerminalLlegada) {
		this.mtcTerminalLlegada = mtcTerminalLlegada;
	}

	/**
	 * @return the mtcCodigoTerminalSalida
	 */
	public Integer getMtcCodigoTerminalSalida() {
		return mtcCodigoTerminalSalida;
	}

	/**
	 * @param mtcCodigoTerminalSalida the mtcCodigoTerminalSalida to set
	 */
	public void setMtcCodigoTerminalSalida(Integer mtcCodigoTerminalSalida) {
		this.mtcCodigoTerminalSalida = mtcCodigoTerminalSalida;
	}

	/**
	 * @return the mtcCodigoTerminalLlegada
	 */
	public Integer getMtcCodigoTerminalLlegada() {
		return mtcCodigoTerminalLlegada;
	}

	/**
	 * @param mtcCodigoTerminalLlegada the mtcCodigoTerminalLlegada to set
	 */
	public void setMtcCodigoTerminalLlegada(Integer mtcCodigoTerminalLlegada) {
		this.mtcCodigoTerminalLlegada = mtcCodigoTerminalLlegada;
	}

	/**
	 * @return the mtcCodigoRuta
	 */
	public String getMtcCodigoRuta() {
		return mtcCodigoRuta;
	}

	/**
	 * @param mtcCodigoRuta the mtcCodigoRuta to set
	 */
	public void setMtcCodigoRuta(String mtcCodigoRuta) {
		this.mtcCodigoRuta = mtcCodigoRuta;
	}

	/**
	 * @return the itinerario
	 */
	public ItinerarioSispas getItinerario() {
		return itinerario;
	}

	/**
	 * @param itinerario the itinerario to set
	 */
	public void setItinerario(ItinerarioSispas itinerario) {
		this.itinerario = itinerario;
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
