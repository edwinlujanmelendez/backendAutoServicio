package pe.movilbus.autoservicio.beans;

import java.io.Serializable;
import java.util.List;

public class AsientoOcupado implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private int asiento;
	private int piso;
	private Integer idorigen;
	private Integer iddestino;
	private List<Integer> subConjunto;
	
	
	public AsientoOcupado() {
		super();
	}
	public AsientoOcupado(int asiento, int piso, Integer idorigen, Integer iddestino) {
		super();
		this.asiento = asiento;
		this.piso = piso;
		this.idorigen = idorigen;
		this.iddestino = iddestino;
	}
	public int getAsiento() {
		return asiento;
	}
	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public Integer getIdorigen() {
		return idorigen;
	}
	public void setIdorigen(Integer idorigen) {
		this.idorigen = idorigen;
	}
	public Integer getIddestino() {
		return iddestino;
	}
	public void setIddestino(Integer iddestino) {
		this.iddestino = iddestino;
	}
	public List<Integer> getSubConjunto() {
		return subConjunto;
	}
	public void setSubConjunto(List<Integer> subConjunto) {
		this.subConjunto = subConjunto;
	}
	
	
	
}
