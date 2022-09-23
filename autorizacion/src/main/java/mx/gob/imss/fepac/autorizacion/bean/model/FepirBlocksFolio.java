package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="FEPIR_BLOCKS_FOLIOS")
@IdClass(value = FepirBlocksFolioPK.class)
public class FepirBlocksFolio  implements Serializable {
	@Id
	@Column(name = "CVE_BLOCK_FOLIO", nullable = false)
	private String cveBlockFolio;
	@Id
	@Column(name = "CVE_DELEGACION", nullable = false)
	private Long cveDelegacion;
	@Id
	@Column(name = "NUM_FOLIO", nullable = false)
	private String numFolio;
	@Id
	@Column(name = "PROGRAMA", nullable = false)
	private Long programa;
	@Id
	@Column(name = "TRIM_PROGRAMA", nullable = false)
	private Long trimPrograma;
	@Column(name = "CVE_AREA", nullable = false)
	private Long cveArea;
	@Column(name = "CVE_ESTATUS", nullable = false)
	private long cveEstatus;
	@Column(name = "CVE_PRESUP_ALMACEN", nullable = false)
	private String cvePresupAlmacen;
	@Column(name = "FEC_ASIGNACION", nullable = false)
	private java.sql.Date fecAsignacion;
	@Column(name = "FEC_BAJA", nullable = false)
	private java.sql.Date fecBaja;
	@Column(name = "FEC_CAMBIO_ESTATUS", nullable = false)
	private java.sql.Date fecCambioEstatus;
	@Column(name = "FEC_RECEPCION_SEDECOR", nullable = false)
	private java.sql.Date fecRecepcionSedecor;
	@Column(name = "FEC_REPORTE", nullable = false)
	private java.sql.Date fecReporte;
	@Column(name = "FEC_USR_UPD_REG", nullable = false)
	private java.sql.Date fecUsrUpdReg;
	@Column(name = "FOLIO_AUTORIZACION", nullable = false)
	private String folioAutorizacion;
	@Column(name = "OBSERVACIONES", nullable = false)
	private String observaciones;
	@Column(name = "USR_UPD_REG", nullable = false)
	private String usrUpdReg;

	public FepirBlocksFolio() {
		super();
	}

	public FepirBlocksFolio(String cveBlockFolio, Long cveDelegacion, String numFolio, Long programa, Long trimPrograma,
			Long cveArea, long cveEstatus, String cvePresupAlmacen, Date fecAsignacion, Date fecBaja,
			Date fecCambioEstatus, Date fecRecepcionSedecor, Date fecReporte, Date fecUsrUpdReg,
			String folioAutorizacion, String observaciones, String usrUpdReg) {
		super();
		this.cveBlockFolio = cveBlockFolio;
		this.cveDelegacion = cveDelegacion;
		this.numFolio = numFolio;
		this.programa = programa;
		this.trimPrograma = trimPrograma;
		this.cveArea = cveArea;
		this.cveEstatus = cveEstatus;
		this.cvePresupAlmacen = cvePresupAlmacen;
		this.fecAsignacion = fecAsignacion;
		this.fecBaja = fecBaja;
		this.fecCambioEstatus = fecCambioEstatus;
		this.fecRecepcionSedecor = fecRecepcionSedecor;
		this.fecReporte = fecReporte;
		this.fecUsrUpdReg = fecUsrUpdReg;
		this.folioAutorizacion = folioAutorizacion;
		this.observaciones = observaciones;
		this.usrUpdReg = usrUpdReg;
	}
	
	public FepirBlocksFolio(
			Long cveArea, long cveEstatus, String cvePresupAlmacen, Date fecAsignacion, Date fecBaja,
			Date fecCambioEstatus, Date fecRecepcionSedecor, Date fecReporte, Date fecUsrUpdReg,
			String folioAutorizacion, String observaciones, String usrUpdReg) {
		super();
		this.cveArea = cveArea;
		this.cveEstatus = cveEstatus;
		this.cvePresupAlmacen = cvePresupAlmacen;
		this.fecAsignacion = fecAsignacion;
		this.fecBaja = fecBaja;
		this.fecCambioEstatus = fecCambioEstatus;
		this.fecRecepcionSedecor = fecRecepcionSedecor;
		this.fecReporte = fecReporte;
		this.fecUsrUpdReg = fecUsrUpdReg;
		this.folioAutorizacion = folioAutorizacion;
		this.observaciones = observaciones;
		this.usrUpdReg = usrUpdReg;
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

	public Long getCveArea() {
		return cveArea;
	}

	public void setCveArea(Long cveArea) {
		this.cveArea = cveArea;
	}

	public long getCveEstatus() {
		return cveEstatus;
	}

	public void setCveEstatus(long cveEstatus) {
		this.cveEstatus = cveEstatus;
	}

	public String getCvePresupAlmacen() {
		return cvePresupAlmacen;
	}

	public void setCvePresupAlmacen(String cvePresupAlmacen) {
		this.cvePresupAlmacen = cvePresupAlmacen;
	}

	public java.sql.Date getFecAsignacion() {
		return fecAsignacion;
	}

	public void setFecAsignacion(java.sql.Date fecAsignacion) {
		this.fecAsignacion = fecAsignacion;
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

	public java.sql.Date getFecRecepcionSedecor() {
		return fecRecepcionSedecor;
	}

	public void setFecRecepcionSedecor(java.sql.Date fecRecepcionSedecor) {
		this.fecRecepcionSedecor = fecRecepcionSedecor;
	}

	public java.sql.Date getFecReporte() {
		return fecReporte;
	}

	public void setFecReporte(java.sql.Date fecReporte) {
		this.fecReporte = fecReporte;
	}

	public java.sql.Date getFecUsrUpdReg() {
		return fecUsrUpdReg;
	}

	public void setFecUsrUpdReg(java.sql.Date fecUsrUpdReg) {
		this.fecUsrUpdReg = fecUsrUpdReg;
	}

	public String getFolioAutorizacion() {
		return folioAutorizacion;
	}

	public void setFolioAutorizacion(String folioAutorizacion) {
		this.folioAutorizacion = folioAutorizacion;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getUsrUpdReg() {
		return usrUpdReg;
	}

	public void setUsrUpdReg(String usrUpdReg) {
		this.usrUpdReg = usrUpdReg;
	}

	@Override
	public String toString() {
		return "FepirBlocksFolio [cveBlockFolio=" + cveBlockFolio + ", cveDelegacion=" + cveDelegacion + ", numFolio="
				+ numFolio + ", programa=" + programa + ", trimPrograma=" + trimPrograma + ", cveArea=" + cveArea
				+ ", cveEstatus=" + cveEstatus + ", cvePresupAlmacen=" + cvePresupAlmacen + ", fecAsignacion="
				+ fecAsignacion + ", fecBaja=" + fecBaja + ", fecCambioEstatus=" + fecCambioEstatus
				+ ", fecRecepcionSedecor=" + fecRecepcionSedecor + ", fecReporte=" + fecReporte + ", fecUsrUpdReg="
				+ fecUsrUpdReg + ", folioAutorizacion=" + folioAutorizacion + ", observaciones=" + observaciones
				+ ", usrUpdReg=" + usrUpdReg + "]";
	}



	

	

}
