package pe.movilbus.autoservicio.beans;

import java.io.Serializable;
import java.math.BigDecimal;

public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private BigDecimal idcliente;
	private String nroDoc;
	private String razonSocial;
	private String direccion;
	private int flag;
	public Cliente() {
		super();
	}
	
	
	
	public Cliente(BigDecimal idcliente, String direccion) {
		super();
		this.idcliente = idcliente;
		this.direccion = direccion;
	}



	public Cliente(BigDecimal idcliente, String nroDoc, String razonSocial, String direccion, int flag) {
		super();
		this.idcliente = idcliente;
		this.nroDoc = nroDoc;
		this.razonSocial = razonSocial;
		this.direccion = direccion;
		this.flag = flag;
	}
	public BigDecimal getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(BigDecimal idcliente) {
		this.idcliente = idcliente;
	}
	public String getNroDoc() {
		return nroDoc;
	}
	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}



	@Override
	public String toString() {
		return "Cliente [idcliente=" + idcliente + ", nroDoc=" + nroDoc + ", razonSocial=" + razonSocial
				+ ", direccion=" + direccion + ", flag=" + flag + "]";
	}
	
	
	
	
}
