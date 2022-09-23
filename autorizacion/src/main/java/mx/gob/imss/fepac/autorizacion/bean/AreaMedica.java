package mx.gob.imss.fepac.autorizacion.bean;

import java.io.Serializable;



public class AreaMedica implements Serializable {

	

	private Integer cveArea;

	private String decripArea;
	
	public AreaMedica() {
		super();
	}

	public AreaMedica( Integer cveArea, String decripArea) {
		super();
		
		this.cveArea = cveArea;
		this.decripArea = decripArea;
	}

	public AreaMedica(String decripArea) {
		super();
		this.decripArea = decripArea;
	}



	public Integer getCveArea() {
		return cveArea;
	}

	public void setCveArea(Integer cveArea) {
		this.cveArea = cveArea;
	}

	public String getDecripArea() {
		return decripArea;
	}

	public void setDecripArea(String decripArea) {
		this.decripArea = decripArea;
	}

	@Override
	public String toString() {
		return "AreaMedica [cveArea=" + cveArea + ", decripArea=" + decripArea + "]";
	}

	
	
	
	
	
}



