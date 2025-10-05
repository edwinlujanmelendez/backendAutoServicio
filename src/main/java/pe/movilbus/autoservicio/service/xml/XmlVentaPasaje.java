package pe.movilbus.autoservicio.service.xml;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class XmlVentaPasaje  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private XmlConfigPrint configPrint;
	private List<XmlVenta> venta;
	private XmlLiquidacionTuentrada liqTuentrada;

	/**
	 * @return the venta
	 */
	public List<XmlVenta> getVenta() {
		return venta;
	}

	/**
	 * @param venta the venta to set
	 */
	public void setVenta(List<XmlVenta> venta) {
		this.venta = venta;
	}

	/**
	 * @return the configPrint
	 */
	public XmlConfigPrint getConfigPrint() {
		return configPrint;
	}

	/**
	 * @param configPrint the configPrint to set
	 */
	public void setConfigPrint(XmlConfigPrint configPrint) {
		this.configPrint = configPrint;
	}

	/**
	 * @return the liqTuentrada
	 */
	public XmlLiquidacionTuentrada getLiqTuentrada() {
		return liqTuentrada;
	}

	/**
	 * @param liqTuentrada the liqTuentrada to set
	 */
	public void setLiqTuentrada(XmlLiquidacionTuentrada liqTuentrada) {
		this.liqTuentrada = liqTuentrada;
	}
	
}