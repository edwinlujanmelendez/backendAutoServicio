package pe.movilbus.autoservicio.beans;

import java.util.HashSet;
import java.util.Set;

public class GastoSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private TipoGastoSispas tipoGasto;
	private String numeroDocumento;
	private Double monto;
	private String nombrePiloto;
	private String codigoBus;
	private String consignado;
	private String observacion;
	private AgenciaSispas agencia;
	private LiquidacionSispas liquidacion;
	private DetalleLiquidacionSispas detalleLiquidacion;
	private LiquidacionOficinaSispas liquidacionOficina;
	private CompaniaSispas empresa;
	private Integer  idcancelacionvt;
	private String   stcancelacionvt;
	
	
	private Set<DetalleLiquidacionSispas> detalleLiquidacions = new HashSet<DetalleLiquidacionSispas>(0);
	private Set<LiquidacionOficinaSispas> liquidacionOficinas = new HashSet<LiquidacionOficinaSispas>(0);

	public GastoSispas() {
	}
	
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public TipoGastoSispas getTipoGasto() {
		return this.tipoGasto;
	}
	public void setTipoGasto(TipoGastoSispas tipoGasto) {
		this.tipoGasto = tipoGasto;
	}

	public String getNumeroDocumento() {
		return this.numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public Double getMonto() {
		return this.monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public String getNombrePiloto() {
		return this.nombrePiloto;
	}
	public void setNombrePiloto(String nombrePiloto) {
		this.nombrePiloto = nombrePiloto;
	}

	public String getCodigoBus() {
		return this.codigoBus;
	}
	public void setCodigoBus(String codigoBus) {
		this.codigoBus = codigoBus;
	}

	public String getConsignado() {
		return this.consignado;
	}
	public void setConsignado(String consignado) {
		this.consignado = consignado;
	}

	public String getObservacion() {
		return this.observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	public AgenciaSispas getAgencia(){
		return agencia;
	}
	
	public void setAgencia(AgenciaSispas agencia){
		this.agencia=agencia;
	}
	
	public LiquidacionSispas getLiquidacion(){
		return liquidacion;
	}
	
	public void setLiquidacion (LiquidacionSispas liquidacion){
		this.liquidacion=liquidacion;
	}
	
	public DetalleLiquidacionSispas getDetalleLiquidacion(){
		return detalleLiquidacion;
	}
	
	public void setDetalleLiquidacion(DetalleLiquidacionSispas detalleLiquidacion){
		this.detalleLiquidacion=detalleLiquidacion;
	}
	
	public LiquidacionOficinaSispas getLiquidacionOficina(){
		return liquidacionOficina;
	}
	
	public void setLiquidacionOficina(LiquidacionOficinaSispas liquidacionOficina){
		this.liquidacionOficina=liquidacionOficina;
	}
	
	public Set<DetalleLiquidacionSispas> getDetalleLiquidacions() {
		return this.detalleLiquidacions;
	}
	public void setDetalleLiquidacions(
			Set<DetalleLiquidacionSispas> detalleLiquidacions) {
		this.detalleLiquidacions = detalleLiquidacions;
	}

	public Set<LiquidacionOficinaSispas> getLiquidacionOficinas() {
		return this.liquidacionOficinas;
	}
	public void setLiquidacionOficinas(
			Set<LiquidacionOficinaSispas> liquidacionOficinas) {
		this.liquidacionOficinas = liquidacionOficinas;
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
	
}
