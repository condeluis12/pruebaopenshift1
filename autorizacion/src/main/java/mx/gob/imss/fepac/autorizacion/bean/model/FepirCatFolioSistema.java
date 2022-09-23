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
@Table(name="FEPIR_CAT_FOLIO_SISTEMA")
public class FepirCatFolioSistema implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_FOLIO_SISTEMA", nullable = false)
	private String cveFolioSistema;
	@Column(name = "CIS", nullable = false)
	private String cis;
	@Column(name = "FEC_USR_UPD_REG", nullable = false)
	private java.sql.Date fecUsrUpdReg;
	@Column(name = "NOM_SISTEMA", nullable = false)
	private String nomSistema;
	@Column(name = "USR_UPD_REG", nullable = false)
	private String usrUpdReg;
	@Column(name = "VERSION", nullable = false)
	private String version;
	@OneToMany( mappedBy="fepirCatFolioSistema", cascade = CascadeType.ALL)
	private java.util.Set<FepirFolioFepac> fepirFolioFepacs;
	@OneToMany( mappedBy="fepirCatFolioSistema", cascade = CascadeType.ALL)
	private java.util.Set<FepirPerfilSistema> fepirPerfilSistemas;

	public FepirCatFolioSistema() {
		super();
	}

	

	public FepirCatFolioSistema(String cveFolioSistema, String cis, Date fecUsrUpdReg, String nomSistema,
			String usrUpdReg, String version, Set<FepirFolioFepac> fepirFolioFepacs,
			Set<FepirPerfilSistema> fepirPerfilSistemas) {
		super();
		this.cveFolioSistema = cveFolioSistema;
		this.cis = cis;
		this.fecUsrUpdReg = fecUsrUpdReg;
		this.nomSistema = nomSistema;
		this.usrUpdReg = usrUpdReg;
		this.version = version;
		this.fepirFolioFepacs = fepirFolioFepacs;
		this.fepirPerfilSistemas = fepirPerfilSistemas;
	}

	

	public String getCveFolioSistema() {
		return cveFolioSistema;
	}

	public void setCveFolioSistema(String cveFolioSistema) {
		this.cveFolioSistema = cveFolioSistema;
	}

	public String getCis() {
		return cis;
	}

	public void setCis(String cis) {
		this.cis = cis;
	}

	public java.sql.Date getFecUsrUpdReg() {
		return fecUsrUpdReg;
	}

	public void setFecUsrUpdReg(java.sql.Date fecUsrUpdReg) {
		this.fecUsrUpdReg = fecUsrUpdReg;
	}

	public String getNomSistema() {
		return nomSistema;
	}

	public void setNomSistema(String nomSistema) {
		this.nomSistema = nomSistema;
	}

	public String getUsrUpdReg() {
		return usrUpdReg;
	}

	public void setUsrUpdReg(String usrUpdReg) {
		this.usrUpdReg = usrUpdReg;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public java.util.Set<FepirFolioFepac> getFepirFolioFepacs() {
		return fepirFolioFepacs;
	}

	public void setFepirFolioFepacs(java.util.Set<FepirFolioFepac> fepirFolioFepacs) {
		this.fepirFolioFepacs = fepirFolioFepacs;
	}

	public java.util.Set<FepirPerfilSistema> getFepirPerfilSistemas() {
		return fepirPerfilSistemas;
	}

	public void setFepirPerfilSistemas(java.util.Set<FepirPerfilSistema> fepirPerfilSistemas) {
		this.fepirPerfilSistemas = fepirPerfilSistemas;
	}



	@Override
	public String toString() {
		return "FepirCatFolioSistema [cveFolioSistema=" + cveFolioSistema + ", cis=" + cis + ", fecUsrUpdReg="
				+ fecUsrUpdReg + ", nomSistema=" + nomSistema + ", usrUpdReg=" + usrUpdReg + ", version=" + version
				+ ", fepirFolioFepacs=" + fepirFolioFepacs + ", fepirPerfilSistemas=" + fepirPerfilSistemas + "]";
	}

	

}
