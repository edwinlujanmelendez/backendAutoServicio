package pe.movilbus.autoservicio.beans;

import java.io.Serializable;

public class Secuencia implements Serializable {
	private static final long serialVersionUID = 1L;
	private String c_corseq;
	private String c_serie;
	
	public Secuencia(){
		super();
	}
	
	public Secuencia(String c_corseq, String c_serie) {
		super();
		this.c_corseq = c_corseq;
		this.c_serie = c_serie;
	}

	public String getC_corseq() {
		return c_corseq;
	}

	public void setC_corseq(String c_corseq) {
		this.c_corseq = c_corseq;
	}

	public String getC_serie() {
		return c_serie;
	}

	public void setC_serie(String c_serie) {
		this.c_serie = c_serie;
	}
	
	

}
