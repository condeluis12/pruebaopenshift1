package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.util.Objects;


public class FepirMedicoUnidadPK implements Serializable {

	private Long cveDelegacion;

	private String cvePresupuestal;
	
	private String matricula;

	public FepirMedicoUnidadPK() {
		super();
	}

	
	public FepirMedicoUnidadPK(Long cveDelegacion, String cvePresupuestal, String matricula) {
		super();
		this.cveDelegacion = cveDelegacion;
		this.cvePresupuestal = cvePresupuestal;
		this.matricula = matricula;
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	@Override
	public String toString() {
		return "FepirMedicoUnidadPK [cveDelegacion=" + cveDelegacion + ", cvePresupuestal=" + cvePresupuestal
				+ ", matricula=" + matricula + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(cveDelegacion, cvePresupuestal, matricula);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FepirMedicoUnidadPK other = (FepirMedicoUnidadPK) obj;
		return Objects.equals(cveDelegacion, other.cveDelegacion)
				&& Objects.equals(cvePresupuestal, other.cvePresupuestal) && Objects.equals(matricula, other.matricula);
	}

	

}
