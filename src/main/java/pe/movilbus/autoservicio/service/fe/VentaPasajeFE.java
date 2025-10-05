package pe.movilbus.autoservicio.service.fe;

import java.util.Date;

import org.datacontract.schemas._2004._07.feservice.Result;

/**
 *
 * @author eneyra
 */
public class VentaPasajeFE implements java.io.Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    
    private String VENPAS_ID;
    private String ITINERARIO_ID;
    private String RUTA_ID;
    private String C_ORIGEN;
    private String C_DESTINO;
    private String CLIENTE_ID;
    private String DOCCLI;
    private String C_RAZSOC;
    private String C_DIRECCION;
    private String PASAJERO_ID;
    private String C_APEPAT;
    private String C_APEMAT;
    private String C_NOMBRE;
    private String TIPDOC_ID;
    private String TIPDOC;
    private String DOCPAX;
    private String C_FECNAC;
    private String FORPAG_ID;
    private String FORMAPAGO;
    private String SERVICIO_ID;
    private String SERVICIO;
    private String TIPCOM_ID;
    private String TIPOCOMPROBANTE;
    private String TIPMOV_ID;
    private String TIPOMOVIMIENTO;
    private String TIPFORPAG_ID;
    private String TIPOFORMAPAGO;
    private String TARCRE_ID;
    private String TARJETACREDITO;
    private String C_NUMBOLETO;
    private String N_NUMASIENTO;
    private String N_NUMPISO;
    private String FECPAR;
    private String C_HORPAR;
    private String FECLLE;
    private String C_HORLLE;
    private String N_TARIFA;
    private String N_RECARGO;
    private String N_DESCUENTO;    
    private String N_PENALIDAD;
    private String N_IMPPAG;
    private String N_ACUENTA;
    private String C_TIPTRA;
    private String FECLIQ;
    private String AGENCIA_ID;
    private String AGENCIA;
    private String USUARIO_ID;
    private String C_LOGIN;
    private String CANVEN_ID;
    private String CANALVENTA;
    private String PREALI_ID;
    private String ALIMENTACION;
    private String IDAGELLEGADA;
    private String PARTIDA;
    private String IDAGEPARTIDA;
    private String AGDESTINO;
    private String C_NUMCONTROL;
    private String C_ESTREG;
    private String OPETARCRE_ID;
    private String OPETARCRE;
    private String C_NUMBOLANT;
    private String C_NOMAPE;
    private String C_OBSERVACIONES;
    private String VENPAS_IDORIGINAL;
    private String N_IMPPAGEFE;
    private String N_IMPPAGTAR;
    private String PROMOCION_ID;
    private String N_IDIDARET;
    private String TIPMON_ID;
    private String C_UNIMON;
    private String C_SIMMON;
    private String NOMBRECORTOAGENCIAPARTIDA;
    private String N_TARIFAEQU;
    private String N_DESEQU;
    private String N_TIPCAM;
    private String EMPRESA_ID;
    private String RAZON;
    private String DIRPARTIDA;
    private String DIRLLEGADA;
    private String EMPNOMBCOR;
    private String EMPSIGLA;
    private String C_NUMDOC;
    private String nomcordoc;   
    private String n_igv;   
    private String C_EMAIL_CONTACTO;   
    private String C_EMAIL_TARJETA;   
    private String C_HOREMB;
    private String C_CODVUELO;
    private String C_IATAORG;
    private String C_IATADEST;
    private Date   D_FECPAR;
    private Date   D_FECLLEG;
    private String N_TAR_DES;
    private String UBIGEO_ORI;
    private String UBIGEO_DES;
    private String NROOPERACIONCOMPRA;
    private Result result;
    
    
    

    public VentaPasajeFE() {
    }

    @Override
    public String toString() {
        return "VentaPasajeFE{" + "VENPAS_ID=" + VENPAS_ID + ", ITINERARIO_ID=" + ITINERARIO_ID + ", RUTA_ID=" + RUTA_ID + ", C_ORIGEN=" + C_ORIGEN + ", C_DESTINO=" + C_DESTINO + ", CLIENTE_ID=" + CLIENTE_ID + ", DOCCLI=" + DOCCLI + ", C_RAZSOC=" + C_RAZSOC + ", C_DIRECCION=" + C_DIRECCION + ", PASAJERO_ID=" + PASAJERO_ID + ", C_APEPAT=" + C_APEPAT + ", C_APEMAT=" + C_APEMAT + ", C_NOMBRE=" + C_NOMBRE + ", TIPDOC_ID=" + TIPDOC_ID + ", TIPDOC=" + TIPDOC + ", DOCPAX=" + DOCPAX + ", C_FECNAC=" + C_FECNAC + ", FORPAG_ID=" + FORPAG_ID + ", FORMAPAGO=" + FORMAPAGO + ", SERVICIO_ID=" + SERVICIO_ID + ", SERVICIO=" + SERVICIO + ", TIPCOM_ID=" + TIPCOM_ID + ", TIPOCOMPROBANTE=" + TIPOCOMPROBANTE + ", TIPMOV_ID=" + TIPMOV_ID + ", TIPOMOVIMIENTO=" + TIPOMOVIMIENTO + ", TIPFORPAG_ID=" + TIPFORPAG_ID + ", TIPOFORMAPAGO=" + TIPOFORMAPAGO + ", TARCRE_ID=" + TARCRE_ID + ", TARJETACREDITO=" + TARJETACREDITO + ", C_NUMBOLETO=" + C_NUMBOLETO + ", N_NUMASIENTO=" + N_NUMASIENTO + ", N_NUMPISO=" + N_NUMPISO + ", FECPAR=" + FECPAR + ", C_HORPAR=" + C_HORPAR + ", FECLLE=" + FECLLE + ", C_HORLLE=" + C_HORLLE + ", N_TARIFA=" + N_TARIFA + ", N_RECARGO=" + N_RECARGO + ", N_DESCUENTO=" + N_DESCUENTO + ", N_PENALIDAD=" + N_PENALIDAD + ", N_IMPPAG=" + N_IMPPAG + ", N_ACUENTA=" + N_ACUENTA + ", C_TIPTRA=" + C_TIPTRA + ", FECLIQ=" + FECLIQ + ", AGENCIA_ID=" + AGENCIA_ID + ", AGENCIA=" + AGENCIA + ", USUARIO_ID=" + USUARIO_ID + ", C_LOGIN=" + C_LOGIN + ", CANVEN_ID=" + CANVEN_ID + ", CANALVENTA=" + CANALVENTA + ", PREALI_ID=" + PREALI_ID + ", ALIMENTACION=" + ALIMENTACION + ", IDAGELLEGADA=" + IDAGELLEGADA + ", PARTIDA=" + PARTIDA + ", IDAGEPARTIDA=" + IDAGEPARTIDA + ", AGDESTINO=" + AGDESTINO + ", C_NUMCONTROL=" + C_NUMCONTROL + ", C_ESTREG=" + C_ESTREG + ", OPETARCRE_ID=" + OPETARCRE_ID + ", OPETARCRE=" + OPETARCRE + ", C_NUMBOLANT=" + C_NUMBOLANT + ", C_NOMAPE=" + C_NOMAPE + ", C_OBSERVACIONES=" + C_OBSERVACIONES + ", VENPAS_IDORIGINAL=" + VENPAS_IDORIGINAL + ", N_IMPPAGEFE=" + N_IMPPAGEFE + ", N_IMPPAGTAR=" + N_IMPPAGTAR + ", PROMOCION_ID=" + PROMOCION_ID + ", N_IDIDARET=" + N_IDIDARET + ", TIPMON_ID=" + TIPMON_ID + ", C_UNIMON=" + C_UNIMON + ", C_SIMMON=" + C_SIMMON + ", NOMBRECORTOAGENCIAPARTIDA=" + NOMBRECORTOAGENCIAPARTIDA + ", N_TARIFAEQU=" + N_TARIFAEQU + ", N_DESEQU=" + N_DESEQU + ", N_TIPCAM=" + N_TIPCAM + ", EMPRESA_ID=" + EMPRESA_ID + ", RAZON=" + RAZON + ", DIRPARTIDA=" + DIRPARTIDA + ", DIRLLEGADA=" + DIRLLEGADA + ", EMPNOMBCOR=" + EMPNOMBCOR + ", EMPSIGLA=" + EMPSIGLA + ", C_NUMDOC=" + C_NUMDOC + ", nomcordoc=" + nomcordoc + ", n_igv=" + n_igv + ", C_EMAIL_CONTACTO=" + C_EMAIL_CONTACTO + ", C_EMAIL_TARJETA=" + C_EMAIL_TARJETA + ", C_HOREMB=" + C_HOREMB + ", C_CODVUELO=" + C_CODVUELO + ", C_IATAORG=" + C_IATAORG + ", C_IATADEST=" + C_IATADEST + ", D_FECPAR=" + D_FECPAR + ", D_FECLLEG=" + D_FECLLEG + ", N_TAR_DES=" + N_TAR_DES + ", UBIGEO_ORI=" + UBIGEO_ORI + ", UBIGEO_DES=" + UBIGEO_DES + ", NROOPERACIONCOMPRA=" + NROOPERACIONCOMPRA + '}';
    }

   

    public String getVENPAS_ID() {
        return VENPAS_ID;
    }

    public void setVENPAS_ID(String VENPAS_ID) {
        this.VENPAS_ID = VENPAS_ID;
    }

    public String getITINERARIO_ID() {
        return ITINERARIO_ID;
    }

    public void setITINERARIO_ID(String ITINERARIO_ID) {
        this.ITINERARIO_ID = ITINERARIO_ID;
    }

    public String getRUTA_ID() {
        return RUTA_ID;
    }

    public void setRUTA_ID(String RUTA_ID) {
        this.RUTA_ID = RUTA_ID;
    }

    public String getC_ORIGEN() {
        return C_ORIGEN;
    }

    public void setC_ORIGEN(String C_ORIGEN) {
        this.C_ORIGEN = C_ORIGEN;
    }

    public String getC_DESTINO() {
        return C_DESTINO;
    }

    public void setC_DESTINO(String C_DESTINO) {
        this.C_DESTINO = C_DESTINO;
    }

    public String getCLIENTE_ID() {
        return CLIENTE_ID;
    }

    public void setCLIENTE_ID(String CLIENTE_ID) {
        this.CLIENTE_ID = CLIENTE_ID;
    }

    public String getDOCCLI() {
        return DOCCLI;
    }

    public void setDOCCLI(String DOCCLI) {
        this.DOCCLI = DOCCLI;
    }

    public String getC_RAZSOC() {
        return C_RAZSOC;
    }

    public void setC_RAZSOC(String C_RAZSOC) {
        this.C_RAZSOC = C_RAZSOC;
    }

    public String getC_DIRECCION() {
        return C_DIRECCION;
    }

    public void setC_DIRECCION(String C_DIRECCION) {
        this.C_DIRECCION = C_DIRECCION;
    }

    public String getPASAJERO_ID() {
        return PASAJERO_ID;
    }

    public void setPASAJERO_ID(String PASAJERO_ID) {
        this.PASAJERO_ID = PASAJERO_ID;
    }

    public String getC_APEPAT() {
        return C_APEPAT;
    }

    public void setC_APEPAT(String C_APEPAT) {
        this.C_APEPAT = C_APEPAT;
    }

    public String getC_APEMAT() {
        return C_APEMAT;
    }

    public void setC_APEMAT(String C_APEMAT) {
        this.C_APEMAT = C_APEMAT;
    }

    public String getC_NOMBRE() {
        return C_NOMBRE;
    }

    public void setC_NOMBRE(String C_NOMBRE) {
        this.C_NOMBRE = C_NOMBRE;
    }

    public String getTIPDOC_ID() {
        return TIPDOC_ID;
    }

    public void setTIPDOC_ID(String TIPDOC_ID) {
        this.TIPDOC_ID = TIPDOC_ID;
    }

    public String getTIPDOC() {
        return TIPDOC;
    }

    public void setTIPDOC(String TIPDOC) {
        this.TIPDOC = TIPDOC;
    }

    public String getDOCPAX() {
        return DOCPAX;
    }

    public void setDOCPAX(String DOCPAX) {
        this.DOCPAX = DOCPAX;
    }

    public String getC_FECNAC() {
        return C_FECNAC;
    }

    public void setC_FECNAC(String C_FECNAC) {
        this.C_FECNAC = C_FECNAC;
    }

    public String getFORPAG_ID() {
        return FORPAG_ID;
    }

    public void setFORPAG_ID(String FORPAG_ID) {
        this.FORPAG_ID = FORPAG_ID;
    }

    public String getFORMAPAGO() {
        return FORMAPAGO;
    }

    public void setFORMAPAGO(String FORMAPAGO) {
        this.FORMAPAGO = FORMAPAGO;
    }

    public String getSERVICIO_ID() {
        return SERVICIO_ID;
    }

    public void setSERVICIO_ID(String SERVICIO_ID) {
        this.SERVICIO_ID = SERVICIO_ID;
    }

    public String getSERVICIO() {
        return SERVICIO;
    }

    public void setSERVICIO(String SERVICIO) {
        this.SERVICIO = SERVICIO;
    }

    public String getTIPCOM_ID() {
        return TIPCOM_ID;
    }

    public void setTIPCOM_ID(String TIPCOM_ID) {
        this.TIPCOM_ID = TIPCOM_ID;
    }

    public String getTIPOCOMPROBANTE() {
        return TIPOCOMPROBANTE;
    }

    public void setTIPOCOMPROBANTE(String TIPOCOMPROBANTE) {
        this.TIPOCOMPROBANTE = TIPOCOMPROBANTE;
    }

    public String getTIPMOV_ID() {
        return TIPMOV_ID;
    }

    public void setTIPMOV_ID(String TIPMOV_ID) {
        this.TIPMOV_ID = TIPMOV_ID;
    }

    public String getTIPOMOVIMIENTO() {
        return TIPOMOVIMIENTO;
    }

    public void setTIPOMOVIMIENTO(String TIPOMOVIMIENTO) {
        this.TIPOMOVIMIENTO = TIPOMOVIMIENTO;
    }

    public String getTIPFORPAG_ID() {
        return TIPFORPAG_ID;
    }

    public void setTIPFORPAG_ID(String TIPFORPAG_ID) {
        this.TIPFORPAG_ID = TIPFORPAG_ID;
    }

    public String getTIPOFORMAPAGO() {
        return TIPOFORMAPAGO;
    }

    public void setTIPOFORMAPAGO(String TIPOFORMAPAGO) {
        this.TIPOFORMAPAGO = TIPOFORMAPAGO;
    }

    public String getTARCRE_ID() {
        return TARCRE_ID;
    }

    public void setTARCRE_ID(String TARCRE_ID) {
        this.TARCRE_ID = TARCRE_ID;
    }

    public String getTARJETACREDITO() {
        return TARJETACREDITO;
    }

    public void setTARJETACREDITO(String TARJETACREDITO) {
        this.TARJETACREDITO = TARJETACREDITO;
    }

    public String getC_NUMBOLETO() {
        return C_NUMBOLETO;
    }

    public void setC_NUMBOLETO(String C_NUMBOLETO) {
        this.C_NUMBOLETO = C_NUMBOLETO;
    }

    public String getN_NUMASIENTO() {
        return N_NUMASIENTO;
    }

    public void setN_NUMASIENTO(String N_NUMASIENTO) {
        this.N_NUMASIENTO = N_NUMASIENTO;
    }

    public String getN_NUMPISO() {
        return N_NUMPISO;
    }

    public void setN_NUMPISO(String N_NUMPISO) {
        this.N_NUMPISO = N_NUMPISO;
    }

    public String getFECPAR() {
        return FECPAR;
    }

    public void setFECPAR(String FECPAR) {
        this.FECPAR = FECPAR;
    }

    public String getC_HORPAR() {
        return C_HORPAR;
    }

    public void setC_HORPAR(String C_HORPAR) {
        this.C_HORPAR = C_HORPAR;
    }

    public String getFECLLE() {
        return FECLLE;
    }

    public void setFECLLE(String FECLLE) {
        this.FECLLE = FECLLE;
    }

    public String getC_HORLLE() {
        return C_HORLLE;
    }

    public void setC_HORLLE(String C_HORLLE) {
        this.C_HORLLE = C_HORLLE;
    }

    public String getN_TARIFA() {
        return N_TARIFA;
    }

    public void setN_TARIFA(String N_TARIFA) {
        this.N_TARIFA = N_TARIFA;
    }

    public String getN_RECARGO() {
        return N_RECARGO;
    }

    public void setN_RECARGO(String N_RECARGO) {
        this.N_RECARGO = N_RECARGO;
    }

    public String getN_DESCUENTO() {
        return N_DESCUENTO;
    }

    public void setN_DESCUENTO(String N_DESCUENTO) {
        this.N_DESCUENTO = N_DESCUENTO;
    }

    public String getN_PENALIDAD() {
        return N_PENALIDAD;
    }

    public void setN_PENALIDAD(String N_PENALIDAD) {
        this.N_PENALIDAD = N_PENALIDAD;
    }

    public String getN_IMPPAG() {
        return N_IMPPAG;
    }

    public void setN_IMPPAG(String N_IMPPAG) {
        this.N_IMPPAG = N_IMPPAG;
    }

    public String getN_ACUENTA() {
        return N_ACUENTA;
    }

    public void setN_ACUENTA(String N_ACUENTA) {
        this.N_ACUENTA = N_ACUENTA;
    }

    public String getC_TIPTRA() {
        return C_TIPTRA;
    }

    public void setC_TIPTRA(String C_TIPTRA) {
        this.C_TIPTRA = C_TIPTRA;
    }

    public String getFECLIQ() {
        return FECLIQ;
    }

    public void setFECLIQ(String FECLIQ) {
        this.FECLIQ = FECLIQ;
    }

    public String getAGENCIA_ID() {
        return AGENCIA_ID;
    }

    public void setAGENCIA_ID(String AGENCIA_ID) {
        this.AGENCIA_ID = AGENCIA_ID;
    }

    public String getAGENCIA() {
        return AGENCIA;
    }

    public void setAGENCIA(String AGENCIA) {
        this.AGENCIA = AGENCIA;
    }

    public String getUSUARIO_ID() {
        return USUARIO_ID;
    }

    public void setUSUARIO_ID(String USUARIO_ID) {
        this.USUARIO_ID = USUARIO_ID;
    }

    public String getC_LOGIN() {
        return C_LOGIN;
    }

    public void setC_LOGIN(String C_LOGIN) {
        this.C_LOGIN = C_LOGIN;
    }

    public String getCANVEN_ID() {
        return CANVEN_ID;
    }

    public void setCANVEN_ID(String CANVEN_ID) {
        this.CANVEN_ID = CANVEN_ID;
    }

    public String getCANALVENTA() {
        return CANALVENTA;
    }

    public void setCANALVENTA(String CANALVENTA) {
        this.CANALVENTA = CANALVENTA;
    }

    public String getPREALI_ID() {
        return PREALI_ID;
    }

    public void setPREALI_ID(String PREALI_ID) {
        this.PREALI_ID = PREALI_ID;
    }

    public String getALIMENTACION() {
        return ALIMENTACION;
    }

    public void setALIMENTACION(String ALIMENTACION) {
        this.ALIMENTACION = ALIMENTACION;
    }

    public String getIDAGELLEGADA() {
        return IDAGELLEGADA;
    }

    public void setIDAGELLEGADA(String IDAGELLEGADA) {
        this.IDAGELLEGADA = IDAGELLEGADA;
    }

    public String getPARTIDA() {
        return PARTIDA;
    }

    public void setPARTIDA(String PARTIDA) {
        this.PARTIDA = PARTIDA;
    }

    public String getIDAGEPARTIDA() {
        return IDAGEPARTIDA;
    }

    public void setIDAGEPARTIDA(String IDAGEPARTIDA) {
        this.IDAGEPARTIDA = IDAGEPARTIDA;
    }

    public String getAGDESTINO() {
        return AGDESTINO;
    }

    public void setAGDESTINO(String AGDESTINO) {
        this.AGDESTINO = AGDESTINO;
    }

    public String getC_NUMCONTROL() {
        return C_NUMCONTROL;
    }

    public void setC_NUMCONTROL(String C_NUMCONTROL) {
        this.C_NUMCONTROL = C_NUMCONTROL;
    }

    public String getC_ESTREG() {
        return C_ESTREG;
    }

    public void setC_ESTREG(String C_ESTREG) {
        this.C_ESTREG = C_ESTREG;
    }

    public String getOPETARCRE_ID() {
        return OPETARCRE_ID;
    }

    public void setOPETARCRE_ID(String OPETARCRE_ID) {
        this.OPETARCRE_ID = OPETARCRE_ID;
    }

    public String getOPETARCRE() {
        return OPETARCRE;
    }

    public void setOPETARCRE(String OPETARCRE) {
        this.OPETARCRE = OPETARCRE;
    }

    public String getC_NUMBOLANT() {
        return C_NUMBOLANT;
    }

    public void setC_NUMBOLANT(String C_NUMBOLANT) {
        this.C_NUMBOLANT = C_NUMBOLANT;
    }

    public String getC_NOMAPE() {
        return C_NOMAPE;
    }

    public void setC_NOMAPE(String C_NOMAPE) {
        this.C_NOMAPE = C_NOMAPE;
    }

    public String getC_OBSERVACIONES() {
        return C_OBSERVACIONES;
    }

    public void setC_OBSERVACIONES(String C_OBSERVACIONES) {
        this.C_OBSERVACIONES = C_OBSERVACIONES;
    }

    public String getVENPAS_IDORIGINAL() {
        return VENPAS_IDORIGINAL;
    }

    public void setVENPAS_IDORIGINAL(String VENPAS_IDORIGINAL) {
        this.VENPAS_IDORIGINAL = VENPAS_IDORIGINAL;
    }

    public String getN_IMPPAGEFE() {
        return N_IMPPAGEFE;
    }

    public void setN_IMPPAGEFE(String N_IMPPAGEFE) {
        this.N_IMPPAGEFE = N_IMPPAGEFE;
    }

    public String getN_IMPPAGTAR() {
        return N_IMPPAGTAR;
    }

    public void setN_IMPPAGTAR(String N_IMPPAGTAR) {
        this.N_IMPPAGTAR = N_IMPPAGTAR;
    }

    public String getPROMOCION_ID() {
        return PROMOCION_ID;
    }

    public void setPROMOCION_ID(String PROMOCION_ID) {
        this.PROMOCION_ID = PROMOCION_ID;
    }

    public String getN_IDIDARET() {
        return N_IDIDARET;
    }

    public void setN_IDIDARET(String N_IDIDARET) {
        this.N_IDIDARET = N_IDIDARET;
    }

    public String getTIPMON_ID() {
        return TIPMON_ID;
    }

    public void setTIPMON_ID(String TIPMON_ID) {
        this.TIPMON_ID = TIPMON_ID;
    }

    public String getC_UNIMON() {
        return C_UNIMON;
    }

    public void setC_UNIMON(String C_UNIMON) {
        this.C_UNIMON = C_UNIMON;
    }

    public String getC_SIMMON() {
        return C_SIMMON;
    }

    public void setC_SIMMON(String C_SIMMON) {
        this.C_SIMMON = C_SIMMON;
    }

    public String getNOMBRECORTOAGENCIAPARTIDA() {
        return NOMBRECORTOAGENCIAPARTIDA;
    }

    public void setNOMBRECORTOAGENCIAPARTIDA(String NOMBRECORTOAGENCIAPARTIDA) {
        this.NOMBRECORTOAGENCIAPARTIDA = NOMBRECORTOAGENCIAPARTIDA;
    }

    public String getN_TARIFAEQU() {
        return N_TARIFAEQU;
    }

    public void setN_TARIFAEQU(String N_TARIFAEQU) {
        this.N_TARIFAEQU = N_TARIFAEQU;
    }

    public String getN_DESEQU() {
        return N_DESEQU;
    }

    public void setN_DESEQU(String N_DESEQU) {
        this.N_DESEQU = N_DESEQU;
    }

    public String getN_TIPCAM() {
        return N_TIPCAM;
    }

    public void setN_TIPCAM(String N_TIPCAM) {
        this.N_TIPCAM = N_TIPCAM;
    }

    public String getEMPRESA_ID() {
        return EMPRESA_ID;
    }

    public void setEMPRESA_ID(String EMPRESA_ID) {
        this.EMPRESA_ID = EMPRESA_ID;
    }

    public String getRAZON() {
        return RAZON;
    }

    public void setRAZON(String RAZON) {
        this.RAZON = RAZON;
    }

    public String getDIRPARTIDA() {
        return DIRPARTIDA;
    }

    public void setDIRPARTIDA(String DIRPARTIDA) {
        this.DIRPARTIDA = DIRPARTIDA;
    }

    public String getDIRLLEGADA() {
        return DIRLLEGADA;
    }

    public void setDIRLLEGADA(String DIRLLEGADA) {
        this.DIRLLEGADA = DIRLLEGADA;
    }

    public String getEMPNOMBCOR() {
        return EMPNOMBCOR;
    }

    public void setEMPNOMBCOR(String EMPNOMBCOR) {
        this.EMPNOMBCOR = EMPNOMBCOR;
    }

    public String getEMPSIGLA() {
        return EMPSIGLA;
    }

    public void setEMPSIGLA(String EMPSIGLA) {
        this.EMPSIGLA = EMPSIGLA;
    }

    public String getC_NUMDOC() {
        return C_NUMDOC;
    }

    public void setC_NUMDOC(String C_NUMDOC) {
        this.C_NUMDOC = C_NUMDOC;
    }

    public String getNomcordoc() {
        return nomcordoc;
    }

    public void setNomcordoc(String nomcordoc) {
        this.nomcordoc = nomcordoc;
    }

    public String getN_igv() {
        return n_igv;
    }

    public void setN_igv(String n_igv) {
        this.n_igv = n_igv;
    }

    public String getC_EMAIL_CONTACTO() {
        return C_EMAIL_CONTACTO;
    }

    public void setC_EMAIL_CONTACTO(String C_EMAIL_CONTACTO) {
        this.C_EMAIL_CONTACTO = C_EMAIL_CONTACTO;
    }

    public String getC_EMAIL_TARJETA() {
        return C_EMAIL_TARJETA;
    }

    public void setC_EMAIL_TARJETA(String C_EMAIL_TARJETA) {
        this.C_EMAIL_TARJETA = C_EMAIL_TARJETA;
    }

    public String getC_HOREMB() {
        return C_HOREMB;
    }

    public void setC_HOREMB(String C_HOREMB) {
        this.C_HOREMB = C_HOREMB;
    }

    public String getC_CODVUELO() {
        return C_CODVUELO;
    }

    public void setC_CODVUELO(String C_CODVUELO) {
        this.C_CODVUELO = C_CODVUELO;
    }

    public String getC_IATAORG() {
        return C_IATAORG;
    }

    public void setC_IATAORG(String C_IATAORG) {
        this.C_IATAORG = C_IATAORG;
    }

    public String getC_IATADEST() {
        return C_IATADEST;
    }

    public void setC_IATADEST(String C_IATADEST) {
        this.C_IATADEST = C_IATADEST;
    }

    public Date getD_FECPAR() {
        return D_FECPAR;
    }

    public void setD_FECPAR(Date D_FECPAR) {
        this.D_FECPAR = D_FECPAR;
    }

    public Date getD_FECLLEG() {
        return D_FECLLEG;
    }

    public void setD_FECLLEG(Date D_FECLLEG) {
        this.D_FECLLEG = D_FECLLEG;
    }

    public String getN_TAR_DES() {
        return N_TAR_DES;
    }

    public void setN_TAR_DES(String N_TAR_DES) {
        this.N_TAR_DES = N_TAR_DES;
    }

    public String getUBIGEO_ORI() {
        return UBIGEO_ORI;
    }

    public void setUBIGEO_ORI(String UBIGEO_ORI) {
        this.UBIGEO_ORI = UBIGEO_ORI;
    }   
    
    public String getUBIGEO_DES() {
        return UBIGEO_DES;
    }

    public void setUBIGEO_DES(String UBIGEO_DES) {
        this.UBIGEO_DES = UBIGEO_DES;
    }
    
    public String getNROOPERACIONCOMPRA() {
        return NROOPERACIONCOMPRA;
    }

    public void setNROOPERACIONCOMPRA(String NROOPERACIONCOMPRA) {
        this.NROOPERACIONCOMPRA = NROOPERACIONCOMPRA;
    }
    
    public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}