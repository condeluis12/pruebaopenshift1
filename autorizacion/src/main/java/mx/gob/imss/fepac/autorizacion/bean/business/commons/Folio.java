package mx.gob.imss.fepac.autorizacion.bean.business.commons;

import java.io.Serializable;


public class Folio implements Serializable  {
	
	
	private String cveFolio;
	private String valorFolio;
	
	public Folio(){
		
	}
	
	public Folio (String valorFolio){
		this.cveFolio = valorFolio;
		this.valorFolio = valorFolio;
	}
	
	public Folio(String cveFolio, String valorFolio){
		this.cveFolio = cveFolio;
		this.valorFolio = valorFolio;
	}
		
	public String getCveFolio() {
		return cveFolio;
	}
	public void setCveFolio(String cveFolio) {
		this.cveFolio = cveFolio;
	}
	public String getValorFolio() {
		return valorFolio;
	}
	public void setValorFolio(String valorFolio) {
		this.valorFolio = valorFolio;
	}
	

}
