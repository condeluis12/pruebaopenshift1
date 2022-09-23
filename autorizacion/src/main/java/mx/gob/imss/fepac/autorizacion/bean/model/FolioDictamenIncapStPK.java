package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.util.Objects;


public class FolioDictamenIncapStPK  implements Serializable  {

	
	
	private Long cveDelegacion;
	
	private String cvePresupuestal;
	
	private Long cveTipoDictamen;
	
	private String numFolio;
	
	private Long programa;

	public FolioDictamenIncapStPK() {
		super();
	}

	public FolioDictamenIncapStPK(Long cveDelegacion, String cvePresupuestal, Long cveTipoDictamen, String numFolio,
			Long programa) {
		super();
		this.cveDelegacion = cveDelegacion;
		this.cvePresupuestal = cvePresupuestal;
		this.cveTipoDictamen = cveTipoDictamen;
		this.numFolio = numFolio;
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

	public Long getCveTipoDictamen() {
		return cveTipoDictamen;
	}

	public void setCveTipoDictamen(Long cveTipoDictamen) {
		this.cveTipoDictamen = cveTipoDictamen;
	}

	public String getNumFolio() {
		return numFolio;
	}

	public void setNumFolio(String numFolio) {
		this.numFolio = numFolio;
	}

	public Long getPrograma() {
		return programa;
	}

	public void setPrograma(Long programa) {
		this.programa = programa;
	}
	@Override
	public String toString() {
		return "FolioDictamenIncapStPK [cveDelegacion=" + cveDelegacion + ", cvePresupuestal=" + cvePresupuestal
				+ ", cveTipoDictamen=" + cveTipoDictamen + ", numFolio=" + numFolio + ", programa=" + programa + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cveDelegacion, cvePresupuestal, cveTipoDictamen, numFolio, programa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FolioDictamenIncapStPK other = (FolioDictamenIncapStPK) obj;
		return Objects.equals(cveDelegacion, other.cveDelegacion)
				&& Objects.equals(cvePresupuestal, other.cvePresupuestal)
				&& Objects.equals(cveTipoDictamen, other.cveTipoDictamen) && Objects.equals(numFolio, other.numFolio)
				&& Objects.equals(programa, other.programa);
	}

	

}
