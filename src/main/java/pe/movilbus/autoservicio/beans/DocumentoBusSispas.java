package pe.movilbus.autoservicio.beans;

public class DocumentoBusSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private EstadoDocumentoBusSispas estadoDocumentoBus;
	private BusSispas bus;
	private TipoDocumentoSispas tipoDocumento;
	private String numeroDocumento;
	private String fechaExpedicion;
	private String fechaVencimiento;
	
	public DocumentoBusSispas() {
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
	 * @return Objeto estadoDocumentoBus.
	 */
	public EstadoDocumentoBusSispas getEstadoDocumentoBus() {
		return estadoDocumentoBus;
	}
	/**
	 * @param estadoDocumentoBus	: Setea el objeto estadoDocumentoBus.
	 */
	public void setEstadoDocumentoBus(EstadoDocumentoBusSispas estadoDocumentoBus) {
		this.estadoDocumentoBus = estadoDocumentoBus;
	}

	/**
	 * @return Objeto bus.
	 */
	public BusSispas getBus() {
		return bus;
	}
	/**
	 * @param bus	: Setea el objeto bus.
	 */
	public void setBus(BusSispas bus) {
		this.bus = bus;
	}

	/**
	 * @return Objeto tipoDocumento.
	 */
	public TipoDocumentoSispas getTipoDocumento() {
		return tipoDocumento;
	}
	/**
	 * @param tipoDocumento	: Setea el objeto tipoDocumento.
	 */
	public void setTipoDocumento(TipoDocumentoSispas tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * @return Objeto numeroDocumento.
	 */
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	/**
	 * @param numeroDocumento	: Setea el objeto numeroDocumento.
	 */
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	/**
	 * @return Objeto fechaExpedicion.
	 */
	public String getFechaExpedicion() {
		return fechaExpedicion;
	}
	/**
	 * @param fechaExpedicion	: Setea el objeto fechaExpedicion.
	 */
	public void setFechaExpedicion(String fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}

	/**
	 * @return Objeto fechaVencimiento.
	 */
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	/**
	 * @param fechaVencimiento	: Setea el objeto fechaVencimiento.
	 */
	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
}
