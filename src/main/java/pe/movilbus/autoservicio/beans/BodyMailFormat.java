package pe.movilbus.autoservicio.beans;

import java.io.Serializable;

public class BodyMailFormat extends GenericBean implements Serializable {
	  private static final long serialVersionUID = 1L;
	  
	  	private Integer id;
	  	private String c_cabecera;
	  	private String c_footer;
	  	private String c_titulo;
	  	private String cc_correo;
	  	private String co_correo;
	  	private String archivos_adic;
	  
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getC_cabecera() {
			return c_cabecera;
		}
		public void setC_cabecera(String c_cabecera) {
			this.c_cabecera = c_cabecera;
		}
		public String getC_footer() {
			return c_footer;
		}
		public void setC_footer(String c_footer) {
			this.c_footer = c_footer;
		}
		public String getC_titulo() {
			return c_titulo;
		}
		public void setC_titulo(String c_titulo) {
			this.c_titulo = c_titulo;
		}
		public String getCc_correo() {
			return cc_correo;
		}
		public void setCc_correo(String cc_correo) {
			this.cc_correo = cc_correo;
		}
		public String getCo_correo() {
			return co_correo;
		}
		public void setCo_correo(String co_correo) {
			this.co_correo = co_correo;
		}
		public String getArchivos_adic() {
			return archivos_adic;
		}
		public void setArchivos_adic(String archivos_adic) {
			this.archivos_adic = archivos_adic;
		}
}
