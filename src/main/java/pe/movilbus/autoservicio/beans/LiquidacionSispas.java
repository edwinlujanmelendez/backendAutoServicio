package pe.movilbus.autoservicio.beans;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class LiquidacionSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer anio;
	private AgenciaSispas agencia;
	private UsuarioSispas usuario;
	private String nombreUsuario;
	private Date fechaLiquidacion;
	private Double montoIngresado;
	private Integer estadoLiquidacion;
	private LiquidacionOficinaSispas liquidacionOficina;
	
	
	private Set<DetalleLiquidacionSispas> detalleLiquidaciones = new HashSet<DetalleLiquidacionSispas>(0);
	private Set<LiquidacionOficinaSispas> liquidacionOficinas = new HashSet<LiquidacionOficinaSispas>(0);

	//NO MAPEADO
	
	//Especie Valorada
	private String serie;
	private String boletoInicial;
	private String boletoFinal;
	private Integer cantidadBoletos;
	private Integer cortes;
	private TipoComprobanteSispas tipoComprobante;
	private String  sigla;
	
	//Resumen de ventas
	private double totalVoublers;
	
	private Integer cantidadContado;
	private double  montoContado;
	
	private Integer cantidadContadoJaenCha;
	private double  montoContadoJaenCha;
	
	private Integer cantidadTarjetaVisa;
	private double  montoTarjetaVisa;
	private Integer cantidadTarjetaMasterCard;
	private double  montoTarjetaMasterCard;
	
	// 01/08/2019 ORBIS PAGOLINK
	private Integer cantidadOrbisMT;
	private double  montoOrbisMT;
	private Integer cantidadOrbisMB;
	private double  montoOrbisMB;
	
	private Integer cantidadDepositoMT;
	private double  montoDepositoMT;
	private Integer cantidadDepositoMB;
	private double  montoDepositoMB;
	
	private Integer cantidadMigracionMT;
	private double  montoMigracionMT;
	private Integer cantidadMigracionMB;
	private double  montoMigracionMB;
	
	private Integer cantidadPagoLinkVisaMT;
	private double  montoPagoLinkVisaMT;
	private Integer cantidadPagoLinkVisaMB;
	private double  montoPagoLinkVisaMB;
	
	private Integer cantidadPagoLinkMasterMT;
	private double  montoPagoLinkMasterMT;
	private Integer cantidadPagoLinkMasterMB;
	private double  montoPagoLinkMasterMB;
	
	
	private Integer cantidadCortesia;
	private double montoCortesia;
	private Integer cantidadPrepagado;
	private double montoPrepagado;
	private Integer cantidadCreditos;
	private double montoCreditos;
	
	private Integer cantidadContadoMB;
	private double  montoContadoMB;	
	private Integer cantidadContadoMBJaenCha;
	private double  montoContadoMBJaenCha;
	private Integer cantidadTarjetaVisaMB;
	private double  montoTarjetaVisaMB;
	private Integer cantidadTarjetaMasterCardMB;
	private double  montoTarjetaMasterCardMB;
	private Integer cantidadCortesiaMB;
	private double montoCortesiaMB;
	private Integer cantidadPrepagadoMB;
	private double montoPrepagadoMB;
	private Integer cantidadCreditosMB;
	private double montoCreditosMB;
	
	
	
	//recibos de caja con tarjeta 
	private Integer cantidadTarjetaVisaRC;
	private double montoTarjetaVisaRC;
	private Integer cantidadTarjetaMasterCardRC;
	private double montoTarjetaMasterCardRC;
	
	private Integer cantidadTarjetaVisaRCMB;
	private double montoTarjetaVisaRCMB;
	private Integer cantidadTarjetaMasterCardRCMB;
	private double montoTarjetaMasterCardRCMB;
	
	// NOTA DE CREDITOS SIN AFECTAR EL EFECTIVO
	private Integer cantidadNCSinRestarEfectivo;
	private double montoNCSinRestarEfectivo;
	private Integer cantidadNCSinRestarEfectivoMB;
	private double montoNCSinRestarEfectivoMB;
	
	//Otros ingresos
	private Integer cantidadRC;
	private double montoRC;
	
	private Integer cantidadRCMB;
	private double montoRCMB;
	
	//Egresos
	private Integer cantidadGastoVarios;
	private double  montoGastoVarios;
	private Integer cantidadPeajes;
	private double  montoPeajes;
	private Integer cantidadPagoGiros;
	private double  montoPagoGiros;
	private Integer cantidadDevolucion;
	private double  montoDevolucion;			
	private Integer cantidadGastoConDocumento;
	private double  montoGastoConDocumento;
	private Integer cantidadNotaCredito;
	private double  montoNotaCredito;
	
	
	private Integer cantidadGastoVariosMB;
	private double  montoGastoVariosMB;
	private Integer cantidadPeajesMB;
	private double  montoPeajesMB;
	private Integer cantidadPagoGirosMB;
	private double  montoPagoGirosMB;	
	private Integer cantidadGastoConDocumentoMB;
	private double  montoGastoConDocumentoMB;
	private Integer cantidadDevolucionMB;
	private double  montoDevolucionMB;
	private Integer cantidadNotaCreditoMB;
	private double  montoNotaCreditoMB;
//	private Integer cantidadDevolucion80;
//	private double montoDevolucion80;
//	private Integer cantidadDevolucion100;
//	private double montoDevolucion100;
	
	
	
	public LiquidacionSispas() {
	}
	
	public LiquidacionSispas(Integer id) {
		super();
		this.id = id;
	}

	/**
	 * @return Objeto id.
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id	: Setea el objeto id.
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * @return Objeto anio.
	 */
	public Integer getAnio() {
		return anio;
	}
	/**
	 * @param anio	: Setea el objeto anio.
	 */
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	
	/**
	 * @return Objeto agencia.
	 */
	public AgenciaSispas getAgencia() {
		return agencia;
	}
	/**
	 * @param agencia	: Setea el objeto agencia.
	 */
	public void setAgencia(AgenciaSispas agencia) {
		this.agencia = agencia;
	}
	
	/**
	 * @return Objeto usuario.
	 */
	public UsuarioSispas getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario	: Setea el objeto usuario.
	 */
	public void setUsuario(UsuarioSispas usuario) {
		this.usuario = usuario;
	}
	
	/**
	 * @return Objeto nombreUsuario.
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	/**
	 * @param nombreUsuario	: Setea el objeto nombreUsuario.
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	/**
	 * @return Objeto fechaLiquidacion.
	 */
	public Date getFechaLiquidacion() {
		return fechaLiquidacion;
	}
	/**
	 * @param fechaLiquidacion	: Setea el objeto fechaLiquidacion.
	 */
	public void setFechaLiquidacion(Date fechaLiquidacion) {
		this.fechaLiquidacion = fechaLiquidacion;
	}
	
	/**
	 * @return Objeto montoIngresado.
	 */
	public Double getMontoIngresado() {
		return montoIngresado;
	}
	/**
	 * @param montoIngresado	: Setea el objeto montoIngresado.
	 */
	public void setMontoIngresado(Double montoIngresado) {
		this.montoIngresado = montoIngresado;
	}
	/**
	 * @return Objeto estadoLiquidacion.
	 */
	public Integer getestadoLiquidacion(){
		return estadoLiquidacion;
	}
	/**
	 * @param estadoLiquidacion	: Setea el objeto estadoLiquidacion.
	 */
	public void setEstadoLiquidacion(Integer estadoLiquidacion){
		this.estadoLiquidacion=estadoLiquidacion;
	}
	
	
	//NO MAPEADOS-UTILIZADOS PARA EL REPORTE DE LA LIQUIDACION DE TURNO//
	//Especie valoradas
	public Integer getCantidadBoletos(){
		return cantidadBoletos;
	}
	public void setCantidadBoletos(Integer cantidadBoletos){
		this.cantidadBoletos=cantidadBoletos;
	}
	
	public String getboletoFinal(){
		return boletoFinal;
	}
	public void setBoletoFinal(String boletoFinal){
		this.boletoFinal=boletoFinal;
	}
	
	public String getBoletoInicial(){
		return boletoInicial;
	}
	public void setBoletoInicial(String boletoInicial){
		this.boletoInicial=boletoInicial;
	}
	
	public String getSerie(){
		return serie;
	}
	public void setSerie(String serie){
		this.serie=serie;
	}
	
	public TipoComprobanteSispas getTipoComprobante(){
		return tipoComprobante;
	}
	public void setTipoComprobante(TipoComprobanteSispas tipoComprobante){
		this.tipoComprobante=tipoComprobante;
	}
	
	public Integer getCorte(){
		return cortes;
	}
	public void setCorte(Integer corte){
		this.cortes=corte;
	}

	
	//Resumen de ventas
	public double getTotalVouchers(){
		return totalVoublers;
	}
	public void setTotalVouchers(double totalVouchers){
		this.totalVoublers=totalVouchers;
	}
	public Integer getCantidadContado(){
		return cantidadContado;
	}
	public void setCantidadContado(Integer cantidadContado){
		this.cantidadContado=cantidadContado;
	}
	public double getMontoContado(){
		return montoContado;
	}
	public void setMontoContado(double montocontado){
		this.montoContado=montocontado;
	}
	public Integer getCantidadTarjetaVisa(){
		return cantidadTarjetaVisa;
	}
	public void setCantidadTarjetaVisa(Integer cantidadTarjetaVisa){
		this.cantidadTarjetaVisa=cantidadTarjetaVisa;
	}
	public double getMontoTarjetaVisa(){
		return montoTarjetaVisa;
	}
	public void setMontoTarjetaVisa(double montoTarjetavisa){
		this.montoTarjetaVisa=montoTarjetavisa;
	}
	public Integer getCantidadTarjetaMasterCard(){
		return cantidadTarjetaMasterCard;
	}
	public void setCantidadTarjetaMasterCard(Integer cantidadTarjetaMasterCard){
		this.cantidadTarjetaMasterCard=cantidadTarjetaMasterCard;
	}
	public double getMontoTarjetaMasterCard(){
		return montoTarjetaMasterCard;
	}
	public void setMontoTarjetaMasterCard(double montoTarjetaMasterCard){
		this.montoTarjetaMasterCard=montoTarjetaMasterCard;
	}
	public Integer getCantidadcortesia(){
		return cantidadCortesia;
	}
	public void setCantidadCortesia(Integer cantidadCortesia){
		this.cantidadCortesia=cantidadCortesia;
	}
	public double getMontoCortesia(){
		return montoCortesia;
	}
	public void setMontoCortesia(double montoCortesia){
		this.montoCortesia=montoCortesia;
	}
	public Integer getCantidadPrepagado(){
		return cantidadPrepagado;
	}
	public void setCantidadPrepagado(Integer cantidadPrepagado){
		this.cantidadPrepagado=cantidadPrepagado;
	}
	public double getMontoPrepagado(){
		return montoPrepagado;
	}
	public void setMontoPrepagado(double montoPrepagado){
		this.montoPrepagado=montoPrepagado;
	}
	public Integer getCantidadCreditos(){
		return cantidadCreditos;
	}
	public void setCantidadCreditos(Integer cantidadCreditos){
		this.cantidadCreditos=cantidadCreditos;
	}
	public double getMontoCreditos(){
		return montoCreditos;
	}
	public void setMontoCreditos(double montoCreditos){
		this.montoCreditos=montoCreditos;
	}
	//Otros ingresos
	public Integer getCantidadRCCaja(){
		return cantidadRC;
	}
	public void setCantidadRC(Integer cantidadRC){
		this.cantidadRC=cantidadRC;
	}
	public double getMontoRC(){
		return montoRC;
	}
	public void setMontoRC(double montoRC){
		this.montoRC=montoRC;
	}
	
	//Egresos.
	public Integer getCantidadGastoVarios(){
		return cantidadGastoVarios;
	}
	public void setCantidadGastoVarios(Integer cantidadGastoVarios){
		this.cantidadGastoVarios=cantidadGastoVarios;
	}
	public double getMontoGastoVarios(){
		return montoGastoVarios;
	}
	public void setMontoGastoVarios(double montoGastoVarios){
		this.montoGastoVarios=montoGastoVarios;
	}
	public Integer getCantidadPeajes(){
		return cantidadPeajes;
	}
	public void setCantidadPeajes(Integer cantidadPeajes){
		this.cantidadPeajes=cantidadPeajes;
	}
	public double getMontoPeajes(){
		return montoPeajes;
	}
	public void setMontoPeajes(double montoPeajes){
		this.montoPeajes=montoPeajes;
	}
	public Integer getCantidadPagoGiros(){
		return cantidadPagoGiros;
	}
	public void setCantidadPagoGiros(Integer cantidadPagoGiros){
		this.cantidadPagoGiros=cantidadPagoGiros;
	}
	public double getMontoPagoGiros(){
		return montoPagoGiros;
	}
	public void setMontoPagoGiros(double montoPagoGiros){
		this.montoPagoGiros=montoPagoGiros;
	}
	public Integer getCantidadDevolucion (){
		return cantidadDevolucion;
	}
	public void setCantidadDevolucion(Integer cantidadDevolucion){
		this.cantidadDevolucion=cantidadDevolucion;
	}
	public double getMontoDevolucion(){
		return montoDevolucion;
	}
	public void setMontoDevolucion(double montodDevolucion){
		this.montoDevolucion=montodDevolucion;
	}
//	public Integer getCantidadDevolucion80 (){
//		return cantidadDevolucion80;
//	}
//	public void setCantidadDevolucion80(Integer cantidadDevolucion80){
//		this.cantidadDevolucion80=cantidadDevolucion80;
//	}
//	public double getMontoDevolucion80(){
//		return montoDevolucion80;
//	}
//	public void setMontoDevolucion80(double montodDevolucion80){
//		this.montoDevolucion80=montodDevolucion80;
//	}
//	public Integer getCantidadDevolucion100(){
//		return cantidadDevolucion100;
//	}
//	public void setCantidadDevolucion100(Integer cantidaddDevolucion100){
//		this.cantidadDevolucion100=cantidaddDevolucion100;
//	}
//	public double getMontoDevolucion100(){
//		return montoDevolucion100;
//	}
//	public void setMontoDevolucion100(double montoDevolucion100){
//		this.montoDevolucion100=montoDevolucion100;
//	}
	
	public Set<DetalleLiquidacionSispas> getDetalleLiquidacions() {
		return this.detalleLiquidaciones;
	}
	public void setDetalleLiquidacions(
			Set<DetalleLiquidacionSispas> detalleLiquidacions) {
		this.detalleLiquidaciones = detalleLiquidacions;
	}
	
	public Set<LiquidacionOficinaSispas> getLiquidacionOficinas() {
		return this.liquidacionOficinas;
	}
	public void setLiquidacionOficinas(
			Set<LiquidacionOficinaSispas> liquidacionOficinas) {
		this.liquidacionOficinas = liquidacionOficinas;
	}

	/**
	 * @return the cantidadTarjetaVisaRC
	 */
	public Integer getCantidadTarjetaVisaRC() {
		return cantidadTarjetaVisaRC;
	}

	/**
	 * @param cantidadTarjetaVisaRC the cantidadTarjetaVisaRC to set
	 */
	public void setCantidadTarjetaVisaRC(Integer cantidadTarjetaVisaRC) {
		this.cantidadTarjetaVisaRC = cantidadTarjetaVisaRC;
	}

	/**
	 * @return the montoTarjetaVisaRC
	 */
	public double getMontoTarjetaVisaRC() {
		return montoTarjetaVisaRC;
	}

	/**
	 * @param montoTarjetaVisaRC the montoTarjetaVisaRC to set
	 */
	public void setMontoTarjetaVisaRC(double montoTarjetaVisaRC) {
		this.montoTarjetaVisaRC = montoTarjetaVisaRC;
	}

	/**
	 * @return the cantidadTarjetaMasterCardRC
	 */
	public Integer getCantidadTarjetaMasterCardRC() {
		return cantidadTarjetaMasterCardRC;
	}

	/**
	 * @param cantidadTarjetaMasterCardRC the cantidadTarjetaMasterCardRC to set
	 */
	public void setCantidadTarjetaMasterCardRC(
			Integer cantidadTarjetaMasterCardRC) {
		this.cantidadTarjetaMasterCardRC = cantidadTarjetaMasterCardRC;
	}

	/**
	 * @return the montoTarjetaMasterCardRC
	 */
	public double getMontoTarjetaMasterCardRC() {
		return montoTarjetaMasterCardRC;
	}

	/**
	 * @param montoTarjetaMasterCardRC the montoTarjetaMasterCardRC to set
	 */
	public void setMontoTarjetaMasterCardRC(double montoTarjetaMasterCardRC) {
		this.montoTarjetaMasterCardRC = montoTarjetaMasterCardRC;
	}

	/**
	 * @return the cantidadGastoConDocumento
	 */
	public Integer getCantidadGastoConDocumento() {
		return cantidadGastoConDocumento;
	}

	/**
	 * @param cantidadGastoConDocumento the cantidadGastoConDocumento to set
	 */
	public void setCantidadGastoConDocumento(Integer cantidadGastoConDocumento) {
		this.cantidadGastoConDocumento = cantidadGastoConDocumento;
	}

	/**
	 * @return the montoGastoConDocumento
	 */
	public double getMontoGastoConDocumento() {
		return montoGastoConDocumento;
	}

	/**
	 * @param montoGastoConDocumento the montoGastoConDocumento to set
	 */
	public void setMontoGastoConDocumento(double montoGastoConDocumento) {
		this.montoGastoConDocumento = montoGastoConDocumento;
	}

	/**
	 * @return the sigla
	 */
	public String getSigla() {
		return sigla;
	}

	/**
	 * @param sigla the sigla to set
	 */
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	
	// MOVIL BUS ---- 
	public Integer getCantidadContadoMB() {
		return cantidadContadoMB;
	}

	public void setCantidadContadoMB(Integer cantidadContadoMB) {
		this.cantidadContadoMB = cantidadContadoMB;
	}

	public double getMontoContadoMB() {
		return montoContadoMB;
	}

	public void setMontoContadoMB(double montoContadoMB) {
		this.montoContadoMB = montoContadoMB;
	}

	public Integer getCantidadTarjetaVisaMB() {
		return cantidadTarjetaVisaMB;
	}

	public void setCantidadTarjetaVisaMB(Integer cantidadTarjetaVisaMB) {
		this.cantidadTarjetaVisaMB = cantidadTarjetaVisaMB;
	}

	public double getMontoTarjetaVisaMB() {
		return montoTarjetaVisaMB;
	}

	public void setMontoTarjetaVisaMB(double montoTarjetaVisaMB) {
		this.montoTarjetaVisaMB = montoTarjetaVisaMB;
	}

	public Integer getCantidadTarjetaMasterCardMB() {
		return cantidadTarjetaMasterCardMB;
	}

	public void setCantidadTarjetaMasterCardMB(Integer cantidadTarjetaMasterCardMB) {
		this.cantidadTarjetaMasterCardMB = cantidadTarjetaMasterCardMB;
	}

	public double getMontoTarjetaMasterCardMB() {
		return montoTarjetaMasterCardMB;
	}

	public void setMontoTarjetaMasterCardMB(double montoTarjetaMasterCardMB) {
		this.montoTarjetaMasterCardMB = montoTarjetaMasterCardMB;
	}

	public Integer getCantidadCortesiaMB() {
		return cantidadCortesiaMB;
	}

	public void setCantidadCortesiaMB(Integer cantidadCortesiaMB) {
		this.cantidadCortesiaMB = cantidadCortesiaMB;
	}

	public double getMontoCortesiaMB() {
		return montoCortesiaMB;
	}

	public void setMontoCortesiaMB(double montoCortesiaMB) {
		this.montoCortesiaMB = montoCortesiaMB;
	}

	public Integer getCantidadPrepagadoMB() {
		return cantidadPrepagadoMB;
	}

	public void setCantidadPrepagadoMB(Integer cantidadPrepagadoMB) {
		this.cantidadPrepagadoMB = cantidadPrepagadoMB;
	}

	public double getMontoPrepagadoMB() {
		return montoPrepagadoMB;
	}

	public void setMontoPrepagadoMB(double montoPrepagadoMB) {
		this.montoPrepagadoMB = montoPrepagadoMB;
	}

	public Integer getCantidadCreditosMB() {
		return cantidadCreditosMB;
	}

	public void setCantidadCreditosMB(Integer cantidadCreditosMB) {
		this.cantidadCreditosMB = cantidadCreditosMB;
	}

	public double getMontoCreditosMB() {
		return montoCreditosMB;
	}

	public void setMontoCreditosMB(double montoCreditosMB) {
		this.montoCreditosMB = montoCreditosMB;
	}

	public Integer getCantidadTarjetaVisaRCMB() {
		return cantidadTarjetaVisaRCMB;
	}

	public void setCantidadTarjetaVisaRCMB(Integer cantidadTarjetaVisaRCMB) {
		this.cantidadTarjetaVisaRCMB = cantidadTarjetaVisaRCMB;
	}

	public double getMontoTarjetaVisaRCMB() {
		return montoTarjetaVisaRCMB;
	}

	public void setMontoTarjetaVisaRCMB(double montoTarjetaVisaRCMB) {
		this.montoTarjetaVisaRCMB = montoTarjetaVisaRCMB;
	}

	public Integer getCantidadTarjetaMasterCardRCMB() {
		return cantidadTarjetaMasterCardRCMB;
	}

	public void setCantidadTarjetaMasterCardRCMB(
			Integer cantidadTarjetaMasterCardRCMB) {
		this.cantidadTarjetaMasterCardRCMB = cantidadTarjetaMasterCardRCMB;
	}

	public double getMontoTarjetaMasterCardRCMB() {
		return montoTarjetaMasterCardRCMB;
	}

	public void setMontoTarjetaMasterCardRCMB(double montoTarjetaMasterCardRCMB) {
		this.montoTarjetaMasterCardRCMB = montoTarjetaMasterCardRCMB;
	}

	public Integer getCantidadRCMB() {
		return cantidadRCMB;
	}

	public void setCantidadRCMB(Integer cantidadRCMB) {
		this.cantidadRCMB = cantidadRCMB;
	}

	public double getMontoRCMB() {
		return montoRCMB;
	}

	public void setMontoRCMB(double montoRCMB) {
		this.montoRCMB = montoRCMB;
	}

	public Integer getCantidadDevolucionMB() {
		return cantidadDevolucionMB;
	}

	public void setCantidadDevolucionMB(Integer cantidadDevolucionMB) {
		this.cantidadDevolucionMB = cantidadDevolucionMB;
	}

	public double getMontoDevolucionMB() {
		return montoDevolucionMB;
	}

	public void setMontoDevolucionMB(double montoDevolucionMB) {
		this.montoDevolucionMB = montoDevolucionMB;
	}

	public Integer getCantidadGastoVariosMB() {
		return cantidadGastoVariosMB;
	}

	public void setCantidadGastoVariosMB(Integer cantidadGastoVariosMB) {
		this.cantidadGastoVariosMB = cantidadGastoVariosMB;
	}

	public double getMontoGastoVariosMB() {
		return montoGastoVariosMB;
	}

	public void setMontoGastoVariosMB(double montoGastoVariosMB) {
		this.montoGastoVariosMB = montoGastoVariosMB;
	}

	public Integer getCantidadPeajesMB() {
		return cantidadPeajesMB;
	}

	public void setCantidadPeajesMB(Integer cantidadPeajesMB) {
		this.cantidadPeajesMB = cantidadPeajesMB;
	}

	public double getMontoPeajesMB() {
		return montoPeajesMB;
	}

	public void setMontoPeajesMB(double montoPeajesMB) {
		this.montoPeajesMB = montoPeajesMB;
	}

	public Integer getCantidadPagoGirosMB() {
		return cantidadPagoGirosMB;
	}

	public void setCantidadPagoGirosMB(Integer cantidadPagoGirosMB) {
		this.cantidadPagoGirosMB = cantidadPagoGirosMB;
	}

	public double getMontoPagoGirosMB() {
		return montoPagoGirosMB;
	}

	public void setMontoPagoGirosMB(double montoPagoGirosMB) {
		this.montoPagoGirosMB = montoPagoGirosMB;
	}

	public Integer getCantidadGastoConDocumentoMB() {
		return cantidadGastoConDocumentoMB;
	}

	public void setCantidadGastoConDocumentoMB(Integer cantidadGastoConDocumentoMB) {
		this.cantidadGastoConDocumentoMB = cantidadGastoConDocumentoMB;
	}

	public double getMontoGastoConDocumentoMB() {
		return montoGastoConDocumentoMB;
	}

	public void setMontoGastoConDocumentoMB(double montoGastoConDocumentoMB) {
		this.montoGastoConDocumentoMB = montoGastoConDocumentoMB;
	}

	/**
	 * @return the liquidacionOficina
	 */
	public LiquidacionOficinaSispas getLiquidacionOficina() {
		return liquidacionOficina;
	}

	/**
	 * @param liquidacionOficina the liquidacionOficina to set
	 */
	public void setLiquidacionOficina(LiquidacionOficinaSispas liquidacionOficina) {
		this.liquidacionOficina = liquidacionOficina;
	}

	/**
	 * @return the cantidadContadoJaenCha
	 */
	public Integer getCantidadContadoJaenCha() {
		return cantidadContadoJaenCha;
	}

	/**
	 * @param cantidadContadoJaenCha the cantidadContadoJaenCha to set
	 */
	public void setCantidadContadoJaenCha(Integer cantidadContadoJaenCha) {
		this.cantidadContadoJaenCha = cantidadContadoJaenCha;
	}

	/**
	 * @return the montoContadoJaenCha
	 */
	public double getMontoContadoJaenCha() {
		return montoContadoJaenCha;
	}

	/**
	 * @param montoContadoJaenCha the montoContadoJaenCha to set
	 */
	public void setMontoContadoJaenCha(double montoContadoJaenCha) {
		this.montoContadoJaenCha = montoContadoJaenCha;
	}

	/**
	 * @return the cantidadContadoMBJaenCha
	 */
	public Integer getCantidadContadoMBJaenCha() {
		return cantidadContadoMBJaenCha;
	}

	/**
	 * @param cantidadContadoMBJaenCha the cantidadContadoMBJaenCha to set
	 */
	public void setCantidadContadoMBJaenCha(Integer cantidadContadoMBJaenCha) {
		this.cantidadContadoMBJaenCha = cantidadContadoMBJaenCha;
	}

	/**
	 * @return the montoContadoMBJaenCha
	 */
	public double getMontoContadoMBJaenCha() {
		return montoContadoMBJaenCha;
	}

	/**
	 * @param montoContadoMBJaenCha the montoContadoMBJaenCha to set
	 */
	public void setMontoContadoMBJaenCha(double montoContadoMBJaenCha) {
		this.montoContadoMBJaenCha = montoContadoMBJaenCha;
	}

	/**
	 * @return the cantidadNotaCredito
	 */
	public Integer getCantidadNotaCredito() {
		return cantidadNotaCredito;
	}

	/**
	 * @param cantidadNotaCredito the cantidadNotaCredito to set
	 */
	public void setCantidadNotaCredito(Integer cantidadNotaCredito) {
		this.cantidadNotaCredito = cantidadNotaCredito;
	}

	/**
	 * @return the montoNotaCredito
	 */
	public double getMontoNotaCredito() {
		return montoNotaCredito;
	}

	/**
	 * @param montoNotaCredito the montoNotaCredito to set
	 */
	public void setMontoNotaCredito(double montoNotaCredito) {
		this.montoNotaCredito = montoNotaCredito;
	}

	/**
	 * @return the cantidadNotaCreditoMB
	 */
	public Integer getCantidadNotaCreditoMB() {
		return cantidadNotaCreditoMB;
	}

	/**
	 * @param cantidadNotaCreditoMB the cantidadNotaCreditoMB to set
	 */
	public void setCantidadNotaCreditoMB(Integer cantidadNotaCreditoMB) {
		this.cantidadNotaCreditoMB = cantidadNotaCreditoMB;
	}

	/**
	 * @return the montoNotaCreditoMB
	 */
	public double getMontoNotaCreditoMB() {
		return montoNotaCreditoMB;
	}

	/**
	 * @param montoNotaCreditoMB the montoNotaCreditoMB to set
	 */
	public void setMontoNotaCreditoMB(double montoNotaCreditoMB) {
		this.montoNotaCreditoMB = montoNotaCreditoMB;
	}

	/**
	 * @return the cantidadOrbisMT
	 */
	public Integer getCantidadOrbisMT() {
		return cantidadOrbisMT;
	}

	/**
	 * @param cantidadOrbisMT the cantidadOrbisMT to set
	 */
	public void setCantidadOrbisMT(Integer cantidadOrbisMT) {
		this.cantidadOrbisMT = cantidadOrbisMT;
	}

	/**
	 * @return the cantidadOrbisMB
	 */
	public Integer getCantidadOrbisMB() {
		return cantidadOrbisMB;
	}

	/**
	 * @param cantidadOrbisMB the cantidadOrbisMB to set
	 */
	public void setCantidadOrbisMB(Integer cantidadOrbisMB) {
		this.cantidadOrbisMB = cantidadOrbisMB;
	}

	/**
	 * @return the cantidadDepositoMT
	 */
	public Integer getCantidadDepositoMT() {
		return cantidadDepositoMT;
	}

	/**
	 * @param cantidadDepositoMT the cantidadDepositoMT to set
	 */
	public void setCantidadDepositoMT(Integer cantidadDepositoMT) {
		this.cantidadDepositoMT = cantidadDepositoMT;
	}

	/**
	 * @return the cantidadDepositoMB
	 */
	public Integer getCantidadDepositoMB() {
		return cantidadDepositoMB;
	}

	/**
	 * @param cantidadDepositoMB the cantidadDepositoMB to set
	 */
	public void setCantidadDepositoMB(Integer cantidadDepositoMB) {
		this.cantidadDepositoMB = cantidadDepositoMB;
	}

	/**
	 * @return the cantidadPagoLinkVisaMT
	 */
	public Integer getCantidadPagoLinkVisaMT() {
		return cantidadPagoLinkVisaMT;
	}

	/**
	 * @param cantidadPagoLinkVisaMT the cantidadPagoLinkVisaMT to set
	 */
	public void setCantidadPagoLinkVisaMT(Integer cantidadPagoLinkVisaMT) {
		this.cantidadPagoLinkVisaMT = cantidadPagoLinkVisaMT;
	}

	/**
	 * @return the cantidadPagoLinkVisaMB
	 */
	public Integer getCantidadPagoLinkVisaMB() {
		return cantidadPagoLinkVisaMB;
	}

	/**
	 * @param cantidadPagoLinkVisaMB the cantidadPagoLinkVisaMB to set
	 */
	public void setCantidadPagoLinkVisaMB(Integer cantidadPagoLinkVisaMB) {
		this.cantidadPagoLinkVisaMB = cantidadPagoLinkVisaMB;
	}

	/**
	 * @return the cantidadPagoLinkMasterMT
	 */
	public Integer getCantidadPagoLinkMasterMT() {
		return cantidadPagoLinkMasterMT;
	}

	/**
	 * @param cantidadPagoLinkMasterMT the cantidadPagoLinkMasterMT to set
	 */
	public void setCantidadPagoLinkMasterMT(Integer cantidadPagoLinkMasterMT) {
		this.cantidadPagoLinkMasterMT = cantidadPagoLinkMasterMT;
	}

	/**
	 * @return the cantidadPagoLinkMasterMB
	 */
	public Integer getCantidadPagoLinkMasterMB() {
		return cantidadPagoLinkMasterMB;
	}

	/**
	 * @param cantidadPagoLinkMasterMB the cantidadPagoLinkMasterMB to set
	 */
	public void setCantidadPagoLinkMasterMB(Integer cantidadPagoLinkMasterMB) {
		this.cantidadPagoLinkMasterMB = cantidadPagoLinkMasterMB;
	}

	/**
	 * @return the montoOrbisMT
	 */
	public double getMontoOrbisMT() {
		return montoOrbisMT;
	}

	/**
	 * @param montoOrbisMT the montoOrbisMT to set
	 */
	public void setMontoOrbisMT(double montoOrbisMT) {
		this.montoOrbisMT = montoOrbisMT;
	}

	/**
	 * @return the montoOrbisMB
	 */
	public double getMontoOrbisMB() {
		return montoOrbisMB;
	}

	/**
	 * @param montoOrbisMB the montoOrbisMB to set
	 */
	public void setMontoOrbisMB(double montoOrbisMB) {
		this.montoOrbisMB = montoOrbisMB;
	}

	/**
	 * @return the montoDepositoMT
	 */
	public double getMontoDepositoMT() {
		return montoDepositoMT;
	}

	/**
	 * @param montoDepositoMT the montoDepositoMT to set
	 */
	public void setMontoDepositoMT(double montoDepositoMT) {
		this.montoDepositoMT = montoDepositoMT;
	}

	/**
	 * @return the montoDepositoMB
	 */
	public double getMontoDepositoMB() {
		return montoDepositoMB;
	}

	/**
	 * @param montoDepositoMB the montoDepositoMB to set
	 */
	public void setMontoDepositoMB(double montoDepositoMB) {
		this.montoDepositoMB = montoDepositoMB;
	}

	/**
	 * @return the montoPagoLinkVisaMT
	 */
	public double getMontoPagoLinkVisaMT() {
		return montoPagoLinkVisaMT;
	}

	/**
	 * @param montoPagoLinkVisaMT the montoPagoLinkVisaMT to set
	 */
	public void setMontoPagoLinkVisaMT(double montoPagoLinkVisaMT) {
		this.montoPagoLinkVisaMT = montoPagoLinkVisaMT;
	}

	/**
	 * @return the montoPagoLinkVisaMB
	 */
	public double getMontoPagoLinkVisaMB() {
		return montoPagoLinkVisaMB;
	}

	/**
	 * @param montoPagoLinkVisaMB the montoPagoLinkVisaMB to set
	 */
	public void setMontoPagoLinkVisaMB(double montoPagoLinkVisaMB) {
		this.montoPagoLinkVisaMB = montoPagoLinkVisaMB;
	}

	/**
	 * @return the montoPagoLinkMasterMT
	 */
	public double getMontoPagoLinkMasterMT() {
		return montoPagoLinkMasterMT;
	}

	/**
	 * @param montoPagoLinkMasterMT the montoPagoLinkMasterMT to set
	 */
	public void setMontoPagoLinkMasterMT(double montoPagoLinkMasterMT) {
		this.montoPagoLinkMasterMT = montoPagoLinkMasterMT;
	}

	/**
	 * @return the montoPagoLinkMasterMB
	 */
	public double getMontoPagoLinkMasterMB() {
		return montoPagoLinkMasterMB;
	}

	/**
	 * @param montoPagoLinkMasterMB the montoPagoLinkMasterMB to set
	 */
	public void setMontoPagoLinkMasterMB(double montoPagoLinkMasterMB) {
		this.montoPagoLinkMasterMB = montoPagoLinkMasterMB;
	}

	public Integer getCantidadMigracionMT() {
		return cantidadMigracionMT;
	}

	public void setCantidadMigracionMT(Integer cantidadMigracionMT) {
		this.cantidadMigracionMT = cantidadMigracionMT;
	}

	public double getMontoMigracionMT() {
		return montoMigracionMT;
	}

	public void setMontoMigracionMT(double montoMigracionMT) {
		this.montoMigracionMT = montoMigracionMT;
	}

	public Integer getCantidadMigracionMB() {
		return cantidadMigracionMB;
	}

	public void setCantidadMigracionMB(Integer cantidadMigracionMB) {
		this.cantidadMigracionMB = cantidadMigracionMB;
	}

	public double getMontoMigracionMB() {
		return montoMigracionMB;
	}

	public void setMontoMigracionMB(double montoMigracionMB) {
		this.montoMigracionMB = montoMigracionMB;
	}

	public Integer getCantidadNCSinRestarEfectivo() {
		return cantidadNCSinRestarEfectivo;
	}

	public void setCantidadNCSinRestarEfectivo(Integer cantidadNCSinRestarEfectivo) {
		this.cantidadNCSinRestarEfectivo = cantidadNCSinRestarEfectivo;
	}

	public double getMontoNCSinRestarEfectivo() {
		return montoNCSinRestarEfectivo;
	}

	public void setMontoNCSinRestarEfectivo(double montoNCSinRestarEfectivo) {
		this.montoNCSinRestarEfectivo = montoNCSinRestarEfectivo;
	}

	public Integer getCantidadNCSinRestarEfectivoMB() {
		return cantidadNCSinRestarEfectivoMB;
	}

	public void setCantidadNCSinRestarEfectivoMB(Integer cantidadNCSinRestarEfectivoMB) {
		this.cantidadNCSinRestarEfectivoMB = cantidadNCSinRestarEfectivoMB;
	}

	public double getMontoNCSinRestarEfectivoMB() {
		return montoNCSinRestarEfectivoMB;
	}

	public void setMontoNCSinRestarEfectivoMB(double montoNCSinRestarEfectivoMB) {
		this.montoNCSinRestarEfectivoMB = montoNCSinRestarEfectivoMB;
	}
	
}
