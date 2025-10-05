package pe.movilbus.autoservicio.beans;

public class GrupoMantenimientoSispas extends GenericBean implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String codigo;
	private String denominacion;
	private String nombreCorto;

	public GrupoMantenimientoSispas() {
	}

	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return this.codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDenominacion() {
		return this.denominacion;
	}
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public String getNombreCorto() {
		return this.nombreCorto;
	}
	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}
}
