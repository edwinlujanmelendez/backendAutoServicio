package pe.movilbus.autoservicio.beans;

import java.util.Date;

public class Liquidacion implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private int n_anio;
	private int agencia_id;
	private int usuario_id;
	private String c_nomusu;
	private Date d_fecliq;
	private String n_moning;
	private int n_estliq;
	private int liqofi_id;
	
	public Liquidacion(int id, int n_anio, int agencia_id, int usuario_id, String c_nomusu, Date d_fecliq,
			String n_moning, int n_estliq, int liqofi_id) {
		super();
		this.id = id;
		this.n_anio = n_anio;
		this.agencia_id = agencia_id;
		this.usuario_id = usuario_id;
		this.c_nomusu = c_nomusu;
		this.d_fecliq = d_fecliq;
		this.n_moning = n_moning;
		this.n_estliq = n_estliq;
		this.liqofi_id = liqofi_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getN_anio() {
		return n_anio;
	}

	public void setN_anio(int n_anio) {
		this.n_anio = n_anio;
	}

	public int getAgencia_id() {
		return agencia_id;
	}

	public void setAgencia_id(int agencia_id) {
		this.agencia_id = agencia_id;
	}

	public int getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}

	public String getC_nomusu() {
		return c_nomusu;
	}

	public void setC_nomusu(String c_nomusu) {
		this.c_nomusu = c_nomusu;
	}

	public Date getD_fecliq() {
		return d_fecliq;
	}

	public void setD_fecliq(Date d_fecliq) {
		this.d_fecliq = d_fecliq;
	}

	public String getN_moning() {
		return n_moning;
	}

	public void setN_moning(String n_moning) {
		this.n_moning = n_moning;
	}

	public int getN_estliq() {
		return n_estliq;
	}

	public void setN_estliq(int n_estliq) {
		this.n_estliq = n_estliq;
	}

	public int getLiqofi_id() {
		return liqofi_id;
	}

	public void setLiqofi_id(int liqofi_id) {
		this.liqofi_id = liqofi_id;
	}
}
