package pe.movilbus.autoservicio.beans;

import java.util.Date;
import java.util.List;

import org.datacontract.schemas._2004._07.feservice.Result;

public class VentaPasajeSispas extends GenericBean implements java.io.Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private VentaPasajeSispas ventaPasaje;
	private Long ventaOriginal;		
	private ItinerarioSispas itinerario;
	private RutaSispas ruta;
	private ClienteSispas cliente;
	private PasajeroSispas pasajero;
	private FormaPagoSispas formaPago;
	private ServicioSispas servicio;
	private TipoComprobanteSispas tipoComprobante;
	private TipoMovimientoSispas tipoMovimiento;
	private TipoFormaPagoSispas tipoFormaPago;
	private TarjetaCreditoSispas tarjetaCredito;
	private AgenciaSispas agencia;
	private AgenciaSispas agenciaPartida;
	private AgenciaSispas agenciaLlegada;
	private UsuarioSispas usuario;
	private CanalVentaSispas canalVenta;
	private ManifiestoSispas manifiesto;
	private PreferenciaAlimentariaSispas preferenciaAlimentaria;
	private String numeroBoleto;
	private String numeroBoletoAnterior;
	private Integer numeroAsiento;
	private Integer numeroPiso;
	private String numeroControl;
	private Date fechaPartida;
	private String horaPartida;
	private Date fechaLlegada;
	private String horaLllegada;
	private Integer secuencial;
	private Double tarifa;
	private Double recargo;
	private Double descuento;
	private Double penalidad;
	private Double acuenta;
	private Double importePagado;
	private Double difTarjetaPagado;	
	private String tipoTransaccion;
	private Date fechaCaducidad;
	private LiquidacionSispas liquidacion;
	private Date fechaLiquidacion;
	private String    numeroOperacionBancaria;
	private Date 	  fechaExpiracionReserva;
	private String    horaExpiracionReserva;
	private Integer   idaRetorno;
	private String    rucClienteCredito;
	private Integer   esFechaAbierta;
	private String    observaciones;
	private Double    importePagadoEfectivo;
	private Double 	  importePagadoTarjeta;
	private PromocionSispas promocion;
	private Long 	  identificadorIdaRetorno;
	private CentroCostoSispas centroCosto;
	private Date 	    fechaTransferencia;
	private String      estadoDocumento;
	private TipoMonedaSispas  tipoMoneda;
	private Double   tipoCambio;
	private Double   importePagadoEquibalente;
	private Double   descuentoEquibalente;
	private Double   tarifaEquibalente;
	private String   codigoReferencia;
	private CompaniaSispas empresa;
	private Integer  idordenser;
	private String   estadoordenser;
	private Integer  idcancelacionvt;
	private String   stcancelacionvt;	
	private String purchaseOperationNumber;
	// private BigDecimal idRegistroPayme;
	// private String     tipoRegistro;
	// private String     nrooperacion;
	//Add jabanto - 29/03/2018
	private Integer enviadoSFE;
	private Date fechaEnvioSFE;
	private Result result;
	private TipoNotaSispas tipoNota;
	private Double igv;
	private String  nacionalidad;
	private Integer idparentesco;
	private Long idventaparents;
	private Long ventaTransaccion;
	private Integer idtipopasajero;
	
	// no mapeado
	private String relacionParentesco;
	private String responsableParantesco;
	private boolean noVinculadoParentesco;
	
	// No mapeados
	private Date  fechaEmisionUltimoCompb;
	private String nroOrden;
	private UsuarioHardwareSispas usuarioHardware;
	private List<Integer> subConjunto;
	private Integer cantidadPax;
	private Integer cantidadPaxRuta;
	private String key;
	private DetalleItinerarioSispas detalleItinerario;
	private Boolean servicioEspecialFactura = false;
	private String numeroserie;
	private String ultimoEmitido;
	private Integer numeroBoletoEmitidos;
	private Integer diasTranscurridos;
	private Double promedioXdia;
	private String ultimoEnviadoXAbastecimientos;
	private String fechaUltimoEnvioXAbastecimientos;
	private OperadorTarjetaCreditoSispas operadorTarjetaCredito;
	private String numeroVoucher;
	private Integer tipoConsulta;
	private String horaEmbarque;
	private String horaDesembarque;
	private List<VentaPasajeSispas> lstVentaXRuta;
	private List<VentaPasajeSispas> lstPasajeros;	
	private Integer Agenciausuario;
	private AgenciaSispas agenciaVenta; // Para revisar las agencias de las ventas ::  Detalle coorporativo.
	private UsuarioSispas funcionario;
	private Double importeEsperado;
	private Double importeDescuentos;
	private Double importeReal;
	
	private String correoContacto;
	private String correoTarjeta;
	private String telefonoweb;
	
	private String purchaseoperationnew;
	private String purchaseoperationiubiz;
	private String nrooperationpagoefectivo;
	private String nrocippagoefectivo;
	private String nroticketbetterez;
	
	private String promocionEcommerce;			//@elujan++
	
	// reportes de Cenas  x Ruta mayor
	private Integer nronivel; // primer o segundo piso.
	private Integer nroTotal; // total de alimentos.
	private Integer pripiso;  // total de alimentos en el primer  piso.
	private Integer segpiso;  // total de alimentos en el segundo piso.
	
	private Integer pripollo; // cantidad de menu de pollo del primer piso
	private Integer pricarne; // cantidad de menu de carne del primer piso
	private Integer privegetariana; // cantidad de menu de vegetariana del primer piso
	private Integer priinfantil; // cantidad de menu de infantil del primer piso
	private Integer segpollo; // cantidad de menu de pollo del segundo piso
	private Integer segcarne; // cantidad de menu de carne del segundo piso
	private Integer segvegetariana; // cantidad de menu de vegetariana del segundo piso
	private Integer seginfantil; // cantidad de menu de infantil del segundo piso
	private String  estadobolcredito;
	
	// REPORTE DE AVANCE DE VENTA SISTEMA DE CARGA - DATOS
	private Double cantidadBulto;
	private Double cantidadPeso;
	private Double importeCarga;
	
	private Double porcentajeOcupacion;
	private Double porcentajeDescuento;
	private Double solxKmSispas;
	private Double solxKmSiscar;
	private Double solxKmAcumulado;

	/**
	 * Usuario que realiza la Operación Remota
	 */
	private UsuarioSispas usuarioRemoto;
	/**
	 * Usuario Hardware desde donde se realiza la Operación Remota
	 */
	private UsuarioHardwareSispas usuarioHardwareRemoto;
	private Boolean esRemoto;

	public VentaPasajeSispas() {
	}

	public VentaPasajeSispas(Long id) {
		super();
		this.id = id;
	}

	/**
	 * @return Objeto id.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            : Setea el objeto id.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return Objeto ventaPasaje.
	 */
	public VentaPasajeSispas getVentaPasaje() {
		return ventaPasaje;
	}

	/**
	 * @param ventaPasaje
	 *            : Setea el objeto ventaPasaje.
	 */
	public void setVentaPasaje(VentaPasajeSispas ventaPasaje) {
		this.ventaPasaje = ventaPasaje;
	}

	/**
	 * @return the ventaOriginal
	 */
	public Long getVentaOriginal() {
		return ventaOriginal;
	}

	/**
	 * @param ventaOriginal
	 *            the ventaOriginal to set
	 */
	public void setVentaOriginal(Long ventaOriginal) {
		this.ventaOriginal = ventaOriginal;
	}

	/**
	 * @return Objeto itinerario.
	 */
	public ItinerarioSispas getItinerario() {
		return itinerario;
	}

	/**
	 * @param itinerario
	 *            : Setea el objeto itinerario.
	 */
	public void setItinerario(ItinerarioSispas itinerario) {
		this.itinerario = itinerario;
	}

	/**
	 * @return Objeto ruta.
	 */
	public RutaSispas getRuta() {
		return ruta;
	}

	/**
	 * @param ruta
	 *            : Setea el objeto ruta.
	 */
	public void setRuta(RutaSispas ruta) {
		this.ruta = ruta;
	}

	/**
	 * @return Objeto cliente.
	 */
	public ClienteSispas getCliente() {
		return cliente;
	}

	/**
	 * @param cliente
	 *            : Setea el objeto cliente.
	 */
	public void setCliente(ClienteSispas cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return Objeto pasajero.
	 */
	public PasajeroSispas getPasajero() {
		return pasajero;
	}

	/**
	 * @param pasajero
	 *            : Setea el objeto pasajero.
	 */
	public void setPasajero(PasajeroSispas pasajero) {
		this.pasajero = pasajero;
	}

	/**
	 * @return Objeto formaPago.
	 */
	public FormaPagoSispas getFormaPago() {
		return formaPago;
	}

	/**
	 * @param formaPago
	 *            : Setea el objeto formaPago.
	 */
	public void setFormaPago(FormaPagoSispas formaPago) {
		this.formaPago = formaPago;
	}

	/**
	 * @return Objeto servicio.
	 */
	public ServicioSispas getServicio() {
		return servicio;
	}

	/**
	 * @param servicio
	 *            : Setea el objeto servicio.
	 */
	public void setServicio(ServicioSispas servicio) {
		this.servicio = servicio;
	}

	/**
	 * @return Objeto tipoComprobante.
	 */
	public TipoComprobanteSispas getTipoComprobante() {
		return tipoComprobante;
	}

	/**
	 * @param tipoComprobante
	 *            : Setea el objeto tipoComprobante.
	 */
	public void setTipoComprobante(TipoComprobanteSispas tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}

	/**
	 * @return Objeto condicionVenta.
	 */
	public TipoMovimientoSispas getTipoMovimiento() {
		return tipoMovimiento;
	}

	/**
	 * @param tipoMovimiento
	 *            : Setea el objeto condicionVenta.
	 */
	public void setTipoMovimiento(TipoMovimientoSispas tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	/**
	 * @return Objeto tipoFormaPago.
	 */
	public TipoFormaPagoSispas getTipoFormaPago() {
		return tipoFormaPago;
	}

	/**
	 * @param tipoFormaPago
	 *            : Setea el objeto tipoFormaPago.
	 */
	public void setTipoFormaPago(TipoFormaPagoSispas tipoFormaPago) {
		this.tipoFormaPago = tipoFormaPago;
	}

	/**
	 * @return Objeto tarjetaCredito.
	 */
	public TarjetaCreditoSispas getTarjetaCredito() {
		return tarjetaCredito;
	}

	/**
	 * @param tarjetaCredito
	 *            : Setea el objeto tarjetaCredito.
	 */
	public void setTarjetaCredito(TarjetaCreditoSispas tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	/**
	 * @return Objeto agencia.
	 */
	public AgenciaSispas getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia
	 *            : Setea el objeto agencia.
	 */
	public void setAgencia(AgenciaSispas agencia) {
		this.agencia = agencia;
	}

	/**
	 * @return Objeto agenciaPartida.
	 */
	public AgenciaSispas getAgenciaPartida() {
		return agenciaPartida;
	}

	/**
	 * @param agenciaPartida
	 *            : Setea el objeto agenciaPartida.
	 */
	public void setAgenciaPartida(AgenciaSispas agenciaPartida) {
		this.agenciaPartida = agenciaPartida;
	}

	/**
	 * @return Objeto agenciaLlegada.
	 */
	public AgenciaSispas getAgenciaLlegada() {
		return agenciaLlegada;
	}

	/**
	 * @param agenciaLlegada
	 *            : Setea el objeto agenciaLlegada.
	 */
	public void setAgenciaLlegada(AgenciaSispas agenciaLlegada) {
		this.agenciaLlegada = agenciaLlegada;
	}

	/**
	 * @return Objeto usuario.
	 */
	public UsuarioSispas getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario
	 *            : Setea el objeto usuario.
	 */
	public void setUsuario(UsuarioSispas usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return Objeto canalVenta.
	 */
	public CanalVentaSispas getCanalVenta() {
		return canalVenta;
	}

	/**
	 * @param canalVenta
	 *            : Setea el objeto canalVenta.
	 */
	public void setCanalVenta(CanalVentaSispas canalVenta) {
		this.canalVenta = canalVenta;
	}

	/**
	 * @return Objeto manifiesto.
	 */
	public ManifiestoSispas getManifiesto() {
		return manifiesto;
	}

	/**
	 * @param manifiesto
	 *            : Setea el objeto manifiesto.
	 */
	public void setManifiesto(ManifiestoSispas manifiesto) {
		this.manifiesto = manifiesto;
	}

	/**
	 * @return Objeto preferenciaAlimentaria.
	 */
	public PreferenciaAlimentariaSispas getPreferenciaAlimentaria() {
		return preferenciaAlimentaria;
	}

	/**
	 * @param preferenciaAlimentaria
	 *            : Setea el objeto preferenciaAlimentaria.
	 */
	public void setPreferenciaAlimentaria(
			PreferenciaAlimentariaSispas preferenciaAlimentaria) {
		this.preferenciaAlimentaria = preferenciaAlimentaria;
	}

	/**
	 * @return Objeto numeroBoleto.
	 */
	public String getNumeroBoleto() {
		return numeroBoleto;
	}

	/**
	 * @param numeroBoleto
	 *            : Setea el objeto numeroBoleto.
	 */
	public void setNumeroBoleto(String numeroBoleto) {
		this.numeroBoleto = numeroBoleto;
	}

	/**
	 * @return the numeroBoletoAnterior
	 */
	public String getNumeroBoletoAnterior() {
		return numeroBoletoAnterior;
	}

	/**
	 * @param numeroBoletoAnterior
	 *            the numeroBoletoAnterior to set
	 */
	public void setNumeroBoletoAnterior(String numeroBoletoAnterior) {
		this.numeroBoletoAnterior = numeroBoletoAnterior;
	}

	/**
	 * @return Objeto numeroAsiento.
	 */
	public Integer getNumeroAsiento() {
		return numeroAsiento;
	}

	/**
	 * @param numeroAsiento
	 *            : Setea el objeto numeroAsiento.
	 */
	public void setNumeroAsiento(Integer numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}

	/**
	 * @return the numeroPiso
	 */
	public Integer getNumeroPiso() {
		return numeroPiso;
	}

	/**
	 * @param numeroPiso
	 *            the numeroPiso to set
	 */
	public void setNumeroPiso(Integer numeroPiso) {
		this.numeroPiso = numeroPiso;
	}

	/**
	 * @return the numeroControl
	 */
	public String getNumeroControl() {
		return numeroControl;
	}

	/**
	 * @param numeroControl
	 *            the numeroControl to set
	 */
	public void setNumeroControl(String numeroControl) {
		this.numeroControl = numeroControl;
	}

	/**
	 * @return Objeto fechaPartida.
	 */
	public Date getFechaPartida() {
		return fechaPartida;
	}

	/**
	 * @param fechaPartida
	 *            : Setea el objeto fechaPartida.
	 */
	public void setFechaPartida(Date fechaPartida) {
		this.fechaPartida = fechaPartida;
	}

	/**
	 * @return Objeto horaPartida.
	 */
	public String getHoraPartida() {
		return horaPartida;
	}

	/**
	 * @param horaPartida
	 *            : Setea el objeto horaPartida.
	 */
	public void setHoraPartida(String horaPartida) {
		this.horaPartida = horaPartida;
	}

	/**
	 * @return Objeto fechaLlegada.
	 */
	public Date getFechaLlegada() {
		return fechaLlegada;
	}

	/**
	 * @param fechaLlegada
	 *            : Setea el objeto fechaLlegada.
	 */
	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	/**
	 * @return Objeto horaLllegada.
	 */
	public String getHoraLllegada() {
		return horaLllegada;
	}

	/**
	 * @param horaLllegada
	 *            : Setea el objeto horaLllegada.
	 */
	public void setHoraLllegada(String horaLllegada) {
		this.horaLllegada = horaLllegada;
	}

	/**
	 * @return Objeto secuencial.
	 */
	public Integer getSecuencial() {
		return secuencial;
	}

	/**
	 * @param secuencial
	 *            : Setea el objeto secuencial.
	 */
	public void setSecuencial(Integer secuencial) {
		this.secuencial = secuencial;
	}

	/**
	 * @return Objeto tarifa.
	 */
	public Double getTarifa() {
		return tarifa;
	}

	/**
	 * @param tarifa
	 *            : Setea el objeto tarifa.
	 */
	public void setTarifa(Double tarifa) {
		this.tarifa = tarifa;
	}

	/**
	 * @return Objeto recargo.
	 */
	public Double getRecargo() {
		return recargo;
	}

	/**
	 * @param recargo
	 *            : Setea el objeto recargo.
	 */
	public void setRecargo(Double recargo) {
		this.recargo = recargo;
	}

	/**
	 * @return Objeto descuento.
	 */
	public Double getDescuento() {
		return descuento;
	}

	/**
	 * @param descuento
	 *            : Setea el objeto descuento.
	 */
	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	/**
	 * @return Objeto penalidad.
	 */
	public Double getPenalidad() {
		return penalidad;
	}

	/**
	 * @param penalidad
	 *            : Setea el objeto penalidad.
	 */
	public void setPenalidad(Double penalidad) {
		this.penalidad = penalidad;
	}

	/**
	 * @return the acuenta
	 */
	public Double getAcuenta() {
		return acuenta;
	}

	/**
	 * @param acuenta
	 *            the acuenta to set
	 */
	public void setAcuenta(Double acuenta) {
		this.acuenta = acuenta;
	}

	/**
	 * @return Objeto importePagado.
	 */
	public Double getImportePagado() {
		return importePagado;
	}

	/**
	 * @param importePagado
	 *            : Setea el objeto importePagado.
	 */
	public void setImportePagado(Double importePagado) {
		this.importePagado = importePagado;
	}

	/**
	 * @return Objeto tipoTransaccion.
	 */
	public String getTipoTransaccion() {
		return tipoTransaccion;
	}

	/**
	 * @param tipoTransaccion
	 *            : Setea el objeto tipoTransaccion.
	 */
	public void setTipoTransaccion(String tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}

	/**
	 * @return Objeto fechaCaducidad.
	 */
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	/**
	 * @param fechaCaducidad
	 *            : Setea el objeto fechaCaducidad.
	 */
	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	/**
	 * @return the liquidacion
	 */
	public LiquidacionSispas getLiquidacion() {
		return liquidacion;
	}

	/**
	 * @param liquidacion
	 *            the liquidacion to set
	 */
	public void setLiquidacion(LiquidacionSispas liquidacion) {
		this.liquidacion = liquidacion;
	}

	/**
	 * @return Objeto fechaLiquidacion.
	 */
	public Date getFechaLiquidacion() {
		return fechaLiquidacion;
	}

	/**
	 * @param fechaLiquidacion
	 *            : Setea el objeto fechaLiquidacion.
	 */
	public void setFechaLiquidacion(Date fechaLiquidacion) {
		this.fechaLiquidacion = fechaLiquidacion;
	}

	/**
	 * @return Objeto numeroOperacionBancaria.
	 */
	public String getNumeroOperacionBancaria() {
		return numeroOperacionBancaria;
	}

	/**
	 * @param numeroOperacionBancaria
	 *            : Setea el objeto numeroOperacionBancaria.
	 */
	public void setNumeroOperacionBancaria(String numeroOperacionBancaria) {
		this.numeroOperacionBancaria = numeroOperacionBancaria;
	}

	/**
	 * @return Objeto fechaExpiracionReserva.
	 */
	public Date getFechaExpiracionReserva() {
		return fechaExpiracionReserva;
	}

	/**
	 * @param fechaExpiracionReserva
	 *            : Setea el objeto fechaExpiracionReserva.
	 */
	public void setFechaExpiracionReserva(Date fechaExpiracionReserva) {
		this.fechaExpiracionReserva = fechaExpiracionReserva;
	}

	/**
	 * @return Objeto horaExpiracionReserva.
	 */
	public String getHoraExpiracionReserva() {
		return horaExpiracionReserva;
	}

	/**
	 * @param horaExpiracionReserva
	 *            : Setea el objeto horaExpiracionReserva.
	 */
	public void setHoraExpiracionReserva(String horaExpiracionReserva) {
		this.horaExpiracionReserva = horaExpiracionReserva;
	}

	/**
	 * @return the idaRetorno
	 */
	public Integer getIdaRetorno() {
		return idaRetorno;
	}

	/**
	 * @param idaRetorno
	 *            the idaRetorno to set
	 */
	public void setIdaRetorno(Integer idaRetorno) {
		this.idaRetorno = idaRetorno;
	}

	/**
	 * @return the rucClienteCredito
	 */
	public String getRucClienteCredito() {
		return rucClienteCredito;
	}

	/**
	 * @param rucClienteCredito
	 *            the rucClienteCredito to set
	 */
	public void setRucClienteCredito(String rucClienteCredito) {
		this.rucClienteCredito = rucClienteCredito;
	}

	/**
	 * @return the esAbierta
	 */
	public Integer getEsFechaAbierta() {
		return esFechaAbierta;
	}

	/**
	 * @param esAbierta
	 *            the esAbierta to set
	 */
	public void setEsFechaAbierta(Integer esFechaAbierta) {
		this.esFechaAbierta = esFechaAbierta;
	}

	/**
	 * @return the observaciones
	 */
	public String getObservaciones() {
		return observaciones;
	}

	/**
	 * @param observaciones
	 *            the observaciones to set
	 */
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	/**
	 * @return the importePagadoEfectivo
	 */
	public Double getImportePagadoEfectivo() {
		return importePagadoEfectivo;
	}

	/**
	 * @param importePagadoEfectivo
	 *            the importePagadoEfectivo to set
	 */
	public void setImportePagadoEfectivo(Double importePagadoEfectivo) {
		this.importePagadoEfectivo = importePagadoEfectivo;
	}

	/**
	 * @return the importePagadoTarjeta
	 */
	public Double getImportePagadoTarjeta() {
		return importePagadoTarjeta;
	}

	/**
	 * @param importePagadoTarjeta
	 *            the importePagadoTarjeta to set
	 */
	public void setImportePagadoTarjeta(Double importePagadoTarjeta) {
		this.importePagadoTarjeta = importePagadoTarjeta;
	}

	/**
	 * @return the promocion
	 */
	public PromocionSispas getPromocion() {
		return promocion;
	}

	/**
	 * @param promocion
	 *            the promocion to set
	 */
	public void setPromocion(PromocionSispas promocion) {
		this.promocion = promocion;
	}

	/**
	 * @return the identificadorIdaRetorno
	 */
	public Long getIdentificadorIdaRetorno() {
		return identificadorIdaRetorno;
	}

	/**
	 * @param identificadorIdaRetorno
	 *            the identificadorIdaRetorno to set
	 */
	public void setIdentificadorIdaRetorno(Long identificadorIdaRetorno) {
		this.identificadorIdaRetorno = identificadorIdaRetorno;
	}

	/**
	 * @return the usuarioHardware
	 */
	public UsuarioHardwareSispas getUsuarioHardware() {
		return usuarioHardware;
	}

	/**
	 * @param usuarioHardware
	 *            the usuarioHardware to set
	 */
	public void setUsuarioHardware(UsuarioHardwareSispas usuarioHardware) {
		this.usuarioHardware = usuarioHardware;
	}

	/**
	 * @return cantidadpax
	 */
	public Integer getCantidadPax() {
		return cantidadPax;
	}

	/**
	 * @param cantidadPax
	 *            : cantidad de pasajeros
	 */
	public void setCantidadPax(Integer cantidadPax) {
		this.cantidadPax = cantidadPax;
	}

	/**
	 * @return the subConjunto
	 */
	public List<Integer> getSubConjunto() {
		return subConjunto;
	}

	/**
	 * @param subConjunto
	 *            the subConjunto to set
	 */
	public void setSubConjunto(List<Integer> subConjunto) {
		this.subConjunto = subConjunto;
	}

	/**
	 * Clave con el siguiente formato <b>nAsiento-nPiso
	 * 
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Setea el formato de la clave <b>nAsiento-nPiso
	 * 
	 * @param key
	 *            the key to set
	 */
	public void setKey() {
		this.key = this.numeroAsiento + "-" + this.numeroPiso;
	}

	/**
	 * @return the detalleItinerario
	 */
	public DetalleItinerarioSispas getDetalleItinerario() {
		return detalleItinerario;
	}

	/**
	 * @param detalleItinerario
	 *            the detalleItinerario to set
	 */
	public void setDetalleItinerario(DetalleItinerarioSispas detalleItinerario) {
		this.detalleItinerario = detalleItinerario;
	}

	/**
	 * @return the servicioEspecialFactura
	 */
	public Boolean getServicioEspecialFactura() {
		return servicioEspecialFactura;
	}

	/**
	 * @param servicioEspecialFactura
	 *            the servicioEspecialFactura to set
	 */
	public void setServicioEspecialFactura(Boolean servicioEspecialFactura) {
		this.servicioEspecialFactura = servicioEspecialFactura;
	}

	/**
	 * @return the serie
	 */
	public String getNumeroSerie() {
		return numeroserie;
	}

	/**
	 * @param serie
	 *            the serie to set
	 */
	public void setNumeroSerie(String numeroSerie) {
		this.numeroserie = numeroSerie;
	}

	/**
	 * @return the ultimoEmitido
	 */
	public String getUltimoEmitido() {
		return ultimoEmitido;
	}

	/**
	 * @param ultimoEmitido
	 *            the ultimoEmitido to set
	 */
	public void setUltimoEmitido(String ultimoEmitido) {
		this.ultimoEmitido = ultimoEmitido;
	}

	/**
	 * @return the numeroBoletoEmitidos
	 */
	public Integer getNumeroBoletoEmitidos() {
		return numeroBoletoEmitidos;
	}

	/**
	 * @param numeroBoletoEmitidos
	 *            the numeroBoletoEmitidos to set
	 */
	public void setNumeroBoletoEmitidos(Integer numeroBoletoEmitidos) {
		this.numeroBoletoEmitidos = numeroBoletoEmitidos;
	}

	/**
	 * @return the diasTranscurridos
	 */
	public Integer getDiasTranscurridos() {
		return diasTranscurridos;
	}

	/**
	 * @param diasTranscurridos
	 *            the diasTranscurridos to set
	 */
	public void setDiasTranscurridos(Integer diasTranscurridos) {
		this.diasTranscurridos = diasTranscurridos;
	}

	/**
	 * @return the promedioXdia
	 */
	public Double getPromedioXdia() {
		return promedioXdia;
	}

	/**
	 * @param promedioXdia
	 *            the promedioXdia to set
	 */
	public void setPromedioXdia(Double promedioXdia) {
		this.promedioXdia = promedioXdia;
	}

	/**
	 * @return the ultimoEnviadoXAbastecimientos
	 */
	public String getUltimoEnviadoXAbastecimientos() {
		return ultimoEnviadoXAbastecimientos;
	}

	/**
	 * @param ultimoEnviadoXAbastecimientos
	 *            the ultimoEnviadoXAbastecimientos to set
	 */
	public void setUltimoEnviadoXAbastecimientos(
			String ultimoEnviadoXAbastecimientos) {
		this.ultimoEnviadoXAbastecimientos = ultimoEnviadoXAbastecimientos;
	}

	/**
	 * @return the fechaUltimoEnvioXAbastecimientos
	 */
	public String getFechaUltimoEnvioXAbastecimientos() {
		return fechaUltimoEnvioXAbastecimientos;
	}

	/**
	 * @param fechaUltimoEnvioXAbastecimientos
	 *            the fechaUltimoEnvioXAbastecimientos to set
	 */
	public void setFechaUltimoEnvioXAbastecimientos(
			String fechaUltimoEnvioXAbastecimientos) {
		this.fechaUltimoEnvioXAbastecimientos = fechaUltimoEnvioXAbastecimientos;
	}

	/**
	 * @return the operadorTarjetaCredito
	 */
	public OperadorTarjetaCreditoSispas getOperadorTarjetaCredito() {
		return operadorTarjetaCredito;
	}

	/**
	 * @param operadorTarjetaCredito
	 *            the operadorTarjetaCredito to set
	 */
	public void setOperadorTarjetaCredito(
			OperadorTarjetaCreditoSispas operadorTarjetaCredito) {
		this.operadorTarjetaCredito = operadorTarjetaCredito;
	}

	/**
	 * @return the centroCosto
	 */
	public CentroCostoSispas getCentroCosto() {
		return centroCosto;
	}

	/**
	 * @param centroCosto
	 *            the centroCosto to set
	 */
	public void setCentroCosto(CentroCostoSispas centroCosto) {
		this.centroCosto = centroCosto;
	}

	/**
	 * @return the numeroVoucher
	 */
	public String getNumeroVoucher() {
		return numeroVoucher;
	}

	/**
	 * @param numeroVoucher
	 *            the numeroVoucher to set
	 */
	public void setNumeroVoucher(String numeroVoucher) {
		this.numeroVoucher = numeroVoucher;
	}

	/**
	 * @return the cantidadPaxRuta
	 */
	public Integer getCantidadPaxRuta() {
		return cantidadPaxRuta;
	}

	/**
	 * @param cantidadPaxRuta
	 *            the cantidadPaxRuta to set
	 */
	public void setCantidadPaxRuta(Integer cantidadPaxRuta) {
		this.cantidadPaxRuta = cantidadPaxRuta;
	}

	/**
	 * @return the tipoConsulta
	 */
	public Integer getTipoConsulta() {
		return tipoConsulta;
	}

	/**
	 * @param tipoConsulta
	 *            the tipoConsulta to set
	 */
	public void setTipoConsulta(Integer tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}

	/**
	 * @return the horaEmbarque
	 */
	public String getHoraEmbarque() {
		return horaEmbarque;
	}

	/**
	 * @param horaEmbarque
	 *            the horaEmbarque to set
	 */
	public void setHoraEmbarque(String horaEmbarque) {
		this.horaEmbarque = horaEmbarque;
	}

	/**
	 * @return the horaDesembarque
	 */
	public String getHoraDesembarque() {
		return horaDesembarque;
	}

	/**
	 * @param horaDesembarque
	 *            the horaDesembarque to set
	 */
	public void setHoraDesembarque(String horaDesembarque) {
		this.horaDesembarque = horaDesembarque;
	}

	/**
	 * @return Usuario que realiza la Operación Remota
	 */
	public UsuarioSispas getUsuarioRemoto() {
		return usuarioRemoto;
	}

	/**
	 * @param usuarioRemoto
	 *            the usuarioRemoto to set
	 */
	public void setUsuarioRemoto(UsuarioSispas usuarioRemoto) {
		this.usuarioRemoto = usuarioRemoto;
	}

	/**
	 * @return Usuario Hardware desde donde se realiza la Operación Remota
	 */
	public UsuarioHardwareSispas getUsuarioHardwareRemoto() {
		return usuarioHardwareRemoto;
	}

	/**
	 * @param usuarioHardwareRemoto
	 *            the usuarioHardwareRemoto to set
	 */
	public void setUsuarioHardwareRemoto(UsuarioHardwareSispas usuarioHardwareRemoto) {
		this.usuarioHardwareRemoto = usuarioHardwareRemoto;
	}

	/**
	 * @return the esRemoto
	 */
	public Boolean getEsRemoto() {
		return esRemoto;
	}

	/**
	 * @param esRemoto
	 *            the esRemoto to set
	 */
	public void setEsRemoto(Boolean esRemoto) {
		this.esRemoto = esRemoto;
	}

	/**
	 * @return the lstVentaRuta
	 */
	public List<VentaPasajeSispas> getLstVentaXRuta() {
		return lstVentaXRuta;
	}

	/**
	 * @param lstVentaRuta
	 *            the lstVentaRuta to set
	 */
	public void setLstVentaXRuta(List<VentaPasajeSispas> lstVentaXRuta) {
		this.lstVentaXRuta = lstVentaXRuta;
	}

	/**
	 * @return the fechaTransferencia
	 */
	public Date getFechaTransferencia() {
		return fechaTransferencia;
	}

	/**
	 * @param fechaTransferencia
	 *            the fechaTransferencia to set
	 */
	public void setFechaTransferencia(Date fechaTransferencia) {
		this.fechaTransferencia = fechaTransferencia;
	}

	/**
	 * @return the lstPasajeros
	 */
	public List<VentaPasajeSispas> getLstPasajeros() {
		return lstPasajeros;
	}

	/**
	 * @param lstPasajeros
	 *            the lstPasajeros to set
	 */
	public void setLstPasajeros(List<VentaPasajeSispas> lstPasajeros) {
		this.lstPasajeros = lstPasajeros;
	}

	/**
	 * @return the estadoDocumento
	 */
	public String getEstadoDocumento() {
		return estadoDocumento;
	}

	/**
	 * @param estadoDocumento
	 *            the estadoDocumento to set
	 */
	public void setEstadoDocumento(String estadoDocumento) {
		this.estadoDocumento = estadoDocumento;
	}

	/**
	 * @return the tipoMoneda
	 */
	public TipoMonedaSispas getTipoMoneda() {
		return tipoMoneda;
	}

	/**
	 * @param tipoMoneda
	 *            the tipoMoneda to set
	 */
	public void setTipoMoneda(TipoMonedaSispas tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}

	/**
	 * @return the tipoCambio
	 */
	public Double getTipoCambio() {
		return tipoCambio;
	}

	/**
	 * @param tipoCambio
	 *            the tipoCambio to set
	 */
	public void setTipoCambio(Double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	/**
	 * @return the importePagadoEquibalente
	 */
	public Double getImportePagadoEquibalente() {
		return importePagadoEquibalente;
	}

	/**
	 * @param importePagadoEquibalente
	 *            the importePagadoEquibalente to set
	 */
	public void setImportePagadoEquibalente(Double importePagadoEquibalente) {
		this.importePagadoEquibalente = importePagadoEquibalente;
	}

	/**
	 * @return the descuentoEquibalente
	 */
	public Double getDescuentoEquibalente() {
		return descuentoEquibalente;
	}

	/**
	 * @param descuentoEquibalente
	 *            the descuentoEquibalente to set
	 */
	public void setDescuentoEquibalente(Double descuentoEquibalente) {
		this.descuentoEquibalente = descuentoEquibalente;
	}

	/**
	 * @return the tarifaEquibalente
	 */
	public Double getTarifaEquibalente() {
		return tarifaEquibalente;
	}

	/**
	 * @param tarifaEquibalente
	 *            the tarifaEquibalente to set
	 */
	public void setTarifaEquibalente(Double tarifaEquibalente) {
		this.tarifaEquibalente = tarifaEquibalente;
	}

	/**
	 * @return the empresa
	 */
	public CompaniaSispas getEmpresa() {
		return empresa;
	}

	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(CompaniaSispas empresa) {
		this.empresa = empresa;
	}

	public Integer getAgenciausuario() {
		return Agenciausuario;
	}

	public void setAgenciausuario(Integer agenciausuario) {
		Agenciausuario = agenciausuario;
	}

	public AgenciaSispas getAgenciaVenta() {
		return agenciaVenta;
	}

	public void setAgenciaVenta(AgenciaSispas agenciaVenta) {
		this.agenciaVenta = agenciaVenta;
	}

	/**
	 * @return the codigoReferencia
	 */
	public String getCodigoReferencia() {
		return codigoReferencia;
	}

	
	
	
	public String getCorreoContacto() {
		return correoContacto;
	}

	public void setCorreoContacto(String correoContacto) {
		this.correoContacto = correoContacto;
	}

	public String getCorreoTarjeta() {
		return correoTarjeta;
	}

	public void setCorreoTarjeta(String correoTarjeta) {
		this.correoTarjeta = correoTarjeta;
	}

	public String getTelefonoweb() {
		return telefonoweb;
	}

	public void setTelefonoweb(String telefonoweb) {
		this.telefonoweb = telefonoweb;
	}

	/**
	 * @param codigoReferencia the codigoReferencia to set
	 */
	public void setCodigoReferencia(String codigoReferencia) {
		this.codigoReferencia = codigoReferencia;
	}

	public Integer getNronivel() {
		return nronivel;
	}

	public void setNronivel(Integer nronivel) {
		this.nronivel = nronivel;
	}

	public Integer getNroTotal() {
		return nroTotal;
	}

	public void setNroTotal(Integer nroTotal) {
		this.nroTotal = nroTotal;
	}

	public Integer getPripiso() {
		return pripiso;
	}

	public void setPripiso(Integer pripiso) {
		this.pripiso = pripiso;
	}

	public Integer getSegpiso() {
		return segpiso;
	}

	public void setSegpiso(Integer segpiso) {
		this.segpiso = segpiso;
	}

	public UsuarioSispas getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(UsuarioSispas funcionario) {
		this.funcionario = funcionario;
	}

	/**
	 * @return the idordenser
	 */
	public Integer getIdordenser() {
		return idordenser;
	}

	/**
	 * @param idordenser the idordenser to set
	 */
	public void setIdordenser(Integer idordenser) {
		this.idordenser = idordenser;
	}

	/**
	 * @return the nroOrden
	 */
	public String getNroOrden() {
		return nroOrden;
	}

	/**
	 * @param nroOrden the nroOrden to set
	 */
	public void setNroOrden(String nroOrden) {
		this.nroOrden = nroOrden;
	}

	/**
	 * @return the estadoordenser
	 */
	public String getEstadoordenser() {
		return estadoordenser;
	}

	/**
	 * @param estadoordenser the estadoordenser to set
	 */
	public void setEstadoordenser(String estadoordenser) {
		this.estadoordenser = estadoordenser;
	}

	/**
	 * @return the idcancelacionvt
	 */
	public Integer getIdcancelacionvt() {
		return idcancelacionvt;
	}

	/**
	 * @param idcancelacionvt the idcancelacionvt to set
	 */
	public void setIdcancelacionvt(Integer idcancelacionvt) {
		this.idcancelacionvt = idcancelacionvt;
	}

	/**
	 * @return the stcancelacionvt
	 */
	public String getStcancelacionvt() {
		return stcancelacionvt;
	}

	/**
	 * @param stcancelacionvt the stcancelacionvt to set
	 */
	public void setStcancelacionvt(String stcancelacionvt) {
		this.stcancelacionvt = stcancelacionvt;
	}

	public String getPurchaseOperationNumber() {
		return purchaseOperationNumber;
	}

	public void setPurchaseOperationNumber(String purchaseOperationNumber) {
		this.purchaseOperationNumber = purchaseOperationNumber;
	}

	
	/**
	 * @return the pripollo
	 */
	public Integer getPripollo() {
		return pripollo;
	}

	/**
	 * @param pripollo the pripollo to set
	 */
	public void setPripollo(Integer pripollo) {
		this.pripollo = pripollo;
	}

	/**
	 * @return the pricarne
	 */
	public Integer getPricarne() {
		return pricarne;
	}

	/**
	 * @param pricarne the pricarne to set
	 */
	public void setPricarne(Integer pricarne) {
		this.pricarne = pricarne;
	}

	/**
	 * @return the privegetariana
	 */
	public Integer getPrivegetariana() {
		return privegetariana;
	}

	/**
	 * @param privegetariana the privegetariana to set
	 */
	public void setPrivegetariana(Integer privegetariana) {
		this.privegetariana = privegetariana;
	}

	/**
	 * @return the priinfantil
	 */
	public Integer getPriinfantil() {
		return priinfantil;
	}

	/**
	 * @param priinfantil the priinfantil to set
	 */
	public void setPriinfantil(Integer priinfantil) {
		this.priinfantil = priinfantil;
	}

	/**
	 * @return the segpollo
	 */
	public Integer getSegpollo() {
		return segpollo;
	}

	/**
	 * @param segpollo the segpollo to set
	 */
	public void setSegpollo(Integer segpollo) {
		this.segpollo = segpollo;
	}

	/**
	 * @return the segcarne
	 */
	public Integer getSegcarne() {
		return segcarne;
	}

	/**
	 * @param segcarne the segcarne to set
	 */
	public void setSegcarne(Integer segcarne) {
		this.segcarne = segcarne;
	}

	/**
	 * @return the segvegetariana
	 */
	public Integer getSegvegetariana() {
		return segvegetariana;
	}

	/**
	 * @param segvegetariana the segvegetariana to set
	 */
	public void setSegvegetariana(Integer segvegetariana) {
		this.segvegetariana = segvegetariana;
	}

	/**
	 * @return the seginfantil
	 */
	public Integer getSeginfantil() {
		return seginfantil;
	}

	/**
	 * @param seginfantil the seginfantil to set
	 */
	public void setSeginfantil(Integer seginfantil) {
		this.seginfantil = seginfantil;
	}

	/**
	 * @return the enviadoSFE
	 */
	public Integer getEnviadoSFE() {
		return enviadoSFE;
	}

	/**
	 * @param enviadoSFE the enviadoSFE to set
	 */
	public void setEnviadoSFE(Integer enviadoSFE) {
		this.enviadoSFE = enviadoSFE;
	}

	/**
	 * @return the fechaEnvioSFE
	 */
	public Date getFechaEnvioSFE() {
		return fechaEnvioSFE;
	}

	/**
	 * @param fechaEnvioSFE the fechaEnvioSFE to set
	 */
	public void setFechaEnvioSFE(Date fechaEnvioSFE) {
		this.fechaEnvioSFE = fechaEnvioSFE;
	}

	/**
	 * @return the result
	 */
	public Result getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(Result result) {
		this.result = result;
	}

	/**
	 * @return the tipoNota
	 */
	public TipoNotaSispas getTipoNota() {
		return tipoNota;
	}

	/**
	 * @param tipoNota the tipoNota to set
	 */
	public void setTipoNota(TipoNotaSispas tipoNota) {
		this.tipoNota = tipoNota;
	}

	/**
	 * @return the igv
	 */
	public Double getIgv() {
		return igv;
	}

	/**
	 * @param igv the igv to set
	 */
	public void setIgv(Double igv) {
		this.igv = igv;
	}

	/**
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	/**
	 * @return the difTarjetaPagado
	 */
	public Double getDifTarjetaPagado() {
		return difTarjetaPagado;
	}

	/**
	 * @param difTarjetaPagado the difTarjetaPagado to set
	 */
	public void setDifTarjetaPagado(Double difTarjetaPagado) {
		this.difTarjetaPagado = difTarjetaPagado;
	}

	/**
	 * @return the estadobolcredito
	 */
	public String getEstadobolcredito() {
		return estadobolcredito;
	}

	/**
	 * @param estadobolcredito the estadobolcredito to set
	 */
	public void setEstadobolcredito(String estadobolcredito) {
		this.estadobolcredito = estadobolcredito;
	}

	/**
	 * @return the importeEsperado
	 */
	public Double getImporteEsperado() {
		return importeEsperado;
	}

	/**
	 * @param importeEsperado the importeEsperado to set
	 */
	public void setImporteEsperado(Double importeEsperado) {
		this.importeEsperado = importeEsperado;
	}

	/**
	 * @return the importeDescuentos
	 */
	public Double getImporteDescuentos() {
		return importeDescuentos;
	}

	/**
	 * @param importeDescuentos the importeDescuentos to set
	 */
	public void setImporteDescuentos(Double importeDescuentos) {
		this.importeDescuentos = importeDescuentos;
	}

	/**
	 * @return the importeReal
	 */
	public Double getImporteReal() {
		return importeReal;
	}

	/**
	 * @param importeReal the importeReal to set
	 */
	public void setImporteReal(Double importeReal) {
		this.importeReal = importeReal;
	}

	/**
	 * @return the fechaEmisionUltimoCompb
	 */
	public Date getFechaEmisionUltimoCompb() {
		return fechaEmisionUltimoCompb;
	}

	/**
	 * @param fechaEmisionUltimoCompb the fechaEmisionUltimoCompb to set
	 */
	public void setFechaEmisionUltimoCompb(Date fechaEmisionUltimoCompb) {
		this.fechaEmisionUltimoCompb = fechaEmisionUltimoCompb;
	}

	public Double getCantidadBulto() {
		return cantidadBulto;
	}

	public void setCantidadBulto(Double cantidadBulto) {
		this.cantidadBulto = cantidadBulto;
	}

	public Double getCantidadPeso() {
		return cantidadPeso;
	}

	public void setCantidadPeso(Double cantidadPeso) {
		this.cantidadPeso = cantidadPeso;
	}

	public Double getImporteCarga() {
		return importeCarga;
	}

	public void setImporteCarga(Double importeCarga) {
		this.importeCarga = importeCarga;
	}

	public Double getPorcentajeOcupacion() {
		return porcentajeOcupacion;
	}

	public void setPorcentajeOcupacion(Double porcentajeOcupacion) {
		this.porcentajeOcupacion = porcentajeOcupacion;
	}

	public Double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(Double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public Double getSolxKmSispas() {
		return solxKmSispas;
	}

	public void setSolxKmSispas(Double solxKmSispas) {
		this.solxKmSispas = solxKmSispas;
	}

	public Double getSolxKmSiscar() {
		return solxKmSiscar;
	}

	public void setSolxKmSiscar(Double solxKmSiscar) {
		this.solxKmSiscar = solxKmSiscar;
	}

	public Double getSolxKmAcumulado() {
		return solxKmAcumulado;
	}

	public void setSolxKmAcumulado(Double solxKmAcumulado) {
		this.solxKmAcumulado = solxKmAcumulado;
	}

	public String getPurchaseoperationnew() {
		return purchaseoperationnew;
	}

	public void setPurchaseoperationnew(String purchaseoperationnew) {
		this.purchaseoperationnew = purchaseoperationnew;
	}

	public String getPurchaseoperationiubiz() {
		return purchaseoperationiubiz;
	}

	public void setPurchaseoperationiubiz(String purchaseoperationiubiz) {
		this.purchaseoperationiubiz = purchaseoperationiubiz;
	}

	public String getNrooperationpagoefectivo() {
		return nrooperationpagoefectivo;
	}

	public void setNrooperationpagoefectivo(String nrooperationpagoefectivo) {
		this.nrooperationpagoefectivo = nrooperationpagoefectivo;
	}

	public String getNrocippagoefectivo() {
		return nrocippagoefectivo;
	}

	public void setNrocippagoefectivo(String nrocippagoefectivo) {
		this.nrocippagoefectivo = nrocippagoefectivo;
	}

	public String getNroticketbetterez() {
		return nroticketbetterez;
	}

	public void setNroticketbetterez(String nroticketbetterez) {
		this.nroticketbetterez = nroticketbetterez;
	}

	public Integer getIdparentesco() {
		return idparentesco;
	}

	public void setIdparentesco(Integer idparentesco) {
		this.idparentesco = idparentesco;
	}

	public Long getIdventaparents() {
		return idventaparents;
	}

	public void setIdventaparents(Long idventaparents) {
		this.idventaparents = idventaparents;
	}

	public Long getVentaTransaccion() {
		return ventaTransaccion;
	}

	public void setVentaTransaccion(Long ventaTransaccion) {
		this.ventaTransaccion = ventaTransaccion;
	}

	public Integer getIdtipopasajero() {
		return idtipopasajero;
	}

	public void setIdtipopasajero(Integer idtipopasajero) {
		this.idtipopasajero = idtipopasajero;
	}

	public String getRelacionParentesco() {
		return relacionParentesco;
	}

	public void setRelacionParentesco(String relacionParentesco) {
		this.relacionParentesco = relacionParentesco;
	}

	public String getResponsableParantesco() {
		return responsableParantesco;
	}

	public void setResponsableParantesco(String responsableParantesco) {
		this.responsableParantesco = responsableParantesco;
	}

	public String getPromocionEcommerce() {
		return promocionEcommerce;
	}

	public void setPromocionEcommerce(String promocionEcommerce) {
		this.promocionEcommerce = promocionEcommerce;
	}

	public boolean isNoVinculadoParentesco() {
		return noVinculadoParentesco;
	}

	public void setNoVinculadoParentesco(boolean noVinculadoParentesco) {
		this.noVinculadoParentesco = noVinculadoParentesco;
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