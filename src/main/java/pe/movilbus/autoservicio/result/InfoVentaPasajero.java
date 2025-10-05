package pe.movilbus.autoservicio.result;

import java.io.Serializable;

public class InfoVentaPasajero implements Serializable{

	private static final long serialVersionUID = 1L;
	private String rutaIda;
	private String fpartidaIda;
	private String hrsalidaIda;
	private boolean flagRetorno;
	private String rutaRetorno;
	private String fpartidaRetorno;
	private String hrsalidaRetorno;	
	private int totalPasajero;
	//adicional IDA
	private String servicioIda;
	private String fllegadaIda;
	private String hrllegadaIda;
	private double montoFinalIda;
	private String drPartidaIda;
	private String drLlegadaIda;
	private String nroAsientoIda;
	
	
	
	// adicional VUELTA
	private String servicioRetorno;
	private String fllegadaRetorno;
	private String hrllegadaRetorno;	
	private double montoFinalRetorno;
	private String drPartidaRetorno;
	private String drLlegadaRetorno;
	private String nroAsientoRetorno;
	
	private String correoEnvio;
	
	
	public InfoVentaPasajero() {
		super();
	}
	
	
	
	
	public InfoVentaPasajero(String rutaIda, String fpartidaIda, String hrsalidaIda,
			String fllegadaIda,String hrllegadaIda,String servicioIda, int totalPasajero,double montoFinalIda,
			String drPartidaIda, String drLlegadaIda,String nroAsientoIda,String correoEnvio) {
		super();
		this.rutaIda = rutaIda;
		this.fpartidaIda = fpartidaIda;
		this.hrsalidaIda = hrsalidaIda;
		this.fllegadaIda = fllegadaIda;
		this.hrllegadaIda = hrllegadaIda;
		this.servicioIda = servicioIda;
		this.totalPasajero = totalPasajero;
		this.montoFinalIda = montoFinalIda;
		this.drPartidaIda = drPartidaIda;
		this.drLlegadaIda = drLlegadaIda;
		this.nroAsientoIda = nroAsientoIda;
		this.correoEnvio = correoEnvio;
		
	}



	public String getRutaIda() {
		return rutaIda;
	}
	public void setRutaIda(String rutaIda) {
		this.rutaIda = rutaIda;
	}
	public String getFpartidaIda() {
		return fpartidaIda;
	}
	public void setFpartidaIda(String fpartidaIda) {
		this.fpartidaIda = fpartidaIda;
	}
	public String getHrsalidaIda() {
		return hrsalidaIda;
	}
	public void setHrsalidaIda(String hrsalidaIda) {
		this.hrsalidaIda = hrsalidaIda;
	}
	public boolean isFlagRetorno() {
		return flagRetorno;
	}
	public void setFlagRetorno(boolean flagRetorno) {
		this.flagRetorno = flagRetorno;
	}
	public String getRutaRetorno() {
		return rutaRetorno;
	}
	public void setRutaRetorno(String rutaRetorno) {
		this.rutaRetorno = rutaRetorno;
	}
	public String getFpartidaRetorno() {
		return fpartidaRetorno;
	}
	public void setFpartidaRetorno(String fpartidaRetorno) {
		this.fpartidaRetorno = fpartidaRetorno;
	}
	public String getHrsalidaRetorno() {
		return hrsalidaRetorno;
	}
	public void setHrsalidaRetorno(String hrsalidaRetorno) {
		this.hrsalidaRetorno = hrsalidaRetorno;
	}
	public int getTotalPasajero() {
		return totalPasajero;
	}
	public void setTotalPasajero(int totalPasajero) {
		this.totalPasajero = totalPasajero;
	}




	public String getServicioIda() {
		return servicioIda;
	}




	public void setServicioIda(String servicioIda) {
		this.servicioIda = servicioIda;
	}




	public String getFllegadaIda() {
		return fllegadaIda;
	}




	public void setFllegadaIda(String fllegadaIda) {
		this.fllegadaIda = fllegadaIda;
	}




	public String getHrllegadaIda() {
		return hrllegadaIda;
	}




	public void setHrllegadaIda(String hrllegadaIda) {
		this.hrllegadaIda = hrllegadaIda;
	}




	public double getMontoFinalIda() {
		return montoFinalIda;
	}




	public void setMontoFinalIda(double montoFinalIda) {
		this.montoFinalIda = montoFinalIda;
	}




	public String getServicioRetorno() {
		return servicioRetorno;
	}




	public void setServicioRetorno(String servicioRetorno) {
		this.servicioRetorno = servicioRetorno;
	}




	public String getFllegadaRetorno() {
		return fllegadaRetorno;
	}




	public void setFllegadaRetorno(String fllegadaRetorno) {
		this.fllegadaRetorno = fllegadaRetorno;
	}




	public String getHrllegadaRetorno() {
		return hrllegadaRetorno;
	}




	public void setHrllegadaRetorno(String hrllegadaRetorno) {
		this.hrllegadaRetorno = hrllegadaRetorno;
	}




	public double getMontoFinalRetorno() {
		return montoFinalRetorno;
	}




	public void setMontoFinalRetorno(double montoFinalRetorno) {
		this.montoFinalRetorno = montoFinalRetorno;
	}




	public String getDrPartidaIda() {
		return drPartidaIda;
	}




	public void setDrPartidaIda(String drPartidaIda) {
		this.drPartidaIda = drPartidaIda;
	}




	public String getDrLlegadaIda() {
		return drLlegadaIda;
	}




	public void setDrLlegadaIda(String drLlegadaIda) {
		this.drLlegadaIda = drLlegadaIda;
	}




	public String getNroAsientoIda() {
		return nroAsientoIda;
	}




	public void setNroAsientoIda(String nroAsientoIda) {
		this.nroAsientoIda = nroAsientoIda;
	}




	public String getDrPartidaRetorno() {
		return drPartidaRetorno;
	}




	public void setDrPartidaRetorno(String drPartidaRetorno) {
		this.drPartidaRetorno = drPartidaRetorno;
	}




	public String getDrLlegadaRetorno() {
		return drLlegadaRetorno;
	}




	public void setDrLlegadaRetorno(String drLlegadaRetorno) {
		this.drLlegadaRetorno = drLlegadaRetorno;
	}




	public String getNroAsientoRetorno() {
		return nroAsientoRetorno;
	}




	public void setNroAsientoRetorno(String nroAsientoRetorno) {
		this.nroAsientoRetorno = nroAsientoRetorno;
	}




	public String getCorreoEnvio() {
		return correoEnvio;
	}




	public void setCorreoEnvio(String correoEnvio) {
		this.correoEnvio = correoEnvio;
	}




	@Override
	public String toString() {
		return "InfoVentaPasajero [rutaIda=" + rutaIda + ", fpartidaIda=" + fpartidaIda + ", hrsalidaIda=" + hrsalidaIda
				+ ", flagRetorno=" + flagRetorno + ", rutaRetorno=" + rutaRetorno + ", fpartidaRetorno="
				+ fpartidaRetorno + ", hrsalidaRetorno=" + hrsalidaRetorno + ", totalPasajero=" + totalPasajero
				+ ", servicioIda=" + servicioIda + ", fllegadaIda=" + fllegadaIda + ", hrllegadaIda=" + hrllegadaIda
				+ ", montoFinalIda=" + montoFinalIda + ", drPartidaIda=" + drPartidaIda + ", drLlegadaIda="
				+ drLlegadaIda + ", nroAsientoIda=" + nroAsientoIda + ", servicioRetorno=" + servicioRetorno
				+ ", fllegadaRetorno=" + fllegadaRetorno + ", hrllegadaRetorno=" + hrllegadaRetorno
				+ ", montoFinalRetorno=" + montoFinalRetorno + ", drPartidaRetorno=" + drPartidaRetorno
				+ ", drLlegadaRetorno=" + drLlegadaRetorno + ", nroAsientoRetorno=" + nroAsientoRetorno
				+ ", correoEnvio=" + correoEnvio + "]";
	}
	
	
	
	
	
}
