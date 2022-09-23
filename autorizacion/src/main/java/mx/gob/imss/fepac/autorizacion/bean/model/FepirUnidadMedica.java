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
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@DynamicUpdate
@Table(name="FEPIR_UNIDAD_MEDICA")
@IdClass(value = FepirUnidadMedicaPK.class)
public class FepirUnidadMedica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CVE_DELEGACION")
	private Long cveDelegacion;
	@Id
	@Column(name = "CVE_PRESUPUESTAL")
	private String cvePresupuestal;
	
	@Column(name = "FECHA_ALTA")
	private Date fechaAlta;
	@Column(name = "FECHA_BAJA")
	private Date fechaBaja;
	@Column(name = "CVE_PREI")
	private Long cvePrei;
	@Column(name = "FEC_USR_UPD_REG")
	private Date fecUsrUpdReg;
	@Column(name = "NOM_UNIDAD_MEDICA")
	private String nomUnidadMedica;
	@Column(name = "NUM_ECON_MEDICA")
	private Long numEconMedica;
	@Column(name = "USR_UPD_REG")
	private String usrUpdReg;
	@Column(name = "CVE_NIVEL_SERVICIO")
	private Long cveNivelServicio;
	@OneToMany( mappedBy = "fepirUnidadMedica", cascade = CascadeType.ALL)
	private java.util.Set<FepirAsigFolioUnidad> fepirAsigFolioUnidads;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_DELEGACION",referencedColumnName="CVE_DELEGACION", insertable=false, updatable=false)
	@JsonIgnore
	private FepirCatDelegacion fepirCatDelegacion;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_NIVEL_SERVICIO",referencedColumnName="CVE_NIVEL_SERVICIO", insertable=false, updatable=false)
	@JsonIgnore
	private FepirCatNivelServicio fepirCatNivelServicio;
	@OneToMany( mappedBy="fepirUnidadMedica", cascade = CascadeType.ALL)
	private java.util.Set<FolioDictamenPrograma> folioDictamenProgramas;
	@OneToMany( mappedBy = "fepirUnidadMedica", cascade = CascadeType.ALL)
	private java.util.Set<FepirUsuarioAcceso> fepirUsuarioAcceso;
	public FepirUnidadMedica(Long cveDelegacion, String cvePresupuestal, Date fechaAlta, Date fechaBaja, Long cvePrei,
			Date fecUsrUpdReg, String nomUnidadMedica, Long numEconMedica, String usrUpdReg, Long cveNivelServicio,
			Set<FepirAsigFolioUnidad> fepirAsigFolioUnidads, FepirCatDelegacion fepirCatDelegacion,
			FepirCatNivelServicio fepirCatNivelServicio, Set<FolioDictamenPrograma> folioDictamenProgramas,
			Set<FepirUsuarioAcceso> fepirUsuarioAcceso) {
		super();
		this.cveDelegacion = cveDelegacion;
		this.cvePresupuestal = cvePresupuestal;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.cvePrei = cvePrei;
		this.fecUsrUpdReg = fecUsrUpdReg;
		this.nomUnidadMedica = nomUnidadMedica;
		this.numEconMedica = numEconMedica;
		this.usrUpdReg = usrUpdReg;
		this.cveNivelServicio = cveNivelServicio;
		this.fepirAsigFolioUnidads = fepirAsigFolioUnidads;
		this.fepirCatDelegacion = fepirCatDelegacion;
		this.fepirCatNivelServicio = fepirCatNivelServicio;
		this.folioDictamenProgramas = folioDictamenProgramas;
		this.fepirUsuarioAcceso = fepirUsuarioAcceso;
	}
	
	

	public FepirUnidadMedica(Long cveDelegacion, String cvePresupuestal, String nomUnidadMedica) {
		super();
		this.cveDelegacion = cveDelegacion;
		this.cvePresupuestal = cvePresupuestal;
		this.nomUnidadMedica = nomUnidadMedica;
	}
	
	
	



	public FepirUnidadMedica(String nomUnidadMedica) {
		super();
		this.nomUnidadMedica = nomUnidadMedica;
	}



	public FepirUnidadMedica(Long cveDelegacion, String cvePresupuestal, Date fechaAlta, Date fechaBaja, Long cvePrei,
			Date fecUsrUpdReg, String nomUnidadMedica, Long numEconMedica, String usrUpdReg, Long cveNivelServicio) {
		super();
		this.cveDelegacion = cveDelegacion;
		this.cvePresupuestal = cvePresupuestal;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.cvePrei = cvePrei;
		this.fecUsrUpdReg = fecUsrUpdReg;
		this.nomUnidadMedica = nomUnidadMedica;
		this.numEconMedica = numEconMedica;
		this.usrUpdReg = usrUpdReg;
		this.cveNivelServicio = cveNivelServicio;
	}



	public FepirUnidadMedica() {
		super();
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
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Date getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	public Long getCvePrei() {
		return cvePrei;
	}
	public void setCvePrei(Long cvePrei) {
		this.cvePrei = cvePrei;
	}
	public Date getFecUsrUpdReg() {
		return fecUsrUpdReg;
	}
	public void setFecUsrUpdReg(Date fecUsrUpdReg) {
		this.fecUsrUpdReg = fecUsrUpdReg;
	}
	public String getNomUnidadMedica() {
		return nomUnidadMedica;
	}
	public void setNomUnidadMedica(String nomUnidadMedica) {
		this.nomUnidadMedica = nomUnidadMedica;
	}
	public Long getNumEconMedica() {
		return numEconMedica;
	}
	public void setNumEconMedica(Long numEconMedica) {
		this.numEconMedica = numEconMedica;
	}
	public String getUsrUpdReg() {
		return usrUpdReg;
	}
	public void setUsrUpdReg(String usrUpdReg) {
		this.usrUpdReg = usrUpdReg;
	}
	public Long getCveNivelServicio() {
		return cveNivelServicio;
	}
	public void setCveNivelServicio(Long cveNivelServicio) {
		this.cveNivelServicio = cveNivelServicio;
	}
	public java.util.Set<FepirAsigFolioUnidad> getFepirAsigFolioUnidads() {
		return fepirAsigFolioUnidads;
	}
	public void setFepirAsigFolioUnidads(java.util.Set<FepirAsigFolioUnidad> fepirAsigFolioUnidads) {
		this.fepirAsigFolioUnidads = fepirAsigFolioUnidads;
	}
	public FepirCatDelegacion getFepirCatDelegacion() {
		return fepirCatDelegacion;
	}
	public void setFepirCatDelegacion(FepirCatDelegacion fepirCatDelegacion) {
		this.fepirCatDelegacion = fepirCatDelegacion;
	}
	public FepirCatNivelServicio getFepirCatNivelServicio() {
		return fepirCatNivelServicio;
	}
	public void setFepirCatNivelServicio(FepirCatNivelServicio fepirCatNivelServicio) {
		this.fepirCatNivelServicio = fepirCatNivelServicio;
	}
	public java.util.Set<FolioDictamenPrograma> getFolioDictamenProgramas() {
		return folioDictamenProgramas;
	}
	public void setFolioDictamenProgramas(java.util.Set<FolioDictamenPrograma> folioDictamenProgramas) {
		this.folioDictamenProgramas = folioDictamenProgramas;
	}
	public java.util.Set<FepirUsuarioAcceso> getFepirUsuarioAcceso() {
		return fepirUsuarioAcceso;
	}
	public void setFepirUsuarioAcceso(java.util.Set<FepirUsuarioAcceso> fepirUsuarioAcceso) {
		this.fepirUsuarioAcceso = fepirUsuarioAcceso;
	}
	@Override
	public String toString() {
		return "FepirUnidadMedica [cveDelegacion=" + cveDelegacion + ", cvePresupuestal=" + cvePresupuestal
				+ ", fechaAlta=" + fechaAlta + ", fechaBaja=" + fechaBaja + ", cvePrei=" + cvePrei + ", fecUsrUpdReg="
				+ fecUsrUpdReg + ", nomUnidadMedica=" + nomUnidadMedica + ", numEconMedica=" + numEconMedica
				+ ", usrUpdReg=" + usrUpdReg + ", cveNivelServicio=" + cveNivelServicio + ", fepirAsigFolioUnidads="
				+ fepirAsigFolioUnidads + ", fepirCatDelegacion=" + fepirCatDelegacion + ", fepirCatNivelServicio="
				+ fepirCatNivelServicio + ", folioDictamenProgramas=" + folioDictamenProgramas + ", fepirUsuarioAcceso="
				+ fepirUsuarioAcceso + "]";
	}


}
