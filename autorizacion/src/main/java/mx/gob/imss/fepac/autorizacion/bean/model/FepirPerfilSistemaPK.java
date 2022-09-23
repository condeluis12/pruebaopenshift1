package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.util.Objects;


public class FepirPerfilSistemaPK implements Serializable  {





	private String cveFolioSistema;

	private Long cvePerfil;

	public FepirPerfilSistemaPK() {
		super();
	}

	public FepirPerfilSistemaPK(String cveFolioSistema, Long cvePerfil) {
		super();
		this.cveFolioSistema = cveFolioSistema;
		this.cvePerfil = cvePerfil;
	}

	public String getCveFolioSistema() {
		return cveFolioSistema;
	}

	public void setCveFolioSistema(String cveFolioSistema) {
		this.cveFolioSistema = cveFolioSistema;
	}

	public Long getCvePerfil() {
		return cvePerfil;
	}

	public void setCvePerfil(Long cvePerfil) {
		this.cvePerfil = cvePerfil;
	}

	@Override
	public String toString() {
		return "FepirPerfilSistemaPK [cveFolioSistema=" + cveFolioSistema + ", cvePerfil=" + cvePerfil + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cveFolioSistema, cvePerfil);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FepirPerfilSistemaPK other = (FepirPerfilSistemaPK) obj;
		return Objects.equals(cveFolioSistema, other.cveFolioSistema) && Objects.equals(cvePerfil, other.cvePerfil);
	}

	
}
