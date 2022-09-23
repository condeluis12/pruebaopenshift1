package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.util.Objects;

public class FepirAsigFolioUnidadPK implements Serializable {


	
	

	private String cveBlockFolio;

	private Long cveDelegacion;
	
	private String cvePresupuestal;
	
	private String numFolio;
	
	private Long programa;
	
	private Long trimPrograma;

	public FepirAsigFolioUnidadPK() {
		super();
	}

	

	public FepirAsigFolioUnidadPK(String cveBlockFolio, Long cveDelegacion, String cvePresupuestal, String numFolio,
			Long programa, Long trimPrograma) {
		super();
		this.cveBlockFolio = cveBlockFolio;
		this.cveDelegacion = cveDelegacion;
		this.cvePresupuestal = cvePresupuestal;
		this.numFolio = numFolio;
		this.programa = programa;
		this.trimPrograma = trimPrograma;
	}


	public String getCveBlockFolio() {
		return cveBlockFolio;
	}

	public void setCveBlockFolio(String cveBlockFolio) {
		this.cveBlockFolio = cveBlockFolio;
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

	public Long getTrimPrograma() {
		return trimPrograma;
	}

	public void setTrimPrograma(Long trimPrograma) {
		this.trimPrograma = trimPrograma;
	}



	@Override
	public String toString() {
		return "FepirAsigFolioUnidadPK [cveBlockFolio=" + cveBlockFolio + ", cveDelegacion=" + cveDelegacion
				+ ", cvePresupuestal=" + cvePresupuestal + ", numFolio=" + numFolio + ", programa=" + programa
				+ ", trimPrograma=" + trimPrograma + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(cveBlockFolio, cveDelegacion, cvePresupuestal, numFolio, programa, trimPrograma);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FepirAsigFolioUnidadPK other = (FepirAsigFolioUnidadPK) obj;
		return Objects.equals(cveBlockFolio, other.cveBlockFolio) && Objects.equals(cveDelegacion, other.cveDelegacion)
				&& Objects.equals(cvePresupuestal, other.cvePresupuestal) && Objects.equals(numFolio, other.numFolio)
				&& Objects.equals(programa, other.programa) && Objects.equals(trimPrograma, other.trimPrograma);
	}

	
}
