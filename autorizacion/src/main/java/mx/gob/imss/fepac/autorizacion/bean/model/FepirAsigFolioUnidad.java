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
@Table(name="FEPIR_ASIG_FOLIO_UNIDAD")
@IdClass(value = FepirAsigFolioUnidadPK.class)
public class FepirAsigFolioUnidad  implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CVE_BLOCK_FOLIO", nullable = false)
	private String cveBlockFolio;
	@Id
	@Column(name = "CVE_DELEGACION", nullable = false)
	private Long cveDelegacion;
	@Id
	@Column(name = "CVE_PRESUPUESTAL", nullable = false)
	private String cvePresupuestal;
	@Id
	@Column(name = "NUM_FOLIO", nullable = false)
	private String numFolio;
	@Id
	@Column(name = "PROGRAMA", nullable = false)
	private Long programa;
	@Id
	@Column(name = "TRIM_PROGRAMA", nullable = false)
	private Long trimPrograma;

	@Column(name = "CVE_ESTATUS", nullable = false)
	private long cveEstatus;
	@Column(name = "FEC_ASIGNACION", nullable = false)
	private java.sql.Date fecAsignacion;
	@Column(name = "FEC_CAMBIO_ESTATUS", nullable = false)
	private java.sql.Date fecCambioEstatus;
	@Column(name = "FEC_REASIGNACION", nullable = false)
	private java.sql.Date fecReasignacion;
	@Column(name = "FEC_REPORTE", nullable = false)
	private java.sql.Date fecReporte;
	@Column(name = "FEC_SOLICITUD", nullable = false)
	private java.sql.Date fecSolicitud;
	@Column(name = "FEC_USR_UPD_REG", nullable = false)
	private java.sql.Date fecUsrUpdReg;
	@Column(name = "USR_UPD_REG", nullable = false)
	private String usrUpdReg;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_ESTATUS", referencedColumnName="CVE_ESTATUS",insertable=false, updatable=false)
	@JsonIgnore
	private FepirCatEstatusFolio fepirCatEstatusFolio;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumns({
	@JoinColumn(name="CVE_DELEGACION", referencedColumnName="CVE_DELEGACION",insertable=false, updatable=false),
    @JoinColumn(name="CVE_PRESUPUESTAL", referencedColumnName="CVE_PRESUPUESTAL",insertable=false, updatable=false)
	})
	@JsonIgnore
	private FepirUnidadMedica fepirUnidadMedica;

	public FepirAsigFolioUnidad() {
		super();
	}

	public FepirAsigFolioUnidad( long cveEstatus,
			Date fecAsignacion, Date fecCambioEstatus, Date fecReasignacion, Date fecReporte, Date fecSolicitud,
			Date fecUsrUpdReg, String usrUpdReg, FepirCatEstatusFolio fepirCatEstatusFolio,
			FepirUnidadMedica fepirUnidadMedica) {
		super();
	
		this.cveEstatus = cveEstatus;
		this.fecAsignacion = fecAsignacion;
		this.fecCambioEstatus = fecCambioEstatus;
		this.fecReasignacion = fecReasignacion;
		this.fecReporte = fecReporte;
		this.fecSolicitud = fecSolicitud;
		this.fecUsrUpdReg = fecUsrUpdReg;
		this.usrUpdReg = usrUpdReg;
		this.fepirCatEstatusFolio = fepirCatEstatusFolio;
		this.fepirUnidadMedica = fepirUnidadMedica;
	}

	

	

	public long getCveEstatus() {
		return cveEstatus;
	}

	public void setCveEstatus(long cveEstatus) {
		this.cveEstatus = cveEstatus;
	}

	public java.sql.Date getFecAsignacion() {
		return fecAsignacion;
	}

	public void setFecAsignacion(java.sql.Date fecAsignacion) {
		this.fecAsignacion = fecAsignacion;
	}

	public java.sql.Date getFecCambioEstatus() {
		return fecCambioEstatus;
	}

	public void setFecCambioEstatus(java.sql.Date fecCambioEstatus) {
		this.fecCambioEstatus = fecCambioEstatus;
	}

	public java.sql.Date getFecReasignacion() {
		return fecReasignacion;
	}

	public void setFecReasignacion(java.sql.Date fecReasignacion) {
		this.fecReasignacion = fecReasignacion;
	}

	public java.sql.Date getFecReporte() {
		return fecReporte;
	}

	public void setFecReporte(java.sql.Date fecReporte) {
		this.fecReporte = fecReporte;
	}

	public java.sql.Date getFecSolicitud() {
		return fecSolicitud;
	}

	public void setFecSolicitud(java.sql.Date fecSolicitud) {
		this.fecSolicitud = fecSolicitud;
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

	public FepirCatEstatusFolio getFepirCatEstatusFolio() {
		return fepirCatEstatusFolio;
	}

	public void setFepirCatEstatusFolio(FepirCatEstatusFolio fepirCatEstatusFolio) {
		this.fepirCatEstatusFolio = fepirCatEstatusFolio;
	}

	public FepirUnidadMedica getFepirUnidadMedica() {
		return fepirUnidadMedica;
	}

	public void setFepirUnidadMedica(FepirUnidadMedica fepirUnidadMedica) {
		this.fepirUnidadMedica = fepirUnidadMedica;
	}


	

}
