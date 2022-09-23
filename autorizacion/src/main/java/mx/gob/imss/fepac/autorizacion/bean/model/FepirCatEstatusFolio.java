package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="FEPIR_CAT_ESTATUS_FOLIO")
public class FepirCatEstatusFolio implements Serializable  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_ESTATUS")
	private Long cveEstatus;
	@Column(name = "FEC_USR_UPD_REG")
	private java.util.Date fecUsrUpdReg;
	@Column(name = "NOM_ESTATUS")
	private String nomEstatus;
	@Column(name = "USR_UPD_REG")
	private String usrUpdReg;
	@OneToMany( mappedBy="fepirCatEstatusFolio", cascade = CascadeType.ALL)
	private java.util.Set<FepirAsigFolioUnidad> fepirAsigFolioUnidads;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_TPO_ESTATUS")
	@JsonIgnore
	private FepirCatTpoEstatus fepirCatTpoEstatus;
	@OneToMany( mappedBy="fepirCatEstatusFolio", cascade = CascadeType.ALL)
	private java.util.Set<FepirFolioFepac> fepirFolioFepacs;
	@OneToMany( mappedBy="fepirCatEstatusFolio", cascade = CascadeType.ALL)
	private java.util.Set<FepirFolioHistorico> fepirFolioHistoricos;
	@OneToMany( mappedBy="fepirCatEstatusFolio", cascade = CascadeType.ALL)
	private java.util.Set<FepirUsuarioAcceso> fepirUsuarioAccesos;

	public FepirCatEstatusFolio() {
		super();
	}



	public FepirCatEstatusFolio(Long cveEstatus, Date fecUsrUpdReg, String nomEstatus, String usrUpdReg,
			Set<FepirAsigFolioUnidad> fepirAsigFolioUnidads, FepirCatTpoEstatus fepirCatTpoEstatus,
			Set<FepirFolioFepac> fepirFolioFepacs, Set<FepirFolioHistorico> fepirFolioHistoricos,
			Set<FepirUsuarioAcceso> fepirUsuarioAccesos) {
		super();
		this.cveEstatus = cveEstatus;
		this.fecUsrUpdReg = fecUsrUpdReg;
		this.nomEstatus = nomEstatus;
		this.usrUpdReg = usrUpdReg;
		this.fepirAsigFolioUnidads = fepirAsigFolioUnidads;
		this.fepirCatTpoEstatus = fepirCatTpoEstatus;
		this.fepirFolioFepacs = fepirFolioFepacs;
		this.fepirFolioHistoricos = fepirFolioHistoricos;
		this.fepirUsuarioAccesos = fepirUsuarioAccesos;
	}

	
	public Long getCveEstatus() {
		return cveEstatus;
	}

	public void setCveEstatus(Long cveEstatus) {
		this.cveEstatus = cveEstatus;
	}

	public java.util.Date getFecUsrUpdReg() {
		return fecUsrUpdReg;
	}

	public void setFecUsrUpdReg(java.util.Date fecUsrUpdReg) {
		this.fecUsrUpdReg = fecUsrUpdReg;
	}

	public String getNomEstatus() {
		return nomEstatus;
	}

	public void setNomEstatus(String nomEstatus) {
		this.nomEstatus = nomEstatus;
	}

	public String getUsrUpdReg() {
		return usrUpdReg;
	}

	public void setUsrUpdReg(String usrUpdReg) {
		this.usrUpdReg = usrUpdReg;
	}

	public java.util.Set<FepirAsigFolioUnidad> getFepirAsigFolioUnidads() {
		return fepirAsigFolioUnidads;
	}

	public void setFepirAsigFolioUnidads(java.util.Set<FepirAsigFolioUnidad> fepirAsigFolioUnidads) {
		this.fepirAsigFolioUnidads = fepirAsigFolioUnidads;
	}

	public FepirCatTpoEstatus getFepirCatTpoEstatus() {
		return fepirCatTpoEstatus;
	}

	public void setFepirCatTpoEstatus(FepirCatTpoEstatus fepirCatTpoEstatus) {
		this.fepirCatTpoEstatus = fepirCatTpoEstatus;
	}

	public java.util.Set<FepirFolioFepac> getFepirFolioFepacs() {
		return fepirFolioFepacs;
	}

	public void setFepirFolioFepacs(java.util.Set<FepirFolioFepac> fepirFolioFepacs) {
		this.fepirFolioFepacs = fepirFolioFepacs;
	}

	public java.util.Set<FepirFolioHistorico> getFepirFolioHistoricos() {
		return fepirFolioHistoricos;
	}

	public void setFepirFolioHistoricos(java.util.Set<FepirFolioHistorico> fepirFolioHistoricos) {
		this.fepirFolioHistoricos = fepirFolioHistoricos;
	}

	public java.util.Set<FepirUsuarioAcceso> getFepirUsuarioAccesos() {
		return fepirUsuarioAccesos;
	}

	public void setFepirUsuarioAccesos(java.util.Set<FepirUsuarioAcceso> fepirUsuarioAccesos) {
		this.fepirUsuarioAccesos = fepirUsuarioAccesos;
	}



	@Override
	public String toString() {
		return "FepirCatEstatusFolio [cveEstatus=" + cveEstatus + ", fecUsrUpdReg=" + fecUsrUpdReg + ", nomEstatus="
				+ nomEstatus + ", usrUpdReg=" + usrUpdReg + ", fepirAsigFolioUnidads=" + fepirAsigFolioUnidads
				+ ", fepirCatTpoEstatus=" + fepirCatTpoEstatus + ", fepirFolioFepacs=" + fepirFolioFepacs
				+ ", fepirFolioHistoricos=" + fepirFolioHistoricos + ", fepirUsuarioAccesos=" + fepirUsuarioAccesos
				+ "]";
	}

	

}
