package pe.movilbus.autoservicio.beans;

import java.util.Date;
import java.util.TreeMap;

public class LiquidacionOficinaSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	
	/*END BEGIN 29/01/2017 - JA*/
//	private Gasto gasto;
//	private Liquidacion liquidacion;
	
	private Integer anio;
	private Date fechaLiquidacion;
	private Integer estado;
	private AgenciaSispas agencia;
	private UsuarioSispas usuario;
	
	
	private TreeMap<String, String[]> ventasCounter; //No mapeado
	private Double reciboCaja_MT=.00;
	private Double reciboCaja_MB=.00;
	private Double credito_MT=.00;
	private Double credito_MB=.00;
	private Double remota_MT=.00;
	private Double remota_MB=.00;
	private Double pase_MT=.00;
	private Double pase_MB=.00;
	private Double tvisa_MT=.00;
	private Double tvisa_MB=.00;
	private Double tmaster_MT=.00;
	private Double tmaster_MB=.00;
	private Double devo_MT=.00;
	private Double devo_MB=.00;
	private Double trans_MT=.00;
	private Double trans_MB=.00;	
	private Double migra_MT=.00;
	private Double migra_MB=.00;
	
	// 02/08/2019
	private Double orbis_MT=.00;
	private Double orbis_MB=.00;	
	private Double pagolinkVisa_MT=.00;
	private Double pagolinkVisa_MB=.00;
	private Double pagolinkMaster_MT=.00;
	private Double pagolinkMaster_MB=.00;
	
	private Double gastosVarios_MT=.00;
	private Double gastosVarios_MB=.00;
	private Double peajes_MT=.00;
	private Double peajes_MB=.00;
	private Double gastosRC_MT=.00;
	private Double gastosRC_MB=.00;
	private Double notaCred_MT=.00;
	private Double notaCred_MB=.00;
	
	private Double nCSinEfectivo_MT=.00;
	private Double nCSinEfectivo_MB=.00;
	
	public LiquidacionOficinaSispas() {
	}

	/**
	 * @return Objeto id.
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id	: Setea el objeto id.
	 */
	public void setId(Long id) {
		this.id = id;
	}

//	/**
//	 * @return Objeto gasto.
//	 */
//	public Gasto getGasto() {
//		return gasto;
//	}
//	/**
//	 * @param gasto	: Setea el objeto gasto.
//	 */
//	public void setGasto(Gasto gasto) {
//		this.gasto = gasto;
//	}

//	/**
//	 * @return Objeto liquidacion.
//	 */
//	public Liquidacion getLiquidacion() {
//		return liquidacion;
//	}
//	/**
//	 * @param liquidacion	: Setea el objeto liquidacion.
//	 */
//	public void setLiquidacion(Liquidacion liquidacion) {
//		this.liquidacion = liquidacion;
//	}

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
	
	public void setUsuario(UsuarioSispas  usuario){
		this.usuario=usuario;
	}
	public UsuarioSispas getUsuario(){
		return usuario;
	}

	/**
	 * @return the estado
	 */
	public Integer getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	/**
	 * @return the agencia
	 */
	public AgenciaSispas getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(AgenciaSispas agencia) {
		this.agencia = agencia;
	}

	/**
	 * @return the credito_MT
	 */
	public Double getCredito_MT() {
		return credito_MT;
	}

	/**
	 * @param credito_MT the credito_MT to set
	 */
	public void setCredito_MT(Double credito_MT) {
		this.credito_MT = credito_MT;
	}

	/**
	 * @return the credito_MB
	 */
	public Double getCredito_MB() {
		return credito_MB;
	}

	/**
	 * @param credito_MB the credito_MB to set
	 */
	public void setCredito_MB(Double credito_MB) {
		this.credito_MB = credito_MB;
	}

	/**
	 * @return the remota_MT
	 */
	public Double getRemota_MT() {
		return remota_MT;
	}

	/**
	 * @param remota_MT the remota_MT to set
	 */
	public void setRemota_MT(Double remota_MT) {
		this.remota_MT = remota_MT;
	}

	/**
	 * @return the remota_MB
	 */
	public Double getRemota_MB() {
		return remota_MB;
	}

	/**
	 * @param remota_MB the remota_MB to set
	 */
	public void setRemota_MB(Double remota_MB) {
		this.remota_MB = remota_MB;
	}

	/**
	 * @return the pase_MT
	 */
	public Double getPase_MT() {
		return pase_MT;
	}

	/**
	 * @param pase_MT the pase_MT to set
	 */
	public void setPase_MT(Double pase_MT) {
		this.pase_MT = pase_MT;
	}

	/**
	 * @return the pase_MB
	 */
	public Double getPase_MB() {
		return pase_MB;
	}

	/**
	 * @param pase_MB the pase_MB to set
	 */
	public void setPase_MB(Double pase_MB) {
		this.pase_MB = pase_MB;
	}

	/**
	 * @return the tvisa_MT
	 */
	public Double getTvisa_MT() {
		return tvisa_MT;
	}

	/**
	 * @param tvisa_MT the tvisa_MT to set
	 */
	public void setTvisa_MT(Double tvisa_MT) {
		this.tvisa_MT = tvisa_MT;
	}

	/**
	 * @return the tvisa_MB
	 */
	public Double getTvisa_MB() {
		return tvisa_MB;
	}

	/**
	 * @param tvisa_MB the tvisa_MB to set
	 */
	public void setTvisa_MB(Double tvisa_MB) {
		this.tvisa_MB = tvisa_MB;
	}

	/**
	 * @return the tmaster_MT
	 */
	public Double getTmaster_MT() {
		return tmaster_MT;
	}

	/**
	 * @param tmaster_MT the tmaster_MT to set
	 */
	public void setTmaster_MT(Double tmaster_MT) {
		this.tmaster_MT = tmaster_MT;
	}

	/**
	 * @return the tmaster_MB
	 */
	public Double getTmaster_MB() {
		return tmaster_MB;
	}

	/**
	 * @param tmaster_MB the tmaster_MB to set
	 */
	public void setTmaster_MB(Double tmaster_MB) {
		this.tmaster_MB = tmaster_MB;
	}

	/**
	 * @return the devo_MT
	 */
	public Double getDevo_MT() {
		return devo_MT;
	}

	/**
	 * @param devo_MT the devo_MT to set
	 */
	public void setDevo_MT(Double devo_MT) {
		this.devo_MT = devo_MT;
	}

	/**
	 * @return the devo_MB
	 */
	public Double getDevo_MB() {
		return devo_MB;
	}

	/**
	 * @param devo_MB the devo_MB to set
	 */
	public void setDevo_MB(Double devo_MB) {
		this.devo_MB = devo_MB;
	}

	/**
	 * @return the trans_MT
	 */
	public Double getTrans_MT() {
		return trans_MT;
	}

	/**
	 * @param trans_MT the trans_MT to set
	 */
	public void setTrans_MT(Double trans_MT) {
		this.trans_MT = trans_MT;
	}

	/**
	 * @return the trans_MB
	 */
	public Double getTrans_MB() {
		return trans_MB;
	}

	/**
	 * @param trans_MB the trans_MB to set
	 */
	public void setTrans_MB(Double trans_MB) {
		this.trans_MB = trans_MB;
	}

	/**
	 * @return the ventasCounter
	 */
	public TreeMap<String, String[]> getVentasCounter() {
		return ventasCounter;
	}

	/**
	 * @param ventasCounter the ventasCounter to set
	 */
	public void setVentasCounter(TreeMap<String, String[]> ventasCounter) {
		this.ventasCounter = ventasCounter;
	}

	/**
	 * @return the gastosVarios_MT
	 */
	public Double getGastosVarios_MT() {
		return gastosVarios_MT;
	}

	/**
	 * @param gastosVarios_MT the gastosVarios_MT to set
	 */
	public void setGastosVarios_MT(Double gastosVarios_MT) {
		this.gastosVarios_MT = gastosVarios_MT;
	}

	/**
	 * @return the gastosVarios_MB
	 */
	public Double getGastosVarios_MB() {
		return gastosVarios_MB;
	}

	/**
	 * @param gastosVarios_MB the gastosVarios_MB to set
	 */
	public void setGastosVarios_MB(Double gastosVarios_MB) {
		this.gastosVarios_MB = gastosVarios_MB;
	}

	/**
	 * @return the peajes_MT
	 */
	public Double getPeajes_MT() {
		return peajes_MT;
	}

	/**
	 * @param peajes_MT the peajes_MT to set
	 */
	public void setPeajes_MT(Double peajes_MT) {
		this.peajes_MT = peajes_MT;
	}

	/**
	 * @return the peajes_MB
	 */
	public Double getPeajes_MB() {
		return peajes_MB;
	}

	/**
	 * @param peajes_MB the peajes_MB to set
	 */
	public void setPeajes_MB(Double peajes_MB) {
		this.peajes_MB = peajes_MB;
	}

	/**
	 * @return the gastosRC_MT
	 */
	public Double getGastosRC_MT() {
		return gastosRC_MT;
	}

	/**
	 * @param gastosRC_MT the gastosRC_MT to set
	 */
	public void setGastosRC_MT(Double gastosRC_MT) {
		this.gastosRC_MT = gastosRC_MT;
	}

	/**
	 * @return the gastosRC_MB
	 */
	public Double getGastosRC_MB() {
		return gastosRC_MB;
	}

	/**
	 * @param gastosRC_MB the gastosRC_MB to set
	 */
	public void setGastosRC_MB(Double gastosRC_MB) {
		this.gastosRC_MB = gastosRC_MB;
	}

	/**
	 * @return the reciboCaja_MT
	 */
	public Double getReciboCaja_MT() {
		return reciboCaja_MT;
	}

	/**
	 * @param reciboCaja_MT the reciboCaja_MT to set
	 */
	public void setReciboCaja_MT(Double reciboCaja_MT) {
		this.reciboCaja_MT = reciboCaja_MT;
	}

	/**
	 * @return the reciboCaja_MB
	 */
	public Double getReciboCaja_MB() {
		return reciboCaja_MB;
	}

	/**
	 * @param reciboCaja_MB the reciboCaja_MB to set
	 */
	public void setReciboCaja_MB(Double reciboCaja_MB) {
		this.reciboCaja_MB = reciboCaja_MB;
	}

	/**
	 * @return the notaCred_MT
	 */
	public Double getNotaCred_MT() {
		return notaCred_MT;
	}

	/**
	 * @param notaCred_MT the notaCred_MT to set
	 */
	public void setNotaCred_MT(Double notaCred_MT) {
		this.notaCred_MT = notaCred_MT;
	}

	/**
	 * @return the notaCred_MB
	 */
	public Double getNotaCred_MB() {
		return notaCred_MB;
	}

	/**
	 * @param notaCred_MB the notaCred_MB to set
	 */
	public void setNotaCred_MB(Double notaCred_MB) {
		this.notaCred_MB = notaCred_MB;
	}

	/**
	 * @return the orbis_MT
	 */
	public Double getOrbis_MT() {
		return orbis_MT;
	}

	/**
	 * @param orbis_MT the orbis_MT to set
	 */
	public void setOrbis_MT(Double orbis_MT) {
		this.orbis_MT = orbis_MT;
	}

	/**
	 * @return the orbis_MB
	 */
	public Double getOrbis_MB() {
		return orbis_MB;
	}

	/**
	 * @param orbis_MB the orbis_MB to set
	 */
	public void setOrbis_MB(Double orbis_MB) {
		this.orbis_MB = orbis_MB;
	}

	/**
	 * @return the pagolinkVisa_MT
	 */
	public Double getPagolinkVisa_MT() {
		return pagolinkVisa_MT;
	}

	/**
	 * @param pagolinkVisa_MT the pagolinkVisa_MT to set
	 */
	public void setPagolinkVisa_MT(Double pagolinkVisa_MT) {
		this.pagolinkVisa_MT = pagolinkVisa_MT;
	}

	/**
	 * @return the pagolinkVisa_MB
	 */
	public Double getPagolinkVisa_MB() {
		return pagolinkVisa_MB;
	}

	/**
	 * @param pagolinkVisa_MB the pagolinkVisa_MB to set
	 */
	public void setPagolinkVisa_MB(Double pagolinkVisa_MB) {
		this.pagolinkVisa_MB = pagolinkVisa_MB;
	}

	/**
	 * @return the pagolinkMaster_MT
	 */
	public Double getPagolinkMaster_MT() {
		return pagolinkMaster_MT;
	}

	/**
	 * @param pagolinkMaster_MT the pagolinkMaster_MT to set
	 */
	public void setPagolinkMaster_MT(Double pagolinkMaster_MT) {
		this.pagolinkMaster_MT = pagolinkMaster_MT;
	}

	/**
	 * @return the pagolinkMaster_MB
	 */
	public Double getPagolinkMaster_MB() {
		return pagolinkMaster_MB;
	}

	/**
	 * @param pagolinkMaster_MB the pagolinkMaster_MB to set
	 */
	public void setPagolinkMaster_MB(Double pagolinkMaster_MB) {
		this.pagolinkMaster_MB = pagolinkMaster_MB;
	}

	public Double getMigra_MT() {
		return migra_MT;
	}

	public void setMigra_MT(Double migra_MT) {
		this.migra_MT = migra_MT;
	}

	public Double getMigra_MB() {
		return migra_MB;
	}

	public void setMigra_MB(Double migra_MB) {
		this.migra_MB = migra_MB;
	}

	public Double getnCSinEfectivo_MT() {
		return nCSinEfectivo_MT;
	}

	public void setnCSinEfectivo_MT(Double nCSinEfectivo_MT) {
		this.nCSinEfectivo_MT = nCSinEfectivo_MT;
	}

	public Double getnCSinEfectivo_MB() {
		return nCSinEfectivo_MB;
	}

	public void setnCSinEfectivo_MB(Double nCSinEfectivo_MB) {
		this.nCSinEfectivo_MB = nCSinEfectivo_MB;
	}

}
