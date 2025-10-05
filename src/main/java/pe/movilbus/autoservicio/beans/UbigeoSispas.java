package pe.movilbus.autoservicio.beans;

import java.io.Serializable;

public class UbigeoSispas extends GenericBean implements Serializable {

	private static final long serialVersionUID = 1L;     
	private String id;
    private String codigoDepartamento;
    private String codigoProvincia;
    private String codigoDistrito;
    private String nombreUbigeo;
     
    public UbigeoSispas() {
    	super();
    }

    
    public UbigeoSispas(String id){
    	this.id=id;
    }
    
	/**
	 * @return Objeto id.
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id	: Setea el objeto id.
	 */
	public void setId(String id) {
		this.id = id;
	}

	public String getCodigoDepartamento() {
		return codigoDepartamento;
	}
	public void setCodigoDepartamento(String codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}

	public String getCodigoProvincia() {
		return codigoProvincia;
	}
	public void setCodigoProvincia(String codigoProvincia) {
		this.codigoProvincia = codigoProvincia;
	}

	public String getCodigoDistrito() {
		return codigoDistrito;
	}
	public void setCodigoDistrito(String codigoDistrito) {
		this.codigoDistrito = codigoDistrito;
	}

	public String getNombreUbigeo() {
		return nombreUbigeo;
	}
	public void setNombreUbigeo(String nombreUbigeo) {
		this.nombreUbigeo = nombreUbigeo;
	}    
}
