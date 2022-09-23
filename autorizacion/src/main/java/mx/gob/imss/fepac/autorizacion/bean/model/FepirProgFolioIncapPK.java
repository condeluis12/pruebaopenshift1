package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.util.Objects;


public class FepirProgFolioIncapPK implements Serializable {


	
	private Long cveDelegacion;
	
	private Long programa;
	
	private Long trimPrograma;

	public FepirProgFolioIncapPK() {
		super();
	}



	public FepirProgFolioIncapPK(Long cveDelegacion, Long programa, Long trimPrograma) {
		super();
		this.cveDelegacion = cveDelegacion;
		this.programa = programa;
		this.trimPrograma = trimPrograma;
	}

	

	public Long getCveDelegacion() {
		return cveDelegacion;
	}

	public void setCveDelegacion(Long cveDelegacion) {
		this.cveDelegacion = cveDelegacion;
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
	public int hashCode() {
		return Objects.hash(cveDelegacion, programa, trimPrograma);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FepirProgFolioIncapPK other = (FepirProgFolioIncapPK) obj;
		return Objects.equals(cveDelegacion, other.cveDelegacion) && Objects.equals(programa, other.programa)
				&& Objects.equals(trimPrograma, other.trimPrograma);
	}

	

}
