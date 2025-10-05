package pe.movilbus.autoservicio.beans;

import java.io.Serializable;
import java.math.BigDecimal;

public class RptPromocion implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String idaVuelta;
	private BigDecimal promocion_id;
	private String c_denominacion;
	private String c_tarcre;
	private Double n_valdes;
	private int stock;
	
	public RptPromocion(){
		super();
	}
	
	public RptPromocion(String idaVuelta, BigDecimal promocion_id, String c_denominacion, String c_tarcre, Double n_valdes, int stock) {
		super();
		this.idaVuelta = idaVuelta;
		this.promocion_id = promocion_id;
		this.c_denominacion = c_denominacion;
		this.c_tarcre = c_tarcre;
		this.n_valdes = n_valdes;
		this.stock = stock;
	}
	
	public String getIdaVuelta() {
		return idaVuelta;
	}

	public void setIdaVuelta(String idaVuelta) {
		this.idaVuelta = idaVuelta;
	}

	public BigDecimal getPromocion_id() {
		return promocion_id;
	}

	public void setPromocion_id(BigDecimal promocion_id) {
		this.promocion_id = promocion_id;
	}

	public String getC_denominacion() {
		return c_denominacion;
	}

	public void setC_denominacion(String c_denominacion) {
		this.c_denominacion = c_denominacion;
	}

	public String getC_tarcre() {
		return c_tarcre;
	}

	public void setC_tarcre(String c_tarcre) {
		this.c_tarcre = c_tarcre;
	}

	public Double getN_valdes() {
		return n_valdes;
	}

	public void setN_valdes(Double n_valdes) {
		this.n_valdes = n_valdes;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
