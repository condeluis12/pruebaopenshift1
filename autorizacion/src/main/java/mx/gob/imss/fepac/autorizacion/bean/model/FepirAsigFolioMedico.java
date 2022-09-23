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

import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@DynamicUpdate
@Table(name="FEPIR_ASIG_FOLIO_MEDICO")
@IdClass(value = FepirAsigFolioMedicoPK.class)
public class FepirAsigFolioMedico  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CVE_BLOCK_FOLIO")
	private String cveBlockFolio;
	@Id
	@Column(name = "CVE_DELEGACION")
	private Long cveDelegacion;
	@Id
	@Column(name = "CVE_PRESUPUESTAL")
	private String cvePresupuestal;
	@Id
	@Column(name = "MATRICULA")
	private String matricula;
	@Id
	@Column(name = "NUM_FOLIO")
	private String numFolio;
	@Id
	@Column(name = "PROGRAMA")
	private Long programa;
	@Id
	@Column(name = "TRIM_PROGRAMA")
	private Long trimPrograma;
	@Column(name = "CVE_ESTATUS")
	private long cveEstatus;
	@Column(name = "FECHA_ENTREGA")
	private java.util.Date fechaEntrega;
	@Column(name = "FEC_ASGINACION")
	private java.util.Date fecAsginacion;
	@Column(name = "FEC_CAMBIO_ESTATUS")
	private java.util.Date fecCambioEstatus;
	@Column(name = "FEC_REASIGNACION")
	private java.util.Date fecReasignacion;
	@Column(name = "FEC_REPORTE")
	private java.util.Date fecReporte;
	@Column(name = "FEC_ULT_CERT_INCAP")
	private java.util.Date fecUltCertIncap;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="MATRICULA",referencedColumnName="MATRICULA",insertable=false, updatable=false)
	@JsonIgnore
	private FepirMedico fepirMedico;

	public FepirAsigFolioMedico() {
		super();
	}
	
	

	public FepirAsigFolioMedico(String cveBlockFolio, Long cveDelegacion) {
		super();
		this.cveBlockFolio = cveBlockFolio;
		this.cveDelegacion = cveDelegacion;
	}



	public FepirAsigFolioMedico(String cveBlockFolio, Long cveDelegacion, String cvePresupuestal, String matricula,
			String numFolio, Long programa, Long trimPrograma, long cveEstatus, Date fechaEntrega, Date fecAsginacion,
			Date fecCambioEstatus, Date fecReasignacion, Date fecReporte, Date fecUltCertIncap,
			FepirMedico fepirMedico) {
		super();
		this.cveBlockFolio = cveBlockFolio;
		this.cveDelegacion = cveDelegacion;
		this.cvePresupuestal = cvePresupuestal;
		this.matricula = matricula;
		this.numFolio = numFolio;
		this.programa = programa;
		this.trimPrograma = trimPrograma;
		this.cveEstatus = cveEstatus;
		this.fechaEntrega = fechaEntrega;
		this.fecAsginacion = fecAsginacion;
		this.fecCambioEstatus = fecCambioEstatus;
		this.fecReasignacion = fecReasignacion;
		this.fecReporte = fecReporte;
		this.fecUltCertIncap = fecUltCertIncap;
		this.fepirMedico = fepirMedico;
	}



	public String getCveBlockFolio() {
		return cveBlockFolio;
	}



	public void setCveBlockFolio(String cveBlockFolio) {
		this.cveBlockFolio = cveBlockFolio;
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



	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public String getNumFolio() {
		return numFolio;
	}



	public void setNumFolio(String numFolio) {
		this.numFolio = numFolio;
	}



	public Long getPrograma() {
		return programa;
	}



	public void setPrograma(Long programa) {
		this.programa = programa;
	}



	public Long getTrimPrograma() {
		return trimPrograma;
	}



	public void setTrimPrograma(Long trimPrograma) {
		this.trimPrograma = trimPrograma;
	}



	public long getCveEstatus() {
		return cveEstatus;
	}



	public void setCveEstatus(long cveEstatus) {
		this.cveEstatus = cveEstatus;
	}



	public java.util.Date getFechaEntrega() {
		return fechaEntrega;
	}



	public void setFechaEntrega(java.util.Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}



	public java.util.Date getFecAsginacion() {
		return fecAsginacion;
	}



	public void setFecAsginacion(java.util.Date fecAsginacion) {
		this.fecAsginacion = fecAsginacion;
	}



	public java.util.Date getFecCambioEstatus() {
		return fecCambioEstatus;
	}



	public void setFecCambioEstatus(java.util.Date fecCambioEstatus) {
		this.fecCambioEstatus = fecCambioEstatus;
	}



	public java.util.Date getFecReasignacion() {
		return fecReasignacion;
	}



	public void setFecReasignacion(java.util.Date fecReasignacion) {
		this.fecReasignacion = fecReasignacion;
	}



	public java.util.Date getFecReporte() {
		return fecReporte;
	}



	public void setFecReporte(java.util.Date fecReporte) {
		this.fecReporte = fecReporte;
	}



	public java.util.Date getFecUltCertIncap() {
		return fecUltCertIncap;
	}



	public void setFecUltCertIncap(java.util.Date fecUltCertIncap) {
		this.fecUltCertIncap = fecUltCertIncap;
	}



	public FepirMedico getFepirMedico() {
		return fepirMedico;
	}



	public void setFepirMedico(FepirMedico fepirMedico) {
		this.fepirMedico = fepirMedico;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	

	
}
