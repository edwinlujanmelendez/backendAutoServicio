package pe.movilbus.autoservicio.beans;

import java.io.Serializable;

public class JsonRest implements Serializable {

	private static final long serialVersionUID = 1L;

    private String rspCode;
    private String rspMessage;
    private String response;
    private String msjExito;
    private String msjError;
    private String url;
    private String body;

    public JsonRest() {
		super();
	}
    
    public JsonRest(String rspCode, String response) {
		super();
		this.rspCode = rspCode;
		this.response = response;
	}
    
	public JsonRest(String rspCode, String rspMessage, String response, String msjExito, String msjError, String url,
			String body) {
		super();
		this.rspCode = rspCode;
		this.rspMessage = rspMessage;
		this.response = response;
		this.msjExito = msjExito;
		this.msjError = msjError;
		this.url = url;
		this.body = body;
	}

	public String getRspCode() {
        return rspCode;
    }

    public void setRspCode(String rspCode) {
        this.rspCode = rspCode;
    }

    public String getRspMessage() {
        return rspMessage;
    }

    public void setRspMessage(String rspMessage) {
        this.rspMessage = rspMessage;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

   

    public String getMsjExito() {
		return msjExito;
	}

	public void setMsjExito(String msjExito) {
		this.msjExito = msjExito;
	}

	public String getMsjError() {
        return msjError;
    }

    public void setMsjError(String msjError) {
        this.msjError = msjError;
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
    
}
