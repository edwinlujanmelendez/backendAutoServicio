
package org.datacontract.schemas._2004._07.feservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Nota complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Nota">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agenciaID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cliente" type="{http://schemas.datacontract.org/2004/07/FEService.Input}Cliente" minOccurs="0"/>
 *         &lt;element name="codigoTipoNota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionSustento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionTipoNota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentoReferencia" type="{http://schemas.datacontract.org/2004/07/FEService.Input}DocumentoReferencia" minOccurs="0"/>
 *         &lt;element name="fechaEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="igv" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="informacionAdicional" type="{http://schemas.datacontract.org/2004/07/FEService.Input}InformacionAdicional" minOccurs="0"/>
 *         &lt;element name="numeroCorrelativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroSerie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rucEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tipoComprobanteID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoMonedaSoles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tipoVenta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="usuarioID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="usuarioInsercion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuarioModificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nota", propOrder = {
    "agenciaID",
    "cliente",
    "codigoTipoNota",
    "descripcionSustento",
    "descripcionTipoNota",
    "documentoReferencia",
    "fechaEmision",
    "horaEmision",
    "igv",
    "informacionAdicional",
    "numeroCorrelativo",
    "numeroSerie",
    "rucEmpresa",
    "subtotal",
    "tipoComprobanteID",
    "tipoMonedaSoles",
    "tipoVenta",
    "total",
    "usuarioID",
    "usuarioInsercion",
    "usuarioModificacion"
})
public class Nota {

    protected Long agenciaID;
    @XmlElementRef(name = "cliente", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<Cliente> cliente;
    @XmlElementRef(name = "codigoTipoNota", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoTipoNota;
    @XmlElementRef(name = "descripcionSustento", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionSustento;
    @XmlElementRef(name = "descripcionTipoNota", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionTipoNota;
    @XmlElementRef(name = "documentoReferencia", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<DocumentoReferencia> documentoReferencia;
    @XmlElementRef(name = "fechaEmision", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaEmision;
    @XmlElementRef(name = "horaEmision", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> horaEmision;
    protected Double igv;
    @XmlElementRef(name = "informacionAdicional", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<InformacionAdicional> informacionAdicional;
    @XmlElementRef(name = "numeroCorrelativo", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroCorrelativo;
    @XmlElementRef(name = "numeroSerie", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroSerie;
    @XmlElementRef(name = "rucEmpresa", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rucEmpresa;
    protected Double subtotal;
    @XmlElementRef(name = "tipoComprobanteID", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoComprobanteID;
    protected Boolean tipoMonedaSoles;
    protected Integer tipoVenta;
    protected Double total;
    protected Long usuarioID;
    @XmlElementRef(name = "usuarioInsercion", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuarioInsercion;
    @XmlElementRef(name = "usuarioModificacion", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuarioModificacion;

    /**
     * Obtiene el valor de la propiedad agenciaID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAgenciaID() {
        return agenciaID;
    }

    /**
     * Define el valor de la propiedad agenciaID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAgenciaID(Long value) {
        this.agenciaID = value;
    }

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Cliente }{@code >}
     *     
     */
    public JAXBElement<Cliente> getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Cliente }{@code >}
     *     
     */
    public void setCliente(JAXBElement<Cliente> value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoNota.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoTipoNota() {
        return codigoTipoNota;
    }

    /**
     * Define el valor de la propiedad codigoTipoNota.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoTipoNota(JAXBElement<String> value) {
        this.codigoTipoNota = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionSustento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionSustento() {
        return descripcionSustento;
    }

    /**
     * Define el valor de la propiedad descripcionSustento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionSustento(JAXBElement<String> value) {
        this.descripcionSustento = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionTipoNota.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionTipoNota() {
        return descripcionTipoNota;
    }

    /**
     * Define el valor de la propiedad descripcionTipoNota.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionTipoNota(JAXBElement<String> value) {
        this.descripcionTipoNota = value;
    }

    /**
     * Obtiene el valor de la propiedad documentoReferencia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocumentoReferencia }{@code >}
     *     
     */
    public JAXBElement<DocumentoReferencia> getDocumentoReferencia() {
        return documentoReferencia;
    }

    /**
     * Define el valor de la propiedad documentoReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocumentoReferencia }{@code >}
     *     
     */
    public void setDocumentoReferencia(JAXBElement<DocumentoReferencia> value) {
        this.documentoReferencia = value;
    }

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
     * Obtiene el valor de la propiedad horaEmision.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHoraEmision() {
        return horaEmision;
    }

    /**
     * Define el valor de la propiedad horaEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHoraEmision(JAXBElement<String> value) {
        this.horaEmision = value;
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
     * Obtiene el valor de la propiedad informacionAdicional.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InformacionAdicional }{@code >}
     *     
     */
    public JAXBElement<InformacionAdicional> getInformacionAdicional() {
        return informacionAdicional;
    }

    /**
     * Define el valor de la propiedad informacionAdicional.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InformacionAdicional }{@code >}
     *     
     */
    public void setInformacionAdicional(JAXBElement<InformacionAdicional> value) {
        this.informacionAdicional = value;
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
     * Obtiene el valor de la propiedad numeroSerie.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroSerie() {
        return numeroSerie;
    }

    /**
     * Define el valor de la propiedad numeroSerie.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroSerie(JAXBElement<String> value) {
        this.numeroSerie = value;
    }

    /**
     * Obtiene el valor de la propiedad rucEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRucEmpresa() {
        return rucEmpresa;
    }

    /**
     * Define el valor de la propiedad rucEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRucEmpresa(JAXBElement<String> value) {
        this.rucEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad subtotal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSubtotal() {
        return subtotal;
    }

    /**
     * Define el valor de la propiedad subtotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSubtotal(Double value) {
        this.subtotal = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoComprobanteID.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoComprobanteID() {
        return tipoComprobanteID;
    }

    /**
     * Define el valor de la propiedad tipoComprobanteID.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoComprobanteID(JAXBElement<String> value) {
        this.tipoComprobanteID = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoMonedaSoles.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTipoMonedaSoles() {
        return tipoMonedaSoles;
    }

    /**
     * Define el valor de la propiedad tipoMonedaSoles.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTipoMonedaSoles(Boolean value) {
        this.tipoMonedaSoles = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoVenta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoVenta() {
        return tipoVenta;
    }

    /**
     * Define el valor de la propiedad tipoVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoVenta(Integer value) {
        this.tipoVenta = value;
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
     * Obtiene el valor de la propiedad usuarioID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUsuarioID() {
        return usuarioID;
    }

    /**
     * Define el valor de la propiedad usuarioID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUsuarioID(Long value) {
        this.usuarioID = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioInsercion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuarioInsercion() {
        return usuarioInsercion;
    }

    /**
     * Define el valor de la propiedad usuarioInsercion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuarioInsercion(JAXBElement<String> value) {
        this.usuarioInsercion = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioModificacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuarioModificacion() {
        return usuarioModificacion;
    }

    /**
     * Define el valor de la propiedad usuarioModificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuarioModificacion(JAXBElement<String> value) {
        this.usuarioModificacion = value;
    }

}
