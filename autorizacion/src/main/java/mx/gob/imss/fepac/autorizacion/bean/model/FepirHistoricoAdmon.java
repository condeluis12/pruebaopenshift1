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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="FEPIR_HISTORICO_ADMON")
public class FepirHistoricoAdmon implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HISTO_SEQ")
	@SequenceGenerator(name = "HISTO_SEQ", allocationSize = 1)
	@Column(name = "SECUENCIA")
	private Long secuencia;
	@Column(name = "FECHA_ACCION")
	private Date fechaAccion;
	@Column(name = "CVE_PRESUPUESTAL")
	private String cvePresupuestal;
	@Column(name = "MATRICULA")
	private String fepirMedico;
	@Column(name = "CVE_USUARIO")
	private String cveUsuario;
	@Column(name = "CVE_USUARIO_MODIF")
	private String cveUsuarioModif;
	@Column(name = "CVE_DELEGACION")
	private Long fepirCatDelegacion;
	@Column(name = "ID_ACCION_ADMON")
	private Long idAccionAdmon;
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	@JoinColumn(name="ID_ACCION_ADMON",referencedColumnName="ID_ACCION_ADMON", insertable=false, updatable=false)
	@JsonIgnore
	private FepirAccionAdmon FepirAccionAdmon ;
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_DELEGACION",referencedColumnName="CVE_DELEGACION", insertable=false, updatable=false)
	@JsonIgnore
	private FepirCatDelegacion fepirCatDelegacions; 
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	@JoinColumn(name="MATRICULA",referencedColumnName="MATRICULA", insertable=false, updatable=false)
	@JsonIgnore
	private FepirMedico fepirMedicos;


	public FepirHistoricoAdmon() {
		super();
	}


	public FepirHistoricoAdmon(Long secuencia, Date fechaAccion, String cvePresupuestal, String fepirMedico,
			String cveUsuario, String cveUsuarioModif, Long fepirCatDelegacion, Long idAccionAdmon,
			mx.gob.imss.fepac.autorizacion.bean.model.FepirAccionAdmon fepirAccionAdmon, FepirCatDelegacion fepirCatDelegacions) {
		super();
		this.secuencia = secuencia;
		this.fechaAccion = fechaAccion;
		this.cvePresupuestal = cvePresupuestal;
		this.fepirMedico = fepirMedico;
		this.cveUsuario = cveUsuario;
		this.cveUsuarioModif = cveUsuarioModif;
		this.fepirCatDelegacion = fepirCatDelegacion;
		this.idAccionAdmon = idAccionAdmon;
		FepirAccionAdmon = fepirAccionAdmon;
		this.fepirCatDelegacions = fepirCatDelegacions;
	}


	public Long getSecuencia() {
		return secuencia;
	}


	public void setSecuencia(Long secuencia) {
		this.secuencia = secuencia;
	}


	public Date getFechaAccion() {
		return fechaAccion;
	}


	public void setFechaAccion(Date fechaAccion) {
		this.fechaAccion = fechaAccion;
	}


	public String getCvePresupuestal() {
		return cvePresupuestal;
	}


	public void setCvePresupuestal(String cvePresupuestal) {
		this.cvePresupuestal = cvePresupuestal;
	}


	public String getFepirMedico() {
		return fepirMedico;
	}


	public void setFepirMedico(String fepirMedico) {
		this.fepirMedico = fepirMedico;
	}


	public String getCveUsuario() {
		return cveUsuario;
	}


	public void setCveUsuario(String cveUsuario) {
		this.cveUsuario = cveUsuario;
	}


	public String getCveUsuarioModif() {
		return cveUsuarioModif;
	}


	public void setCveUsuarioModif(String cveUsuarioModif) {
		this.cveUsuarioModif = cveUsuarioModif;
	}


	public Long getFepirCatDelegacion() {
		return fepirCatDelegacion;
	}


	public void setFepirCatDelegacion(Long fepirCatDelegacion) {
		this.fepirCatDelegacion = fepirCatDelegacion;
	}


	public Long getIdAccionAdmon() {
		return idAccionAdmon;
	}


	public void setIdAccionAdmon(Long idAccionAdmon) {
		this.idAccionAdmon = idAccionAdmon;
	}


	public FepirAccionAdmon getFepirAccionAdmon() {
		return FepirAccionAdmon;
	}


	public void setFepirAccionAdmon(FepirAccionAdmon fepirAccionAdmon) {
		FepirAccionAdmon = fepirAccionAdmon;
	}


	public FepirCatDelegacion getFepirCatDelegacions() {
		return fepirCatDelegacions;
	}


	public void setFepirCatDelegacions(FepirCatDelegacion fepirCatDelegacions) {
		this.fepirCatDelegacions = fepirCatDelegacions;
	}


	@Override
	public String toString() {
		return "FepirHistoricoAdmon [secuencia=" + secuencia + ", fechaAccion=" + fechaAccion + ", cvePresupuestal="
				+ cvePresupuestal + ", fepirMedico=" + fepirMedico + ", cveUsuario=" + cveUsuario + ", cveUsuarioModif="
				+ cveUsuarioModif + ", fepirCatDelegacion=" + fepirCatDelegacion + ", idAccionAdmon=" + idAccionAdmon
				+ ", FepirAccionAdmon=" + FepirAccionAdmon + ", fepirCatDelegacions=" + fepirCatDelegacions + "]";
	}

	
	

	

}
