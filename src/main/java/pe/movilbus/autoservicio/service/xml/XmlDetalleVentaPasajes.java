package pe.movilbus.autoservicio.service.xml;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType
public class XmlDetalleVentaPasajes  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<XmlItem> item;

	/**
	 * @return the item
	 */
	public List<XmlItem> getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(List<XmlItem> item) {
		this.item = item;
	}	
}