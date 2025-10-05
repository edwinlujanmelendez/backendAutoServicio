package pe.movilbus.autoservicio.beans;

import java.io.Serializable;

public class ReimprimirBoleto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int    venpas_id;
	private String c_origen;
	private String c_destino;
	private String c_apepat;
	private String c_apemat;
	private String c_nombre;
	private String c_nomape;
	private String c_nomcor;
	private String d_fecpar;
	private String c_horpar;
	private String c_horlle;
	private int    n_numasiento;
	private String direccion_salida;
	private String direccion_llegada;
	private int    tipmov_id;
	private String c_denominacion;
	private String c_numboleto;
	private int    importe;
	private int    venpas_idoriginal;
	private int    empresa_id;
	private String c_razsoc;
	
	public ReimprimirBoleto(){
		super();
	}

	public ReimprimirBoleto(int venpas_id, String c_origen, String c_destino, String c_apepat, String c_apemat, 
			String c_nombre, String c_nomape, String c_nomcor, String d_fecpar, String c_horpar, String c_horlle, 
			int n_numasiento, String direccion_salida, String direccion_llegada, int tipmov_id, String c_denominacion, 
			String c_numboleto, int importe, int venpas_idoriginal, int empresa_id, String c_razsoc) {
		super();
		this.venpas_id = venpas_id;
		this.c_origen = c_origen;
		this.c_destino = c_destino;
		this.c_apepat = c_apepat;
		this.c_apemat = c_apemat;
		this.c_nombre = c_nombre;
		this.c_nomape = c_nomape;
		this.c_nomcor = c_nomcor;
		this.d_fecpar = d_fecpar;
		this.c_horpar = c_horpar;
		this.c_horlle = c_horlle;
		this.n_numasiento = n_numasiento;
		this.direccion_salida = direccion_salida;
		this.direccion_llegada = direccion_llegada;
		this.tipmov_id = tipmov_id;
		this.c_denominacion = c_denominacion;
		this.c_numboleto = c_numboleto;
		this.importe = importe;
		this.venpas_idoriginal = venpas_idoriginal;
		this.empresa_id = empresa_id;
		this.c_razsoc = c_razsoc;
	}

	public int getVenpas_id() {
		return venpas_id;
	}

	public void setVenpas_id(int venpas_id) {
		this.venpas_id = venpas_id;
	}

	public String getC_origen() {
		return c_origen;
	}

	public void setC_origen(String c_origen) {
		this.c_origen = c_origen;
	}

	public String getC_destino() {
		return c_destino;
	}

	public void setC_destino(String c_destino) {
		this.c_destino = c_destino;
	}

	public String getC_apepat() {
		return c_apepat;
	}

	public void setC_apepat(String c_apepat) {
		this.c_apepat = c_apepat;
	}

	public String getC_apemat() {
		return c_apemat;
	}

	public void setC_apemat(String c_apemat) {
		this.c_apemat = c_apemat;
	}

	public String getC_nombre() {
		return c_nombre;
	}

	public void setC_nombre(String c_nombre) {
		this.c_nombre = c_nombre;
	}

	public String getC_nomape() {
		return c_nomape;
	}

	public void setC_nomape(String c_nomape) {
		this.c_nomape = c_nomape;
	}

	public String getC_nomcor() {
		return c_nomcor;
	}

	public void setC_nomcor(String c_nomcor) {
		this.c_nomcor = c_nomcor;
	}

	public String getD_fecpar() {
		return d_fecpar;
	}

	public void setD_fecpar(String d_fecpar) {
		this.d_fecpar = d_fecpar;
	}

	public String getC_horpar() {
		return c_horpar;
	}

	public void setC_horpar(String c_horpar) {
		this.c_horpar = c_horpar;
	}

	public String getC_horlle() {
		return c_horlle;
	}

	public void setC_horlle(String c_horlle) {
		this.c_horlle = c_horlle;
	}

	public int getN_numasiento() {
		return n_numasiento;
	}

	public void setN_numasiento(int n_numasiento) {
		this.n_numasiento = n_numasiento;
	}

	public String getDireccion_salida() {
		return direccion_salida;
	}

	public void setDireccion_salida(String direccion_salida) {
		this.direccion_salida = direccion_salida;
	}

	public String getDireccion_llegada() {
		return direccion_llegada;
	}

	public void setDireccion_llegada(String direccion_llegada) {
		this.direccion_llegada = direccion_llegada;
	}

	public int getTipmov_id() {
		return tipmov_id;
	}

	public void setTipmov_id(int tipmov_id) {
		this.tipmov_id = tipmov_id;
	}

	public String getC_denominacion() {
		return c_denominacion;
	}

	public void setC_denominacion(String c_denominacion) {
		this.c_denominacion = c_denominacion;
	}

	public String getC_numboleto() {
		return c_numboleto;
	}

	public void setC_numboleto(String c_numboleto) {
		this.c_numboleto = c_numboleto;
	}

	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}

	public int getVenpas_idoriginal() {
		return venpas_idoriginal;
	}

	public void setVenpas_idoriginal(int venpas_idoriginal) {
		this.venpas_idoriginal = venpas_idoriginal;
	}

	public int getEmpresa_id() {
		return empresa_id;
	}

	public void setEmpresa_id(int empresa_id) {
		this.empresa_id = empresa_id;
	}

	public String getC_razsoc() {
		return c_razsoc;
	}

	public void setC_razsoc(String c_razsoc) {
		this.c_razsoc = c_razsoc;
	}
}
