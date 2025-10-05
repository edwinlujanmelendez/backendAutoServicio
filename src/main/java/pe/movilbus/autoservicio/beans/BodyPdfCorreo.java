package pe.movilbus.autoservicio.beans;

import java.io.Serializable;
import java.util.List;

public class BodyPdfCorreo implements Serializable{
	private static final long serialVersionUID = 1L;
	private List<String> boleto_factura;
	private String correo;
	
	public BodyPdfCorreo(){
		super();
	}

	public BodyPdfCorreo(List<String> boleto_factura, String correo) {
		super();
		this.boleto_factura = boleto_factura;
		this.correo = correo;
	}

	public List<String> getBoleto_factura() {
		return boleto_factura;
	}

	public void setBoleto_factura(List<String> boleto_factura) {
		this.boleto_factura = boleto_factura;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
}
