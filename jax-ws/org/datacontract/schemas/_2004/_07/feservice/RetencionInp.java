
package org.datacontract.schemas._2004._07.feservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RetencionInp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RetencionInp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FechaEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImporteTotalRetenido" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ImporteTotalRetenidoEnLetras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MontoTotalPagado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="NumeroCorrelativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RazonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ruc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoCambio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detalleRetencion" type="{http://schemas.datacontract.org/2004/07/FEService.Input}ArrayOfRetencionDetalleInp" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registroRetencion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tasaRetencion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetencionInp", propOrder = {
    "fechaEmision",
    "importeTotalRetenido",
    "importeTotalRetenidoEnLetras",
    "montoTotalPagado",
    "numeroCorrelativo",
    "razonSocial",
    "ruc",
    "serie",
    "tipoCambio",
    "correo",
    "detalleRetencion",
    "id",
    "registroRetencion",
    "tasaRetencion"
})
public class RetencionInp {

    @XmlElementRef(name = "FechaEmision", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaEmision;
    @XmlElement(name = "ImporteTotalRetenido")
    protected Double importeTotalRetenido;
    @XmlElementRef(name = "ImporteTotalRetenidoEnLetras", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importeTotalRetenidoEnLetras;
    @XmlElement(name = "MontoTotalPagado")
    protected Double montoTotalPagado;
    @XmlElementRef(name = "NumeroCorrelativo", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroCorrelativo;
    @XmlElementRef(name = "RazonSocial", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> razonSocial;
    @XmlElementRef(name = "Ruc", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ruc;
    @XmlElementRef(name = "Serie", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serie;
    @XmlElement(name = "TipoCambio")
    protected Double tipoCambio;
    @XmlElementRef(name = "correo", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> correo;
    @XmlElementRef(name = "detalleRetencion", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRetencionDetalleInp> detalleRetencion;
    @XmlElementRef(name = "id", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;
    @XmlElementRef(name = "registroRetencion", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registroRetencion;
    @XmlElementRef(name = "tasaRetencion", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tasaRetencion;

    /**
     * Obtiene el valor de la propiedad fechaEmision.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Define el valor de la propiedad fechaEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaEmision(JAXBElement<String> value) {
        this.fechaEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTotalRetenido.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImporteTotalRetenido() {
        return importeTotalRetenido;
    }

    /**
     * Define el valor de la propiedad importeTotalRetenido.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImporteTotalRetenido(Double value) {
        this.importeTotalRetenido = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTotalRetenidoEnLetras.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImporteTotalRetenidoEnLetras() {
        return importeTotalRetenidoEnLetras;
    }

    /**
     * Define el valor de la propiedad importeTotalRetenidoEnLetras.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImporteTotalRetenidoEnLetras(JAXBElement<String> value) {
        this.importeTotalRetenidoEnLetras = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotalPagado.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoTotalPagado() {
        return montoTotalPagado;
    }

    /**
     * Define el valor de la propiedad montoTotalPagado.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoTotalPagado(Double value) {
        this.montoTotalPagado = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCorrelativo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroCorrelativo() {
        return numeroCorrelativo;
    }

    /**
     * Define el valor de la propiedad numeroCorrelativo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroCorrelativo(JAXBElement<String> value) {
        this.numeroCorrelativo = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRazonSocial() {
        return razonSocial;
    }

    /**
     * Define el valor de la propiedad razonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRazonSocial(JAXBElement<String> value) {
        this.razonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad ruc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRuc() {
        return ruc;
    }

    /**
     * Define el valor de la propiedad ruc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRuc(JAXBElement<String> value) {
        this.ruc = value;
    }

    /**
     * Obtiene el valor de la propiedad serie.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSerie() {
        return serie;
    }

    /**
     * Define el valor de la propiedad serie.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSerie(JAXBElement<String> value) {
        this.serie = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCambio.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTipoCambio() {
        return tipoCambio;
    }

    /**
     * Define el valor de la propiedad tipoCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTipoCambio(Double value) {
        this.tipoCambio = value;
    }

    /**
     * Obtiene el valor de la propiedad correo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorreo() {
        return correo;
    }

    /**
     * Define el valor de la propiedad correo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorreo(JAXBElement<String> value) {
        this.correo = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleRetencion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRetencionDetalleInp }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRetencionDetalleInp> getDetalleRetencion() {
        return detalleRetencion;
    }

    /**
     * Define el valor de la propiedad detalleRetencion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRetencionDetalleInp }{@code >}
     *     
     */
    public void setDetalleRetencion(JAXBElement<ArrayOfRetencionDetalleInp> value) {
        this.detalleRetencion = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad registroRetencion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistroRetencion() {
        return registroRetencion;
    }

    /**
     * Define el valor de la propiedad registroRetencion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistroRetencion(JAXBElement<String> value) {
        this.registroRetencion = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaRetencion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTasaRetencion() {
        return tasaRetencion;
    }

    /**
     * Define el valor de la propiedad tasaRetencion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTasaRetencion(JAXBElement<String> value) {
        this.tasaRetencion = value;
    }

}
