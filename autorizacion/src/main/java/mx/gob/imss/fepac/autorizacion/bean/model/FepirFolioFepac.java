package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@DynamicUpdate
@Table(name="FEPIR_FOLIO_FEPAC")
public class FepirFolioFepac implements Serializable {

	@Id
	@Column(name = "NUM_FOLIO")
	private String numFolio;
	@Column(name = "CVE_ESTATUS")
	private Long cvEstatus;
	@Column(name = "CVE_TIPO_MOTIVO_CANCEL")
	private Long cveTipoMotivoCancel;
	@Column(name = "DIG_VERIFICADOR")
	private Long digVerificador;
	@Column(name = "FEC_CAMBIO_ESTATUS")
	private java.util.Date fecCambioEstatus;
	@Column(name = "FEC_REQ_EXT_ORD")
	private java.util.Date fecReqExtOrd;
	@Column(name = "NSS")
	private String nss;
	@Column(name = "NUM_REQ_EXT_ORD")
	private String numReqExtOrd;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_ESTATUS",referencedColumnName="CVE_ESTATUS", insertable=false, updatable=false)
	@JsonIgnore
	private FepirCatEstatusFolio fepirCatEstatusFolio;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_FOLIO_SISTEMA")
	@JsonIgnore
	private FepirCatFolioSistema fepirCatFolioSistema;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_TIPO_FOLIO")
	@JsonIgnore
	private FepirCatTipoFolio fepirCatTipoFolio;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_TIPO_MOTIVO")
	@JsonIgnore
	private FepirCatTipoMotivo fepirCatTipoMotivo;

	 public FepirFolioFepac() {
	    }

		

		public String getNumFolio() {
		return numFolio;
	}



	public void setNumFolio(String numFolio) {
		this.numFolio = numFolio;
	}



	public Long getCvEstatus() {
		return cvEstatus;
	}



	public void setCvEstatus(Long cvEstatus) {
		this.cvEstatus = cvEstatus;
	}



	public Long getCveTipoMotivoCancel() {
		return cveTipoMotivoCancel;
	}



	public void setCveTipoMotivoCancel(Long cveTipoMotivoCancel) {
		this.cveTipoMotivoCancel = cveTipoMotivoCancel;
	}



	public Long getDigVerificador() {
		return digVerificador;
	}



	public void setDigVerificador(Long digVerificador) {
		this.digVerificador = digVerificador;
	}



	public java.util.Date getFecCambioEstatus() {
		return fecCambioEstatus;
	}



	public void setFecCambioEstatus(java.util.Date fecCambioEstatus) {
		this.fecCambioEstatus = fecCambioEstatus;
	}



	public java.util.Date getFecReqExtOrd() {
		return fecReqExtOrd;
	}



	public void setFecReqExtOrd(java.util.Date fecReqExtOrd) {
		this.fecReqExtOrd = fecReqExtOrd;
	}



	public String getNss() {
		return nss;
	}



	public void setNss(String nss) {
		this.nss = nss;
	}



	public String getNumReqExtOrd() {
		return numReqExtOrd;
	}



	public void setNumReqExtOrd(String numReqExtOrd) {
		this.numReqExtOrd = numReqExtOrd;
	}



	public FepirCatEstatusFolio getFepirCatEstatusFolio() {
		return fepirCatEstatusFolio;
	}



	public void setFepirCatEstatusFolio(FepirCatEstatusFolio fepirCatEstatusFolio) {
		this.fepirCatEstatusFolio = fepirCatEstatusFolio;
	}



	public FepirCatFolioSistema getFepirCatFolioSistema() {
		return fepirCatFolioSistema;
	}



	public void setFepirCatFolioSistema(FepirCatFolioSistema fepirCatFolioSistema) {
		this.fepirCatFolioSistema = fepirCatFolioSistema;
	}



	public FepirCatTipoFolio getFepirCatTipoFolio() {
		return fepirCatTipoFolio;
	}



	public void setFepirCatTipoFolio(FepirCatTipoFolio fepirCatTipoFolio) {
		this.fepirCatTipoFolio = fepirCatTipoFolio;
	}



	public FepirCatTipoMotivo getFepirCatTipoMotivo() {
		return fepirCatTipoMotivo;
	}



	public void setFepirCatTipoMotivo(FepirCatTipoMotivo fepirCatTipoMotivo) {
		this.fepirCatTipoMotivo = fepirCatTipoMotivo;
	}



		public boolean equals(Object other) {
			if (this == other) {
				return true;
			}
			if (!(other instanceof FepirFolioFepac)) {
				return false;
			}
			FepirFolioFepac castOther = (FepirFolioFepac)other;
			return new EqualsBuilder()
				.append(this.getNumFolio(), castOther.getNumFolio())
				.isEquals();
	    }
	    
		public int hashCode() {
			return new HashCodeBuilder()
				.append(getNumFolio())
				.toHashCode();
	    }   

		public String toString() {
			return new ToStringBuilder(this)
				.append("numFolio", getNumFolio())
				.toString();
		}
	

	

	

}
