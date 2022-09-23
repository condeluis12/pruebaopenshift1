package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="FEPIR_FOLIO_HISTORICO")
@IdClass(value = FepirFolioHistoricoPK.class)
public class FepirFolioHistorico implements Serializable {
	@Id
	@Column(name = "CVE_ESTATUS", nullable = false)
	private Long cveEstatus;
	@Id
	@Column(name = "FEC_CAMBIO_STATUS", nullable = false)
	private java.util.Date fecCambioStatus;
	@Id
	@Column(name = "NUM_FOLIO", nullable = false)
	private String numFolio;
	@Column(name = "CVE_DELEGACION", nullable = false)
	private Long cveDelegacion;
	@Column(name = "CVE_PRESUPUESTAL", nullable = false)
	private String cvePresupuestal;
	@Column(name = "FECHA_ENTREGA", nullable = false)
	private java.util.Date fechaEntrega;
	@Column(name = "FEC_ULT_CERT_INCAP", nullable = false)
	private java.util.Date fecUltCertIncap;
	@Column(name = "MATRICULA", nullable = false)
	private String matricula;
	@Column(name = "PROGRAMA", nullable = false)
	private Long programa;
	@Column(name = "SERIE", nullable = false)
	private String serie;
	@Column(name = "TRIMESTRE", nullable = false)
	private Long trimestre;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_ESTATUS",referencedColumnName="CVE_ESTATUS", insertable=false, updatable=false)
	@JsonIgnore
	private FepirCatEstatusFolio fepirCatEstatusFolio;

	public FepirFolioHistorico() {
		super();
	}

	

	public FepirFolioHistorico(Long cveDelegacion, String cvePresupuestal,
			Date fechaEntrega, Date fecUltCertIncap, String matricula, Long programa, String serie, Long trimestre,
			FepirCatEstatusFolio fepirCatEstatusFolio) {
		super();
		
		this.cveDelegacion = cveDelegacion;
		this.cvePresupuestal = cvePresupuestal;
		this.fechaEntrega = fechaEntrega;
		this.fecUltCertIncap = fecUltCertIncap;
		this.matricula = matricula;
		this.programa = programa;
		this.serie = serie;
		this.trimestre = trimestre;
		this.fepirCatEstatusFolio = fepirCatEstatusFolio;
	}

	

	public FepirFolioHistorico(Long cveEstatus, Date fecCambioStatus, String numFolio, Long cveDelegacion,
			String cvePresupuestal, Date fechaEntrega, Date fecUltCertIncap, String matricula, Long programa,
			String serie, Long trimestre, FepirCatEstatusFolio fepirCatEstatusFolio) {
		super();
		this.cveEstatus = cveEstatus;
		this.fecCambioStatus = fecCambioStatus;
		this.numFolio = numFolio;
		this.cveDelegacion = cveDelegacion;
		this.cvePresupuestal = cvePresupuestal;
		this.fechaEntrega = fechaEntrega;
		this.fecUltCertIncap = fecUltCertIncap;
		this.matricula = matricula;
		this.programa = programa;
		this.serie = serie;
		this.trimestre = trimestre;
		this.fepirCatEstatusFolio = fepirCatEstatusFolio;
	}



	public Long getCveEstatus() {
		return cveEstatus;
	}



	public void setCveEstatus(Long cveEstatus) {
		this.cveEstatus = cveEstatus;
	}



	public java.util.Date getFecCambioStatus() {
		return fecCambioStatus;
	}



	public void setFecCambioStatus(java.util.Date fecCambioStatus) {
		this.fecCambioStatus = fecCambioStatus;
	}



	public String getNumFolio() {
		return numFolio;
	}



	public void setNumFolio(String numFolio) {
		this.numFolio = numFolio;
	}



	public Long getCveDelegacion() {
		return cveDelegacion;
	}



	public void setCveDelegacion(Long cveDelegacion) {
		this.cveDelegacion = cveDelegacion;
	}



	public String getCvePresupuestal() {
		return cvePresupuestal;
	}



	public void setCvePresupuestal(String cvePresupuestal) {
		this.cvePresupuestal = cvePresupuestal;
	}



	public java.util.Date getFechaEntrega() {
		return fechaEntrega;
	}



	public void setFechaEntrega(java.util.Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}



	public java.util.Date getFecUltCertIncap() {
		return fecUltCertIncap;
	}



	public void setFecUltCertIncap(java.util.Date fecUltCertIncap) {
		this.fecUltCertIncap = fecUltCertIncap;
	}



	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public Long getPrograma() {
		return programa;
	}



	public void setPrograma(Long programa) {
		this.programa = programa;
	}



	public String getSerie() {
		return serie;
	}



	public void setSerie(String serie) {
		this.serie = serie;
	}



	public Long getTrimestre() {
		return trimestre;
	}



	public void setTrimestre(Long trimestre) {
		this.trimestre = trimestre;
	}



	public FepirCatEstatusFolio getFepirCatEstatusFolio() {
		return fepirCatEstatusFolio;
	}



	public void setFepirCatEstatusFolio(FepirCatEstatusFolio fepirCatEstatusFolio) {
		this.fepirCatEstatusFolio = fepirCatEstatusFolio;
	}



	@Override
	public String toString() {
		return "FepirFolioHistorico [cveEstatus=" + cveEstatus + ", fecCambioStatus=" + fecCambioStatus + ", numFolio="
				+ numFolio + ", cveDelegacion=" + cveDelegacion + ", cvePresupuestal=" + cvePresupuestal
				+ ", fechaEntrega=" + fechaEntrega + ", fecUltCertIncap=" + fecUltCertIncap + ", matricula=" + matricula
				+ ", programa=" + programa + ", serie=" + serie + ", trimestre=" + trimestre + ", fepirCatEstatusFolio="
				+ fepirCatEstatusFolio + "]";
	}



	

}
