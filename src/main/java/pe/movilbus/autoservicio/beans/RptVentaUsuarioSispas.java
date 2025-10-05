package pe.movilbus.autoservicio.beans;

import java.io.Serializable;

public class RptVentaUsuarioSispas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer horaVenta;
	private Integer cantidad;
	private Double importe;
	/**
	 * @return the horaVenta
	 */
	public Integer getHoraVenta() {
		return horaVenta;
	}
	/**
	 * @param horaVenta the horaVenta to set
	 */
	public void setHoraVenta(Integer horaVenta) {
		this.horaVenta = horaVenta;
	}
	/**
	 * @return the cantidad
	 */
	public Integer getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * @return the importe
	 */
	public Double getImporte() {
		return importe;
	}
	/**
	 * @param importe the importe to set
	 */
	public void setImporte(Double importe) {
		this.importe = importe;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return (horaVenta!=null?horaVenta.toString()+" ":"")+(cantidad!=null?cantidad.toString()+" ":"")+(importe!=null?importe.toString():"");
	}

}
