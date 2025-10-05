package pe.movilbus.autoservicio.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class VentaPasajeListSispas implements Serializable, Cloneable {
	
	private static final long serialVersionUID = 1L;
	private BigDecimal venpas_id;				//1
	private BigDecimal venpas_idref;			//2
	private BigDecimal itinerario_id;			//3
	private BigDecimal ruta_id;					//4
	private String c_origen;					//5
	private String c_destino;					//6
	private BigDecimal cliente_id;				//7
	private String doccli;						//8
	private String c_razsoc;					//9
	private BigDecimal pasajero_id;				//10
	private String c_apepat;					//11
	private String c_apemat;					//12
	private String c_nombre;					//13
	private BigDecimal tipdoc_id;				//14
	private String tipdoc;						//15
	private String docpax;						//16
	private String c_fecnac;					//17
	private BigDecimal forpag_id;				//18
	private String formaPago;					//19
	private BigDecimal servicio_id;				//20
	private String servicio;					//21
	private BigDecimal tipcom_id;				//22
	private String tipoComprobante;				//23
	private BigDecimal tipmov_id;				//24
	private String tipoMovimiento;				//25
	private BigDecimal tipforpag_id;			//26
	private String tipoformaPago;				//27
	private BigDecimal tarcre_id;				//28
	private String tarjetacredito;				//29
	private String c_numboleto;					//30
	private Integer n_numasiento;				//31
	private Integer n_numpiso;					//32
	private String fecpar;						//33
	private String c_horpar;					//34
	private String feclle;						//35
	private String c_horlle;					//36
	private BigDecimal n_secuencial;			//37
	private BigDecimal n_tarifa;				//38
	private BigDecimal n_recargo;				//39
	private BigDecimal n_descuento;				//40
	private BigDecimal n_penalidad;				//41
	private BigDecimal n_imppag;				//42
	private BigDecimal n_acuenta;				//43
	private String c_tiptra;					//44
	private Date d_feccad;						//45
	private String fecliq;						//46
	private BigDecimal agencia_id;				//47
	private String agencia;						//48
	private BigDecimal usuario_id;				//49
	private String c_login;						//50
	private BigDecimal canven_id;				//51
	private String canalVenta;					//52
	private BigDecimal manifiesto_id;			//53
	private String n_numopeban;					//54
	private Date fecexpres;						//55
	private String c_horexpres;					//56
	private BigDecimal preali_id;				//57
	private String alimentacion;				//58
	private BigDecimal idAgeLlegada;			//59
	private String partida;						//60
	private BigDecimal idAgePartida;			//61
	private String agDestino;					//62
	private String c_numcontrol;				//63
	private BigDecimal liquidacion_id;			//64
	private String c_estreg;					//65
	private String audfecins;					//66
	private String audusuins;					//67
	private String audipinse;					//68
	private BigDecimal opetarcre_id;			//69
	private String opetarcre;					//70
	private String c_numbolant;					//71
	private BigDecimal n_idaret;				//72
	private String c_rucclicre;					//73
	private BigDecimal n_esfecabi;				//74
	private String c_nomape;					//75
	private String c_observaciones;				//76
	private BigDecimal venpas_idoriginal;		//77
	private BigDecimal n_imppagefe;				//78
	private BigDecimal n_imppagtar;				//79
	private BigDecimal promocion_id;			//80
	private BigDecimal n_ididaret;				//81
	private BigDecimal cencos_id;				//82
	private String c_codigo;					//83
	private String c_denominacion;				//84
	private String c_estdoc;					//85
	private BigDecimal tipmon_id;				//86
	private String c_unimon;					//87
	private String c_simmon;					//88
	private BigDecimal n_imppagequ;				//89
	private String nombreCortoAgenciaPartida;	//90
	private BigDecimal n_tarifaequ;				//91
	private BigDecimal n_desequ;				//92
	private BigDecimal n_tipcam;				//93
	private BigDecimal empresa_id;				//94
	private String razon;						//95
	private String dirpartida;					//96
	private String dirllegada;					//97
	private String empnombcor;					//98
	private String empsigla;					//99
	private String c_stateos;					//100
	private BigDecimal cancelacionvt_id;		//101
	private String c_statecvt;					//102
	private String rdireccionCliente;			//103
	private String tipodocnomcor;				//104
	private String docempresa;					//105
	private String nombserviciog;				//106
	private String usuapepat;					//107
	private String usuapemat;					//108
	private String usunombre;					//109
	private String c_codref;					//110
	
	public VentaPasajeListSispas(BigDecimal venpas_id, BigDecimal venpas_idref, BigDecimal itinerario_id,
			BigDecimal ruta_id, String c_origen, String c_destino, BigDecimal cliente_id, String doccli,
			String c_razsoc, BigDecimal pasajero_id, String c_apepat, String c_apemat, String c_nombre,
			BigDecimal tipdoc_id, String tipdoc, String docpax, String c_fecnac, BigDecimal forpag_id, String formaPago,
			BigDecimal servicio_id, String servicio, BigDecimal tipcom_id, String tipoComprobante, BigDecimal tipmov_id,
			String tipoMovimiento, BigDecimal tipforpag_id, String tipoformaPago, BigDecimal tarcre_id,
			String tarjetacredito, String c_numboleto, Integer n_numasiento, int n_numpiso, String fecpar, String c_horpar,
			String feclle, String c_horlle, BigDecimal n_secuencial, BigDecimal n_tarifa, BigDecimal n_recargo,
			BigDecimal n_descuento, BigDecimal n_penalidad, BigDecimal n_imppag, BigDecimal n_acuenta, String c_tiptra,
			Date d_feccad, String fecliq, BigDecimal agencia_id, String agencia, BigDecimal usuario_id,
			String c_login, BigDecimal canven_id, String canalVenta, BigDecimal manifiesto_id, String n_numopeban,
			Date fecexpres, String c_horexpres, BigDecimal preali_id, String alimentacion, BigDecimal idAgeLlegada,
			String partida, BigDecimal idAgePartida, String agDestino, String c_numcontrol, BigDecimal liquidacion_id,
			String c_estreg, String audfecins, String audusuins, String audipinse, BigDecimal opetarcre_id,
			String opetarcre, String c_numbolant, BigDecimal n_idaret, String c_rucclicre, BigDecimal n_esfecabi,
			String c_nomape, String c_observaciones, BigDecimal venpas_idoriginal, BigDecimal n_imppagefe,
			BigDecimal n_imppagtar, BigDecimal promocion_id, BigDecimal n_ididaret, BigDecimal cencos_id,
			String c_codigo, String c_denominacion, String c_estdoc, BigDecimal tipmon_id, String c_unimon,
			String c_simmon, BigDecimal n_imppagequ, String nombreCortoAgenciaPartida, BigDecimal n_tarifaequ,
			BigDecimal n_desequ, BigDecimal n_tipcam, BigDecimal empresa_id, String razon, String dirpartida,
			String dirllegada, String empnombcor, String empsigla, String c_stateos, BigDecimal cancelacionvt_id,
			String c_statecvt, String rdireccionCliente, String tipodocnomcor, String docempresa, String nombserviciog,
			String usuapepat, String usuapemat, String usunombre, String c_codref) {
		super();
		this.venpas_id = venpas_id;
		this.venpas_idref = venpas_idref;
		this.itinerario_id = itinerario_id;
		this.ruta_id = ruta_id;
		this.c_origen = c_origen;
		this.c_destino = c_destino;
		this.cliente_id = cliente_id;
		this.doccli = doccli;
		this.c_razsoc = c_razsoc;
		this.pasajero_id = pasajero_id;
		this.c_apepat = c_apepat;
		this.c_apemat = c_apemat;
		this.c_nombre = c_nombre;
		this.tipdoc_id = tipdoc_id;
		this.tipdoc = tipdoc;
		this.docpax = docpax;
		this.c_fecnac = c_fecnac;
		this.forpag_id = forpag_id;
		this.formaPago = formaPago;
		this.servicio_id = servicio_id;
		this.servicio = servicio;
		this.tipcom_id = tipcom_id;
		this.tipoComprobante = tipoComprobante;
		this.tipmov_id = tipmov_id;
		this.tipoMovimiento = tipoMovimiento;
		this.tipforpag_id = tipforpag_id;
		this.tipoformaPago = tipoformaPago;
		this.tarcre_id = tarcre_id;
		this.tarjetacredito = tarjetacredito;
		this.c_numboleto = c_numboleto;
		this.n_numasiento = n_numasiento;
		this.n_numpiso = n_numpiso;
		this.fecpar = fecpar;
		this.c_horpar = c_horpar;
		this.feclle = feclle;
		this.c_horlle = c_horlle;
		this.n_secuencial = n_secuencial;
		this.n_tarifa = n_tarifa;
		this.n_recargo = n_recargo;
		this.n_descuento = n_descuento;
		this.n_penalidad = n_penalidad;
		this.n_imppag = n_imppag;
		this.n_acuenta = n_acuenta;
		this.c_tiptra = c_tiptra;
		this.d_feccad = d_feccad;
		this.fecliq = fecliq;
		this.agencia_id = agencia_id;
		this.agencia = agencia;
		this.usuario_id = usuario_id;
		this.c_login = c_login;
		this.canven_id = canven_id;
		this.canalVenta = canalVenta;
		this.manifiesto_id = manifiesto_id;
		this.n_numopeban = n_numopeban;
		this.fecexpres = fecexpres;
		this.c_horexpres = c_horexpres;
		this.preali_id = preali_id;
		this.alimentacion = alimentacion;
		this.idAgeLlegada = idAgeLlegada;
		this.partida = partida;
		this.idAgePartida = idAgePartida;
		this.agDestino = agDestino;
		this.c_numcontrol = c_numcontrol;
		this.liquidacion_id = liquidacion_id;
		this.c_estreg = c_estreg;
		this.audfecins = audfecins;
		this.audusuins = audusuins;
		this.audipinse = audipinse;
		this.opetarcre_id = opetarcre_id;
		this.opetarcre = opetarcre;
		this.c_numbolant = c_numbolant;
		this.n_idaret = n_idaret;
		this.c_rucclicre = c_rucclicre;
		this.n_esfecabi = n_esfecabi;
		this.c_nomape = c_nomape;
		this.c_observaciones = c_observaciones;
		this.venpas_idoriginal = venpas_idoriginal;
		this.n_imppagefe = n_imppagefe;
		this.n_imppagtar = n_imppagtar;
		this.promocion_id = promocion_id;
		this.n_ididaret = n_ididaret;
		this.cencos_id = cencos_id;
		this.c_codigo = c_codigo;
		this.c_denominacion = c_denominacion;
		this.c_estdoc = c_estdoc;
		this.tipmon_id = tipmon_id;
		this.c_unimon = c_unimon;
		this.c_simmon = c_simmon;
		this.n_imppagequ = n_imppagequ;
		this.nombreCortoAgenciaPartida = nombreCortoAgenciaPartida;
		this.n_tarifaequ = n_tarifaequ;
		this.n_desequ = n_desequ;
		this.n_tipcam = n_tipcam;
		this.empresa_id = empresa_id;
		this.razon = razon;
		this.dirpartida = dirpartida;
		this.dirllegada = dirllegada;
		this.empnombcor = empnombcor;
		this.empsigla = empsigla;
		this.c_stateos = c_stateos;
		this.cancelacionvt_id = cancelacionvt_id;
		this.c_statecvt = c_statecvt;
		this.rdireccionCliente = rdireccionCliente;
		this.tipodocnomcor = tipodocnomcor;
		this.docempresa = docempresa;
		this.nombserviciog = nombserviciog;
		this.usuapepat = usuapepat;
		this.usuapemat = usuapemat;
		this.usunombre = usunombre;
		this.c_codref = c_codref;
	}
	
	public BigDecimal getVenpas_id() {
		return venpas_id;
	}
	public void setVenpas_id(BigDecimal venpas_id) {
		this.venpas_id = venpas_id;
	}
	public BigDecimal getVenpas_idref() {
		return venpas_idref;
	}
	public void setVenpas_idref(BigDecimal venpas_idref) {
		this.venpas_idref = venpas_idref;
	}
	public BigDecimal getItinerario_id() {
		return itinerario_id;
	}
	public void setItinerario_id(BigDecimal itinerario_id) {
		this.itinerario_id = itinerario_id;
	}
	public BigDecimal getRuta_id() {
		return ruta_id;
	}
	public void setRuta_id(BigDecimal ruta_id) {
		this.ruta_id = ruta_id;
	}
	public String getC_origen() {
		return c_origen;
	}
	public void setC_origen(String c_origen) {
		this.c_origen = c_origen;
	}
	public String getC_destino() {
		return c_destino;
	}
	public void setC_destino(String c_destino) {
		this.c_destino = c_destino;
	}
	public BigDecimal getCliente_id() {
		return cliente_id;
	}
	public void setCliente_id(BigDecimal cliente_id) {
		this.cliente_id = cliente_id;
	}
	public String getDoccli() {
		return doccli;
	}
	public void setDoccli(String doccli) {
		this.doccli = doccli;
	}
	public String getC_razsoc() {
		return c_razsoc;
	}
	public void setC_razsoc(String c_razsoc) {
		this.c_razsoc = c_razsoc;
	}
	public BigDecimal getPasajero_id() {
		return pasajero_id;
	}
	public void setPasajero_id(BigDecimal pasajero_id) {
		this.pasajero_id = pasajero_id;
	}
	public String getC_apepat() {
		return c_apepat;
	}
	public void setC_apepat(String c_apepat) {
		this.c_apepat = c_apepat;
	}
	public String getC_apemat() {
		return c_apemat;
	}
	public void setC_apemat(String c_apemat) {
		this.c_apemat = c_apemat;
	}
	public String getC_nombre() {
		return c_nombre;
	}
	public void setC_nombre(String c_nombre) {
		this.c_nombre = c_nombre;
	}
	public BigDecimal getTipdoc_id() {
		return tipdoc_id;
	}
	public void setTipdoc_id(BigDecimal tipdoc_id) {
		this.tipdoc_id = tipdoc_id;
	}
	public String getTipdoc() {
		return tipdoc;
	}
	public void setTipdoc(String tipdoc) {
		this.tipdoc = tipdoc;
	}
	public String getDocpax() {
		return docpax;
	}
	public void setDocpax(String docpax) {
		this.docpax = docpax;
	}
	public String getC_fecnac() {
		return c_fecnac;
	}
	public void setC_fecnac(String c_fecnac) {
		this.c_fecnac = c_fecnac;
	}
	public BigDecimal getForpag_id() {
		return forpag_id;
	}
	public void setForpag_id(BigDecimal forpag_id) {
		this.forpag_id = forpag_id;
	}
	public String getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	public BigDecimal getServicio_id() {
		return servicio_id;
	}
	public void setServicio_id(BigDecimal servicio_id) {
		this.servicio_id = servicio_id;
	}
	public String getServicio() {
		return servicio;
	}
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	public BigDecimal getTipcom_id() {
		return tipcom_id;
	}
	public void setTipcom_id(BigDecimal tipcom_id) {
		this.tipcom_id = tipcom_id;
	}
	public String getTipoComprobante() {
		return tipoComprobante;
	}
	public void setTipoComprobante(String tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}
	public BigDecimal getTipmov_id() {
		return tipmov_id;
	}
	public void setTipmov_id(BigDecimal tipmov_id) {
		this.tipmov_id = tipmov_id;
	}
	public String getTipoMovimiento() {
		return tipoMovimiento;
	}
	public void setTipoMovimiento(String tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}
	public BigDecimal getTipforpag_id() {
		return tipforpag_id;
	}
	public void setTipforpag_id(BigDecimal tipforpag_id) {
		this.tipforpag_id = tipforpag_id;
	}
	public String getTipoformaPago() {
		return tipoformaPago;
	}
	public void setTipoformaPago(String tipoformaPago) {
		this.tipoformaPago = tipoformaPago;
	}
	public BigDecimal getTarcre_id() {
		return tarcre_id;
	}
	public void setTarcre_id(BigDecimal tarcre_id) {
		this.tarcre_id = tarcre_id;
	}
	public String getTarjetacredito() {
		return tarjetacredito;
	}
	public void setTarjetacredito(String tarjetacredito) {
		this.tarjetacredito = tarjetacredito;
	}
	public String getC_numboleto() {
		return c_numboleto;
	}
	public void setC_numboleto(String c_numboleto) {
		this.c_numboleto = c_numboleto;
	}
	public Integer getN_numasiento() {
		return n_numasiento;
	}
	public void setN_numasiento(Integer n_numasiento) {
		this.n_numasiento = n_numasiento;
	}
	public Integer getN_numpiso() {
		return n_numpiso;
	}
	public void setN_numpiso(Integer n_numpiso) {
		this.n_numpiso = n_numpiso;
	}
	public String getFecpar() {
		return fecpar;
	}
	public void setFecpar(String fecpar) {
		this.fecpar = fecpar;
	}
	public String getC_horpar() {
		return c_horpar;
	}
	public void setC_horpar(String c_horpar) {
		this.c_horpar = c_horpar;
	}
	public String getFeclle() {
		return feclle;
	}
	public void setFeclle(String feclle) {
		this.feclle = feclle;
	}
	public String getC_horlle() {
		return c_horlle;
	}
	public void setC_horlle(String c_horlle) {
		this.c_horlle = c_horlle;
	}
	public BigDecimal getN_secuencial() {
		return n_secuencial;
	}
	public void setN_secuencial(BigDecimal n_secuencial) {
		this.n_secuencial = n_secuencial;
	}
	public BigDecimal getN_tarifa() {
		return n_tarifa;
	}
	public void setN_tarifa(BigDecimal n_tarifa) {
		this.n_tarifa = n_tarifa;
	}
	public BigDecimal getN_recargo() {
		return n_recargo;
	}
	public void setN_recargo(BigDecimal n_recargo) {
		this.n_recargo = n_recargo;
	}
	public BigDecimal getN_descuento() {
		return n_descuento;
	}
	public void setN_descuento(BigDecimal n_descuento) {
		this.n_descuento = n_descuento;
	}
	public BigDecimal getN_penalidad() {
		return n_penalidad;
	}
	public void setN_penalidad(BigDecimal n_penalidad) {
		this.n_penalidad = n_penalidad;
	}
	public BigDecimal getN_imppag() {
		return n_imppag;
	}
	public void setN_imppag(BigDecimal n_imppag) {
		this.n_imppag = n_imppag;
	}
	public BigDecimal getN_acuenta() {
		return n_acuenta;
	}
	public void setN_acuenta(BigDecimal n_acuenta) {
		this.n_acuenta = n_acuenta;
	}
	public String getC_tiptra() {
		return c_tiptra;
	}
	public void setC_tiptra(String c_tiptra) {
		this.c_tiptra = c_tiptra;
	}
	public Date getD_feccad() {
		return d_feccad;
	}
	public void setD_feccad(Date d_feccad) {
		this.d_feccad = d_feccad;
	}
	public String getFecliq() {
		return fecliq;
	}
	public void setFecliq(String fecliq) {
		this.fecliq = fecliq;
	}
	public BigDecimal getAgencia_id() {
		return agencia_id;
	}
	public void setAgencia_id(BigDecimal agencia_id) {
		this.agencia_id = agencia_id;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public BigDecimal getUsuario_id() {
		return usuario_id;
	}
	public void setUsuario_id(BigDecimal usuario_id) {
		this.usuario_id = usuario_id;
	}
	public String getC_login() {
		return c_login;
	}
	public void setC_login(String c_login) {
		this.c_login = c_login;
	}
	public BigDecimal getCanven_id() {
		return canven_id;
	}
	public void setCanven_id(BigDecimal canven_id) {
		this.canven_id = canven_id;
	}
	public String getCanalVenta() {
		return canalVenta;
	}
	public void setCanalVenta(String canalVenta) {
		this.canalVenta = canalVenta;
	}
	public BigDecimal getManifiesto_id() {
		return manifiesto_id;
	}
	public void setManifiesto_id(BigDecimal manifiesto_id) {
		this.manifiesto_id = manifiesto_id;
	}
	public String getN_numopeban() {
		return n_numopeban;
	}
	public void setN_numopeban(String n_numopeban) {
		this.n_numopeban = n_numopeban;
	}
	public Date getFecexpres() {
		return fecexpres;
	}
	public void setFecexpres(Date fecexpres) {
		this.fecexpres = fecexpres;
	}
	public String getC_horexpres() {
		return c_horexpres;
	}
	public void setC_horexpres(String c_horexpres) {
		this.c_horexpres = c_horexpres;
	}
	public BigDecimal getPreali_id() {
		return preali_id;
	}
	public void setPreali_id(BigDecimal preali_id) {
		this.preali_id = preali_id;
	}
	public String getAlimentacion() {
		return alimentacion;
	}
	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}
	public BigDecimal getIdAgeLlegada() {
		return idAgeLlegada;
	}
	public void setIdAgeLlegada(BigDecimal idAgeLlegada) {
		this.idAgeLlegada = idAgeLlegada;
	}
	public String getPartida() {
		return partida;
	}
	public void setPartida(String partida) {
		this.partida = partida;
	}
	public BigDecimal getIdAgePartida() {
		return idAgePartida;
	}
	public void setIdAgePartida(BigDecimal idAgePartida) {
		this.idAgePartida = idAgePartida;
	}
	public String getAgDestino() {
		return agDestino;
	}
	public void setAgDestino(String agDestino) {
		this.agDestino = agDestino;
	}
	public String getC_numcontrol() {
		return c_numcontrol;
	}
	public void setC_numcontrol(String c_numcontrol) {
		this.c_numcontrol = c_numcontrol;
	}
	public BigDecimal getLiquidacion_id() {
		return liquidacion_id;
	}
	public void setLiquidacion_id(BigDecimal liquidacion_id) {
		this.liquidacion_id = liquidacion_id;
	}
	public String getC_estreg() {
		return c_estreg;
	}
	public void setC_estreg(String c_estreg) {
		this.c_estreg = c_estreg;
	}
	public String getAudfecins() {
		return audfecins;
	}
	public void setAudfecins(String audfecins) {
		this.audfecins = audfecins;
	}
	public String getAudusuins() {
		return audusuins;
	}
	public void setAudusuins(String audusuins) {
		this.audusuins = audusuins;
	}
	public String getAudipinse() {
		return audipinse;
	}
	public void setAudipinse(String audipinse) {
		this.audipinse = audipinse;
	}
	public BigDecimal getOpetarcre_id() {
		return opetarcre_id;
	}
	public void setOpetarcre_id(BigDecimal opetarcre_id) {
		this.opetarcre_id = opetarcre_id;
	}
	public String getOpetarcre() {
		return opetarcre;
	}
	public void setOpetarcre(String opetarcre) {
		this.opetarcre = opetarcre;
	}
	public String getC_numbolant() {
		return c_numbolant;
	}
	public void setC_numbolant(String c_numbolant) {
		this.c_numbolant = c_numbolant;
	}
	public BigDecimal getN_idaret() {
		return n_idaret;
	}
	public void setN_idaret(BigDecimal n_idaret) {
		this.n_idaret = n_idaret;
	}
	public String getC_rucclicre() {
		return c_rucclicre;
	}
	public void setC_rucclicre(String c_rucclicre) {
		this.c_rucclicre = c_rucclicre;
	}
	public BigDecimal getN_esfecabi() {
		return n_esfecabi;
	}
	public void setN_esfecabi(BigDecimal n_esfecabi) {
		this.n_esfecabi = n_esfecabi;
	}
	public String getC_nomape() {
		return c_nomape;
	}
	public void setC_nomape(String c_nomape) {
		this.c_nomape = c_nomape;
	}
	public String getC_observaciones() {
		return c_observaciones;
	}
	public void setC_observaciones(String c_observaciones) {
		this.c_observaciones = c_observaciones;
	}
	public BigDecimal getVenpas_idoriginal() {
		return venpas_idoriginal;
	}
	public void setVenpas_idoriginal(BigDecimal venpas_idoriginal) {
		this.venpas_idoriginal = venpas_idoriginal;
	}
	public BigDecimal getN_imppagefe() {
		return n_imppagefe;
	}
	public void setN_imppagefe(BigDecimal n_imppagefe) {
		this.n_imppagefe = n_imppagefe;
	}
	public BigDecimal getN_imppagtar() {
		return n_imppagtar;
	}
	public void setN_imppagtar(BigDecimal n_imppagtar) {
		this.n_imppagtar = n_imppagtar;
	}
	public BigDecimal getPromocion_id() {
		return promocion_id;
	}
	public void setPromocion_id(BigDecimal promocion_id) {
		this.promocion_id = promocion_id;
	}
	public BigDecimal getN_ididaret() {
		return n_ididaret;
	}
	public void setN_ididaret(BigDecimal n_ididaret) {
		this.n_ididaret = n_ididaret;
	}
	public BigDecimal getCencos_id() {
		return cencos_id;
	}
	public void setCencos_id(BigDecimal cencos_id) {
		this.cencos_id = cencos_id;
	}
	public String getC_codigo() {
		return c_codigo;
	}
	public void setC_codigo(String c_codigo) {
		this.c_codigo = c_codigo;
	}
	public String getC_denominacion() {
		return c_denominacion;
	}
	public void setC_denominacion(String c_denominacion) {
		this.c_denominacion = c_denominacion;
	}
	public String getC_estdoc() {
		return c_estdoc;
	}
	public void setC_estdoc(String c_estdoc) {
		this.c_estdoc = c_estdoc;
	}
	public BigDecimal getTipmon_id() {
		return tipmon_id;
	}
	public void setTipmon_id(BigDecimal tipmon_id) {
		this.tipmon_id = tipmon_id;
	}
	public String getC_unimon() {
		return c_unimon;
	}
	public void setC_unimon(String c_unimon) {
		this.c_unimon = c_unimon;
	}
	public String getC_simmon() {
		return c_simmon;
	}
	public void setC_simmon(String c_simmon) {
		this.c_simmon = c_simmon;
	}
	public BigDecimal getN_imppagequ() {
		return n_imppagequ;
	}
	public void setN_imppagequ(BigDecimal n_imppagequ) {
		this.n_imppagequ = n_imppagequ;
	}
	public String getNombreCortoAgenciaPartida() {
		return nombreCortoAgenciaPartida;
	}
	public void setNombreCortoAgenciaPartida(String nombreCortoAgenciaPartida) {
		this.nombreCortoAgenciaPartida = nombreCortoAgenciaPartida;
	}
	public BigDecimal getN_tarifaequ() {
		return n_tarifaequ;
	}
	public void setN_tarifaequ(BigDecimal n_tarifaequ) {
		this.n_tarifaequ = n_tarifaequ;
	}
	public BigDecimal getN_desequ() {
		return n_desequ;
	}
	public void setN_desequ(BigDecimal n_desequ) {
		this.n_desequ = n_desequ;
	}
	public BigDecimal getN_tipcam() {
		return n_tipcam;
	}
	public void setN_tipcam(BigDecimal n_tipcam) {
		this.n_tipcam = n_tipcam;
	}
	public BigDecimal getEmpresa_id() {
		return empresa_id;
	}
	public void setEmpresa_id(BigDecimal empresa_id) {
		this.empresa_id = empresa_id;
	}
	public String getRazon() {
		return razon;
	}
	public void setRazon(String razon) {
		this.razon = razon;
	}
	public String getDirpartida() {
		return dirpartida;
	}
	public void setDirpartida(String dirpartida) {
		this.dirpartida = dirpartida;
	}
	public String getDirllegada() {
		return dirllegada;
	}
	public void setDirllegada(String dirllegada) {
		this.dirllegada = dirllegada;
	}
	public String getEmpnombcor() {
		return empnombcor;
	}
	public void setEmpnombcor(String empnombcor) {
		this.empnombcor = empnombcor;
	}
	public String getEmpsigla() {
		return empsigla;
	}
	public void setEmpsigla(String empsigla) {
		this.empsigla = empsigla;
	}
	public String getC_stateos() {
		return c_stateos;
	}
	public void setC_stateos(String c_stateos) {
		this.c_stateos = c_stateos;
	}
	public BigDecimal getCancelacionvt_id() {
		return cancelacionvt_id;
	}
	public void setCancelacionvt_id(BigDecimal cancelacionvt_id) {
		this.cancelacionvt_id = cancelacionvt_id;
	}
	public String getC_statecvt() {
		return c_statecvt;
	}
	public void setC_statecvt(String c_statecvt) {
		this.c_statecvt = c_statecvt;
	}
	public String getRdireccionCliente() {
		return rdireccionCliente;
	}
	public void setRdireccionCliente(String rdireccionCliente) {
		this.rdireccionCliente = rdireccionCliente;
	}
	public String getTipodocnomcor() {
		return tipodocnomcor;
	}
	public void setTipodocnomcor(String tipodocnomcor) {
		this.tipodocnomcor = tipodocnomcor;
	}
	public String getDocempresa() {
		return docempresa;
	}
	public void setDocempresa(String docempresa) {
		this.docempresa = docempresa;
	}
	public String getNombserviciog() {
		return nombserviciog;
	}
	public void setNombserviciog(String nombserviciog) {
		this.nombserviciog = nombserviciog;
	}
	public String getUsuapepat() {
		return usuapepat;
	}
	public void setUsuapepat(String usuapepat) {
		this.usuapepat = usuapepat;
	}
	public String getUsuapemat() {
		return usuapemat;
	}
	public void setUsuapemat(String usuapemat) {
		this.usuapemat = usuapemat;
	}
	public String getUsunombre() {
		return usunombre;
	}
	public void setUsunombre(String usunombre) {
		this.usunombre = usunombre;
	}
	public String getC_codref() {
		return c_codref;
	}
	public void setC_codref(String c_codref) {
		this.c_codref = c_codref;
	}
}
