package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.util.Objects;

public class FepirPerfilPermisoPK  implements Serializable {


	private Long cvePerfil;
	private Long cvePermiso;
	private String cveTipoFolio;

	public FepirPerfilPermisoPK() {
		super();
	}

	

	public FepirPerfilPermisoPK(Long cvePerfil, Long cvePermiso, String cveTipoFolio) {
		super();
		this.cvePerfil = cvePerfil;
		this.cvePermiso = cvePermiso;
		this.cveTipoFolio = cveTipoFolio;
	}


	public Long getCvePerfil() {
		return cvePerfil;
	}

	public void setCvePerfil(Long cvePerfil) {
		this.cvePerfil = cvePerfil;
	}

	public Long getCvePermiso() {
		return cvePermiso;
	}

	public void setCvePermiso(Long cvePermiso) {
		this.cvePermiso = cvePermiso;
	}

	public String getCveTipoFolio() {
		return cveTipoFolio;
	}

	public void setCveTipoFolio(String cveTipoFolio) {
		this.cveTipoFolio = cveTipoFolio;
	}



	@Override
	public String toString() {
		return "FepirPerfilPermisoPK [cvePerfil=" + cvePerfil + ", cvePermiso=" + cvePermiso + ", cveTipoFolio="
				+ cveTipoFolio + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(cvePerfil, cvePermiso, cveTipoFolio);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FepirPerfilPermisoPK other = (FepirPerfilPermisoPK) obj;
		return Objects.equals(cvePerfil, other.cvePerfil) && Objects.equals(cvePermiso, other.cvePermiso)
				&& Objects.equals(cveTipoFolio, other.cveTipoFolio);
	}

	

}
