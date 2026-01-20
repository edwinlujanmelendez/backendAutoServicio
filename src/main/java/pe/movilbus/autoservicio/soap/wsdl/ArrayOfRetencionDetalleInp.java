//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2026.01.15 a las 11:23:58 PM COT 
//


package pe.movilbus.autoservicio.soap.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfRetencionDetalleInp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRetencionDetalleInp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetencionDetalleInp" type="{http://schemas.datacontract.org/2004/07/FEService.Input}RetencionDetalleInp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRetencionDetalleInp", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", propOrder = {
    "retencionDetalleInp"
})
public class ArrayOfRetencionDetalleInp {

    @XmlElement(name = "RetencionDetalleInp", nillable = true)
    protected List<RetencionDetalleInp> retencionDetalleInp;

    /**
     * Gets the value of the retencionDetalleInp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retencionDetalleInp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetencionDetalleInp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetencionDetalleInp }
     * 
     * 
     */
    public List<RetencionDetalleInp> getRetencionDetalleInp() {
        if (retencionDetalleInp == null) {
            retencionDetalleInp = new ArrayList<RetencionDetalleInp>();
        }
        return this.retencionDetalleInp;
    }

}
