package pe.movilbus.autoservicio.beans;

import java.io.Serializable;

public class VentaPasajeros implements Serializable{

	private static final long serialVersionUID = 1L;
	private VentaPasaje ventaIda;
	private VentaPasaje ventaVuelta;
	
	
	public VentaPasajeros() {
		super();
	}

	public VentaPasajeros(VentaPasaje ventaIda, VentaPasaje ventaVuelta) {
		super();
		this.ventaIda = ventaIda;
		this.ventaVuelta = ventaVuelta;
	}

	public VentaPasaje getVentaIda() {
		return ventaIda;
	}

	public void setVentaIda(VentaPasaje ventaIda) {
		this.ventaIda = ventaIda;
	}

	public VentaPasaje getVentaVuelta() {
		return ventaVuelta;
	}

	public void setVentaVuelta(VentaPasaje ventaVuelta) {
		this.ventaVuelta = ventaVuelta;
	}

	@Override
	public String toString() {
		return "VentaPasajeros [ventaIda=" + ventaIda + ", ventaVuelta=" + ventaVuelta + "]";
	}

	

}
