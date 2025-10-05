
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.feservice.Result;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="setBajaDocumentoResult" type="{http://schemas.datacontract.org/2004/07/FEService.Util}Result" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "setBajaDocumentoResult"
})
@XmlRootElement(name = "setBajaDocumentoResponse")
public class SetBajaDocumentoResponse {

    @XmlElementRef(name = "setBajaDocumentoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Result> setBajaDocumentoResult;

    /**
     * Obtiene el valor de la propiedad setBajaDocumentoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public JAXBElement<Result> getSetBajaDocumentoResult() {
        return setBajaDocumentoResult;
    }

    /**
     * Define el valor de la propiedad setBajaDocumentoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public void setSetBajaDocumentoResult(JAXBElement<Result> value) {
        this.setBajaDocumentoResult = value;
    }

}
