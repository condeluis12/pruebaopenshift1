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
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="FEPIR_CAT_TURNO")
public class FepirCatTurno implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_TURNO")
	private Long cveTurno;
	@Column(name = "HORA_FIN")
	private Date horaFin;
	@Column(name = "HORA_INICIO")
	private Date horaInicio;
	@Column(name = "NOM_TURNO")
	private String nomTurno;
	@OneToMany(mappedBy="fepirCatTurno", cascade = CascadeType.ALL)
	private java.util.Set<FepirMedicoUnidad> fepirMedicoUnidads;

	public FepirCatTurno() {
		super();
	}

	

	public FepirCatTurno(Long cveTurno, String nomTurno) {
		super();
		this.cveTurno = cveTurno;
		this.nomTurno = nomTurno;
	}



	public FepirCatTurno(Long cveTurno, Date horaFin, Date horaInicio, String nomTurno,
			Set<FepirMedicoUnidad> fepirMedicoUnidads) {
		super();
		this.cveTurno = cveTurno;
		this.horaFin = horaFin;
		this.horaInicio = horaInicio;
		this.nomTurno = nomTurno;
		this.fepirMedicoUnidads = fepirMedicoUnidads;
	}

	

	public Long getCveTurno() {
		return cveTurno;
	}

	public void setCveTurno(Long cveTurno) {
		this.cveTurno = cveTurno;
	}

	public Date getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}

	public Date getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getNomTurno() {
		return nomTurno;
	}

	public void setNomTurno(String nomTurno) {
		this.nomTurno = nomTurno;
	}

	public java.util.Set<FepirMedicoUnidad> getFepirMedicoUnidads() {
		return fepirMedicoUnidads;
	}

	public void setFepirMedicoUnidads(java.util.Set<FepirMedicoUnidad> fepirMedicoUnidads) {
		this.fepirMedicoUnidads = fepirMedicoUnidads;
	}



	@Override
	public String toString() {
		return "FepirCatTurno [cveTurno=" + cveTurno + ", horaFin=" + horaFin + ", horaInicio=" + horaInicio
				+ ", nomTurno=" + nomTurno + ", fepirMedicoUnidads=" + fepirMedicoUnidads + "]";
	}

	

}
