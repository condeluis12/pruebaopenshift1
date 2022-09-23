package mx.gob.imss.fepac.autorizacion.bean;

import java.io.Serializable;


public class Delegacion implements Serializable {
	
	private String cveDelegacion;

	private String nomDelegacion;

	private String cveRegion;
	
	
	

	public Delegacion() {
		super();
	}



	public Delegacion(String cveDelegacion, String nomDelegacion, String cveRegion) {
		super();
		this.cveDelegacion = cveDelegacion;
		this.nomDelegacion = nomDelegacion;
		this.cveRegion = cveRegion;
	}



	public String getCveDelegacion() {
		return cveDelegacion;
	}

	public void setCveDelegacion(String cveDelegacion) {
		this.cveDelegacion = cveDelegacion;
	}

	public String getNomDelegacion() {
		return nomDelegacion;
	}

	public void setNomDelegacion(String nomDelegacion) {
		this.nomDelegacion = nomDelegacion;
	}

	public String getCveRegion() {
		return cveRegion;
	}

	public void setCveRegion(String cveRegion) {
		this.cveRegion = cveRegion;
	}



	@Override
	public String toString() {
		return "Delegacion [cveDelegacion=" + cveDelegacion + ", nomDelegacion=" + nomDelegacion + ", cveRegion="
				+ cveRegion + "]";
	}

	
}
	