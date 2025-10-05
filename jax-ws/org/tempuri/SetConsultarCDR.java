
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.feservice.DocumentCDR;


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
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentCDR" type="{http://schemas.datacontract.org/2004/07/FEService.Input}DocumentCDR" minOccurs="0"/>
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
    "token",
    "documentCDR"
})
@XmlRootElement(name = "setConsultarCDR")
public class SetConsultarCDR {

    @XmlElementRef(name = "token", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> token;
    @XmlElementRef(name = "documentCDR", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<DocumentCDR> documentCDR;

    /**
     * Obtiene el valor de la propiedad token.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getToken() {
        return token;
    }

    /**
     * Define el valor de la propiedad token.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setToken(JAXBElement<String> value) {
        this.token = value;
    }

    /**
     * Obtiene el valor de la propiedad documentCDR.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocumentCDR }{@code >}
     *     
     */
    public JAXBElement<DocumentCDR> getDocumentCDR() {
        return documentCDR;
    }

    /**
     * Define el valor de la propiedad documentCDR.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocumentCDR }{@code >}
     *     
     */
    public void setDocumentCDR(JAXBElement<DocumentCDR> value) {
        this.documentCDR = value;
    }

}
