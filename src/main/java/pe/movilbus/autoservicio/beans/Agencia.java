package pe.movilbus.autoservicio.beans;

public class Agencia {
	
	private int agencia_id;
	private int tipage_id;
	private int localidad_id;
	private int concesionario_id;
	private int ubigeo_id;
	private int zoncom_id;
	private String c_denominacion;
	private String c_nomcor;
	private int n_esterminal;
	private int c_codigo;
	private String c_direccion;
	private int nacionalidad_id;
	private int codigo_concar;
	private String c_nombre_concar;
	
	public Agencia() {
		super();
	}

	public Agencia(int agencia_id, int tipage_id, int localidad_id, int concesionario_id, int ubigeo_id, int zoncom_id,
			String c_denominacion, String c_nomcor, int n_esterminal, int c_codigo, String c_direccion,
			int nacionalidad_id, int codigo_concar, String c_nombre_concar) {
		super();
		this.agencia_id = agencia_id;
		this.tipage_id = tipage_id;
		this.localidad_id = localidad_id;
		this.concesionario_id = concesionario_id;
		this.ubigeo_id = ubigeo_id;
		this.zoncom_id = zoncom_id;
		this.c_denominacion = c_denominacion;
		this.c_nomcor = c_nomcor;
		this.n_esterminal = n_esterminal;
		this.c_codigo = c_codigo;
		this.c_direccion = c_direccion;
		this.nacionalidad_id = nacionalidad_id;
		this.codigo_concar = codigo_concar;
		this.c_nombre_concar = c_nombre_concar;
	}

	public int getAgencia_id() {
		return agencia_id;
	}

	public void setAgencia_id(int agencia_id) {
		this.agencia_id = agencia_id;
	}

	public int getTipage_id() {
		return tipage_id;
	}

	public void setTipage_id(int tipage_id) {
		this.tipage_id = tipage_id;
	}

	public int getLocalidad_id() {
		return localidad_id;
	}

	public void setLocalidad_id(int localidad_id) {
		this.localidad_id = localidad_id;
	}

	public int getConcesionario_id() {
		return concesionario_id;
	}

	public void setConcesionario_id(int concesionario_id) {
		this.concesionario_id = concesionario_id;
	}

	public int getUbigeo_id() {
		return ubigeo_id;
	}

	public void setUbigeo_id(int ubigeo_id) {
		this.ubigeo_id = ubigeo_id;
	}

	public int getZoncom_id() {
		return zoncom_id;
	}

	public void setZoncom_id(int zoncom_id) {
		this.zoncom_id = zoncom_id;
	}

	public String getC_denominacion() {
		return c_denominacion;
	}

	public void setC_denominacion(String c_denominacion) {
		this.c_denominacion = c_denominacion;
	}

	public String getC_nomcor() {
		return c_nomcor;
	}

	public void setC_nomcor(String c_nomcor) {
		this.c_nomcor = c_nomcor;
	}

	public int getN_esterminal() {
		return n_esterminal;
	}

	public void setN_esterminal(int n_esterminal) {
		this.n_esterminal = n_esterminal;
	}

	public int getC_codigo() {
		return c_codigo;
	}

	public void setC_codigo(int c_codigo) {
		this.c_codigo = c_codigo;
	}

	public String getC_direccion() {
		return c_direccion;
	}

	public void setC_direccion(String c_direccion) {
		this.c_direccion = c_direccion;
	}

	public int getNacionalidad_id() {
		return nacionalidad_id;
	}

	public void setNacionalidad_id(int nacionalidad_id) {
		this.nacionalidad_id = nacionalidad_id;
	}

	public int getCodigo_concar() {
		return codigo_concar;
	}

	public void setCodigo_concar(int codigo_concar) {
		this.codigo_concar = codigo_concar;
	}

	public String getC_nombre_concar() {
		return c_nombre_concar;
	}

	public void setC_nombre_concar(String c_nombre_concar) {
		this.c_nombre_concar = c_nombre_concar;
	}
}