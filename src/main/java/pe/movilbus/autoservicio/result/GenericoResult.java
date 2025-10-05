package pe.movilbus.autoservicio.result;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import pe.movilbus.autoservicio.util.Constantes;



public class GenericoResult implements Serializable{

	private static final long serialVersionUID = 1L;
	private Boolean result = Constantes.RESULT_FALSE;
	private List<Error> listaError;
	
	
	public GenericoResult() {
		super();
	}
	
	
	
	

	public GenericoResult(Boolean result) {
		super();
		this.result = result;
	}





	public GenericoResult(List<Error> listaError) {
		super();
		this.listaError = listaError;
	}

	public GenericoResult(Error error) {
		super();
		List<Error> lista =new ArrayList<>();
		lista.add(error);
		this.listaError = lista;
	}

	




	public GenericoResult(Boolean result, List<Error> listaError) {
		super();
		this.result = result;
		this.listaError = listaError;
	}





	public Boolean getResult() {
		return result;
	}
	
	public void setResult(Boolean result) {
		this.result = result;
	}



	public List<Error> getListaError() {
		return listaError;
	}



	public void setListaError(List<Error> listaError) {
		this.listaError = listaError;
	}
	
	
	
	
}
