package pe.movilbus.autoservicio.beans;

import java.util.Date;

public class PuntoControlEstadoBusSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private EstadoBusSispas estadoBus;
	private BusSispas bus;
	private Date fechaInicio;
	private Date fechaFin;

	public PuntoControlEstadoBusSispas() {
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public EstadoBusSispas getEstadoBus() {
		return this.estadoBus;
	}
	public void setEstadoBus(EstadoBusSispas estadoBus) {
		this.estadoBus = estadoBus;
	}

	public BusSispas getBus() {
		return this.bus;
	}
	public void setBus(BusSispas bus) {
		this.bus = bus;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
}
