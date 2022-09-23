package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.util.Objects;


public class FolioDictamenProgramaPK implements Serializable {

	
	
	
	private Long cveDelegacion;

	private String cvePresupuestal;
	
	private Long programa;

	public FolioDictamenProgramaPK() {
		super();
	}

	

	public FolioDictamenProgramaPK(Long cveDelegacion, String cvePresupuestal, Long programa) {
		super();
		this.cveDelegacion = cveDelegacion;
		this.cvePresupuestal = cvePresupuestal;
		this.programa = programa;
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

	public Long getPrograma() {
		return programa;
	}

	public void setPrograma(Long programa) {
		this.programa = programa;
	}



	@Override
	public String toString() {
		return "FolioDictamenProgramaPK [cveDelegacion=" + cveDelegacion + ", cvePresupuestal=" + cvePresupuestal
				+ ", programa=" + programa + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(cveDelegacion, cvePresupuestal, programa);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FolioDictamenProgramaPK other = (FolioDictamenProgramaPK) obj;
		return Objects.equals(cveDelegacion, other.cveDelegacion)
				&& Objects.equals(cvePresupuestal, other.cvePresupuestal) && Objects.equals(programa, other.programa);
	}

	
}
