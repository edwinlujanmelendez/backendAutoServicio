
package org.datacontract.schemas._2004._07.feservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Venta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Venta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsCreatePdf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="agenciaID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="centroCosto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cliente" type="{http://schemas.datacontract.org/2004/07/FEService.Input}Cliente" minOccurs="0"/>
 *         &lt;element name="dImporte" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="dTasa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="direccionEmbarque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentoReferencia" type="{http://schemas.datacontract.org/2004/07/FEService.Input}DocumentoReferencia" minOccurs="0"/>
 *         &lt;element name="dtipoventa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="glosaRetencion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="igv" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="informacionAdicional" type="{http://schemas.datacontract.org/2004/07/FEService.Input}InformacionAdicional" minOccurs="0"/>
 *         &lt;element name="isSOUE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="listDetalleCuota" type="{http://schemas.datacontract.org/2004/07/FEService.Input}ArrayOfDetalleCuota" minOccurs="0"/>
 *         &lt;element name="listDetalleVenta" type="{http://schemas.datacontract.org/2004/07/FEService.Input}ArrayOfDetalleVenta" minOccurs="0"/>
 *         &lt;element name="montoSubTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montoTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montoTotalDescuento" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numeroCorrelativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroPrefactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroSerie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentduedate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rucEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoCambio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tipoComprobanteID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoMonedaSoles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tipoVenta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "Venta", propOrder = {
    "isCreatePdf",
    "agenciaID",
    "centroCosto",
    "cliente",
    "dImporte",
    "dTasa",
    "direccionEmbarque",
    "documentoReferencia",
    "dtipoventa",
    "fechaEmision",
    "glosaRetencion",
    "horaEmision",
    "igv",
    "informacionAdicional",
    "isSOUE",
    "listDetalleCuota",
    "listDetalleVenta",
    "montoSubTotal",
    "montoTotal",
    "montoTotalDescuento",
    "numeroCorrelativo",
    "numeroPrefactura",
    "numeroSerie",
    "observaciones",
    "paymentduedate",
    "producto",
    "rucEmpresa",
    "tipoCambio",
    "tipoComprobanteID",
    "tipoMonedaSoles",
    "tipoVenta",
    "usuarioID",
    "usuarioInsercion",
    "usuarioModificacion"
})
public class Venta {

    @XmlElement(name = "IsCreatePdf")
    protected Boolean isCreatePdf;
    protected Long agenciaID;
    @XmlElementRef(name = "centroCosto", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> centroCosto;
    @XmlElementRef(name = "cliente", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<Cliente> cliente;
    protected Double dImporte;
    protected Double dTasa;
    @XmlElementRef(name = "direccionEmbarque", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> direccionEmbarque;
    @XmlElementRef(name = "documentoReferencia", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<DocumentoReferencia> documentoReferencia;
    @XmlElementRef(name = "dtipoventa", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dtipoventa;
    @XmlElementRef(name = "fechaEmision", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaEmision;
    @XmlElementRef(name = "glosaRetencion", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> glosaRetencion;
    @XmlElementRef(name = "horaEmision", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> horaEmision;
    protected Double igv;
    @XmlElementRef(name = "informacionAdicional", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<InformacionAdicional> informacionAdicional;
    protected Boolean isSOUE;
    @XmlElementRef(name = "listDetalleCuota", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetalleCuota> listDetalleCuota;
    @XmlElementRef(name = "listDetalleVenta", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetalleVenta> listDetalleVenta;
    protected Double montoSubTotal;
    protected Double montoTotal;
    protected Double montoTotalDescuento;
    @XmlElementRef(name = "numeroCorrelativo", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroCorrelativo;
    @XmlElementRef(name = "numeroPrefactura", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroPrefactura;
    @XmlElementRef(name = "numeroSerie", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroSerie;
    @XmlElementRef(name = "observaciones", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observaciones;
    @XmlElementRef(name = "paymentduedate", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentduedate;
    @XmlElementRef(name = "producto", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> producto;
    @XmlElementRef(name = "rucEmpresa", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rucEmpresa;
    protected Double tipoCambio;
    @XmlElementRef(name = "tipoComprobanteID", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoComprobanteID;
    protected Boolean tipoMonedaSoles;
    protected Integer tipoVenta;
    protected Long usuarioID;
    @XmlElementRef(name = "usuarioInsercion", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuarioInsercion;
    @XmlElementRef(name = "usuarioModificacion", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuarioModificacion;

    /**
     * Obtiene el valor de la propiedad isCreatePdf.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCreatePdf() {
        return isCreatePdf;
    }

    /**
     * Define el valor de la propiedad isCreatePdf.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCreatePdf(Boolean value) {
        this.isCreatePdf = value;
    }

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
     * Obtiene el valor de la propiedad centroCosto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCentroCosto() {
        return centroCosto;
    }

    /**
     * Define el valor de la propiedad centroCosto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCentroCosto(JAXBElement<String> value) {
        this.centroCosto = value;
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
     * Obtiene el valor de la propiedad dImporte.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDImporte() {
        return dImporte;
    }

    /**
     * Define el valor de la propiedad dImporte.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDImporte(Double value) {
        this.dImporte = value;
    }

    /**
     * Obtiene el valor de la propiedad dTasa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDTasa() {
        return dTasa;
    }

    /**
     * Define el valor de la propiedad dTasa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDTasa(Double value) {
        this.dTasa = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionEmbarque.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDireccionEmbarque() {
        return direccionEmbarque;
    }

    /**
     * Define el valor de la propiedad direccionEmbarque.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDireccionEmbarque(JAXBElement<String> value) {
        this.direccionEmbarque = value;
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
     * Obtiene el valor de la propiedad dtipoventa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDtipoventa() {
        return dtipoventa;
    }

    /**
     * Define el valor de la propiedad dtipoventa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDtipoventa(JAXBElement<String> value) {
        this.dtipoventa = value;
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
     * Obtiene el valor de la propiedad glosaRetencion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlosaRetencion() {
        return glosaRetencion;
    }

    /**
     * Define el valor de la propiedad glosaRetencion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlosaRetencion(JAXBElement<String> value) {
        this.glosaRetencion = value;
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
     * Obtiene el valor de la propiedad isSOUE.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSOUE() {
        return isSOUE;
    }

    /**
     * Define el valor de la propiedad isSOUE.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSOUE(Boolean value) {
        this.isSOUE = value;
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
     * Obtiene el valor de la propiedad montoSubTotal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoSubTotal() {
        return montoSubTotal;
    }

    /**
     * Define el valor de la propiedad montoSubTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoSubTotal(Double value) {
        this.montoSubTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoTotal() {
        return montoTotal;
    }

    /**
     * Define el valor de la propiedad montoTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoTotal(Double value) {
        this.montoTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotalDescuento.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoTotalDescuento() {
        return montoTotalDescuento;
    }

    /**
     * Define el valor de la propiedad montoTotalDescuento.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoTotalDescuento(Double value) {
        this.montoTotalDescuento = value;
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
     * Obtiene el valor de la propiedad numeroPrefactura.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroPrefactura() {
        return numeroPrefactura;
    }

    /**
     * Define el valor de la propiedad numeroPrefactura.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroPrefactura(JAXBElement<String> value) {
        this.numeroPrefactura = value;
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
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObservaciones(JAXBElement<String> value) {
        this.observaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentduedate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentduedate() {
        return paymentduedate;
    }

    /**
     * Define el valor de la propiedad paymentduedate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentduedate(JAXBElement<String> value) {
        this.paymentduedate = value;
    }

    /**
     * Obtiene el valor de la propiedad producto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProducto() {
        return producto;
    }

    /**
     * Define el valor de la propiedad producto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProducto(JAXBElement<String> value) {
        this.producto = value;
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
