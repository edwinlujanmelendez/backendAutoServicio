//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2026.01.15 a las 11:23:58 PM COT 
//


package pe.movilbus.autoservicio.soap.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InformacionAdicional complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InformacionAdicional"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PropiedadesAdicionales" type="{http://schemas.datacontract.org/2004/07/FEService.Input}ArrayOfInformacionAdicional.PropiedadAdicional" minOccurs="0"/&gt;
 *         &lt;element name="TotalesMonedaAdicional" type="{http://schemas.datacontract.org/2004/07/FEService.Input}ArrayOfInformacionAdicional.TotalMonedaAdicional" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionAdicional", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", propOrder = {
    "propiedadesAdicionales",
    "totalesMonedaAdicional"
})
public class InformacionAdicional {

    @XmlElementRef(name = "PropiedadesAdicionales", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInformacionAdicionalPropiedadAdicional> propiedadesAdicionales;
    @XmlElementRef(name = "TotalesMonedaAdicional", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInformacionAdicionalTotalMonedaAdicional> totalesMonedaAdicional;

    /**
     * Obtiene el valor de la propiedad propiedadesAdicionales.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInformacionAdicionalPropiedadAdicional }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInformacionAdicionalPropiedadAdicional> getPropiedadesAdicionales() {
        return propiedadesAdicionales;
    }

    /**
     * Define el valor de la propiedad propiedadesAdicionales.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInformacionAdicionalPropiedadAdicional }{@code >}
     *     
     */
    public void setPropiedadesAdicionales(JAXBElement<ArrayOfInformacionAdicionalPropiedadAdicional> value) {
        this.propiedadesAdicionales = value;
    }

    /**
     * Obtiene el valor de la propiedad totalesMonedaAdicional.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInformacionAdicionalTotalMonedaAdicional }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInformacionAdicionalTotalMonedaAdicional> getTotalesMonedaAdicional() {
        return totalesMonedaAdicional;
    }

    /**
     * Define el valor de la propiedad totalesMonedaAdicional.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInformacionAdicionalTotalMonedaAdicional }{@code >}
     *     
     */
    public void setTotalesMonedaAdicional(JAXBElement<ArrayOfInformacionAdicionalTotalMonedaAdicional> value) {
        this.totalesMonedaAdicional = value;
    }

}
