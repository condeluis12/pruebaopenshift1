package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.sql.Date;
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
@Table(name="FEPIR_CAT_CATEGORIA")
public class FepirCatCategoria implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_CATEGORIA", nullable = false)
	private Long cveCategoria;
	@Column(name = "FEC_USR_UPD_REG", nullable = false)
	private java.sql.Date fecUsrUpdReg;
	@Column(name = "NOM_CATEGORIA", nullable = false)
	private String nomCategoria;
	@Column(name = "USR_UPD_REG", nullable = false)
	private String usrUpdReg;
	@OneToMany( mappedBy="fepirCatCategoria", cascade = CascadeType.ALL)
	private java.util.Set<FepirMedico> fepirMedicos;

	public FepirCatCategoria() {
		super();
	}

	public FepirCatCategoria(Long cveCategoria, Date fecUsrUpdReg, String nomCategoria,
			String usrUpdReg, Set<FepirMedico> fepirMedicos) {
		super();
	
		this.cveCategoria = cveCategoria;
		this.fecUsrUpdReg = fecUsrUpdReg;
		this.nomCategoria = nomCategoria;
		this.usrUpdReg = usrUpdReg;
		this.fepirMedicos = fepirMedicos;
	}

	public Long getCveCategoria() {
		return cveCategoria;
	}

	public void setCveCategoria(Long cveCategoria) {
		this.cveCategoria = cveCategoria;
	}

	public java.sql.Date getFecUsrUpdReg() {
		return fecUsrUpdReg;
	}

	public void setFecUsrUpdReg(java.sql.Date fecUsrUpdReg) {
		this.fecUsrUpdReg = fecUsrUpdReg;
	}

	public String getNomCategoria() {
		return nomCategoria;
	}

	public void setNomCategoria(String nomCategoria) {
		this.nomCategoria = nomCategoria;
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
		return "FepirCatCategoria [cveCategoria=" + cveCategoria + ", fecUsrUpdReg=" + fecUsrUpdReg + ", nomCategoria="
				+ nomCategoria + ", usrUpdReg=" + usrUpdReg + ", fepirMedicos=" + fepirMedicos + "]";
	}

	

}
