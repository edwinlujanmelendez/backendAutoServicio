package pe.movilbus.autoservicio.beans;

import java.io.Serializable;

public class MensajeConfirmacionResult implements Serializable{

	private static final long serialVersionUID = 1L;
	private boolean result;
	private String mensaje;
	
	public MensajeConfirmacionResult() {
		super();
	}
	
	public MensajeConfirmacionResult(boolean result, String mensaje) {
		super();
		this.result = result;
		this.mensaje = mensaje;
	}
	
	public boolean getResult() {
		return result;
	}
	
	public void setResult(boolean result) {
		this.result = result;
	}
	
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
