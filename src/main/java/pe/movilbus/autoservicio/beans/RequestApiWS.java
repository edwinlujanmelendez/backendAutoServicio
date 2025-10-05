package pe.movilbus.autoservicio.beans;

import java.io.Serializable;

public class RequestApiWS implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private String url;
	private String body;
	private String autorizacion;
	private String tipometodo;
		
	public RequestApiWS() {
		super();
	}

	public RequestApiWS(String url, String body, String autorizacion, String tipometodo) {
		super();
		this.url = url;
		this.body = body;
		this.autorizacion = autorizacion;
		this.tipometodo = tipometodo;
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getAutorizacion() {
		return autorizacion;
	}
	public void setAutorizacion(String autorizacion) {
		this.autorizacion = autorizacion;
	}

	public String getTipometodo() {
		return tipometodo;
	}

	public void setTipometodo(String tipometodo) {
		this.tipometodo = tipometodo;
	}
}
