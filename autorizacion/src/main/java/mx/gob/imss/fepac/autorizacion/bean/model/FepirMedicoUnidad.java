package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@DynamicUpdate
@Table(name="FEPIR_MEDICO_UNIDAD")
@IdClass(value = FepirMedicoUnidadPK.class)
public class FepirMedicoUnidad implements Serializable {

	@Id
	@Column(name = "CVE_DELEGACION")
	private Long cveDelegacion;
	@Id
	@Column(name = "CVE_PRESUPUESTAL")
	private String cvePresupuestal;
	@Id
	@Column(name = "MATRICULA")
	private String matricula;
	@Column(name = "CONSULTORIO")
	private Long consultorio;
	@Column(name = "FEC_ASIGNACION")
	private Date fecAsignacion;
	@Column(name = "FEC_BAJA")
	private Date fecBaja;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_TURNO")
	@JsonIgnore
	private FepirCatTurno fepirCatTurno;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="MATRICULA",referencedColumnName="MATRICULA", insertable=false, updatable=false)
	@JsonIgnore
	private FepirMedico fepirMedico;
	
	
	public FepirMedicoUnidad(Long cveDelegacion, String cvePresupuestal, String matricula, Long consultorio,
			Date fecAsignacion, Date fecBaja) {
		super();
		this.cveDelegacion = cveDelegacion;
		this.cvePresupuestal = cvePresupuestal;
		this.matricula = matricula;
		this.consultorio = consultorio;
		this.fecAsignacion = fecAsignacion;
		this.fecBaja = fecBaja;
	}

	public FepirMedicoUnidad(Long cveDelegacion, String cvePresupuestal, String matricula, Long consultorio,
			Date fecAsignacion, Date fecBaja, FepirCatTurno fepirCatTurno, FepirMedico fepirMedico) {
		super();
		this.cveDelegacion = cveDelegacion;
		this.cvePresupuestal = cvePresupuestal;
		this.matricula = matricula;
		this.consultorio = consultorio;
		this.fecAsignacion = fecAsignacion;
		this.fecBaja = fecBaja;
		this.fepirCatTurno = fepirCatTurno;
		this.fepirMedico = fepirMedico;
	}
	
	public FepirMedicoUnidad(String matricula) {
		super();
		this.matricula = matricula;
	}

	public FepirMedicoUnidad() {
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
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Long getConsultorio() {
		return consultorio;
	}
	public void setConsultorio(Long consultorio) {
		this.consultorio = consultorio;
	}
	public Date getFecAsignacion() {
		return fecAsignacion;
	}
	public void setFecAsignacion(Date fecAsignacion) {
		this.fecAsignacion = fecAsignacion;
	}
	public Date getFecBaja() {
		return fecBaja;
	}
	public void setFecBaja(Date fecBaja) {
		this.fecBaja = fecBaja;
	}
	public FepirCatTurno getFepirCatTurno() {
		return fepirCatTurno;
	}
	public void setFepirCatTurno(FepirCatTurno fepirCatTurno) {
		this.fepirCatTurno = fepirCatTurno;
	}
	public FepirMedico getFepirMedico() {
		return fepirMedico;
	}
	public void setFepirMedico(FepirMedico fepirMedico) {
		this.fepirMedico = fepirMedico;
	}
	@Override
	public String toString() {
		return "FepirMedicoUnidad [cveDelegacion=" + cveDelegacion + ", cvePresupuestal=" + cvePresupuestal
				+ ", matricula=" + matricula + ", consultorio=" + consultorio + ", fecAsignacion=" + fecAsignacion
				+ ", fecBaja=" + fecBaja + ", fepirCatTurno=" + fepirCatTurno + ", fepirMedico=" + fepirMedico + "]";
	}

	


	
}
