
package org.datacontract.schemas._2004._07.feservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Result complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Result">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsCorrect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="barcode" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="barcode_QR" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="listDetalleCuota" type="{http://schemas.datacontract.org/2004/07/FEService.Input}ArrayOfDetalleCuota" minOccurs="0"/>
 *         &lt;element name="listDetalleVenta" type="{http://schemas.datacontract.org/2004/07/FEService.Input}ArrayOfDetalleVenta" minOccurs="0"/>
 *         &lt;element name="listEmpresas" type="{http://schemas.datacontract.org/2004/07/FEService.Input}ArrayOfEmpresa" minOccurs="0"/>
 *         &lt;element name="pdf" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="retencionesInp" type="{http://schemas.datacontract.org/2004/07/FEService.Input}ArrayOfRetencionInp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Result", namespace = "http://schemas.datacontract.org/2004/07/FEService.Util", propOrder = {
    "isCorrect",
    "message",
    "barcode",
    "barcodeQR",
    "listDetalleCuota",
    "listDetalleVenta",
    "listEmpresas",
    "pdf",
    "retencionesInp"
})
public class Result {

    @XmlElement(name = "IsCorrect")
    protected Boolean isCorrect;
    @XmlElementRef(name = "Message", namespace = "http://schemas.datacontract.org/2004/07/FEService.Util", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;
    @XmlElementRef(name = "barcode", namespace = "http://schemas.datacontract.org/2004/07/FEService.Util", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> barcode;
    @XmlElementRef(name = "barcode_QR", namespace = "http://schemas.datacontract.org/2004/07/FEService.Util", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> barcodeQR;
    @XmlElementRef(name = "listDetalleCuota", namespace = "http://schemas.datacontract.org/2004/07/FEService.Util", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetalleCuota> listDetalleCuota;
    @XmlElementRef(name = "listDetalleVenta", namespace = "http://schemas.datacontract.org/2004/07/FEService.Util", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetalleVenta> listDetalleVenta;
    @XmlElementRef(name = "listEmpresas", namespace = "http://schemas.datacontract.org/2004/07/FEService.Util", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEmpresa> listEmpresas;
    @XmlElementRef(name = "pdf", namespace = "http://schemas.datacontract.org/2004/07/FEService.Util", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> pdf;
    @XmlElementRef(name = "retencionesInp", namespace = "http://schemas.datacontract.org/2004/07/FEService.Util", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRetencionInp> retencionesInp;

    /**
     * Obtiene el valor de la propiedad isCorrect.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCorrect() {
        return isCorrect;
    }

    /**
     * Define el valor de la propiedad isCorrect.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCorrect(Boolean value) {
        this.isCorrect = value;
    }

    /**
     * Obtiene el valor de la propiedad message.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessage() {
        return message;
    }

    /**
     * Define el valor de la propiedad message.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessage(JAXBElement<String> value) {
        this.message = value;
    }

    /**
     * Obtiene el valor de la propiedad barcode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getBarcode() {
        return barcode;
    }

    /**
     * Define el valor de la propiedad barcode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setBarcode(JAXBElement<byte[]> value) {
        this.barcode = value;
    }

    /**
     * Obtiene el valor de la propiedad barcodeQR.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getBarcodeQR() {
        return barcodeQR;
    }

    /**
     * Define el valor de la propiedad barcodeQR.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setBarcodeQR(JAXBElement<byte[]> value) {
        this.barcodeQR = value;
    }

    /**
     * Obtiene el valor de la propiedad listDetalleCuota.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalleCuota }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDetalleCuota> getListDetalleCuota() {
        return listDetalleCuota;
    }

    /**
     * Define el valor de la propiedad listDetalleCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalleCuota }{@code >}
     *     
     */
    public void setListDetalleCuota(JAXBElement<ArrayOfDetalleCuota> value) {
        this.listDetalleCuota = value;
    }

    /**
     * Obtiene el valor de la propiedad listDetalleVenta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalleVenta }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDetalleVenta> getListDetalleVenta() {
        return listDetalleVenta;
    }

    /**
     * Define el valor de la propiedad listDetalleVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalleVenta }{@code >}
     *     
     */
    public void setListDetalleVenta(JAXBElement<ArrayOfDetalleVenta> value) {
        this.listDetalleVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad listEmpresas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresa }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresa> getListEmpresas() {
        return listEmpresas;
    }

    /**
     * Define el valor de la propiedad listEmpresas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresa }{@code >}
     *     
     */
    public void setListEmpresas(JAXBElement<ArrayOfEmpresa> value) {
        this.listEmpresas = value;
    }

    /**
     * Obtiene el valor de la propiedad pdf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getPdf() {
        return pdf;
    }

    /**
     * Define el valor de la propiedad pdf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setPdf(JAXBElement<byte[]> value) {
        this.pdf = value;
    }

    /**
     * Obtiene el valor de la propiedad retencionesInp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRetencionInp }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRetencionInp> getRetencionesInp() {
        return retencionesInp;
    }

    /**
     * Define el valor de la propiedad retencionesInp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRetencionInp }{@code >}
     *     
     */
    public void setRetencionesInp(JAXBElement<ArrayOfRetencionInp> value) {
        this.retencionesInp = value;
    }

}
