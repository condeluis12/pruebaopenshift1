package mx.gob.imss.fepac.autorizacion.bean.business.commons;

import java.io.Serializable;


public class ResultadoUnidadMedica implements Serializable {
	
	
	private String cvePresupuestal;
	
	private String nombreUM;
	
	private String nombreDelegacion;
	
	private Long cveDelegacion;
	public ResultadoUnidadMedica() {
		super();
	}
	
	public ResultadoUnidadMedica(String cvePresupuestal, String nombreUM, String nombreDelegacion, Long cveDelegacion) {
		super();
		this.cvePresupuestal = cvePresupuestal;
		this.nombreUM = nombreUM;
		this.nombreDelegacion = nombreDelegacion;
		this.cveDelegacion = cveDelegacion;
	}
	
	public String getCvePresupuestal() {
		return cvePresupuestal;
	}
	public void setCvePresupuestal(String cvePresupuestal) {
		this.cvePresupuestal = cvePresupuestal;
	}
	public String getNombreUM() {
		return nombreUM;
	}
	public void setNombreUM(String nombreUM) {
		this.nombreUM = nombreUM;
	}
	public String getNombreDelegacion() {
		return nombreDelegacion;
	}
	public void setNombreDelegacion(String nombreDelegacion) {
		this.nombreDelegacion = nombreDelegacion;
	}
	public Long getCveDelegacion() {
		return cveDelegacion;
	}
	public void setCveDelegacion(Long cveDelegacion) {
		this.cveDelegacion = cveDelegacion;
	}

	@Override
	public String toString() {
		return "ResultadoUnidadMedica [cvePresupuestal=" + cvePresupuestal + ", nombreUM=" + nombreUM
				+ ", nombreDelegacion=" + nombreDelegacion + ", cveDelegacion=" + cveDelegacion + "]";
	}
	
	
	


}
