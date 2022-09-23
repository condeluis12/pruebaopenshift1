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
@Table(name="FEPIR_CAT_TIPO_DICTAMEN")
public class FepirCatTipoDictamen implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_TIPO_DICTAMEN", nullable = false)
	private Long cveTipoDictamen;
	@Column(name = "NOM_TIPO_DICTAMEN", nullable = false)
	private String nomTipoDictamen;
	@OneToMany( mappedBy="fepirCatTipoDictamen", cascade = CascadeType.ALL)
	private java.util.Set<FolioDictamenIncapSt> folioDictamenIncapSts;

	public FepirCatTipoDictamen() {
		super();
	}



	public FepirCatTipoDictamen(Long cveTipoDictamen, String nomTipoDictamen,
			Set<FolioDictamenIncapSt> folioDictamenIncapSts) {
		super();
		this.cveTipoDictamen = cveTipoDictamen;
		this.nomTipoDictamen = nomTipoDictamen;
		this.folioDictamenIncapSts = folioDictamenIncapSts;
	}

	

	public Long getCveTipoDictamen() {
		return cveTipoDictamen;
	}

	public void setCveTipoDictamen(Long cveTipoDictamen) {
		this.cveTipoDictamen = cveTipoDictamen;
	}

	public String getNomTipoDictamen() {
		return nomTipoDictamen;
	}

	public void setNomTipoDictamen(String nomTipoDictamen) {
		this.nomTipoDictamen = nomTipoDictamen;
	}

	public java.util.Set<FolioDictamenIncapSt> getFolioDictamenIncapSts() {
		return folioDictamenIncapSts;
	}

	public void setFolioDictamenIncapSts(java.util.Set<FolioDictamenIncapSt> folioDictamenIncapSts) {
		this.folioDictamenIncapSts = folioDictamenIncapSts;
	}



	@Override
	public String toString() {
		return "FepirCatTipoDictamen [cveTipoDictamen=" + cveTipoDictamen + ", nomTipoDictamen=" + nomTipoDictamen
				+ ", folioDictamenIncapSts=" + folioDictamenIncapSts + "]";
	}

	
}
