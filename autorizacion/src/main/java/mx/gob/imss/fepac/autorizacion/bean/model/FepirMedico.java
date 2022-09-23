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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@DynamicUpdate
@Table(name="FEPIR_MEDICO")
public class FepirMedico implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "MATRICULA")
	private String matricula;
	@Column(name = "CVE_ESTATUS")
	private Long cveEstatus;
	@Column(name = "FEC_USR_UPD_REG")
	private Date fecUsrUpdReg;
	@Column(name = "JORNADA")
	private Long jornada;
	@Column(name = "MATERNO", nullable = false)
	private String materno;
	@Column(name = "NOMBRE", nullable = false)
	private String nombre;
	@Column(name = "PATERNO", nullable = false)
	private String paterno;
	@Column(name = "USR_UPD_REG")
	private String usrUpdReg;
	@Column(name = "FECHA_ALTA")
	private Date fechaAlta;
	@Column(name = "FECHA_BAJA")
	private Date fechaBaja;
	@OneToMany( mappedBy="fepirMedico", cascade = CascadeType.ALL)
	private java.util.Set<FepirAsigFolioMedico> fepirAsigFolioMedicos;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_CATEGORIA")
	@JsonIgnore
	private FepirCatCategoria fepirCatCategoria;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_ESPECIALIDAD")
	@JsonIgnore
	private FepirCatEspecialidad fepirCatEspecialidad;
	@OneToMany( mappedBy="fepirMedico", cascade = CascadeType.ALL)
	private java.util.Set<FepirMedicoUnidad> fepirMedicoUnidads;
	@OneToMany( mappedBy="fepirMedicos", cascade = CascadeType.ALL)
	private java.util.Set<FepirHistoricoAdmon> fepirHistoricoAdmon;

	public FepirMedico() {
		super();
	}

	
	

	public FepirMedico(String matricula, Long cveEstatus, Date fecUsrUpdReg, Long jornada, String materno,
			String nombre, String paterno, String usrUpdReg, Date fechaAlta, Date fechaBaja) {
		super();
		this.matricula = matricula;
		this.cveEstatus = cveEstatus;
		this.fecUsrUpdReg = fecUsrUpdReg;
		this.jornada = jornada;
		this.materno = materno;
		this.nombre = nombre;
		this.paterno = paterno;
		this.usrUpdReg = usrUpdReg;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
	}




	public FepirMedico(String matricula, Long cveEstatus, Date fecUsrUpdReg, Long jornada, String materno,
			String nombre, String paterno, String usrUpdReg, Date fechaAlta, Date fechaBaja,
			Set<FepirAsigFolioMedico> fepirAsigFolioMedicos, FepirCatCategoria fepirCatCategoria,
			FepirCatEspecialidad fepirCatEspecialidad, Set<FepirMedicoUnidad> fepirMedicoUnidads,
			Set<FepirHistoricoAdmon> fepirHistoricoAdmon) {
		super();
		this.matricula = matricula;
		this.cveEstatus = cveEstatus;
		this.fecUsrUpdReg = fecUsrUpdReg;
		this.jornada = jornada;
		this.materno = materno;
		this.nombre = nombre;
		this.paterno = paterno;
		this.usrUpdReg = usrUpdReg;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.fepirAsigFolioMedicos = fepirAsigFolioMedicos;
		this.fepirCatCategoria = fepirCatCategoria;
		this.fepirCatEspecialidad = fepirCatEspecialidad;
		this.fepirMedicoUnidads = fepirMedicoUnidads;
		this.fepirHistoricoAdmon = fepirHistoricoAdmon;
	}


	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Long getCveEstatus() {
		return cveEstatus;
	}

	public void setCveEstatus(Long cveEstatus) {
		this.cveEstatus = cveEstatus;
	}

	public Date getFecUsrUpdReg() {
		return fecUsrUpdReg;
	}

	public void setFecUsrUpdReg(Date fecUsrUpdReg) {
		this.fecUsrUpdReg = fecUsrUpdReg;
	}

	public Long getJornada() {
		return jornada;
	}

	public void setJornada(Long jornada) {
		this.jornada = jornada;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getUsrUpdReg() {
		return usrUpdReg;
	}

	public void setUsrUpdReg(String usrUpdReg) {
		this.usrUpdReg = usrUpdReg;
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

	public java.util.Set<FepirAsigFolioMedico> getFepirAsigFolioMedicos() {
		return fepirAsigFolioMedicos;
	}

	public void setFepirAsigFolioMedicos(java.util.Set<FepirAsigFolioMedico> fepirAsigFolioMedicos) {
		this.fepirAsigFolioMedicos = fepirAsigFolioMedicos;
	}

	public FepirCatCategoria getFepirCatCategoria() {
		return fepirCatCategoria;
	}

	public void setFepirCatCategoria(FepirCatCategoria fepirCatCategoria) {
		this.fepirCatCategoria = fepirCatCategoria;
	}

	public FepirCatEspecialidad getFepirCatEspecialidad() {
		return fepirCatEspecialidad;
	}

	public void setFepirCatEspecialidad(FepirCatEspecialidad fepirCatEspecialidad) {
		this.fepirCatEspecialidad = fepirCatEspecialidad;
	}

	public java.util.Set<FepirMedicoUnidad> getFepirMedicoUnidads() {
		return fepirMedicoUnidads;
	}

	public void setFepirMedicoUnidads(java.util.Set<FepirMedicoUnidad> fepirMedicoUnidads) {
		this.fepirMedicoUnidads = fepirMedicoUnidads;
	}

	public java.util.Set<FepirHistoricoAdmon> getFepirHistoricoAdmon() {
		return fepirHistoricoAdmon;
	}

	public void setFepirHistoricoAdmon(java.util.Set<FepirHistoricoAdmon> fepirHistoricoAdmon) {
		this.fepirHistoricoAdmon = fepirHistoricoAdmon;
	}



	@Override
	public String toString() {
		return "FepirMedico [matricula=" + matricula + ", cveEstatus=" + cveEstatus + ", fecUsrUpdReg=" + fecUsrUpdReg
				+ ", jornada=" + jornada + ", materno=" + materno + ", nombre=" + nombre + ", paterno=" + paterno
				+ ", usrUpdReg=" + usrUpdReg + ", fechaAlta=" + fechaAlta + ", fechaBaja=" + fechaBaja
				+ ", fepirAsigFolioMedicos=" + fepirAsigFolioMedicos + ", fepirCatCategoria=" + fepirCatCategoria
				+ ", fepirCatEspecialidad=" + fepirCatEspecialidad + ", fepirMedicoUnidads=" + fepirMedicoUnidads
				+ ", fepirHistoricoAdmon=" + fepirHistoricoAdmon + "]";
	}

	

}
