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
@Table(name="FEPIR_CAT_ESPECIALIDAD")
public class FepirCatEspecialidad implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_ESPECIALIDAD", nullable = false)
	private Long cveEspecialidad;
	@Column(name = "FEC_USR_UPD_REG", nullable = false)
	private Date fecUsrUpdReg;
	@Column(name = "NOM_ESPECIALIDAD", nullable = false)
	private String nomEspecialidad;
	@Column(name = "USR_UPD_REG", nullable = false)
	private String usrUpdReg;
	@OneToMany(fetch = FetchType.EAGER, mappedBy="fepirCatEspecialidad", cascade = CascadeType.ALL)
	private java.util.Set<FepirMedico> fepirMedicos;

	public FepirCatEspecialidad() {
		super();
	}

	
	
	public FepirCatEspecialidad(Long cveEspecialidad, String nomEspecialidad) {
		super();
		this.cveEspecialidad = cveEspecialidad;
		this.nomEspecialidad = nomEspecialidad;
	}



	public FepirCatEspecialidad(Long cveEspecialidad, Date fecUsrUpdReg,
			String nomEspecialidad, String usrUpdReg, Set<FepirMedico> fepirMedicos) {
		super();
		this.cveEspecialidad = cveEspecialidad;
		this.fecUsrUpdReg = fecUsrUpdReg;
		this.nomEspecialidad = nomEspecialidad;
		this.usrUpdReg = usrUpdReg;
		this.fepirMedicos = fepirMedicos;
	}


	public Long getCveEspecialidad() {
		return cveEspecialidad;
	}

	public void setCveEspecialidad(Long cveEspecialidad) {
		this.cveEspecialidad = cveEspecialidad;
	}

	public Date getFecUsrUpdReg() {
		return fecUsrUpdReg;
	}

	public void setFecUsrUpdReg(Date fecUsrUpdReg) {
		this.fecUsrUpdReg = fecUsrUpdReg;
	}

	public String getNomEspecialidad() {
		return nomEspecialidad;
	}

	public void setNomEspecialidad(String nomEspecialidad) {
		this.nomEspecialidad = nomEspecialidad;
	}

	public String getUsrUpdReg() {
		return usrUpdReg;
	}

	public void setUsrUpdReg(String usrUpdReg) {
		this.usrUpdReg = usrUpdReg;
	}

	public java.util.Set<FepirMedico> getFepirMedicos() {
		return fepirMedicos;
	}

	public void setFepirMedicos(java.util.Set<FepirMedico> fepirMedicos) {
		this.fepirMedicos = fepirMedicos;
	}

	@Override
	public String toString() {
		return "FepirCatEspecialidad [cveEspecialidad=" + cveEspecialidad + ", fecUsrUpdReg=" + fecUsrUpdReg
				+ ", nomEspecialidad=" + nomEspecialidad + ", usrUpdReg=" + usrUpdReg + ", fepirMedicos=" + fepirMedicos
				+ "]";
	}

	
}
