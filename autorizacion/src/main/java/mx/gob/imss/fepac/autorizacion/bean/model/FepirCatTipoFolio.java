package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.sql.Date;
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
@Table(name="FEPIR_CAT_TIPO_FOLIO")
public class FepirCatTipoFolio implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_TIPO_FOLIO", nullable = false)
	private String cveTipoFolio;
	@Column(name = "FEC_USR_UPD_REG", nullable = false)
	private java.sql.Date fecUsrUpdReg;
	@Column(name = "NOM_TIPO_FOLIO", nullable = false)
	private String nomTipoFolio;
	@Column(name = "USR_UPD_REG", nullable = false)
	private String usrUpdReg;
	@OneToMany( mappedBy="fepirCatTipoFolio", cascade = CascadeType.ALL)
	private java.util.Set<FepirFolioFepac> fepirFolioFepacs;

	public FepirCatTipoFolio() {
		super();
	}

	public FepirCatTipoFolio(String cveTipoFolio, Date fecUsrUpdReg, String nomTipoFolio, String usrUpdReg,
			Set<FepirFolioFepac> fepirFolioFepacs) {
		super();
		this.cveTipoFolio = cveTipoFolio;
		this.fecUsrUpdReg = fecUsrUpdReg;
		this.nomTipoFolio = nomTipoFolio;
		this.usrUpdReg = usrUpdReg;
		this.fepirFolioFepacs = fepirFolioFepacs;
	}

	
	public String getCveTipoFolio() {
		return cveTipoFolio;
	}

	public void setCveTipoFolio(String cveTipoFolio) {
		this.cveTipoFolio = cveTipoFolio;
	}

	public java.sql.Date getFecUsrUpdReg() {
		return fecUsrUpdReg;
	}

	public void setFecUsrUpdReg(java.sql.Date fecUsrUpdReg) {
		this.fecUsrUpdReg = fecUsrUpdReg;
	}

	public String getNomTipoFolio() {
		return nomTipoFolio;
	}

	public void setNomTipoFolio(String nomTipoFolio) {
		this.nomTipoFolio = nomTipoFolio;
	}

	public String getUsrUpdReg() {
		return usrUpdReg;
	}

	public void setUsrUpdReg(String usrUpdReg) {
		this.usrUpdReg = usrUpdReg;
	}

	public java.util.Set<FepirFolioFepac> getFepirFolioFepacs() {
		return fepirFolioFepacs;
	}

	public void setFepirFolioFepacs(java.util.Set<FepirFolioFepac> fepirFolioFepacs) {
		this.fepirFolioFepacs = fepirFolioFepacs;
	}

	@Override
	public String toString() {
		return "FepirCatTipoFolio [cveTipoFolio=" + cveTipoFolio + ", fecUsrUpdReg=" + fecUsrUpdReg + ", nomTipoFolio="
				+ nomTipoFolio + ", usrUpdReg=" + usrUpdReg + ", fepirFolioFepacs=" + fepirFolioFepacs + "]";
	}

	

}
