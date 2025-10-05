
package org.datacontract.schemas._2004._07.feservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DetalleVenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetalleVenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bultos" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="codigoAfectacionIgv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoTipoPrecio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="igv" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="porcentajeIgv" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tarifa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="unidadMedida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorUnitario" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalleVenta", propOrder = {
    "bultos",
    "cantidad",
    "codigoAfectacionIgv",
    "codigoProducto",
    "codigoTipoPrecio",
    "descripcion",
    "igv",
    "item",
    "porcentajeIgv",
    "tarifa",
    "total",
    "unidadMedida",
    "valorUnitario"
})
public class DetalleVenta {

    protected Integer bultos;
    protected Double cantidad;
    @XmlElementRef(name = "codigoAfectacionIgv", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoAfectacionIgv;
    @XmlElementRef(name = "codigoProducto", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoProducto;
    @XmlElementRef(name = "codigoTipoPrecio", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoTipoPrecio;
    @XmlElementRef(name = "descripcion", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcion;
    protected Double igv;
    protected Integer item;
    protected Double porcentajeIgv;
    protected Double tarifa;
    protected Double total;
    @XmlElementRef(name = "unidadMedida", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unidadMedida;
    protected Double valorUnitario;

    /**
     * Obtiene el valor de la propiedad bultos.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBultos() {
        return bultos;
    }

    /**
     * Define el valor de la propiedad bultos.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBultos(Integer value) {
        this.bultos = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCantidad(Double value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoAfectacionIgv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoAfectacionIgv() {
        return codigoAfectacionIgv;
    }

    /**
     * Define el valor de la propiedad codigoAfectacionIgv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoAfectacionIgv(JAXBElement<String> value) {
        this.codigoAfectacionIgv = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProducto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * Define el valor de la propiedad codigoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoProducto(JAXBElement<String> value) {
        this.codigoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoPrecio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoTipoPrecio() {
        return codigoTipoPrecio;
    }

    /**
     * Define el valor de la propiedad codigoTipoPrecio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoTipoPrecio(JAXBElement<String> value) {
        this.codigoTipoPrecio = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcion(JAXBElement<String> value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad igv.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIgv() {
        return igv;
    }

    /**
     * Define el valor de la propiedad igv.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIgv(Double value) {
        this.igv = value;
    }

    /**
     * Obtiene el valor de la propiedad item.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItem() {
        return item;
    }

    /**
     * Define el valor de la propiedad item.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItem(Integer value) {
        this.item = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeIgv.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPorcentajeIgv() {
        return porcentajeIgv;
    }

    /**
     * Define el valor de la propiedad porcentajeIgv.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPorcentajeIgv(Double value) {
        this.porcentajeIgv = value;
    }

    /**
     * Obtiene el valor de la propiedad tarifa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTarifa() {
        return tarifa;
    }

    /**
     * Define el valor de la propiedad tarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTarifa(Double value) {
        this.tarifa = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotal(Double value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadMedida.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnidadMedida() {
        return unidadMedida;
    }

    /**
     * Define el valor de la propiedad unidadMedida.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnidadMedida(JAXBElement<String> value) {
        this.unidadMedida = value;
    }

    /**
     * Obtiene el valor de la propiedad valorUnitario.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorUnitario() {
        return valorUnitario;
    }

    /**
     * Define el valor de la propiedad valorUnitario.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorUnitario(Double value) {
        this.valorUnitario = value;
    }

}
