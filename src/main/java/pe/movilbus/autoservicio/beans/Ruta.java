package pe.movilbus.autoservicio.beans;

import java.io.Serializable;

public class Ruta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idLocOrigen;
	private int idLocDestino;
	
	
	
	public Ruta() {
		super();
	}
	
	
	
	public Ruta(int idLocOrigen, int idLocDestino) {
		super();
		this.idLocOrigen = idLocOrigen;
		this.idLocDestino = idLocDestino;
	}



	public int getIdLocOrigen() {
		return idLocOrigen;
	}
	public void setIdLocOrigen(int idLocOrigen) {
		this.idLocOrigen = idLocOrigen;
	}
	public int getIdLocDestino() {
		return idLocDestino;
	}
	public void setIdLocDestino(int idLocDestino) {
		this.idLocDestino = idLocDestino;
	}
	

}
