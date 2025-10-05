
package org.datacontract.schemas._2004._07.feservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Empresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Empresa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntCitySubdivisionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntCountryIdentificationCode_Peru" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntCountrySubentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntStreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntUbigeoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enterprise_Certificado_Apoderado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enterprise_Nombre_Comercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enterprise_Ose_EndpointName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enterprise_Razon_Social" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enterprise_Ruc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enterprise_Sunat_Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enterprise_Sunat_Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Empresa", propOrder = {
    "entCityName",
    "entCitySubdivisionName",
    "entCountryIdentificationCodePeru",
    "entCountrySubentity",
    "entDistrict",
    "entStreetName",
    "entUbigeoId",
    "enterpriseCertificadoApoderado",
    "enterpriseNombreComercial",
    "enterpriseOseEndpointName",
    "enterpriseRazonSocial",
    "enterpriseRuc",
    "enterpriseSunatPassword",
    "enterpriseSunatUsername"
})
public class Empresa {

    @XmlElementRef(name = "EntCityName", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entCityName;
    @XmlElementRef(name = "EntCitySubdivisionName", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entCitySubdivisionName;
    @XmlElementRef(name = "EntCountryIdentificationCode_Peru", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entCountryIdentificationCodePeru;
    @XmlElementRef(name = "EntCountrySubentity", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entCountrySubentity;
    @XmlElementRef(name = "EntDistrict", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entDistrict;
    @XmlElementRef(name = "EntStreetName", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entStreetName;
    @XmlElementRef(name = "EntUbigeoId", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entUbigeoId;
    @XmlElementRef(name = "Enterprise_Certificado_Apoderado", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enterpriseCertificadoApoderado;
    @XmlElementRef(name = "Enterprise_Nombre_Comercial", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enterpriseNombreComercial;
    @XmlElementRef(name = "Enterprise_Ose_EndpointName", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enterpriseOseEndpointName;
    @XmlElementRef(name = "Enterprise_Razon_Social", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enterpriseRazonSocial;
    @XmlElementRef(name = "Enterprise_Ruc", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enterpriseRuc;
    @XmlElementRef(name = "Enterprise_Sunat_Password", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enterpriseSunatPassword;
    @XmlElementRef(name = "Enterprise_Sunat_Username", namespace = "http://schemas.datacontract.org/2004/07/FEService.Input", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enterpriseSunatUsername;

    /**
     * Obtiene el valor de la propiedad entCityName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntCityName() {
        return entCityName;
    }

    /**
     * Define el valor de la propiedad entCityName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntCityName(JAXBElement<String> value) {
        this.entCityName = value;
    }

    /**
     * Obtiene el valor de la propiedad entCitySubdivisionName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntCitySubdivisionName() {
        return entCitySubdivisionName;
    }

    /**
     * Define el valor de la propiedad entCitySubdivisionName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntCitySubdivisionName(JAXBElement<String> value) {
        this.entCitySubdivisionName = value;
    }

    /**
     * Obtiene el valor de la propiedad entCountryIdentificationCodePeru.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntCountryIdentificationCodePeru() {
        return entCountryIdentificationCodePeru;
    }

    /**
     * Define el valor de la propiedad entCountryIdentificationCodePeru.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntCountryIdentificationCodePeru(JAXBElement<String> value) {
        this.entCountryIdentificationCodePeru = value;
    }

    /**
     * Obtiene el valor de la propiedad entCountrySubentity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntCountrySubentity() {
        return entCountrySubentity;
    }

    /**
     * Define el valor de la propiedad entCountrySubentity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntCountrySubentity(JAXBElement<String> value) {
        this.entCountrySubentity = value;
    }

    /**
     * Obtiene el valor de la propiedad entDistrict.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntDistrict() {
        return entDistrict;
    }

    /**
     * Define el valor de la propiedad entDistrict.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntDistrict(JAXBElement<String> value) {
        this.entDistrict = value;
    }

    /**
     * Obtiene el valor de la propiedad entStreetName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntStreetName() {
        return entStreetName;
    }

    /**
     * Define el valor de la propiedad entStreetName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntStreetName(JAXBElement<String> value) {
        this.entStreetName = value;
    }

    /**
     * Obtiene el valor de la propiedad entUbigeoId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntUbigeoId() {
        return entUbigeoId;
    }

    /**
     * Define el valor de la propiedad entUbigeoId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntUbigeoId(JAXBElement<String> value) {
        this.entUbigeoId = value;
    }

    /**
     * Obtiene el valor de la propiedad enterpriseCertificadoApoderado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnterpriseCertificadoApoderado() {
        return enterpriseCertificadoApoderado;
    }

    /**
     * Define el valor de la propiedad enterpriseCertificadoApoderado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnterpriseCertificadoApoderado(JAXBElement<String> value) {
        this.enterpriseCertificadoApoderado = value;
    }

    /**
     * Obtiene el valor de la propiedad enterpriseNombreComercial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnterpriseNombreComercial() {
        return enterpriseNombreComercial;
    }

    /**
     * Define el valor de la propiedad enterpriseNombreComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnterpriseNombreComercial(JAXBElement<String> value) {
        this.enterpriseNombreComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad enterpriseOseEndpointName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnterpriseOseEndpointName() {
        return enterpriseOseEndpointName;
    }

    /**
     * Define el valor de la propiedad enterpriseOseEndpointName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnterpriseOseEndpointName(JAXBElement<String> value) {
        this.enterpriseOseEndpointName = value;
    }

    /**
     * Obtiene el valor de la propiedad enterpriseRazonSocial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnterpriseRazonSocial() {
        return enterpriseRazonSocial;
    }

    /**
     * Define el valor de la propiedad enterpriseRazonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnterpriseRazonSocial(JAXBElement<String> value) {
        this.enterpriseRazonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad enterpriseRuc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnterpriseRuc() {
        return enterpriseRuc;
    }

    /**
     * Define el valor de la propiedad enterpriseRuc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnterpriseRuc(JAXBElement<String> value) {
        this.enterpriseRuc = value;
    }

    /**
     * Obtiene el valor de la propiedad enterpriseSunatPassword.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnterpriseSunatPassword() {
        return enterpriseSunatPassword;
    }

    /**
     * Define el valor de la propiedad enterpriseSunatPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnterpriseSunatPassword(JAXBElement<String> value) {
        this.enterpriseSunatPassword = value;
    }

    /**
     * Obtiene el valor de la propiedad enterpriseSunatUsername.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnterpriseSunatUsername() {
        return enterpriseSunatUsername;
    }

    /**
     * Define el valor de la propiedad enterpriseSunatUsername.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnterpriseSunatUsername(JAXBElement<String> value) {
        this.enterpriseSunatUsername = value;
    }

}
