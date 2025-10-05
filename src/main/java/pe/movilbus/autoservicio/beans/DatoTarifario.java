package pe.movilbus.autoservicio.beans;

import java.io.Serializable;
import java.math.BigDecimal;

public class DatoTarifario implements Serializable {

	private static final long serialVersionUID = 1L;
	private BigDecimal itinerario_id;
	private int ruta_id;
	private String c_codigo;
	private String tipo_servicio;
	private String origen;
	private String age_partida;
	private String fecha_partida;
	private String c_horpar;
	private String destino;
	private String age_llegada;
	private String fecha_llegada;
	private String c_horlle;
	private String c_sectra;
	private String c_desc_escalas;
	private int nropiso;
	private String tipo_tarifa1;
	private int n_tarifa1;
	private String tipo_tarifa2;
	private int n_tarifa2;
	
	public DatoTarifario(){
		super();
	}

	public DatoTarifario(BigDecimal itinerario_id, int ruta_id, String c_codigo, String tipo_servicio, String origen,
			String age_partida, String fecha_partida, String c_horpar, String destino, String age_llegada,
			String fecha_llegada, String c_horlle, String c_sectra, String c_desc_escalas, int nropiso,
			String tipo_tarifa1, int n_tarifa1, String tipo_tarifa2, int n_tarifa2) {
		super();
		this.itinerario_id = itinerario_id;
		this.ruta_id = ruta_id;
		this.c_codigo = c_codigo;
		this.tipo_servicio = tipo_servicio;
		this.origen = origen;
		this.age_partida = age_partida;
		this.fecha_partida = fecha_partida;
		this.c_horpar = c_horpar;
		this.destino = destino;
		this.age_llegada = age_llegada;
		this.fecha_llegada = fecha_llegada;
		this.c_horlle = c_horlle;
		this.c_sectra = c_sectra;
		this.c_desc_escalas = c_desc_escalas;
		this.nropiso = nropiso;
		this.tipo_tarifa1 = tipo_tarifa1;
		this.n_tarifa1 = n_tarifa1;
		this.tipo_tarifa2 = tipo_tarifa2;
		this.n_tarifa2 = n_tarifa2;
	}

	public BigDecimal getItinerario_id() {
		return itinerario_id;
	}

	public void setItinerario_id(BigDecimal itinerario_id) {
		this.itinerario_id = itinerario_id;
	}

	public int getRuta_id() {
		return ruta_id;
	}

	public void setRuta_id(int ruta_id) {
		this.ruta_id = ruta_id;
	}

	public String getC_codigo() {
		return c_codigo;
	}

	public void setC_codigo(String c_codigo) {
		this.c_codigo = c_codigo;
	}

	public String getTipo_servicio() {
		return tipo_servicio;
	}

	public void setTipo_servicio(String tipo_servicio) {
		this.tipo_servicio = tipo_servicio;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getAge_partida() {
		return age_partida;
	}

	public void setAge_partida(String age_partida) {
		this.age_partida = age_partida;
	}

	public String getFecha_partida() {
		return fecha_partida;
	}

	public void setFecha_partida(String fecha_partida) {
		this.fecha_partida = fecha_partida;
	}

	public String getC_horpar() {
		return c_horpar;
	}

	public void setC_horpar(String c_horpar) {
		this.c_horpar = c_horpar;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getAge_llegada() {
		return age_llegada;
	}

	public void setAge_llegada(String age_llegada) {
		this.age_llegada = age_llegada;
	}

	public String getFecha_llegada() {
		return fecha_llegada;
	}

	public void setFecha_llegada(String fecha_llegada) {
		this.fecha_llegada = fecha_llegada;
	}

	public String getC_horlle() {
		return c_horlle;
	}

	public void setC_horlle(String c_horlle) {
		this.c_horlle = c_horlle;
	}

	public String getC_sectra() {
		return c_sectra;
	}

	public void setC_sectra(String c_sectra) {
		this.c_sectra = c_sectra;
	}

	public String getC_desc_escalas() {
		return c_desc_escalas;
	}

	public void setC_desc_escalas(String c_desc_escalas) {
		this.c_desc_escalas = c_desc_escalas;
	}

	public int getNropiso() {
		return nropiso;
	}

	public void setNropiso(int nropiso) {
		this.nropiso = nropiso;
	}

	public String getTipo_tarifa1() {
		return tipo_tarifa1;
	}

	public void setTipo_tarifa1(String tipo_tarifa1) {
		this.tipo_tarifa1 = tipo_tarifa1;
	}

	public int getN_tarifa1() {
		return n_tarifa1;
	}

	public void setN_tarifa1(int n_tarifa1) {
		this.n_tarifa1 = n_tarifa1;
	}

	public String getTipo_tarifa2() {
		return tipo_tarifa2;
	}

	public void setTipo_tarifa2(String tipo_tarifa2) {
		this.tipo_tarifa2 = tipo_tarifa2;
	}

	public int getN_tarifa2() {
		return n_tarifa2;
	}

	public void setN_tarifa2(int n_tarifa2) {
		this.n_tarifa2 = n_tarifa2;
	}
}