package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.util.Objects;


public class FepirBlocksCajaPK implements Serializable {

	
	private String cveBlockFolio;

	private String cveCajaBlock;

	public FepirBlocksCajaPK() {
		super();
	}

	

	public FepirBlocksCajaPK(String cveBlockFolio, String cveCajaBlock) {
		super();
		this.cveBlockFolio = cveBlockFolio;
		this.cveCajaBlock = cveCajaBlock;
	}

	

	public String getCveBlockFolio() {
		return cveBlockFolio;
	}

	public void setCveBlockFolio(String cveBlockFolio) {
		this.cveBlockFolio = cveBlockFolio;
	}

	public String getCveCajaBlock() {
		return cveCajaBlock;
	}

	public void setCveCajaBlock(String cveCajaBlock) {
		this.cveCajaBlock = cveCajaBlock;
	}



	@Override
	public String toString() {
		return "FepirBlocksCajaPK [cveBlockFolio=" + cveBlockFolio + ", cveCajaBlock=" + cveCajaBlock + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(cveBlockFolio, cveCajaBlock);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FepirBlocksCajaPK other = (FepirBlocksCajaPK) obj;
		return Objects.equals(cveBlockFolio, other.cveBlockFolio) && Objects.equals(cveCajaBlock, other.cveCajaBlock);
	}

	

}
