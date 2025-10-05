
package org.datacontract.schemas._2004._07.feservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RetencionDetalleInp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RetencionDetalleInp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaEmisonDoctRelacionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importeNeto" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="importePagado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="importeRetenido" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="importeTotalDoctRelacionado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="monedaDoctRelacionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monedaOriginal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monedaPagado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numDoctRelacionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDoctRelacionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetencionDetalleInp", propOrder = {
    "fechaEmisonDoctRelacionado",
    "fechaPago",
    "importeNeto",
    "importePagado",
    "importeRetenido",
    "importeTotalDoctRelacionado",
    "monedaDoctRelacionado",
    "monedaOriginal",
    "monedaPagado",
    "numDoctRelacionado",
    "numeroPago",
    "tipoDoctRelacionado"
})
public class RetencionDetalleInp {

    @XmlElementRef(name = "fechaEmisonDoctRelacionado", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaEmisonDoctRelacionado;
    @XmlElementRef(name = "fechaPago", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaPago;
    protected Double importeNeto;
    protected Double importePagado;
    protected Double importeRetenido;
    protected Double importeTotalDoctRelacionado;
    @XmlElementRef(name = "monedaDoctRelacionado", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monedaDoctRelacionado;
    @XmlElementRef(name = "monedaOriginal", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monedaOriginal;
    @XmlElementRef(name = "monedaPagado", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monedaPagado;
    @XmlElementRef(name = "numDoctRelacionado", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numDoctRelacionado;
    @XmlElementRef(name = "numeroPago", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroPago;
    @XmlElementRef(name = "tipoDoctRelacionado", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoDoctRelacionado;

    /**
     * Obtiene el valor de la propiedad fechaEmisonDoctRelacionado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaEmisonDoctRelacionado() {
        return fechaEmisonDoctRelacionado;
    }

    /**
     * Define el valor de la propiedad fechaEmisonDoctRelacionado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaEmisonDoctRelacionado(JAXBElement<String> value) {
        this.fechaEmisonDoctRelacionado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPago.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaPago() {
        return fechaPago;
    }

    /**
     * Define el valor de la propiedad fechaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaPago(JAXBElement<String> value) {
        this.fechaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad importeNeto.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImporteNeto() {
        return importeNeto;
    }

    /**
     * Define el valor de la propiedad importeNeto.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImporteNeto(Double value) {
        this.importeNeto = value;
    }

    /**
     * Obtiene el valor de la propiedad importePagado.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImportePagado() {
        return importePagado;
    }

    /**
     * Define el valor de la propiedad importePagado.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImportePagado(Double value) {
        this.importePagado = value;
    }

    /**
     * Obtiene el valor de la propiedad importeRetenido.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImporteRetenido() {
        return importeRetenido;
    }

    /**
     * Define el valor de la propiedad importeRetenido.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImporteRetenido(Double value) {
        this.importeRetenido = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTotalDoctRelacionado.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImporteTotalDoctRelacionado() {
        return importeTotalDoctRelacionado;
    }

    /**
     * Define el valor de la propiedad importeTotalDoctRelacionado.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImporteTotalDoctRelacionado(Double value) {
        this.importeTotalDoctRelacionado = value;
    }

    /**
     * Obtiene el valor de la propiedad monedaDoctRelacionado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonedaDoctRelacionado() {
        return monedaDoctRelacionado;
    }

    /**
     * Define el valor de la propiedad monedaDoctRelacionado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonedaDoctRelacionado(JAXBElement<String> value) {
        this.monedaDoctRelacionado = value;
    }

    /**
     * Obtiene el valor de la propiedad monedaOriginal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonedaOriginal() {
        return monedaOriginal;
    }

    /**
     * Define el valor de la propiedad monedaOriginal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonedaOriginal(JAXBElement<String> value) {
        this.monedaOriginal = value;
    }

    /**
     * Obtiene el valor de la propiedad monedaPagado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonedaPagado() {
        return monedaPagado;
    }

    /**
     * Define el valor de la propiedad monedaPagado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonedaPagado(JAXBElement<String> value) {
        this.monedaPagado = value;
    }

    /**
     * Obtiene el valor de la propiedad numDoctRelacionado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumDoctRelacionado() {
        return numDoctRelacionado;
    }

    /**
     * Define el valor de la propiedad numDoctRelacionado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumDoctRelacionado(JAXBElement<String> value) {
        this.numDoctRelacionado = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroPago.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroPago() {
        return numeroPago;
    }

    /**
     * Define el valor de la propiedad numeroPago.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroPago(JAXBElement<String> value) {
        this.numeroPago = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDoctRelacionado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoDoctRelacionado() {
        return tipoDoctRelacionado;
    }

    /**
     * Define el valor de la propiedad tipoDoctRelacionado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoDoctRelacionado(JAXBElement<String> value) {
        this.tipoDoctRelacionado = value;
    }

}
