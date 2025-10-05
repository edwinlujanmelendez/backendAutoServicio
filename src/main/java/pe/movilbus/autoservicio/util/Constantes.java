package pe.movilbus.autoservicio.util;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Constantes implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	public static final int ID_LOCALIDAD_LIMA = 72;
	public static final String ACTIVO = "A";
	public static final int ID_TIPITI_REGULAR = 1;
	public static final int ACTIVO_ITINERARIO = 0;
	public static final int ACTIVO_DETITI_RUTA = 0;
	
	public static final boolean RESULT_TRUE = true;
	public static final boolean RESULT_FALSE = false;
	
	public static final BigDecimal ID_AGENCIA_MOVIL_WEB = new BigDecimal("387");
	public static final BigDecimal ID_USUARIO_MOVIL_WEB = new BigDecimal("1133");
	public static final BigDecimal ID_HARDWARE_MOVIL_WEB = new BigDecimal("699");
	public static final BigDecimal ID_CANAL_VENTAS_WEB = new BigDecimal("4");
	public static final String     USUARIO_INSER_MODIFICACION = "webmovil";
	public static final String ID_UBIGEO_BUS_PORTAL = "150101";
	public static final String  ID_TIPO_REG_VENPAS_COMPRADO = "1";
    public static final String  ID_TIPO_REG_NO_PAGO_VENTAW = "0";
    public static final Integer ID_TIPO_MOVIMIENTO_CREDITO = 4;
	
	public static final int DESCUENTO_TARIFA = 1;
	public static final int DESCUENTO_PORCENTAJE = 2;
	public static final int DESCUENTO_ECO_INTERNO_PORCENTAJE = 7;
	public static final int DESCUENTO_ECO_INTERNO_TARIFA = 8;
	
	//public static final int ID_TIPMOV_ANULACION_SISTEMA = 5;
	//public static final int ID_TIPMOV_DEVOLUCION = 6;
	//public static final int ID_TIPMOV_ANULACION = 13;
	//public static final int ID_TIPMOV_DEV_EMPRESA = 14;
	
	/*	Para las fechas*/
	public static final String DATE_FORMAT="dd/MM/yyyy";
	public static final String DATE_TIME_FORMAT="dd/MM/yyyy HH:mm:ss";
	public static final String TIME_FORMAT = "HH:mm:ss";
	public static final String DATE_ANIO="YY"; // Formato de Anio
	public static final String DATE_MES_DESC="MMMM"; // Formato del mes - descripción.
	public static final String DATE_DIA="DD"; // Formato de Dia
	
	// Cantidad de digito por Tipo de Documento
	public static final int LENGHT_RUC = 11;
	public static final int LENGHT_DNI = 8;
	public static final int LENGHT_CARNETEXT_PASAPORT = 12;
	public static final int LENGHT_PARTNACIMIENTO_OTROS = 15;
		
	// FLAG ACTUALIZACION GENERAL
	public static final int N_FLAG_ACTUALIZADO = 1;
	public static final int N_FLAG_NO_ACTUALIZADO = 0;
	
	// VICTOR - CONSUMO DE WS PARA LA EMPRESA ALTERNATIVAS CONTABLES
	public static final int ID_PERMISOS_WS_DNI = 1;
	public static final int ID_PERMISOS_WS_RUC = 2;
	public static final String TOKEN_WS = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjY4ZjRmMTE1YTgyMThjNGQyNDU1YzhkZDM4YmY4YmJiMGY2MTdlNzQ0MmQxYmU2MDFmNzBlZjFiOTM0NDQxMjg1MzBiMjE2YmUwN2FkMTQ5In0.eyJhdWQiOiIxIiwianRpIjoiNjhmNGYxMTVhODIxOGM0ZDI0NTVjOGRkMzhiZjhiYmIwZjYxN2U3NDQyZDFiZTYwMWY3MGVmMWI5MzQ0NDEyODUzMGIyMTZiZTA3YWQxNDkiLCJpYXQiOjE1OTQyMzA1ODcsIm5iZiI6MTU5NDIzMDU4NywiZXhwIjoxOTA5NzYzMzg3LCJzdWIiOiIxMzMwIiwic2NvcGVzIjpbIioiXX0.nB1a3ZRjBHB5as56RZWpwBg3MzhC6UtfjkOaX4NnBNftXp8kbDxDbgMpEANJph8rYgMIczhhhzwQPdy9nnWUFmNskbBouW6wtxhZOs9hs18Fzk6Y4t3rVCt4VRhNntkvNWbGh3GUbf-lyjpSar3yliDXXG3H_t6vYEOeZkXwx6e3rAPNY1CR9gbWIi0P6Ykm03-lmQvxdoDgO5d-L_lRPxZHGVWg38UBM8QL5phUrnB9SMyvRRGDYv8974UBpOo1ZTQYZIvUww0lWf8kyRsZWHDsoUEvov8mytHaPkVLh9Y8UoWg2J6MKv326K0dCkpMjIBql9MS89HoQgeFz75hDDYEsXnwbwCB0UiILxDduvaOIAiJJdT9qRplOSWUqrPOyMRUVF21UAbkAo9JwNDpgjrKTmOuSLD90dC6V9v6cR26LPbY8bbDdAotS0Zv5G9lWXfxtUSKopv5Vb7TiocfaHuTnM8KjyIwkFa_v2IqlUzp6WmXQTkEzPbvUp3qdBu6c8Xs7v1InwgL4b-QRfNjAszcxt5nUH3fAnS-T8JtTE6GonztmTR5vP5FpAbfFY2mOdaQvta040iGueFWUfH-ih6TskHeiPYshnO7C84H-5fxAqG6XK54iEFylCy739F1ilYxH-riyCZICtpHF_PAE61DgRVgNyy5PgUVy-XMxxw";
		
	public static final int FORMA_PAGO_ID_CREDITO = 2;
	public static final int ID_TIP_FORMA_PAGO_TARJETA = 7;
	public static final int ID_TIP_FORMA_PAGO_PAGO_EFECTIVO = 11;
	public static final int TIPO_COMPROBANTE_VOUCHER_AGENCIA_VIAJE = 5;
	public static final int TIPO_COMPROBANTE_BOLETO_DE_VIAJE = 1;
	public static final int TIPO_COMPROBANTE_BOLETO_DE_VENTA = 7;
	public static final String RUC_MOVIL_BUS = "20555901179"; //se usara de group. ruc bus - 20555893052
	
	public static final int RS_WS_REGISTRADO     = 0;
	public static final int RS_WS_DENEGADO     = 2;
	public static final int RS_WS_AUTORIZADO     = 3;
	public static final int RS_WS_DESAPROBADO  = 9;
	public static final int RS_WS_INCOMPLETO   = 13;
	public static final int RS_WS_PENDIENTE_PAGO = 17;
	

	// estado de FE
    public static final int ESTADO_FE_NO_REGISTRADO = 0;
    public static final int ESTADO_FE_REGISTRADO    = 1;

    // parametros de payment
    public static final BigDecimal CODIGO_MONEDA_COMPRA_SOLES = new BigDecimal("604");
	public static final String CODIGO_IDIOMA_TRANSACCION_ESPANOL = "SP";
	public static final String PAIS_COMPRA = "PE";
	public static final String LENGUAJE_PROGRAMCION_VPOS = "JAVA";
	public static final String NOMBRE_PRODUCTO_ADQUIRIDO = "VENTA DE PASAJE INTERPROV";
	public static final String PAGO_ALTERNATIVO_TIPO= "OTHER";
	public static final String PAGO_ALTERNATIVO_MARCA_PE= "PAEF";
	public static final String PAGO_ALTERNATIVO_OPCION_PAGO_EFECTIVO= "2";

	// INTEGRACION CON NIUBIZ - PAGOEFECTIVO
	public static final int  MINUTOS_TIME_PAY_NIUBIZ = 15;
	public static final int  HORAS_PAGO_EFECTIVO     = 2;
	
	// mensaje niubiz
	public static final String COD_NIUBIZ_AUTORIZADO = "200";
	
	// mensaje de respuesta - PAYMENT
	public static final String MSJ_TRANSACCION_CANCELADA = "TRANSACCION CANCELADA";
	public static final String MSJ_TRANSACCION_SATISFACTORIA = "SU COMPRA SE REALIZÓ SATISFACTORIAMENTE";
	public static final String MSJ_TRANSACCION_NO_APROBADA = "SU TRANSACCION NO FUE APROBADA";
	public static final String MSJ_TRANSACCION_NRO_CUENTA_INVALIDO = "SU NRO DE CUENTA ES INVALIDA";
	public static final String MSJ_TRANSACCION_NRO_ORDEN_DUPLICADO = "NRO DE ORDEN DUPLICADA";
	
	public static final String COD_ERROR_TRANSACCION_CANCELADA = "2300";
	public static final String COD_ERROR_TRANSACCION_SATISFACTORIA = "00";
	public static final String COD_ERROR_TRANSACCION_NO_APROBADA = "2401";
	public static final String COD_ERROR_TRANSACCION_NRO_CUENTA_INVALIDO = "14";
	public static final String COD_ERROR_TRANSACCION_NRO_ORDEN_DUPLICADO = "2202";
	
	public static final String COD_OPERACION_AUTORIZADA = "00";
	public static final String COD_OPERACION_DENEGADA = "01";
	public static final String COD_OPERACION_PENDIENTE_PAGO = "03";
	public static final String COD_OPERACION_RECHAZADA = "05";
	
	public static final String MSJ_OPERACION_AUTORIZADA = "OPERACION AUTORIZADA";
	public static final String MSJ_OPERACION_DENEGADA = "OPERACION DENEGADA";
	public static final String MSJ_OPERACION_PENDIENTE_PAGO = "PENDIENTE DE PAGO";
	public static final String MSJ_OPERACION_RECHAZADA = "OPERACIÓN RECHAZADA";
	
	public static final String NRO_OPERACION_PAYMENT = "3582"; // 538 old
	
	// Actualizar ventas
	public static final String TIPO_REGISTRO_VENPAS_PAGADO = "1";
	public static final Integer  ID_SERIE_WEB = 239;
	
	/*	Constantes que referencian a los tipos de Agencia	*/
	public static final int ID_TIPAGE_MOVIL = 1;
	public static final int ID_TIPAGE_VIAJES = 2;
	public static final int ID_TIPAGE_CORPORATIVO = 3;
	
	/*	Constantes que referencian a los Tipos de Comprobante	*/
	public static final int ID_TIPCOM_BOLETO_VIAJE=1;
	public static final int ID_TIPCOM_FACTURA=2;
	public static final int ID_TIPCOM_RECIBO_CAJA=3;	
	public static final int ID_TIPCOM_MANIFIESTO_PAX=4;
	public static final int ID_TIPCOM_VOUCHER_AGENCIA_VIAJES=5;
	public static final int ID_TIPCOM_VOUCHER_CORPORATIVO=6;
	public static final int ID_TIPCOM_BOLETA_VENTA=7;
	public static final int ID_TIPCOM_NOTA_CREDITO=8;
	public static final int ID_TIPCOM_NOTA_DEBITO=9;
	
	/*	Para indicar si es verdadero o falso*/
	public static final int TRUE_VALUE = 1;
	public static final int FALSE_VALUE = 0;
	
	/*	Para el estado de la Liquidacion */
	public static final int LIQUI_ESTA_CERRADO=0;
	public static final int LIQUI_ESTA_ABIERTO=1;
	public static final String LIQUI_ESTA_CERRADO_LABEL="CERRADA";
	public static final String LIQUI_ESTA_ABIERTO_LABEL="ABIERTA";
	
	/*	Para expresar el tiempo en milisegundos	*/
	public static final long MILISEGUNDOS_X_DIA = 86400000;
	public static final long MILISEGUNDOS_X_HORA = 3600000;
	public static final long MILISEGUNDOS_X_MINUTO= 60000;
	public static final long MILISEGUNDOS_X_SEGUNDO= 1000;
	
	/*	Para dar formato a las fechas y horas	*/
	public static final DateFormat FORMAT_DATE = new SimpleDateFormat ("dd/MM/yyyy");
	public static final DateFormat FORMAT_YEAR = new SimpleDateFormat ("yyyy");
	public static final DateFormat FORMAT_MONTH = new SimpleDateFormat ("MM");
	public static final DateFormat FORMAT_DAY = new SimpleDateFormat ("dd");
	public static final DateFormat FORMAT_TIME = new SimpleDateFormat ("HH:mm");
	public static final DateFormat FORMAT_TIME_12HRAS = new SimpleDateFormat ("hh:mm");
	public static final DateFormat FORMAT_TIME_24HRAS = new SimpleDateFormat ("hh:mm:ss");
	public static final DateFormat FORMAT_LONG = new SimpleDateFormat ("dd/MM/yyyy HH:mm");
	public static final DateFormat FORMAT_DATE_TIME_24H = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		
	// CONFIGURACION CON OFFICE 365 - PRODUCCION
    public static final String mail_stmp_host = "smtp.office365.com";
    public static final String mail_stmp_starttls = "true";
    public static final String mail_stmp_port = "587";
    public static final String mail_stmp_auth = "true";    
    public static final String correo_remitente   = "no_reply@movilbus.pe";
    public static final String password_remitente = "Wol31614";
    
    // Resultado de la Web Services en Pago Efectivo
    public static final String id_pago_registrado     = "0";
    public static final String id_pago_autorizado     = "3";
    public static final String id_pago_liquidado      = "7";
    public static final String id_pago_desaprobado    = "9";
    public static final String id_pago_incompleto     = "13";
    public static final String id_pago_pendiente_pago = "17";    
    public static final String id_pago_expirado       = "18"; 
    
    // Cuando el nro de operacion no existe en el portal de Payment
    public static final String id_cod_error_no_existe = "7003"; 
    // Artificio
    public static final String id_pago_no_existe = "99"; 
    	
	/*Constantes que referencian a los identificadores de cada empresa*/
   	public static final int ID_EMPRESA_MOVIL_BUS=1;
   	public static final int ID_EMPRESA_MOVIL_TOURS=2;
   	
   	/*	Constantes que referencian al tipo de movimiento	*/
	public static final int ID_TIPMOV_EFECTIVO = 1;
	public static final int ID_TIPMOV_POSTERGACION = 2;
	public static final int ID_TIPMOV_REIMPRESION = 3;
	public static final int ID_TIPMOV_CREDITO = 4;
	public static final int ID_TIPMOV_ANULACION_SISTEMA = 5;
	public static final int ID_TIPMOV_DEVOLUCION = 6;
	public static final int ID_TIPMOV_CONFIRMACION_FA = 7;
	public static final int ID_TIPMOV_FECHA_ABIERTA = 8;
	public static final int ID_TIPMOV_POSTERGACION_FA = 9;
	public static final int ID_TIPMOV_CORTESIA = 10;
	public static final int ID_TIPMOV_RESERVA = 11;
	public static final int ID_TIPMOV_PREPAGADO = 12;
	public static final int ID_TIPMOV_ANULACION = 13;
	public static final int ID_TIPMOV_DEV_EMPRESA = 14;
	public static final int ID_TIPMOV_GASTOS_ADMINISTRATIVOS = 15;
	
	/*	Constantes que referencian a las formas de pago	*/
	public static final int ID_FORPAG_CONTADO=1;
	public static final int ID_FORPAG_CREDITO=2;
	public static final int ID_FORPAG_CORTESIA=3;
	
	/*	Constantes que referencian a los tipos de forma de pago	*/
	public static final int ID_TIPFORPAG_EFECTIVO = 1;
	public static final int ID_TIPFORPAG_CANJE_PUBLICITARIO = 2;
	public static final int ID_TIPFORPAG_CUMPLEANIOS = 3;
	public static final int ID_TIPFORPAG_CREDITO = 4;
	public static final int ID_TIPFORPAG_PUNTOS = 5;
	public static final int ID_TIPFORPAG_TRANSFERENCIA=6; // DEPOSITO	
	public static final int ID_TIPFORPAG_TARJETA=7;
	public static final int ID_TIPFORPAG_CORTESIA=8;
	public static final int ID_TIPFORPAG_ORDEN_TRABAJO=9;
	public static final int ID_TIPFORPAG_PAGO_EFECTIVO=11;
	public static final int ID_TIPFORPAG_ORBIS=12; // ORBIS(PAGO EFECTIVO)
	public static final int ID_TIPFORPAG_PAGOLINK=13; // PAGOLINK
	public static final int ID_TIPFORPAG_MIGRACION=14; //   BT-CONFIRM. FA
	public static final int ID_TIPFORPAG_MIGRACION_1=15; // BT-EDICION VTA.
	
	/*	Constantes que referencian a los Canales de Venta	*/
	public static final int ID_CANVEN_DELIVERY = 1;
	public static final int ID_CANVEN_AGENTE = 2;
	public static final int ID_CANVEN_COUNTER = 3;
	public static final int ID_CANVEN_WEB = 4;
	public static final int ID_CANVEN_AGENCIA_VIAJES = 5;
	public static final int ID_CANVEN_CORPORATIVO = 6;
	
	/*Constantes que refieren el tipo de documeto del Pasajero*/
	public static final int ID_TIPDOC_DNI=1;
	public static final int ID_TIPDOC_RUC=2;
	public static final int ID_TIPDOC_TARJETA_CIRCULACION=3;
	public static final int ID_TIPDOC_SN=9;
	public static final int ID_TIPDOC_CARNET_EXTRANJERIA=8;
	public static final int ID_TIPDOC_PASAPORTE=6;
	public static final int ID_TIPDOC_CEDULA_IDENTIDAD=7;
	
	/* Guarda el valor del IGV actual */
	public static final double IGV=18;
	
	/*	Para el estado de Registro	*/
	public static final String VALUE_ACTIVO="A";
	public static final String VALUE_INACTIVO="I";	
	public static final String LABEL_ACTIVO_DESCP="ACTIVO";
	public static final String LABEL_INACTIVO_DESCP="INACTIVO";
	
	// Para Validar y indicar que nombre de archivo debe ser txt
	public static final int CLAVE_MB = 1; // id movil_bus :: 1
	public static final String DSC_MB ="MOVIL BUS" ; // id movil_bus :: 1
	public static final String SIGLA_MB = "MB";
	
	// Para Validar y indicar que nombre de archivo debe ser txt
	public static final int CLAVE_MT = 2; // id movil_tours :: 2
	public static final String DSC_MT = "MOVIL TOURS"; // id movil_tours :: 2
}
