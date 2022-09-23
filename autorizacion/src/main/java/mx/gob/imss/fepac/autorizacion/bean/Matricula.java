package mx.gob.imss.fepac.autorizacion.bean;

import java.io.Serializable;



public class Matricula implements Serializable {
	
	
	
	private String valueMatricula;

	private String labelMatricula;
	public Matricula() {
		super();
	}
	
	public Matricula(java.lang.String valueMatricula, java.lang.String labelMatricula) {
		super();
		this.valueMatricula = valueMatricula;
		this.labelMatricula = labelMatricula;
	}
	
	
	public String getValueMatricula() {
		return valueMatricula;
	}
	public void setValueMatricula(String valueMatricula) {
		this.valueMatricula = valueMatricula;
	}
	public String getLabelMatricula() {
		return labelMatricula;
	}
	public void setLabelMatricula(String labelMatricula) {
		this.labelMatricula = labelMatricula;
	}

	@Override
	public String toString() {
		return "Matricula [valueMatricula=" + valueMatricula + ", labelMatricula=" + labelMatricula + "]";
	}
	
	
	


}
