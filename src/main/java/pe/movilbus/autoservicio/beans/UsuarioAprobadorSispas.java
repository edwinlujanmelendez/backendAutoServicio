package pe.movilbus.autoservicio.beans;

import java.io.Serializable;

public class UsuarioAprobadorSispas extends GenericBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private UsuarioSispas usuario;
	private Integer nivelAprobacion;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public UsuarioSispas getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioSispas usuario) {
		this.usuario = usuario;
	}
	public Integer getNivelAprobacion() {
		return nivelAprobacion;
	}
	public void setNivelAprobacion(Integer nivelAprobacion) {
		this.nivelAprobacion = nivelAprobacion;
	}
	
}
