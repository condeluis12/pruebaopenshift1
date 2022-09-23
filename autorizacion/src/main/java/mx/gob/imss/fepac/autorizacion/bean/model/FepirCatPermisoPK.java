package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;


public class FepirCatPermisoPK implements Serializable {

	

	private Long cvePermiso;
	
	private String cveTipoFolio;

	public FepirCatPermisoPK() {
		super();
	}


	public FepirCatPermisoPK(Long cvePermiso, String cveTipoFolio) {
		super();
		this.cvePermiso = cvePermiso;
		this.cveTipoFolio = cveTipoFolio;
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
		return "FepirCatPermisoPK [cvePermiso=" + cvePermiso + ", cveTipoFolio=" + cveTipoFolio + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(cvePermiso, cveTipoFolio);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FepirCatPermisoPK other = (FepirCatPermisoPK) obj;
		return Objects.equals(cvePermiso, other.cvePermiso) && Objects.equals(cveTipoFolio, other.cveTipoFolio);
	}
	

	
}
