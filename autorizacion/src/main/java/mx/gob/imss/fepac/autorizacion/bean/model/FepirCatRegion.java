package mx.gob.imss.fepac.autorizacion.bean.model;


import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="FEPIR_CAT_REGION")
public class FepirCatRegion  implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_REGION", nullable = false)
	private Long cveRegion;
	@Column(name = "NOM_REGION", nullable = false)
	private String nomRegion;
	@OneToMany( mappedBy="fepirCatRegion", cascade = CascadeType.ALL)
	private java.util.Set<FepirCatDelegacion> fepirCatDelegacions;

	public FepirCatRegion() {
		super();
	}

	public FepirCatRegion(Long cveRegion, String nomRegion, Set<FepirCatDelegacion> fepirCatDelegacions) {
		super();
		this.cveRegion = cveRegion;
		this.nomRegion = nomRegion;
		this.fepirCatDelegacions = fepirCatDelegacions;
	}

	

	public Long getCveRegion() {
		return cveRegion;
	}

	public void setCveRegion(Long cveRegion) {
		this.cveRegion = cveRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public java.util.Set<FepirCatDelegacion> getFepirCatDelegacions() {
		return fepirCatDelegacions;
	}

	public void setFepirCatDelegacions(java.util.Set<FepirCatDelegacion> fepirCatDelegacions) {
		this.fepirCatDelegacions = fepirCatDelegacions;
	}

	@Override
	public String toString() {
		return "FepirCatRegion [cveRegion=" + cveRegion + ", nomRegion=" + nomRegion + ", fepirCatDelegacions="
				+ fepirCatDelegacions + "]";
	}

	
}
