package mx.gob.imss.fepac.autorizacion.bean.model;


import java.io.Serializable;
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
@Table(name="FEPIR_CAT_PERFIL")
public class FepirCatPerfil implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_PERFIL", nullable = false)
	private Long cvePerfil;
	@Column(name = "NOM_PERFIL", nullable = false)
	private String nomPerfil;
	@OneToMany( mappedBy="fepirCatPerfil2", cascade = CascadeType.ALL)
	private Set<FepirCatPerfilUsuario> fepirCatPerfilUsuarios2;
	@OneToMany( mappedBy="fepirCatPerfil", cascade = CascadeType.ALL)
	private Set<FepirPerfilPermiso> fepirPerfilPermisos;
	@OneToMany( mappedBy="fepirCatPerfil", cascade = CascadeType.ALL)
	private Set<FepirPerfilSistema> fepirPerfilSistemas;
	@OneToMany(fetch = FetchType.EAGER,mappedBy="fepirCatPerfil", cascade = CascadeType.ALL)
	private Set<FepirUsuarioAcceso> fepirUsuarioAccesos;

	public FepirCatPerfil() {
		super();
	}

	public FepirCatPerfil(Long cvePerfil, String nomPerfil, Set<FepirCatPerfilUsuario> fepirCatPerfilUsuarios2,
			Set<FepirPerfilPermiso> fepirPerfilPermisos, Set<FepirPerfilSistema> fepirPerfilSistemas,
			Set<FepirUsuarioAcceso> fepirUsuarioAccesos) {
		super();
		this.cvePerfil = cvePerfil;
		this.nomPerfil = nomPerfil;
		this.fepirCatPerfilUsuarios2 = fepirCatPerfilUsuarios2;
		this.fepirPerfilPermisos = fepirPerfilPermisos;
		this.fepirPerfilSistemas = fepirPerfilSistemas;
		this.fepirUsuarioAccesos = fepirUsuarioAccesos;
	}
	
	

	public FepirCatPerfil(Long cvePerfil, String nomPerfil) {
		super();
		this.cvePerfil = cvePerfil;
		this.nomPerfil = nomPerfil;
	}

	public Long getCvePerfil() {
		return cvePerfil;
	}

	public void setCvePerfil(Long cvePerfil) {
		this.cvePerfil = cvePerfil;
	}

	public String getNomPerfil() {
		return nomPerfil;
	}

	public void setNomPerfil(String nomPerfil) {
		this.nomPerfil = nomPerfil;
	}

	public java.util.Set<FepirCatPerfilUsuario> getFepirCatPerfilUsuarios2() {
		return fepirCatPerfilUsuarios2;
	}

	public void setFepirCatPerfilUsuarios2(java.util.Set<FepirCatPerfilUsuario> fepirCatPerfilUsuarios2) {
		this.fepirCatPerfilUsuarios2 = fepirCatPerfilUsuarios2;
	}

	public java.util.Set<FepirPerfilPermiso> getFepirPerfilPermisos() {
		return fepirPerfilPermisos;
	}

	public void setFepirPerfilPermisos(java.util.Set<FepirPerfilPermiso> fepirPerfilPermisos) {
		this.fepirPerfilPermisos = fepirPerfilPermisos;
	}

	public java.util.Set<FepirPerfilSistema> getFepirPerfilSistemas() {
		return fepirPerfilSistemas;
	}

	public void setFepirPerfilSistemas(java.util.Set<FepirPerfilSistema> fepirPerfilSistemas) {
		this.fepirPerfilSistemas = fepirPerfilSistemas;
	}

	public java.util.Set<FepirUsuarioAcceso> getFepirUsuarioAccesos() {
		return fepirUsuarioAccesos;
	}

	public void setFepirUsuarioAccesos(java.util.Set<FepirUsuarioAcceso> fepirUsuarioAccesos) {
		this.fepirUsuarioAccesos = fepirUsuarioAccesos;
	}

	@Override
	public String toString() {
		return "FepirCatPerfil [cvePerfil=" + cvePerfil + ", nomPerfil=" + nomPerfil + ", fepirCatPerfilUsuarios2="
				+ fepirCatPerfilUsuarios2 + ", fepirPerfilPermisos=" + fepirPerfilPermisos + ", fepirPerfilSistemas="
				+ fepirPerfilSistemas + ", fepirUsuarioAccesos=" + fepirUsuarioAccesos + "]";
	}

	


	
}
