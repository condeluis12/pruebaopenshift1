package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.util.Objects;


public class FepirUnidadMedicaPK implements Serializable {

	

	private Long cveDelegacion;
	
	private String cvePresupuestal;

	public FepirUnidadMedicaPK() {
		super();
	}



	public FepirUnidadMedicaPK(Long cveDelegacion, String cvePresupuestal) {
		super();
		this.cveDelegacion = cveDelegacion;
		this.cvePresupuestal = cvePresupuestal;
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



	@Override
	public String toString() {
		return "FepirUnidadMedicaPK [cveDelegacion=" + cveDelegacion + ", cvePresupuestal=" + cvePresupuestal + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(cveDelegacion, cvePresupuestal);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FepirUnidadMedicaPK other = (FepirUnidadMedicaPK) obj;
		return Objects.equals(cveDelegacion, other.cveDelegacion)
				&& Objects.equals(cvePresupuestal, other.cvePresupuestal);
	}

	

}
