package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;

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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="FEPIR_CAT_PERFIL_USUARIO")
@IdClass(value = FepirCatPerfilUsuarioPK.class)
public class FepirCatPerfilUsuario implements Serializable {
	@Id
	@Column(name = "CVE_PERFIL", nullable = false)
	private Long cvePerfil;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_PERFIL_AUTORIZA", nullable = false)
	private Long cvePerfilAutoriza;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_PERFIL",referencedColumnName="CVE_PERFIL", insertable=false, updatable=false)
	@JsonIgnore
	private FepirCatPerfil fepirCatPerfil2;

	public FepirCatPerfilUsuario() {
		super();
	}

	public FepirCatPerfilUsuario(Long cvePerfil, Long cvePerfilAutoriza, FepirCatPerfil fepirCatPerfil2) {
		super();
		this.cvePerfil = cvePerfil;
		this.cvePerfilAutoriza = cvePerfilAutoriza;
		this.fepirCatPerfil2 = fepirCatPerfil2;
	}

	public Long getCvePerfil() {
		return cvePerfil;
	}

	public void setCvePerfil(Long cvePerfil) {
		this.cvePerfil = cvePerfil;
	}

	public Long getCvePerfilAutoriza() {
		return cvePerfilAutoriza;
	}

	public void setCvePerfilAutoriza(Long cvePerfilAutoriza) {
		this.cvePerfilAutoriza = cvePerfilAutoriza;
	}

	public FepirCatPerfil getFepirCatPerfil2() {
		return fepirCatPerfil2;
	}

	public void setFepirCatPerfil2(FepirCatPerfil fepirCatPerfil2) {
		this.fepirCatPerfil2 = fepirCatPerfil2;
	}

	@Override
	public String toString() {
		return "FepirCatPerfilUsuario [cvePerfil=" + cvePerfil + ", cvePerfilAutoriza=" + cvePerfilAutoriza
				+ ", fepirCatPerfil2=" + fepirCatPerfil2 + "]";
	}

	

	
	
}
