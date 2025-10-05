package pe.movilbus.autoservicio.beans;

import java.util.Date;

public class TarifaSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Cliente cliente;
	private Ruta ruta;
	private Double monto;
	private Date fechaActivacion;
	private Date fechaCaducidad;
	private Date fechaSuspension;

	public TarifaSispas() {
	}

	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return this.cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Ruta getRuta() {
		return this.ruta;
	}
	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}

	public Double getMonto() {
		return this.monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Date getFechaActivacion() {
		return this.fechaActivacion;
	}
	public void setFechaActivacion(Date fechaActivacion) {
		this.fechaActivacion = fechaActivacion;
	}

	public Date getFechaCaducidad() {
		return this.fechaCaducidad;
	}
	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public Date getFechaSuspension() {
		return this.fechaSuspension;
	}
	public void setFechaSuspension(Date fechaSuspension) {
		this.fechaSuspension = fechaSuspension;
	}
}
