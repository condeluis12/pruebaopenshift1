package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FEPIR_BLOCK")
public class FepirBlock implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_BLOCK_FOLIO", nullable = false)
	private String cveBlockFolio;
	@Column(name = "CVE_ESTATUS", nullable = false)
	private long cveEstatus;
	@Column(name = "FEC_ASIGNACION", nullable = false)
	private java.sql.Date fecAsignacion;
	@Column(name = "FEC_BAJA", nullable = false)
	private java.sql.Date fecBaja;
	@Column(name = "FEC_CAMBIO_ESTATUS", nullable = false)
	private java.sql.Date fecCambioEstatus;
	@Column(name = "FEC_RECEP_ALMACEN", nullable = false)
	private java.sql.Date fecRecepAlmacen;
	@Column(name = "FEC_USR_UPD_REG", nullable = false)
	private java.sql.Date fecUsrUpdReg;
	@Column(name = "FOLIO_FINAL", nullable = false)
	private String folioFinal;
	@Column(name = "FOLIO_INICIAL", nullable = false)
	private String folioInicial;
	@Column(name = "USR_UPD_REG", nullable = false)
	private String usrUpdReg;

	public FepirBlock() {
		super();
	}

	

	public FepirBlock(String cveBlockFolio, long cveEstatus, Date fecAsignacion, Date fecBaja,
			Date fecCambioEstatus, Date fecRecepAlmacen, Date fecUsrUpdReg, String folioFinal, String folioInicial,
			String usrUpdReg) {
		super();
		this.cveBlockFolio = cveBlockFolio;
		this.cveEstatus = cveEstatus;
		this.fecAsignacion = fecAsignacion;
		this.fecBaja = fecBaja;
		this.fecCambioEstatus = fecCambioEstatus;
		this.fecRecepAlmacen = fecRecepAlmacen;
		this.fecUsrUpdReg = fecUsrUpdReg;
		this.folioFinal = folioFinal;
		this.folioInicial = folioInicial;
		this.usrUpdReg = usrUpdReg;
	}

	

	public String getCveBlockFolio() {
		return cveBlockFolio;
	}

	public void setCveBlockFolio(String cveBlockFolio) {
		this.cveBlockFolio = cveBlockFolio;
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

	public java.sql.Date getFecRecepAlmacen() {
		return fecRecepAlmacen;
	}

	public void setFecRecepAlmacen(java.sql.Date fecRecepAlmacen) {
		this.fecRecepAlmacen = fecRecepAlmacen;
	}

	public java.sql.Date getFecUsrUpdReg() {
		return fecUsrUpdReg;
	}

	public void setFecUsrUpdReg(java.sql.Date fecUsrUpdReg) {
		this.fecUsrUpdReg = fecUsrUpdReg;
	}

	public String getFolioFinal() {
		return folioFinal;
	}

	public void setFolioFinal(String folioFinal) {
		this.folioFinal = folioFinal;
	}

	public String getFolioInicial() {
		return folioInicial;
	}

	public void setFolioInicial(String folioInicial) {
		this.folioInicial = folioInicial;
	}

	public String getUsrUpdReg() {
		return usrUpdReg;
	}

	public void setUsrUpdReg(String usrUpdReg) {
		this.usrUpdReg = usrUpdReg;
	}



	@Override
	public String toString() {
		return "FepirBlock [cveBlockFolio=" + cveBlockFolio + ", cveEstatus=" + cveEstatus + ", fecAsignacion="
				+ fecAsignacion + ", fecBaja=" + fecBaja + ", fecCambioEstatus=" + fecCambioEstatus
				+ ", fecRecepAlmacen=" + fecRecepAlmacen + ", fecUsrUpdReg=" + fecUsrUpdReg + ", folioFinal="
				+ folioFinal + ", folioInicial=" + folioInicial + ", usrUpdReg=" + usrUpdReg + "]";
	}

	
}
