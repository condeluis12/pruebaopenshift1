package mx.gob.imss.fepac.autorizacion.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class FepirUnidadMedicaProyection {

	private Long cveDelegacion;
	private String cvePresupuestal;	
	private String nomUnidadMedica;
	public FepirUnidadMedicaProyection(Long cveDelegacion, String cvePresupuestal, String nomUnidadMedica) {
		super();
		this.cveDelegacion = cveDelegacion;
		this.cvePresupuestal = cvePresupuestal;
		this.nomUnidadMedica = nomUnidadMedica;
	}
	public FepirUnidadMedicaProyection() {
		super();
	}
	public Long getCveDelegacion() {
		return cveDelegacion;
	}
	public void setCveDelegacion(Long cveDelegacion) {
		this.cveDelegacion = cveDelegacion;
	}
	public String getCvePresupuestal() {
		return cvePresupuestal;
	}
	public void setCvePresupuestal(String cvePresupuestal) {
		this.cvePresupuestal = cvePresupuestal;
	}
	public String getNomUnidadMedica() {
		return nomUnidadMedica;
	}
	public void setNomUnidadMedica(String nomUnidadMedica) {
		this.nomUnidadMedica = nomUnidadMedica;
	}
	@Override
	public String toString() {
		return "fepirUnidadMedicaProyection [cveDelegacion=" + cveDelegacion + ", cvePresupuestal=" + cvePresupuestal
				+ ", nomUnidadMedica=" + nomUnidadMedica + "]";
	}
	
}
