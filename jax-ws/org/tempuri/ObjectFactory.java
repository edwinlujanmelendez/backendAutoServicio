
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.feservice.DocumentCDR;
import org.datacontract.schemas._2004._07.feservice.DocumentoBaja;
import org.datacontract.schemas._2004._07.feservice.Nota;
import org.datacontract.schemas._2004._07.feservice.Result;
import org.datacontract.schemas._2004._07.feservice.Venta;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SetEnviarComprobantesSunatRucEmpresa_QNAME = new QName("http://tempuri.org/", "rucEmpresa");
    private final static QName _SetEnviarComprobantesSunatToken_QNAME = new QName("http://tempuri.org/", "token");
    private final static QName _BuscarDetalleComprobanteTipoComprobante_QNAME = new QName("http://tempuri.org/", "tipoComprobante");
    private final static QName _BuscarDetalleComprobanteCorrelativo_QNAME = new QName("http://tempuri.org/", "correlativo");
    private final static QName _BuscarDetalleComprobanteSerie_QNAME = new QName("http://tempuri.org/", "serie");
    private final static QName _SetBajasFechaEmisionComprobantes_QNAME = new QName("http://tempuri.org/", "fechaEmisionComprobantes");
    private final static QName _SetResumenesResponseSetResumenesResult_QNAME = new QName("http://tempuri.org/", "setResumenesResult");
    private final static QName _SetVentaResponseSetVentaResult_QNAME = new QName("http://tempuri.org/", "setVentaResult");
    private final static QName _SetNotaVentaVenta_QNAME = new QName("http://tempuri.org/", "venta");
    private final static QName _SetNotaVentaNota_QNAME = new QName("http://tempuri.org/", "nota");
    private final static QName _SetNotaVentaResponseSetNotaVentaResult_QNAME = new QName("http://tempuri.org/", "setNotaVentaResult");
    private final static QName _GetRepresentacionImpresaStrRucEmpresa_QNAME = new QName("http://tempuri.org/", "strRucEmpresa");
    private final static QName _SetBajasResponseSetBajasResult_QNAME = new QName("http://tempuri.org/", "setBajasResult");
    private final static QName _SetNotaResponseSetNotaResult_QNAME = new QName("http://tempuri.org/", "setNotaResult");
    private final static QName _GetRepresentacionImpresaResponseGetRepresentacionImpresaResult_QNAME = new QName("http://tempuri.org/", "getRepresentacionImpresaResult");
    private final static QName _SetConsultarCDRDocumentCDR_QNAME = new QName("http://tempuri.org/", "documentCDR");
    private final static QName _SetBajaDocumentoResponseSetBajaDocumentoResult_QNAME = new QName("http://tempuri.org/", "setBajaDocumentoResult");
    private final static QName _SetEnviarComprobantesSunatResponseSetEnviarComprobantesSunatResult_QNAME = new QName("http://tempuri.org/", "setEnviarComprobantesSunatResult");
    private final static QName _SetNotaNotaCreditoDebito_QNAME = new QName("http://tempuri.org/", "notaCreditoDebito");
    private final static QName _BuscarDetalleComprobanteResponseBuscarDetalleComprobanteResult_QNAME = new QName("http://tempuri.org/", "buscarDetalleComprobanteResult");
    private final static QName _SetConsultarCDRResponseSetConsultarCDRResult_QNAME = new QName("http://tempuri.org/", "setConsultarCDRResult");
    private final static QName _SetUpdateStatusCDRResponseSetUpdateStatusCDRResult_QNAME = new QName("http://tempuri.org/", "setUpdateStatusCDRResult");
    private final static QName _SetBajaDocumentoDocumentoBaja_QNAME = new QName("http://tempuri.org/", "documentoBaja");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetEnviarComprobantesSunat }
     * 
     */
    public SetEnviarComprobantesSunat createSetEnviarComprobantesSunat() {
        return new SetEnviarComprobantesSunat();
    }

    /**
     * Create an instance of {@link SetBajas }
     * 
     */
    public SetBajas createSetBajas() {
        return new SetBajas();
    }

    /**
     * Create an instance of {@link SetEnviarComprobantesSunatResponse }
     * 
     */
    public SetEnviarComprobantesSunatResponse createSetEnviarComprobantesSunatResponse() {
        return new SetEnviarComprobantesSunatResponse();
    }

    /**
     * Create an instance of {@link SetUpdatePdfResponse }
     * 
     */
    public SetUpdatePdfResponse createSetUpdatePdfResponse() {
        return new SetUpdatePdfResponse();
    }

    /**
     * Create an instance of {@link BuscarDetalleComprobante }
     * 
     */
    public BuscarDetalleComprobante createBuscarDetalleComprobante() {
        return new BuscarDetalleComprobante();
    }

    /**
     * Create an instance of {@link SetBajaDocumentoResponse }
     * 
     */
    public SetBajaDocumentoResponse createSetBajaDocumentoResponse() {
        return new SetBajaDocumentoResponse();
    }

    /**
     * Create an instance of {@link SetVenta }
     * 
     */
    public SetVenta createSetVenta() {
        return new SetVenta();
    }

    /**
     * Create an instance of {@link SetNotaResponse }
     * 
     */
    public SetNotaResponse createSetNotaResponse() {
        return new SetNotaResponse();
    }

    /**
     * Create an instance of {@link GetRepresentacionImpresaResponse }
     * 
     */
    public GetRepresentacionImpresaResponse createGetRepresentacionImpresaResponse() {
        return new GetRepresentacionImpresaResponse();
    }

    /**
     * Create an instance of {@link SetNotaVenta }
     * 
     */
    public SetNotaVenta createSetNotaVenta() {
        return new SetNotaVenta();
    }

    /**
     * Create an instance of {@link BuscarDetalleComprobanteResponse }
     * 
     */
    public BuscarDetalleComprobanteResponse createBuscarDetalleComprobanteResponse() {
        return new BuscarDetalleComprobanteResponse();
    }

    /**
     * Create an instance of {@link SetUpdatePdf }
     * 
     */
    public SetUpdatePdf createSetUpdatePdf() {
        return new SetUpdatePdf();
    }

    /**
     * Create an instance of {@link SetVentaResponse }
     * 
     */
    public SetVentaResponse createSetVentaResponse() {
        return new SetVentaResponse();
    }

    /**
     * Create an instance of {@link SetResumenes }
     * 
     */
    public SetResumenes createSetResumenes() {
        return new SetResumenes();
    }

    /**
     * Create an instance of {@link SetResumenesResponse }
     * 
     */
    public SetResumenesResponse createSetResumenesResponse() {
        return new SetResumenesResponse();
    }

    /**
     * Create an instance of {@link SetUpdateStatusCDR }
     * 
     */
    public SetUpdateStatusCDR createSetUpdateStatusCDR() {
        return new SetUpdateStatusCDR();
    }

    /**
     * Create an instance of {@link GetRepresentacionImpresa }
     * 
     */
    public GetRepresentacionImpresa createGetRepresentacionImpresa() {
        return new GetRepresentacionImpresa();
    }

    /**
     * Create an instance of {@link SetConsultarCDR }
     * 
     */
    public SetConsultarCDR createSetConsultarCDR() {
        return new SetConsultarCDR();
    }

    /**
     * Create an instance of {@link SetNota }
     * 
     */
    public SetNota createSetNota() {
        return new SetNota();
    }

    /**
     * Create an instance of {@link SetUpdateStatusCDRResponse }
     * 
     */
    public SetUpdateStatusCDRResponse createSetUpdateStatusCDRResponse() {
        return new SetUpdateStatusCDRResponse();
    }

    /**
     * Create an instance of {@link SetBajasResponse }
     * 
     */
    public SetBajasResponse createSetBajasResponse() {
        return new SetBajasResponse();
    }

    /**
     * Create an instance of {@link SetBajaDocumento }
     * 
     */
    public SetBajaDocumento createSetBajaDocumento() {
        return new SetBajaDocumento();
    }

    /**
     * Create an instance of {@link SetNotaVentaResponse }
     * 
     */
    public SetNotaVentaResponse createSetNotaVentaResponse() {
        return new SetNotaVentaResponse();
    }

    /**
     * Create an instance of {@link SetConsultarCDRResponse }
     * 
     */
    public SetConsultarCDRResponse createSetConsultarCDRResponse() {
        return new SetConsultarCDRResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rucEmpresa", scope = SetEnviarComprobantesSunat.class)
    public JAXBElement<String> createSetEnviarComprobantesSunatRucEmpresa(String value) {
        return new JAXBElement<String>(_SetEnviarComprobantesSunatRucEmpresa_QNAME, String.class, SetEnviarComprobantesSunat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "token", scope = SetEnviarComprobantesSunat.class)
    public JAXBElement<String> createSetEnviarComprobantesSunatToken(String value) {
        return new JAXBElement<String>(_SetEnviarComprobantesSunatToken_QNAME, String.class, SetEnviarComprobantesSunat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rucEmpresa", scope = BuscarDetalleComprobante.class)
    public JAXBElement<String> createBuscarDetalleComprobanteRucEmpresa(String value) {
        return new JAXBElement<String>(_SetEnviarComprobantesSunatRucEmpresa_QNAME, String.class, BuscarDetalleComprobante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tipoComprobante", scope = BuscarDetalleComprobante.class)
    public JAXBElement<String> createBuscarDetalleComprobanteTipoComprobante(String value) {
        return new JAXBElement<String>(_BuscarDetalleComprobanteTipoComprobante_QNAME, String.class, BuscarDetalleComprobante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "correlativo", scope = BuscarDetalleComprobante.class)
    public JAXBElement<String> createBuscarDetalleComprobanteCorrelativo(String value) {
        return new JAXBElement<String>(_BuscarDetalleComprobanteCorrelativo_QNAME, String.class, BuscarDetalleComprobante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "serie", scope = BuscarDetalleComprobante.class)
    public JAXBElement<String> createBuscarDetalleComprobanteSerie(String value) {
        return new JAXBElement<String>(_BuscarDetalleComprobanteSerie_QNAME, String.class, BuscarDetalleComprobante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "token", scope = BuscarDetalleComprobante.class)
    public JAXBElement<String> createBuscarDetalleComprobanteToken(String value) {
        return new JAXBElement<String>(_SetEnviarComprobantesSunatToken_QNAME, String.class, BuscarDetalleComprobante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fechaEmisionComprobantes", scope = SetBajas.class)
    public JAXBElement<String> createSetBajasFechaEmisionComprobantes(String value) {
        return new JAXBElement<String>(_SetBajasFechaEmisionComprobantes_QNAME, String.class, SetBajas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rucEmpresa", scope = SetBajas.class)
    public JAXBElement<String> createSetBajasRucEmpresa(String value) {
        return new JAXBElement<String>(_SetEnviarComprobantesSunatRucEmpresa_QNAME, String.class, SetBajas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "token", scope = SetBajas.class)
    public JAXBElement<String> createSetBajasToken(String value) {
        return new JAXBElement<String>(_SetEnviarComprobantesSunatToken_QNAME, String.class, SetBajas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "setResumenesResult", scope = SetResumenesResponse.class)
    public JAXBElement<Result> createSetResumenesResponseSetResumenesResult(Result value) {
        return new JAXBElement<Result>(_SetResumenesResponseSetResumenesResult_QNAME, Result.class, SetResumenesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "setVentaResult", scope = SetVentaResponse.class)
    public JAXBElement<Result> createSetVentaResponseSetVentaResult(Result value) {
        return new JAXBElement<Result>(_SetVentaResponseSetVentaResult_QNAME, Result.class, SetVentaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Venta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "venta", scope = SetNotaVenta.class)
    public JAXBElement<Venta> createSetNotaVentaVenta(Venta value) {
        return new JAXBElement<Venta>(_SetNotaVentaVenta_QNAME, Venta.class, SetNotaVenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "token", scope = SetNotaVenta.class)
    public JAXBElement<String> createSetNotaVentaToken(String value) {
        return new JAXBElement<String>(_SetEnviarComprobantesSunatToken_QNAME, String.class, SetNotaVenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Nota }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nota", scope = SetNotaVenta.class)
    public JAXBElement<Nota> createSetNotaVentaNota(Nota value) {
        return new JAXBElement<Nota>(_SetNotaVentaNota_QNAME, Nota.class, SetNotaVenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "setNotaVentaResult", scope = SetNotaVentaResponse.class)
    public JAXBElement<Result> createSetNotaVentaResponseSetNotaVentaResult(Result value) {
        return new JAXBElement<Result>(_SetNotaVentaResponseSetNotaVentaResult_QNAME, Result.class, SetNotaVentaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strRucEmpresa", scope = GetRepresentacionImpresa.class)
    public JAXBElement<String> createGetRepresentacionImpresaStrRucEmpresa(String value) {
        return new JAXBElement<String>(_GetRepresentacionImpresaStrRucEmpresa_QNAME, String.class, GetRepresentacionImpresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tipoComprobante", scope = GetRepresentacionImpresa.class)
    public JAXBElement<String> createGetRepresentacionImpresaTipoComprobante(String value) {
        return new JAXBElement<String>(_BuscarDetalleComprobanteTipoComprobante_QNAME, String.class, GetRepresentacionImpresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "correlativo", scope = GetRepresentacionImpresa.class)
    public JAXBElement<String> createGetRepresentacionImpresaCorrelativo(String value) {
        return new JAXBElement<String>(_BuscarDetalleComprobanteCorrelativo_QNAME, String.class, GetRepresentacionImpresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "serie", scope = GetRepresentacionImpresa.class)
    public JAXBElement<String> createGetRepresentacionImpresaSerie(String value) {
        return new JAXBElement<String>(_BuscarDetalleComprobanteSerie_QNAME, String.class, GetRepresentacionImpresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "token", scope = GetRepresentacionImpresa.class)
    public JAXBElement<String> createGetRepresentacionImpresaToken(String value) {
        return new JAXBElement<String>(_SetEnviarComprobantesSunatToken_QNAME, String.class, GetRepresentacionImpresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "setBajasResult", scope = SetBajasResponse.class)
    public JAXBElement<Result> createSetBajasResponseSetBajasResult(Result value) {
        return new JAXBElement<Result>(_SetBajasResponseSetBajasResult_QNAME, Result.class, SetBajasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "setNotaResult", scope = SetNotaResponse.class)
    public JAXBElement<Result> createSetNotaResponseSetNotaResult(Result value) {
        return new JAXBElement<Result>(_SetNotaResponseSetNotaResult_QNAME, Result.class, SetNotaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rucEmpresa", scope = SetUpdateStatusCDR.class)
    public JAXBElement<String> createSetUpdateStatusCDRRucEmpresa(String value) {
        return new JAXBElement<String>(_SetEnviarComprobantesSunatRucEmpresa_QNAME, String.class, SetUpdateStatusCDR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "token", scope = SetUpdateStatusCDR.class)
    public JAXBElement<String> createSetUpdateStatusCDRToken(String value) {
        return new JAXBElement<String>(_SetEnviarComprobantesSunatToken_QNAME, String.class, SetUpdateStatusCDR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fechaEmisionComprobantes", scope = SetResumenes.class)
    public JAXBElement<String> createSetResumenesFechaEmisionComprobantes(String value) {
        return new JAXBElement<String>(_SetBajasFechaEmisionComprobantes_QNAME, String.class, SetResumenes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rucEmpresa", scope = SetResumenes.class)
    public JAXBElement<String> createSetResumenesRucEmpresa(String value) {
        return new JAXBElement<String>(_SetEnviarComprobantesSunatRucEmpresa_QNAME, String.class, SetResumenes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "token", scope = SetResumenes.class)
    public JAXBElement<String> createSetResumenesToken(String value) {
        return new JAXBElement<String>(_SetEnviarComprobantesSunatToken_QNAME, String.class, SetResumenes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getRepresentacionImpresaResult", scope = GetRepresentacionImpresaResponse.class)
    public JAXBElement<Result> createGetRepresentacionImpresaResponseGetRepresentacionImpresaResult(Result value) {
        return new JAXBElement<Result>(_GetRepresentacionImpresaResponseGetRepresentacionImpresaResult_QNAME, Result.class, GetRepresentacionImpresaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentCDR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "documentCDR", scope = SetConsultarCDR.class)
    public JAXBElement<DocumentCDR> createSetConsultarCDRDocumentCDR(DocumentCDR value) {
        return new JAXBElement<DocumentCDR>(_SetConsultarCDRDocumentCDR_QNAME, DocumentCDR.class, SetConsultarCDR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "token", scope = SetConsultarCDR.class)
    public JAXBElement<String> createSetConsultarCDRToken(String value) {
        return new JAXBElement<String>(_SetEnviarComprobantesSunatToken_QNAME, String.class, SetConsultarCDR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Venta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "venta", scope = SetVenta.class)
    public JAXBElement<Venta> createSetVentaVenta(Venta value) {
        return new JAXBElement<Venta>(_SetNotaVentaVenta_QNAME, Venta.class, SetVenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "token", scope = SetVenta.class)
    public JAXBElement<String> createSetVentaToken(String value) {
        return new JAXBElement<String>(_SetEnviarComprobantesSunatToken_QNAME, String.class, SetVenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "setBajaDocumentoResult", scope = SetBajaDocumentoResponse.class)
    public JAXBElement<Result> createSetBajaDocumentoResponseSetBajaDocumentoResult(Result value) {
        return new JAXBElement<Result>(_SetBajaDocumentoResponseSetBajaDocumentoResult_QNAME, Result.class, SetBajaDocumentoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "setEnviarComprobantesSunatResult", scope = SetEnviarComprobantesSunatResponse.class)
    public JAXBElement<Result> createSetEnviarComprobantesSunatResponseSetEnviarComprobantesSunatResult(Result value) {
        return new JAXBElement<Result>(_SetEnviarComprobantesSunatResponseSetEnviarComprobantesSunatResult_QNAME, Result.class, SetEnviarComprobantesSunatResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "token", scope = SetNota.class)
    public JAXBElement<String> createSetNotaToken(String value) {
        return new JAXBElement<String>(_SetEnviarComprobantesSunatToken_QNAME, String.class, SetNota.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Nota }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "notaCreditoDebito", scope = SetNota.class)
    public JAXBElement<Nota> createSetNotaNotaCreditoDebito(Nota value) {
        return new JAXBElement<Nota>(_SetNotaNotaCreditoDebito_QNAME, Nota.class, SetNota.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "buscarDetalleComprobanteResult", scope = BuscarDetalleComprobanteResponse.class)
    public JAXBElement<Result> createBuscarDetalleComprobanteResponseBuscarDetalleComprobanteResult(Result value) {
        return new JAXBElement<Result>(_BuscarDetalleComprobanteResponseBuscarDetalleComprobanteResult_QNAME, Result.class, BuscarDetalleComprobanteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "setConsultarCDRResult", scope = SetConsultarCDRResponse.class)
    public JAXBElement<Result> createSetConsultarCDRResponseSetConsultarCDRResult(Result value) {
        return new JAXBElement<Result>(_SetConsultarCDRResponseSetConsultarCDRResult_QNAME, Result.class, SetConsultarCDRResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "setUpdateStatusCDRResult", scope = SetUpdateStatusCDRResponse.class)
    public JAXBElement<Result> createSetUpdateStatusCDRResponseSetUpdateStatusCDRResult(Result value) {
        return new JAXBElement<Result>(_SetUpdateStatusCDRResponseSetUpdateStatusCDRResult_QNAME, Result.class, SetUpdateStatusCDRResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentoBaja }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "documentoBaja", scope = SetBajaDocumento.class)
    public JAXBElement<DocumentoBaja> createSetBajaDocumentoDocumentoBaja(DocumentoBaja value) {
        return new JAXBElement<DocumentoBaja>(_SetBajaDocumentoDocumentoBaja_QNAME, DocumentoBaja.class, SetBajaDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "token", scope = SetBajaDocumento.class)
    public JAXBElement<String> createSetBajaDocumentoToken(String value) {
        return new JAXBElement<String>(_SetEnviarComprobantesSunatToken_QNAME, String.class, SetBajaDocumento.class, value);
    }

}
