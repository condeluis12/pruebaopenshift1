package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FEPIR_CAT_AREA")
public class FepirCatArea implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_AREA", nullable = false)
	private Long cveArea;
	@Column(name = "DESCRIPCION_AREA", nullable = false)
	private String descripcionArea;
	
	
	public FepirCatArea() {
		super();
	}


	public FepirCatArea(Integer idFepirCatArea, Long cveArea, String descripcionArea) {
		super();
		this.cveArea = cveArea;
		this.descripcionArea = descripcionArea;
	}
	






	public Long getCveArea() {
		return cveArea;
	}


	public void setCveArea(Long cveArea) {
		this.cveArea = cveArea;
	}


	public String getDescripcionArea() {
		return descripcionArea;
	}


	public void setDescripcionArea(String descripcionArea) {
		this.descripcionArea = descripcionArea;
	}


	@Override
	public String toString() {
		return "FepirCatArea [cveArea=" + cveArea + ", descripcionArea=" + descripcionArea + "]";
	}


	
	
}
