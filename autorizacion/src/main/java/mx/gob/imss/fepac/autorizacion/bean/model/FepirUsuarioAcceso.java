package mx.gob.imss.fepac.autorizacion.bean.model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@DynamicUpdate
@Table(name="FEPIR_USUARIO_ACCESO")
@IdClass(value = FepirUsuarioAccesoPK.class)
public class FepirUsuarioAcceso implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CVE_DELEGACION")
	private Long cveDelegacion;
	@Id
	@Column(name = "CVE_USUARIO")
	private String cveUsuario;
	@Column(name = "AP_MATERNO")
	private String apMaterno;
	@Column(name = "AP_PATERNO")
	private String apPaterno;
	@Column(name = "CIP")
	private String cip;
	@Column(name = "FEC_ALTA")
	private java.util.Date fecAlta;
	@Column(name = "FEC_BAJA")
	private java.util.Date fecBaja;
	@Column(name = "FEC_USR_UPD_REG")
	private java.util.Date fecUsrUpdReg;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "USR_UPD_REG")
	private String usrUpdReg;
	@Column(name = "CVE_PRESUPUESTAL")
	private String cvePresupuestal;
	@Column(name = "CL_PRUEBA")
	private String  password;
	@Column(name = "CVE_PERFIL")
	private Long cvePerfil;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_DELEGACION",referencedColumnName="CVE_DELEGACION",insertable=false, updatable=false)
	@JsonIgnore
	private FepirCatDelegacion fepirCatDelegacion;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_ESTATUS")
	@JsonIgnore
	private FepirCatEstatusFolio fepirCatEstatusFolio;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_PERFIL",referencedColumnName="CVE_PERFIL",insertable=false, updatable=false)
	@JsonIgnore
	private FepirCatPerfil fepirCatPerfil;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumns({
	@JoinColumn(name="CVE_DELEGACION", referencedColumnName="CVE_DELEGACION",insertable=false, updatable=false),
    @JoinColumn(name="CVE_PRESUPUESTAL", referencedColumnName="CVE_PRESUPUESTAL",insertable=false, updatable=false)
	})
	@JsonIgnore
	private FepirUnidadMedica fepirUnidadMedica;
	public FepirUsuarioAcceso(Long cveDelegacion, String cveUsuario, String apMaterno, String apPaterno, String cip,
			Date fecAlta, Date fecBaja, Date fecUsrUpdReg, String nombre, String usrUpdReg, String cvePresupuestal,
			String password, Long cvePerfil, FepirCatDelegacion fepirCatDelegacion,
			FepirCatEstatusFolio fepirCatEstatusFolio, FepirCatPerfil fepirCatPerfil,
			FepirUnidadMedica fepirUnidadMedica) {
		super();
		this.cveDelegacion = cveDelegacion;
		this.cveUsuario = cveUsuario;
		this.apMaterno = apMaterno;
		this.apPaterno = apPaterno;
		this.cip = cip;
		this.fecAlta = fecAlta;
		this.fecBaja = fecBaja;
		this.fecUsrUpdReg = fecUsrUpdReg;
		this.nombre = nombre;
		this.usrUpdReg = usrUpdReg;
		this.cvePresupuestal = cvePresupuestal;
		this.password = password;
		this.cvePerfil = cvePerfil;
		this.fepirCatDelegacion = fepirCatDelegacion;
		this.fepirCatEstatusFolio = fepirCatEstatusFolio;
		this.fepirCatPerfil = fepirCatPerfil;
		this.fepirUnidadMedica = fepirUnidadMedica;
	}
	
	public FepirUsuarioAcceso(Long cveDelegacion, String cvePresupuestal) {
		super();
		this.cveDelegacion = cveDelegacion;
		this.cvePresupuestal = cvePresupuestal;
	}
	

	public FepirUsuarioAcceso(Long cveDelegacion, String cveUsuario, String cvePresupuestal) {
		super();
		this.cveDelegacion = cveDelegacion;
		this.cveUsuario = cveUsuario;
		this.cvePresupuestal = cvePresupuestal;
	}

	public FepirUsuarioAcceso() {
		super();
	}
	public Long getCveDelegacion() {
		return cveDelegacion;
	}
	public void setCveDelegacion(Long cveDelegacion) {
		this.cveDelegacion = cveDelegacion;
	}
	public String getCveUsuario() {
		return cveUsuario;
	}
	public void setCveUsuario(String cveUsuario) {
		this.cveUsuario = cveUsuario;
	}
	public String getApMaterno() {
		return apMaterno;
	}
	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}
	public String getApPaterno() {
		return apPaterno;
	}
	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}
	public String getCip() {
		return cip;
	}
	public void setCip(String cip) {
		this.cip = cip;
	}
	public java.util.Date getFecAlta() {
		return fecAlta;
	}
	public void setFecAlta(java.util.Date fecAlta) {
		this.fecAlta = fecAlta;
	}
	public java.util.Date getFecBaja() {
		return fecBaja;
	}
	public void setFecBaja(java.util.Date fecBaja) {
		this.fecBaja = fecBaja;
	}
	public java.util.Date getFecUsrUpdReg() {
		return fecUsrUpdReg;
	}
	public void setFecUsrUpdReg(java.util.Date fecUsrUpdReg) {
		this.fecUsrUpdReg = fecUsrUpdReg;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUsrUpdReg() {
		return usrUpdReg;
	}
	public void setUsrUpdReg(String usrUpdReg) {
		this.usrUpdReg = usrUpdReg;
	}
	public String getCvePresupuestal() {
		return cvePresupuestal;
	}
	public void setCvePresupuestal(String cvePresupuestal) {
		this.cvePresupuestal = cvePresupuestal;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getCvePerfil() {
		return cvePerfil;
	}
	public void setCvePerfil(Long cvePerfil) {
		this.cvePerfil = cvePerfil;
	}
	public FepirCatDelegacion getFepirCatDelegacion() {
		return fepirCatDelegacion;
	}
	public void setFepirCatDelegacion(FepirCatDelegacion fepirCatDelegacion) {
		this.fepirCatDelegacion = fepirCatDelegacion;
	}
	public FepirCatEstatusFolio getFepirCatEstatusFolio() {
		return fepirCatEstatusFolio;
	}
	public void setFepirCatEstatusFolio(FepirCatEstatusFolio fepirCatEstatusFolio) {
		this.fepirCatEstatusFolio = fepirCatEstatusFolio;
	}
	public FepirCatPerfil getFepirCatPerfil() {
		return fepirCatPerfil;
	}
	public void setFepirCatPerfil(FepirCatPerfil fepirCatPerfil) {
		this.fepirCatPerfil = fepirCatPerfil;
	}
	public FepirUnidadMedica getFepirUnidadMedica() {
		return fepirUnidadMedica;
	}
	public void setFepirUnidadMedica(FepirUnidadMedica fepirUnidadMedica) {
		this.fepirUnidadMedica = fepirUnidadMedica;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "FepirUsuarioAcceso [cveDelegacion=" + cveDelegacion + ", cveUsuario=" + cveUsuario + ", apMaterno="
				+ apMaterno + ", apPaterno=" + apPaterno + ", cip=" + cip + ", fecAlta=" + fecAlta + ", fecBaja="
				+ fecBaja + ", fecUsrUpdReg=" + fecUsrUpdReg + ", nombre=" + nombre + ", usrUpdReg=" + usrUpdReg
				+ ", cvePresupuestal=" + cvePresupuestal + ", password=" + password + ", cvePerfil=" + cvePerfil
				+ ", fepirCatDelegacion=" + fepirCatDelegacion + ", fepirCatEstatusFolio=" + fepirCatEstatusFolio
				+ ", fepirCatPerfil=" + fepirCatPerfil + ", fepirUnidadMedica=" + fepirUnidadMedica + "]";
	}
	
	
	
	



	
}
