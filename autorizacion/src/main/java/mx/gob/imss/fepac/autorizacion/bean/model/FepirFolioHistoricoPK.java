package mx.gob.imss.fepac.autorizacion.bean.model;


import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class FepirFolioHistoricoPK implements Serializable {

	
	
	private Long cveEstatus;
	
	private java.util.Date fecCambioStatus;

	private String numFolio;

	public FepirFolioHistoricoPK() {
		super();
	}


	public FepirFolioHistoricoPK(Long cveEstatus, Date fecCambioStatus, String numFolio) {
		super();
		this.cveEstatus = cveEstatus;
		this.fecCambioStatus = fecCambioStatus;
		this.numFolio = numFolio;
	}

	

	public Long getCveEstatus() {
		return cveEstatus;
	}

	public void setCveEstatus(Long cveEstatus) {
		this.cveEstatus = cveEstatus;
	}

	public java.util.Date getFecCambioStatus() {
		return fecCambioStatus;
	}

	public void setFecCambioStatus(java.util.Date fecCambioStatus) {
		this.fecCambioStatus = fecCambioStatus;
	}

	public String getNumFolio() {
		return numFolio;
	}

	public void setNumFolio(String numFolio) {
		this.numFolio = numFolio;
	}


	@Override
	public String toString() {
		return "FepirFolioHistoricoPK [cveEstatus=" + cveEstatus + ", fecCambioStatus=" + fecCambioStatus
				+ ", numFolio=" + numFolio + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(cveEstatus, fecCambioStatus, numFolio);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FepirFolioHistoricoPK other = (FepirFolioHistoricoPK) obj;
		return Objects.equals(cveEstatus, other.cveEstatus) && Objects.equals(fecCambioStatus, other.fecCambioStatus)
				&& Objects.equals(numFolio, other.numFolio);
	}

	
}
