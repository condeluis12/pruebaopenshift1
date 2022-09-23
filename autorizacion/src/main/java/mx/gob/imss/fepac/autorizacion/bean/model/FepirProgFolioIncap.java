package mx.gob.imss.fepac.autorizacion.bean.model;


import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="fepirProgFolioIncap")
@IdClass(value = FepirProgFolioIncapPK.class)
public class FepirProgFolioIncap implements Serializable {
	@Id
	@Column(name = "CVE_DELEGACION")
	private Long cveDelegacion;
	@Id
	@Column(name = "PROGRAMA")
	private Long programa;
	@Id
	@Column(name = "TRIM_PROGRAMA")
	private Long trimPrograma;
	@Column(name = "CVE_ESTATUS")
	private Long cveEstatus;
	@Column(name = "FEC_BAJA")
	private java.sql.Date fecBaja;
	@Column(name = "FEC_CAMBIO_ESTATUS")
	private java.sql.Date fecCambioEstatus;
	@Column(name = "FEC_USR_UPD_REG")
	private java.sql.Date fecUsrUpdReg;
	@Column(name = "USR_UPD_REG")
	private String usrUpdReg;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_DELEGACION",referencedColumnName="CVE_DELEGACION", insertable=false, updatable=false)
	@JsonIgnore
	private FepirCatDelegacion fepirCatDelegacion;
	@OneToMany( mappedBy="fepirProgFolioIncap", cascade = CascadeType.ALL)
	private java.util.Set<FepirProgFolioSerie> fepirProgFolioSeries;

	public FepirProgFolioIncap() {
		super();
	}

	

	public FepirProgFolioIncap(Long cveEstatus, Date fecBaja,
			Date fecCambioEstatus, Date fecUsrUpdReg, String usrUpdReg, FepirCatDelegacion fepirCatDelegacion,
			Set<FepirProgFolioSerie> fepirProgFolioSeries) {
		super();
		this.cveEstatus = cveEstatus;
		this.fecBaja = fecBaja;
		this.fecCambioEstatus = fecCambioEstatus;
		this.fecUsrUpdReg = fecUsrUpdReg;
		this.usrUpdReg = usrUpdReg;
		this.fepirCatDelegacion = fepirCatDelegacion;
		this.fepirProgFolioSeries = fepirProgFolioSeries;
	}

	public Long getCveEstatus() {
		return cveEstatus;
	}

	public void setCveEstatus(Long cveEstatus) {
		this.cveEstatus = cveEstatus;
	}

	public java.sql.Date getFecBaja() {
		return fecBaja;
	}

	public void setFecBaja(java.sql.Date fecBaja) {
		this.fecBaja = fecBaja;
	}

	public java.sql.Date getFecCambioEstatus() {
		return fecCambioEstatus;
	}

	public void setFecCambioEstatus(java.sql.Date fecCambioEstatus) {
		this.fecCambioEstatus = fecCambioEstatus;
	}

	public java.sql.Date getFecUsrUpdReg() {
		return fecUsrUpdReg;
	}

	public void setFecUsrUpdReg(java.sql.Date fecUsrUpdReg) {
		this.fecUsrUpdReg = fecUsrUpdReg;
	}

	public String getUsrUpdReg() {
		return usrUpdReg;
	}

	public void setUsrUpdReg(String usrUpdReg) {
		this.usrUpdReg = usrUpdReg;
	}

	public FepirCatDelegacion getFepirCatDelegacion() {
		return fepirCatDelegacion;
	}

	public void setFepirCatDelegacion(FepirCatDelegacion fepirCatDelegacion) {
		this.fepirCatDelegacion = fepirCatDelegacion;
	}

	public java.util.Set<FepirProgFolioSerie> getFepirProgFolioSeries() {
		return fepirProgFolioSeries;
	}

	public void setFepirProgFolioSeries(java.util.Set<FepirProgFolioSerie> fepirProgFolioSeries) {
		this.fepirProgFolioSeries = fepirProgFolioSeries;
	}



	@Override
	public String toString() {
		return "FepirProgFolioIncap [cveDelegacion=" + cveDelegacion + ", programa=" + programa + ", trimPrograma="
				+ trimPrograma + ", cveEstatus=" + cveEstatus + ", fecBaja=" + fecBaja + ", fecCambioEstatus="
				+ fecCambioEstatus + ", fecUsrUpdReg=" + fecUsrUpdReg + ", usrUpdReg=" + usrUpdReg
				+ ", fepirCatDelegacion=" + fepirCatDelegacion + ", fepirProgFolioSeries=" + fepirProgFolioSeries + "]";
	}

	
}
