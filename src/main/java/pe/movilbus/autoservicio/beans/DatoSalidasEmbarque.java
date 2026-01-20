package pe.movilbus.autoservicio.beans;

import java.io.Serializable;
import java.math.BigDecimal;

public class DatoSalidasEmbarque implements Serializable {

	private static final long serialVersionUID = 1L;
//	private BigDecimal itinerario_id;
//	private String c_codigo;
//	private String tipo_servicio;
//	private String origen;
//	private String age_partida;
//	private String fecha_partida;
//	private String c_horpar;
//	private String destino;
//	private String age_llegada;
//	private String fecha_llegada;
//	private String c_horlle;
//	private String c_sectra;
//	private String c_desc_escalas;
//	private String d_fecsalida;
//	private String c_horsalida;
//	private String n_puerta;
//	private String horasalidaagencia;
//	private String puertaagencia;
	
	private int agencia_id_detalle;
	private int itinerario_id;
	private int agencia_id;
	private String servicio;
	private String origen;
	private String destino;
	private String agencia_partida;
	private String fecha_partida;
	private String hora_partida;
	private String d_fecsalida;
	private String hora_salida;
	private String nro_puerta;
	private String c_desc_escalas;
	private String c_codigo;
	
	public DatoSalidasEmbarque(){
		super();
	}

	public DatoSalidasEmbarque(int agencia_id_detalle, int itinerario_id, int agencia_id, String servicio,
			String origen, String destino, String agencia_partida, String fecha_partida, String hora_partida,
			String d_fecsalida, String hora_salida, String nro_puerta, String c_desc_escalas, String c_codigo) {
		super();
		this.agencia_id_detalle = agencia_id_detalle;
		this.itinerario_id = itinerario_id;
		this.agencia_id = agencia_id;
		this.servicio = servicio;
		this.origen = origen;
		this.destino = destino;
		this.agencia_partida = agencia_partida;
		this.fecha_partida = fecha_partida;
		this.hora_partida = hora_partida;
		this.d_fecsalida = d_fecsalida;
		this.hora_salida = hora_salida;
		this.nro_puerta = nro_puerta;
		this.c_desc_escalas = c_desc_escalas;
		this.c_codigo = c_codigo;
	}

	public int getAgencia_id_detalle() {
		return agencia_id_detalle;
	}

	public void setAgencia_id_detalle(int agencia_id_detalle) {
		this.agencia_id_detalle = agencia_id_detalle;
	}

	public int getItinerario_id() {
		return itinerario_id;
	}

	public void setItinerario_id(int itinerario_id) {
		this.itinerario_id = itinerario_id;
	}

	public int getAgencia_id() {
		return agencia_id;
	}

	public void setAgencia_id(int agencia_id) {
		this.agencia_id = agencia_id;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getAgencia_partida() {
		return agencia_partida;
	}

	public void setAgencia_partida(String agencia_partida) {
		this.agencia_partida = agencia_partida;
	}

	public String getFecha_partida() {
		return fecha_partida;
	}

	public void setFecha_partida(String fecha_partida) {
		this.fecha_partida = fecha_partida;
	}

	public String getHora_partida() {
		return hora_partida;
	}

	public void setHora_partida(String hora_partida) {
		this.hora_partida = hora_partida;
	}

	public String getD_fecsalida() {
		return d_fecsalida;
	}

	public void setD_fecsalida(String d_fecsalida) {
		this.d_fecsalida = d_fecsalida;
	}

	public String getHora_salida() {
		return hora_salida;
	}

	public void setHora_salida(String hora_salida) {
		this.hora_salida = hora_salida;
	}

	public String getNro_puerta() {
		return nro_puerta;
	}

	public void setNro_puerta(String nro_puerta) {
		this.nro_puerta = nro_puerta;
	}

	public String getC_desc_escalas() {
		return c_desc_escalas;
	}

	public void setC_desc_escalas(String c_desc_escalas) {
		this.c_desc_escalas = c_desc_escalas;
	}

	public String getC_codigo() {
		return c_codigo;
	}

	public void setC_codigo(String c_codigo) {
		this.c_codigo = c_codigo;
	}
}