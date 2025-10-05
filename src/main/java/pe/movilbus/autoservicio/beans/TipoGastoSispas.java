package pe.movilbus.autoservicio.beans;

import java.util.HashSet;
import java.util.Set;

public class TipoGastoSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String denominacion;
	private String nombreCorto;
	private String mascara;
	
	private Set<GastoBusSispas> gastoBuses = new HashSet<GastoBusSispas>(0);
	private Set<GastoSispas> gastos = new HashSet<GastoSispas>(0);

	public TipoGastoSispas() {
	}

	/**
	 * @return Objeto id.
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id	: Setea el objeto id.
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return Objeto denominacion.
	 */
	public String getDenominacion() {
		return denominacion;
	}

	/**
	 * @param denominacion	: Setea el objeto denominacion.
	 */
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	/**
	 * @return Objeto nombreCorto.
	 */
	public String getNombreCorto() {
		return nombreCorto;
	}

	/**
	 * @param nombreCorto	: Setea el objeto nombreCorto.
	 */
	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}

	/**
	 * @return Objeto mascara.
	 */
	public String getMascara() {
		return mascara;
	}

	/**
	 * @param mascara	: Setea el objeto mascara.
	 */
	public void setMascara(String mascara) {
		this.mascara = mascara;
	}

	public Set<GastoBusSispas> getGastoBuses() {
		return this.gastoBuses;
	}

	public void setGastoBuses(Set<GastoBusSispas> gastoBuses) {
		this.gastoBuses = gastoBuses;
	}

	public Set<GastoSispas> getGastos() {
		return this.gastos;
	}

	public void setGastos(Set<GastoSispas> gastos) {
		this.gastos = gastos;
	}

}
