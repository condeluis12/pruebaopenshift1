package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.sql.Date;

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
@Table(name="FEPIR_BLOCKS_CAJAS")
@IdClass(value = FepirBlocksCajaPK.class)
public class FepirBlocksCaja implements Serializable  {

	@Id
	@Column(name = "CVE_BLOCK_FOLIO", nullable = false)
	private String cveBlockFolio;
	@Id
	@Column(name = "CVE_CAJA_BLOCK", nullable = false)
	private String cveCajaBlock;
	@Column(name = "CVE_ESTATUS", nullable = false)
	private long cveEstatus;
	@Column(name = "FEC_ASGINACION", nullable = false)
	private java.sql.Date fecAsginacion;
	@Column(name = "FEC_CAMBIO_ESTATUS", nullable = false)
	private java.sql.Date fecCambioEstatus;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_CAJA_BLOCK",referencedColumnName="CVE_CAJA_BLOCK", insertable=false, updatable=false)
	@JsonIgnore
	private FepirCaja fepirCaja;

	public FepirBlocksCaja() {
		super();
	}



	public FepirBlocksCaja(long cveEstatus, Date fecAsginacion, Date fecCambioEstatus,
			FepirCaja fepirCaja) {
		super();
	
		this.cveEstatus = cveEstatus;
		this.fecAsginacion = fecAsginacion;
		this.fecCambioEstatus = fecCambioEstatus;
		this.fepirCaja = fepirCaja;
	}

	

	public long getCveEstatus() {
		return cveEstatus;
	}

	public void setCveEstatus(long cveEstatus) {
		this.cveEstatus = cveEstatus;
	}

	public java.sql.Date getFecAsginacion() {
		return fecAsginacion;
	}

	public void setFecAsginacion(java.sql.Date fecAsginacion) {
		this.fecAsginacion = fecAsginacion;
	}

	public java.sql.Date getFecCambioEstatus() {
		return fecCambioEstatus;
	}

	public void setFecCambioEstatus(java.sql.Date fecCambioEstatus) {
		this.fecCambioEstatus = fecCambioEstatus;
	}

	public FepirCaja getFepirCaja() {
		return fepirCaja;
	}

	public void setFepirCaja(FepirCaja fepirCaja) {
		this.fepirCaja = fepirCaja;
	}



	@Override
	public String toString() {
		return "FepirBlocksCaja [cveBlockFolio=" + cveBlockFolio + ", cveCajaBlock=" + cveCajaBlock + ", cveEstatus="
				+ cveEstatus + ", fecAsginacion=" + fecAsginacion + ", fecCambioEstatus=" + fecCambioEstatus
				+ ", fepirCaja=" + fepirCaja + "]";
	}

	
}
