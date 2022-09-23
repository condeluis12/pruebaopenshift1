package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.util.Objects;


public class FepirProgFolioSeriePK implements Serializable {

	
	
	private Long cveDelegacion;

	private Long cveFoliosAsignados;

	private Long programa;

	private Long trimPrograma;

	public FepirProgFolioSeriePK() {
		super();
	}


	public FepirProgFolioSeriePK(Long cveDelegacion, Long cveFoliosAsignados, Long programa, Long trimPrograma) {
		super();
		this.cveDelegacion = cveDelegacion;
		this.cveFoliosAsignados = cveFoliosAsignados;
		this.programa = programa;
		this.trimPrograma = trimPrograma;
	}

	

	public Long getCveDelegacion() {
		return cveDelegacion;
	}

	public void setCveDelegacion(Long cveDelegacion) {
		this.cveDelegacion = cveDelegacion;
	}

	public Long getCveFoliosAsignados() {
		return cveFoliosAsignados;
	}

	public void setCveFoliosAsignados(Long cveFoliosAsignados) {
		this.cveFoliosAsignados = cveFoliosAsignados;
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
		return "FepirProgFolioSeriePK [cveDelegacion=" + cveDelegacion + ", cveFoliosAsignados=" + cveFoliosAsignados
				+ ", programa=" + programa + ", trimPrograma=" + trimPrograma + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(cveDelegacion, cveFoliosAsignados, programa, trimPrograma);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FepirProgFolioSeriePK other = (FepirProgFolioSeriePK) obj;
		return Objects.equals(cveDelegacion, other.cveDelegacion)
				&& Objects.equals(cveFoliosAsignados, other.cveFoliosAsignados)
				&& Objects.equals(programa, other.programa) && Objects.equals(trimPrograma, other.trimPrograma);
	}


}
