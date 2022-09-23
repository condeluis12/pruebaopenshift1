package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.util.Objects;


public class FepirCatPerfilUsuarioPK implements Serializable {

	private Long cvePerfil;

	private Long cvePerfilAutoriza;

	public FepirCatPerfilUsuarioPK() {
		super();
	}


	public FepirCatPerfilUsuarioPK(Long cvePerfil, Long cvePerfilAutoriza) {
		super();
		this.cvePerfil = cvePerfil;
		this.cvePerfilAutoriza = cvePerfilAutoriza;
	}

	public Long getCvePerfil() {
		return cvePerfil;
	}

	public void setCvePerfil(Long cvePerfil) {
		this.cvePerfil = cvePerfil;
	}

	public Long getCvePerfilAutoriza() {
		return cvePerfilAutoriza;
	}

	public void setCvePerfilAutoriza(Long cvePerfilAutoriza) {
		this.cvePerfilAutoriza = cvePerfilAutoriza;
	}


	@Override
	public String toString() {
		return "FepirCatPerfilUsuarioPK [cvePerfil=" + cvePerfil + ", cvePerfilAutoriza=" + cvePerfilAutoriza + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(cvePerfil, cvePerfilAutoriza);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FepirCatPerfilUsuarioPK other = (FepirCatPerfilUsuarioPK) obj;
		return Objects.equals(cvePerfil, other.cvePerfil) && Objects.equals(cvePerfilAutoriza, other.cvePerfilAutoriza);
	}

	

}
