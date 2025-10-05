package pe.movilbus.autoservicio.beans;

import java.io.Serializable;
import java.math.BigDecimal;

public class Pasajero implements Serializable{

	private static final long serialVersionUID = 1L;
	private BigDecimal idpasajero;
	private int idTipoDocumento;
	private String numDocumento;
	private String nombre;
	private String apePaterno;
	private String apeMaterno;
	private String fechanacimiento;
	private String telefono;
	private int flagWS;
	
	public Pasajero() {
		super();
	}
	
	public Pasajero(BigDecimal idpasajero) {
		super();
		this.idpasajero = idpasajero;
	}

	public Pasajero(BigDecimal idpasajero, int idTipoDocumento,  String apePaterno,String nombre, String fechanacimiento) {
		super();
		this.idpasajero = idpasajero;
		this.idTipoDocumento = idTipoDocumento;
		this.apePaterno = apePaterno;
		this.nombre = nombre;
		this.fechanacimiento = fechanacimiento;
	
	}

	public Pasajero(BigDecimal idpasajero, int idTipoDocumento, String numDocumento, String nombre, String apePaterno,
			String apeMaterno, String fechanacimiento, int flagWS) {
		super();
		this.idpasajero = idpasajero;
		this.idTipoDocumento = idTipoDocumento;
		this.numDocumento = numDocumento;
		this.nombre = nombre;
		this.apePaterno = apePaterno;
		this.apeMaterno = apeMaterno;
		this.fechanacimiento = fechanacimiento;
		this.flagWS = flagWS;
	}
	
	public Pasajero(BigDecimal idpasajero, int idTipoDocumento, String numDocumento, String nombre, String apePaterno,
			String apeMaterno, String fechanacimiento, String telefono, int flagWS) {
		super();
		this.idpasajero = idpasajero;
		this.idTipoDocumento = idTipoDocumento;
		this.numDocumento = numDocumento;
		this.nombre = nombre;
		this.apePaterno = apePaterno;
		this.apeMaterno = apeMaterno;
		this.fechanacimiento = fechanacimiento;
		this.telefono = telefono;
		this.flagWS = flagWS;
	}

	public BigDecimal getIdpasajero() {
		return idpasajero;
	}

	public void setIdpasajero(BigDecimal idpasajero) {
		this.idpasajero = idpasajero;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApePaterno() {
		return apePaterno;
	}

	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}

	public String getApeMaterno() {
		return apeMaterno;
	}

	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}

	public int getFlagWS() {
		return flagWS;
	}

	public void setFlagWS(int flagWS) {
		this.flagWS = flagWS;
	}




	public int getIdTipoDocumento() {
		return idTipoDocumento;
	}




	public void setIdTipoDocumento(int idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}



	public String getFechanacimiento() {
		return fechanacimiento;
	}



	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	
	
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Pasajero [idpasajero=" + idpasajero + ", idTipoDocumento=" + idTipoDocumento + ", numDocumento="
				+ numDocumento + ", nombre=" + nombre + ", apePaterno=" + apePaterno + ", apeMaterno=" + apeMaterno
				+ ", fechanacimiento=" + fechanacimiento + ", flagWS=" + flagWS + "]";
	}
	
	

}
