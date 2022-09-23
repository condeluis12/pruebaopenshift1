package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;

public class FepirAsigFolioMedicoPK implements Serializable {

	private String cveBlockFolio;

	private Long cveDelegacion;

	private String cvePresupuestal;

	private String matricula;

	private String numFolio;

	private Long programa;
	private Long trimPrograma;

	public FepirAsigFolioMedicoPK() {
		super();
	}

	public FepirAsigFolioMedicoPK(String cveBlockFolio, Long cveDelegacion,
			String cvePresupuestal, String matricula, String numFolio, Long programa, Long trimPrograma) {
		super();
		
		this.cveBlockFolio = cveBlockFolio;
		this.cveDelegacion = cveDelegacion;
		this.cvePresupuestal = cvePresupuestal;
		this.matricula = matricula;
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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
		return "FepirAsigFolioMedicoPK [cveBlockFolio=" + cveBlockFolio + ", cveDelegacion=" + cveDelegacion
				+ ", cvePresupuestal=" + cvePresupuestal + ", matricula=" + matricula + ", numFolio=" + numFolio
				+ ", programa=" + programa + ", trimPrograma=" + trimPrograma + "]";
	}

	

}
