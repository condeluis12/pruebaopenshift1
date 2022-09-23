package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.util.Objects;


public class FepirUsuarioAccesoPK implements Serializable  {



	private Long cveDelegacion;

	private String cveUsuario;

	public FepirUsuarioAccesoPK() {
		super();
	}

	

	public FepirUsuarioAccesoPK(Long cveDelegacion, String cveUsuario) {
		super();
		this.cveDelegacion = cveDelegacion;
		this.cveUsuario = cveUsuario;
	}

	

	public Long getCveDelegacion() {
		return cveDelegacion;
	}

	public void setCveDelegacion(Long cveDelegacion) {
		this.cveDelegacion = cveDelegacion;
	}

	public String getCveUsuario() {
		return cveUsuario;
	}

	public void setCveUsuario(String cveUsuario) {
		this.cveUsuario = cveUsuario;
	}



	@Override
	public String toString() {
		return "FepirUsuarioAccesoPK [cveDelegacion=" + cveDelegacion + ", cveUsuario=" + cveUsuario + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(cveDelegacion, cveUsuario);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FepirUsuarioAccesoPK other = (FepirUsuarioAccesoPK) obj;
		return Objects.equals(cveDelegacion, other.cveDelegacion) && Objects.equals(cveUsuario, other.cveUsuario);
	}
	
	
	
	
}
