package pe.movilbus.autoservicio.beans;

public class UsuarioHardwareSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private AgenciaSispas agencia;
	private String direccionMAC;
	private String codigo;
	private String descripcion;
	private CanalVentaSispas canalVenta;
	private Integer printApplet;
	
	public UsuarioHardwareSispas() {
	}
	
	/**
	 * @param id
	 */
	public UsuarioHardwareSispas(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public AgenciaSispas getAgencia() {
		return this.agencia;
	}
	public void setAgencia(AgenciaSispas agencia) {
		this.agencia = agencia;
	}

	public CanalVentaSispas getCanalVenta(){
		return this.canalVenta;
	}
	
	public void setCanalVenta(CanalVentaSispas canalVenta){
		this.canalVenta=canalVenta;
	}
	
	/**
	 * @return the direccionMAC
	 */
	public String getDireccionMAC() {
		return direccionMAC;
	}
	/**
	 * @param direccionMAC the direccionMAC to set
	 */
	public void setDireccionMAC(String direccionMAC) {
		this.direccionMAC = direccionMAC;
	}

	public String getCodigo() {
		return this.codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the printApplet
	 */
	public Integer getPrintApplet() {
		return printApplet;
	}

	/**
	 * @param printApplet the printApplet to set
	 */
	public void setPrintApplet(Integer printApplet) {
		this.printApplet = printApplet;
	}
}
