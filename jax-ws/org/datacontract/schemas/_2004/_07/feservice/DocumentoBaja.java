
package org.datacontract.schemas._2004._07.feservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DocumentoBaja complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DocumentoBaja">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agenciaID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="descripcionMotivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCorrelativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroSerie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rucEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDocumentoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "DocumentoBaja", propOrder = {
    "agenciaID",
    "descripcionMotivo",
    "fechaEmision",
    "numeroCorrelativo",
    "numeroSerie",
    "rucEmpresa",
    "tipoDocumentoID",
    "usuarioID",
    "usuarioInsercion",
    "usuarioModificacion"
})
public class DocumentoBaja {

    protected Long agenciaID;
    @XmlElementRef(name = "descripcionMotivo", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionMotivo;
    @XmlElementRef(name = "fechaEmision", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaEmision;
    @XmlElementRef(name = "numeroCorrelativo", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroCorrelativo;
    @XmlElementRef(name = "numeroSerie", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroSerie;
    @XmlElementRef(name = "rucEmpresa", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rucEmpresa;
    @XmlElementRef(name = "tipoDocumentoID", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoDocumentoID;
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
     * Obtiene el valor de la propiedad descripcionMotivo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionMotivo() {
        return descripcionMotivo;
    }

    /**
     * Define el valor de la propiedad descripcionMotivo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionMotivo(JAXBElement<String> value) {
        this.descripcionMotivo = value;
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
     * Obtiene el valor de la propiedad tipoDocumentoID.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoDocumentoID() {
        return tipoDocumentoID;
    }

    /**
     * Define el valor de la propiedad tipoDocumentoID.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoDocumentoID(JAXBElement<String> value) {
        this.tipoDocumentoID = value;
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
