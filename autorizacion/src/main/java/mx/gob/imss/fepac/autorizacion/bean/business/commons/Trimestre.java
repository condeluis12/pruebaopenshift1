package mx.gob.imss.fepac.autorizacion.bean.business.commons;

import java.io.Serializable;


public class Trimestre implements Serializable {

	
	private int cveTrimestre;
	private String valorTrimestre;

	public Trimestre() {
		super();
		
	}

	public Trimestre(Long cveTrimestre, String valorTrimestre) {
		super();
		this.cveTrimestre = cveTrimestre.intValue();
		this.valorTrimestre = valorTrimestre;
	}
	public int getCveTrimestre() {
		return cveTrimestre;
	}
	public void setCveTrimestre(Long cveTrimestre) {
		this.cveTrimestre = cveTrimestre.intValue();
	}
	public String getValorTrimestre() {
		return valorTrimestre;
	}
	public void setValorTrimestre(String valorTrimestre) {
		this.valorTrimestre = valorTrimestre;
	}
	



}
