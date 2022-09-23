package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.util.Objects;


public class FepirAlmacenDelgPK implements Serializable {

	


	private Long cveDelegacion;

	private String cvePresupAlmacen;

	public FepirAlmacenDelgPK() {
		super();
	}

	public FepirAlmacenDelgPK( Long cveDelegacion, String cvePresupAlmacen) {
		super();
		
		this.cveDelegacion = cveDelegacion;
		this.cvePresupAlmacen = cvePresupAlmacen;
	}

	


	public Long getCveDelegacion() {
		return cveDelegacion;
	}

	public void setCveDelegacion(Long cveDelegacion) {
		this.cveDelegacion = cveDelegacion;
	}

	public String getCvePresupAlmacen() {
		return cvePresupAlmacen;
	}

	public void setCvePresupAlmacen(String cvePresupAlmacen) {
		this.cvePresupAlmacen = cvePresupAlmacen;
	}

	@Override
	public String toString() {
		return "FepirAlmacenDelgPK [cveDelegacion=" + cveDelegacion + ", cvePresupAlmacen=" + cvePresupAlmacen + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cveDelegacion, cvePresupAlmacen);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FepirAlmacenDelgPK other = (FepirAlmacenDelgPK) obj;
		return Objects.equals(cveDelegacion, other.cveDelegacion)
				&& Objects.equals(cvePresupAlmacen, other.cvePresupAlmacen);
	}
	
	

}
