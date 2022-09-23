package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.util.Objects;


public class FepirBlocksFolioPK implements Serializable {

	


	private String cveBlockFolio;

	private Long cveDelegacion;
	
	private String numFolio;
	
	private Long programa;

	private Long trimPrograma;

	public FepirBlocksFolioPK() {
		super();
	}

	public FepirBlocksFolioPK( String cveBlockFolio, Long cveDelegacion,
			String numFolio, Long programa, Long trimPrograma) {
		super();
		this.cveBlockFolio = cveBlockFolio;
		this.cveDelegacion = cveDelegacion;
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
		return "FepirBlocksFolioPK [cveBlockFolio=" + cveBlockFolio + ", cveDelegacion=" + cveDelegacion + ", numFolio="
				+ numFolio + ", programa=" + programa + ", trimPrograma=" + trimPrograma + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cveBlockFolio, cveDelegacion, numFolio, programa, trimPrograma);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FepirBlocksFolioPK other = (FepirBlocksFolioPK) obj;
		return Objects.equals(cveBlockFolio, other.cveBlockFolio) && Objects.equals(cveDelegacion, other.cveDelegacion)
				&& Objects.equals(numFolio, other.numFolio) && Objects.equals(programa, other.programa)
				&& Objects.equals(trimPrograma, other.trimPrograma);
	}

	

}
