package pe.movilbus.autoservicio.service.fe;

import java.math.BigDecimal;
import java.util.Date;

import org.datacontract.schemas._2004._07.feservice.Result;

/**
 *
 * @author eneyra
 */
public class VentaPasaje implements java.io.Serializable, Cloneable{
        private static final long serialVersionUID = 1L;
	private BigDecimal  id;
        private BigDecimal  idventa_referencia;
        private BigDecimal  idventa_original;
        private BigDecimal  iditinerario;
        private BigDecimal  idruta;
        private BigDecimal  idcliente;        
        private BigDecimal  idpasajero;
        private BigDecimal  idformapago;
        private BigDecimal  idservicio;
        private BigDecimal  idtipocomprobante;
        private BigDecimal  idtipomovimiento;
        private BigDecimal  idtipoformapago;
        private BigDecimal  idtarjecredito;
        private String      nroBoleto;
        private String      nroBoletoAnterior;
        private Integer     nroAsiento;
        private Integer     nroPiso;
        private String      nroControl;
        private BigDecimal  idagenciaPartida;
        private Date        fechaPartida;
        private String      horaPartida;
        private BigDecimal  idagenciaLLegada;
        private Date        fechaLLegada;
        private String      horaLLegada;
        private Integer     cant_secuencial;
        private Double      tarifa;
        private Double      recargo;
        private Double      descuento;
        private Double      penalidad;
        private Double      acuenta;
        private Double      importepagado;
        private Double      importepagadoEfectivo;
        private Double      importepagadoTarjeta;
        private String      tipoTransicion; // venta o reserva
        private Date        fechaCaducidad;
        private BigDecimal  idliquidacion; // null
        private Date        fechaLiquidacion;
        private BigDecimal  idagencia;
        private BigDecimal  idusuario;
        private BigDecimal  idcanalVenta;
        private Integer     preferenciaAlimentos;
        private Integer     idaRetorno; // 1 : Ida y Vuelta
        private String      ruclienteCredito;
        private Integer     esFechaAbierta; // 0: Normal 1 :Fecha Abierta
        private String      observacion;
        private BigDecimal  idpromocion;
        private BigDecimal  idventasIdaRetorno;        
        private String      estadoDocumento;        
        private BigDecimal  idempresa;
        private Date        fechaVenta;
        private BigDecimal  idregistroPayme;
        private BigDecimal  idresultaWS;
        private String      nroOperacionCompra;
        private String      tipoRegistro;   
        private Double      montoigv;
        private Double      montotuua;
        private String      emailContacto;
        private String      emailTarjeta;
        private String      tlfcontacto;
        private String      nInfo;
        private String      idTarjetaHabitante;
        private String      nroOperationNiubiz;     
        private String      nroOperationPE;  
        private String      nroCIPPE;  
        private Result result;
        
	public VentaPasaje() {
	}

    public VentaPasaje(BigDecimal id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "VentaPasaje{" + "id=" + id + ", idventa_referencia=" + idventa_referencia + ", idventa_original=" + idventa_original + ", iditinerario=" + iditinerario + ", idruta=" + idruta + ", idcliente=" + idcliente + ", idpasajero=" + idpasajero + ", idformapago=" + idformapago + ", idservicio=" + idservicio + ", idtipocomprobante=" + idtipocomprobante + ", idtipomovimiento=" + idtipomovimiento + ", idtipoformapago=" + idtipoformapago + ", idtarjecredito=" + idtarjecredito + ", nroBoleto=" + nroBoleto + ", nroBoletoAnterior=" + nroBoletoAnterior + ", nroAsiento=" + nroAsiento + ", nroPiso=" + nroPiso + ", nroControl=" + nroControl + ", idagenciaPartida=" + idagenciaPartida + ", fechaPartida=" + fechaPartida + ", horaPartida=" + horaPartida + ", idagenciaLLegada=" + idagenciaLLegada + ", fechaLLegada=" + fechaLLegada + ", horaLLegada=" + horaLLegada + ", cant_secuencial=" + cant_secuencial + ", tarifa=" + tarifa + ", recargo=" + recargo + ", descuento=" + descuento + ", penalidad=" + penalidad + ", acuenta=" + acuenta + ", importepagado=" + importepagado + ", importepagadoEfectivo=" + importepagadoEfectivo + ", importepagadoTarjeta=" + importepagadoTarjeta + ", tipoTransicion=" + tipoTransicion + ", fechaCaducidad=" + fechaCaducidad + ", idliquidacion=" + idliquidacion + ", fechaLiquidacion=" + fechaLiquidacion + ", idagencia=" + idagencia + ", idusuario=" + idusuario + ", idcanalVenta=" + idcanalVenta + ", preferenciaAlimentos=" + preferenciaAlimentos + ", idaRetorno=" + idaRetorno + ", ruclienteCredito=" + ruclienteCredito + ", esFechaAbierta=" + esFechaAbierta + ", observacion=" + observacion + ", idpromocion=" + idpromocion + ", idventasIdaRetorno=" + idventasIdaRetorno + ", estadoDocumento=" + estadoDocumento + ", idempresa=" + idempresa + ", fechaVenta=" + fechaVenta + ", idregistroPayme=" + idregistroPayme + ", idresultaWS=" + idresultaWS + ", nroOperacionCompra=" + nroOperacionCompra + ", tipoRegistro=" + tipoRegistro + ", montoigv=" + montoigv + ", montotuua=" + montotuua + ", emailContacto=" + emailContacto + ", emailTarjeta=" + emailTarjeta + ", tlfcontacto=" + tlfcontacto + ", nInfo=" + nInfo + ", idTarjetaHabitante=" + idTarjetaHabitante + ", nroOperationNiubiz=" + nroOperationNiubiz + ", nroOperationPE=" + nroOperationPE + ", nroCIPPE=" + nroCIPPE + '}';
    }

  

   
    
 
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getIdventa_referencia() {
        return idventa_referencia;
    }

    public void setIdventa_referencia(BigDecimal idventa_referencia) {
        this.idventa_referencia = idventa_referencia;
    }

    public BigDecimal getIdventa_original() {
        return idventa_original;
    }

    public void setIdventa_original(BigDecimal idventa_original) {
        this.idventa_original = idventa_original;
    }

    public BigDecimal getIditinerario() {
        return iditinerario;
    }

    public void setIditinerario(BigDecimal iditinerario) {
        this.iditinerario = iditinerario;
    }

    public BigDecimal getIdruta() {
        return idruta;
    }

    public void setIdruta(BigDecimal idruta) {
        this.idruta = idruta;
    }

    public BigDecimal getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(BigDecimal idcliente) {
        this.idcliente = idcliente;
    }

    public BigDecimal getIdpasajero() {
        return idpasajero;
    }

    public void setIdpasajero(BigDecimal idpasajero) {
        this.idpasajero = idpasajero;
    }

    public BigDecimal getIdformapago() {
        return idformapago;
    }

    public void setIdformapago(BigDecimal idformapago) {
        this.idformapago = idformapago;
    }

    public BigDecimal getIdservicio() {
        return idservicio;
    }

    public void setIdservicio(BigDecimal idservicio) {
        this.idservicio = idservicio;
    }

    public BigDecimal getIdtipocomprobante() {
        return idtipocomprobante;
    }

    public void setIdtipocomprobante(BigDecimal idtipocomprobante) {
        this.idtipocomprobante = idtipocomprobante;
    }

    public BigDecimal getIdtipomovimiento() {
        return idtipomovimiento;
    }

    public void setIdtipomovimiento(BigDecimal idtipomovimiento) {
        this.idtipomovimiento = idtipomovimiento;
    }

    public BigDecimal getIdtipoformapago() {
        return idtipoformapago;
    }

    public void setIdtipoformapago(BigDecimal idtipoformapago) {
        this.idtipoformapago = idtipoformapago;
    }

    public BigDecimal getIdtarjecredito() {
        return idtarjecredito;
    }

    public void setIdtarjecredito(BigDecimal idtarjecredito) {
        this.idtarjecredito = idtarjecredito;
    }

    public String getNroBoleto() {
        return nroBoleto;
    }

    public void setNroBoleto(String nroBoleto) {
        this.nroBoleto = nroBoleto;
    }

    public String getNroBoletoAnterior() {
        return nroBoletoAnterior;
    }

    public void setNroBoletoAnterior(String nroBoletoAnterior) {
        this.nroBoletoAnterior = nroBoletoAnterior;
    }

    public Integer getNroAsiento() {
        return nroAsiento;
    }

    public void setNroAsiento(Integer nroAsiento) {
        this.nroAsiento = nroAsiento;
    }

    public Integer getNroPiso() {
        return nroPiso;
    }

    public void setNroPiso(Integer nroPiso) {
        this.nroPiso = nroPiso;
    }

    public String getNroControl() {
        return nroControl;
    }

    public void setNroControl(String nroControl) {
        this.nroControl = nroControl;
    }

    public BigDecimal getIdagenciaPartida() {
        return idagenciaPartida;
    }

    public void setIdagenciaPartida(BigDecimal idagenciaPartida) {
        this.idagenciaPartida = idagenciaPartida;
    }

    public Date getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(Date fechaPartida) {
        this.fechaPartida = fechaPartida;
    }

    public String getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(String horaPartida) {
        this.horaPartida = horaPartida;
    }

    public BigDecimal getIdagenciaLLegada() {
        return idagenciaLLegada;
    }

    public void setIdagenciaLLegada(BigDecimal idagenciaLLegada) {
        this.idagenciaLLegada = idagenciaLLegada;
    }

    public Date getFechaLLegada() {
        return fechaLLegada;
    }

    public void setFechaLLegada(Date fechaLLegada) {
        this.fechaLLegada = fechaLLegada;
    }

    public String getHoraLLegada() {
        return horaLLegada;
    }

    public void setHoraLLegada(String horaLLegada) {
        this.horaLLegada = horaLLegada;
    }

    public Integer getCant_secuencial() {
        return cant_secuencial;
    }

    public void setCant_secuencial(Integer cant_secuencial) {
        this.cant_secuencial = cant_secuencial;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }

    public Double getRecargo() {
        return recargo;
    }

    public void setRecargo(Double recargo) {
        this.recargo = recargo;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double getPenalidad() {
        return penalidad;
    }

    public void setPenalidad(Double penalidad) {
        this.penalidad = penalidad;
    }

    public Double getAcuenta() {
        return acuenta;
    }

    public void setAcuenta(Double acuenta) {
        this.acuenta = acuenta;
    }

    public Double getImportepagado() {
        return importepagado;
    }

    public void setImportepagado(Double importepagado) {
        this.importepagado = importepagado;
    }

    public Double getImportepagadoEfectivo() {
        return importepagadoEfectivo;
    }

    public void setImportepagadoEfectivo(Double importepagadoEfectivo) {
        this.importepagadoEfectivo = importepagadoEfectivo;
    }

    public Double getImportepagadoTarjeta() {
        return importepagadoTarjeta;
    }

    public void setImportepagadoTarjeta(Double importepagadoTarjeta) {
        this.importepagadoTarjeta = importepagadoTarjeta;
    }

    public String getTipoTransicion() {
        return tipoTransicion;
    }

    public void setTipoTransicion(String tipoTransicion) {
        this.tipoTransicion = tipoTransicion;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public BigDecimal getIdliquidacion() {
        return idliquidacion;
    }

    public void setIdliquidacion(BigDecimal idliquidacion) {
        this.idliquidacion = idliquidacion;
    }

    public Date getFechaLiquidacion() {
        return fechaLiquidacion;
    }

    public void setFechaLiquidacion(Date fechaLiquidacion) {
        this.fechaLiquidacion = fechaLiquidacion;
    }

    public BigDecimal getIdagencia() {
        return idagencia;
    }

    public void setIdagencia(BigDecimal idagencia) {
        this.idagencia = idagencia;
    }

    public BigDecimal getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(BigDecimal idusuario) {
        this.idusuario = idusuario;
    }

    public BigDecimal getIdcanalVenta() {
        return idcanalVenta;
    }

    public void setIdcanalVenta(BigDecimal idcanalVenta) {
        this.idcanalVenta = idcanalVenta;
    }

    public Integer getPreferenciaAlimentos() {
        return preferenciaAlimentos;
    }

    public void setPreferenciaAlimentos(Integer preferenciaAlimentos) {
        this.preferenciaAlimentos = preferenciaAlimentos;
    }

    public Integer getIdaRetorno() {
        return idaRetorno;
    }

    public void setIdaRetorno(Integer idaRetorno) {
        this.idaRetorno = idaRetorno;
    }

    public String getRuclienteCredito() {
        return ruclienteCredito;
    }

    public void setRuclienteCredito(String ruclienteCredito) {
        this.ruclienteCredito = ruclienteCredito;
    }

    public Integer getEsFechaAbierta() {
        return esFechaAbierta;
    }

    public void setEsFechaAbierta(Integer esFechaAbierta) {
        this.esFechaAbierta = esFechaAbierta;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public BigDecimal getIdpromocion() {
        return idpromocion;
    }

    public void setIdpromocion(BigDecimal idpromocion) {
        this.idpromocion = idpromocion;
    }

    public BigDecimal getIdventasIdaRetorno() {
        return idventasIdaRetorno;
    }

    public void setIdventasIdaRetorno(BigDecimal idventasIdaRetorno) {
        this.idventasIdaRetorno = idventasIdaRetorno;
    }

  

    public String getEstadoDocumento() {
        return estadoDocumento;
    }

    public void setEstadoDocumento(String estadoDocumento) {
        this.estadoDocumento = estadoDocumento;
    }

    public BigDecimal getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(BigDecimal idempresa) {
        this.idempresa = idempresa;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public BigDecimal getIdregistroPayme() {
        return idregistroPayme;
    }

    public void setIdregistroPayme(BigDecimal idregistroPayme) {
        this.idregistroPayme = idregistroPayme;
    }

    public BigDecimal getIdresultaWS() {
        return idresultaWS;
    }

    public void setIdresultaWS(BigDecimal idresultaWS) {
        this.idresultaWS = idresultaWS;
    }

    public String getNroOperacionCompra() {
        return nroOperacionCompra;
    }

    public void setNroOperacionCompra(String nroOperacionCompra) {
        this.nroOperacionCompra = nroOperacionCompra;
    }

    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public Double getMontoigv() {
        return montoigv;
    }

    public void setMontoigv(Double montoigv) {
        this.montoigv = montoigv;
    }

    public Double getMontotuua() {
        return montotuua;
    }

    public void setMontotuua(Double montotuua) {
        this.montotuua = montotuua;
    }

    public String getEmailContacto() {
        return emailContacto;
    }

    public void setEmailContacto(String emailContacto) {
        this.emailContacto = emailContacto;
    }

    public String getEmailTarjeta() {
        return emailTarjeta;
    }

    public void setEmailTarjeta(String emailTarjeta) {
        this.emailTarjeta = emailTarjeta;
    }

    public String getTlfcontacto() {
        return tlfcontacto;
    }

    public void setTlfcontacto(String tlfcontacto) {
        this.tlfcontacto = tlfcontacto;
    }
    
    public String getNInfo(){
        return nInfo;
    }
    
    public void setNInfo(String nInfo){
        this.nInfo = nInfo;
    }
    
    public String getIdTarjetaHabitante(){
        return idTarjetaHabitante;
    }
    
    public void setIdTarjetaHabitante(String idTarjetaHabitante){
        this.idTarjetaHabitante = idTarjetaHabitante;
    }

    public String getNroOperationNiubiz() {
        return nroOperationNiubiz;
    }

    public void setNroOperationNiubiz(String nroOperationNiubiz) {
        this.nroOperationNiubiz = nroOperationNiubiz;
    }

    public String getNroOperationPE() {
        return nroOperationPE;
    }

    public void setNroOperationPE(String nroOperationPE) {
        this.nroOperationPE = nroOperationPE;
    }

    public String getNroCIPPE() {
        return nroCIPPE;
    }

    public void setNroCIPPE(String nroCIPPE) {
        this.nroCIPPE = nroCIPPE;
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