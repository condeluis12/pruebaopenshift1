package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="FOLIO_DICTAMEN_INCAP_ST")
@IdClass(value = FolioDictamenIncapStPK.class)
public class FolioDictamenIncapSt implements Serializable {

	@Id
	@Column(name = "CVE_DELEGACION")
	private Long cveDelegacion;
	@Id
	@Column(name = "CVE_PRESUPUESTAL")
	private String cvePresupuestal;
	@Id
	@Column(name = "CVE_TIPO_DICTAMEN")
	private Long cveTipoDictamen;
	@Id
	@Column(name = "NUM_FOLIO", nullable = false)
	private String numFolio;
	@Id
	@Column(name = "PROGRAMA")
	private Long programa;
	@Column(name = "CVE_ESTATUS", nullable = false)
	private long cveEstatus;
	@Column(name = "FEC_CAMBIO_ESTATUS", nullable = false)
	private java.sql.Date fecCambioEstatus;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_TIPO_DICTAMEN",insertable = false,updatable = false)
	@JsonIgnore
	private FepirCatTipoDictamen fepirCatTipoDictamen;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
        @JoinColumn(name="PROGRAMA", referencedColumnName="PROGRAMA",insertable = false,updatable = false),
        @JoinColumn(name="CVE_DELEGACION", referencedColumnName="CVE_DELEGACION",insertable = false,updatable = false),
        @JoinColumn(name="CVE_PRESUPUESTAL", referencedColumnName="CVE_PRESUPUESTAL",insertable = false,updatable = false)
})
	@JsonIgnore
	private FolioDictamenPrograma folioDictamenPrograma;

	public FolioDictamenIncapSt() {
		super();
	}

	

	public FolioDictamenIncapSt( long cveEstatus, Date fecCambioEstatus,
			FepirCatTipoDictamen fepirCatTipoDictamen, FolioDictamenPrograma folioDictamenPrograma) {
		super();
		this.cveEstatus = cveEstatus;
		this.fecCambioEstatus = fecCambioEstatus;
		this.fepirCatTipoDictamen = fepirCatTipoDictamen;
		this.folioDictamenPrograma = folioDictamenPrograma;
	}



	public long getCveEstatus() {
		return cveEstatus;
	}

	public void setCveEstatus(long cveEstatus) {
		this.cveEstatus = cveEstatus;
	}

	public java.sql.Date getFecCambioEstatus() {
		return fecCambioEstatus;
	}

	public void setFecCambioEstatus(java.sql.Date fecCambioEstatus) {
		this.fecCambioEstatus = fecCambioEstatus;
	}

	public FepirCatTipoDictamen getFepirCatTipoDictamen() {
		return fepirCatTipoDictamen;
	}

	public void setFepirCatTipoDictamen(FepirCatTipoDictamen fepirCatTipoDictamen) {
		this.fepirCatTipoDictamen = fepirCatTipoDictamen;
	}

	public FolioDictamenPrograma getFolioDictamenPrograma() {
		return folioDictamenPrograma;
	}

	public void setFolioDictamenPrograma(FolioDictamenPrograma folioDictamenPrograma) {
		this.folioDictamenPrograma = folioDictamenPrograma;
	}



	@Override
	public String toString() {
		return "FolioDictamenIncapSt [cveDelegacion=" + cveDelegacion + ", cvePresupuestal=" + cvePresupuestal
				+ ", cveTipoDictamen=" + cveTipoDictamen + ", numFolio=" + numFolio + ", programa=" + programa
				+ ", cveEstatus=" + cveEstatus + ", fecCambioEstatus=" + fecCambioEstatus + ", fepirCatTipoDictamen="
				+ fepirCatTipoDictamen + ", folioDictamenPrograma=" + folioDictamenPrograma + "]";
	}

	

}
