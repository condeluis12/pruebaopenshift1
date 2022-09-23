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
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="FEPIR_CAT_PERMISOS")
@IdClass(value = FepirCatPermisoPK.class)
public class FepirCatPermiso implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_PERMISO")
	private Long cvePermiso;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_TIPO_FOLIO", nullable = false)
	private String cveTipoFolio;
	@Column(name = "NOM_PERMISO", nullable = false)
	private String nomPermiso;
	@OneToMany( mappedBy="fepirCatPermiso", cascade = CascadeType.ALL)
	private java.util.Set<FepirPerfilPermiso> fepirPerfilPermisos;
	@OneToMany( mappedBy="fepirCatPermiso", cascade = CascadeType.ALL)
	private java.util.Set<FepirPerfilSistema> fepirPerfilSistemas;

	public FepirCatPermiso() {
		super();
	}

	
	public FepirCatPermiso(String nomPermiso,
			Set<FepirPerfilPermiso> fepirPerfilPermisos, Set<FepirPerfilSistema> fepirPerfilSistemas) {
		super();
		this.nomPermiso = nomPermiso;
		this.fepirPerfilPermisos = fepirPerfilPermisos;
		this.fepirPerfilSistemas = fepirPerfilSistemas;
	}

	

	public String getNomPermiso() {
		return nomPermiso;
	}

	public void setNomPermiso(String nomPermiso) {
		this.nomPermiso = nomPermiso;
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


	@Override
	public String toString() {
		return "FepirCatPermiso [cvePermiso=" + cvePermiso + ", cveTipoFolio=" + cveTipoFolio + ", nomPermiso="
				+ nomPermiso + ", fepirPerfilPermisos=" + fepirPerfilPermisos + ", fepirPerfilSistemas="
				+ fepirPerfilSistemas + "]";
	}


}
