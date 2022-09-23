package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="FEPIR_PERFIL_PERMISOS")
@IdClass(value = FepirPerfilPermisoPK.class)
public class FepirPerfilPermiso implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CVE_PERFIL", nullable = false)
	private Long cvePerfil;
	@Id
	@Column(name = "CVE_PERMISO")
	private Long cvePermiso;
	@Id
	@Column(name = "CVE_TIPO_FOLIO", nullable = false)
	private String cveTipoFolio;
	@Column(name = "DENEGAR", nullable = false)
	private Long denegar;
	@Column(name = "PERMITIR", nullable = false)
	private Long permitir;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_PERFIL",referencedColumnName="CVE_PERFIL", insertable=false, updatable=false)
	@JsonIgnore
	private FepirCatPerfil fepirCatPerfil;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({@JoinColumn(name="CVE_PERMISO",referencedColumnName="CVE_PERMISO", insertable=false, updatable=false),
		@JoinColumn(name="CVE_TIPO_FOLIO",referencedColumnName="CVE_TIPO_FOLIO",insertable = false, updatable = false)})
	@JsonIgnore
	private FepirCatPermiso fepirCatPermiso;

	public FepirPerfilPermiso() {
		super();
	}

	

	public FepirPerfilPermiso(Long denegar, Long permitir,
			FepirCatPerfil fepirCatPerfil, FepirCatPermiso fepirCatPermiso) {
		super();
		this.denegar = denegar;
		this.permitir = permitir;
		this.fepirCatPerfil = fepirCatPerfil;
		this.fepirCatPermiso = fepirCatPermiso;
	}

	public Long getDenegar() {
		return denegar;
	}

	public void setDenegar(Long denegar) {
		this.denegar = denegar;
	}

	public Long getPermitir() {
		return permitir;
	}

	public void setPermitir(Long permitir) {
		this.permitir = permitir;
	}

	public FepirCatPerfil getFepirCatPerfil() {
		return fepirCatPerfil;
	}

	public void setFepirCatPerfil(FepirCatPerfil fepirCatPerfil) {
		this.fepirCatPerfil = fepirCatPerfil;
	}

	public FepirCatPermiso getFepirCatPermiso() {
		return fepirCatPermiso;
	}

	public void setFepirCatPermiso(FepirCatPermiso fepirCatPermiso) {
		this.fepirCatPermiso = fepirCatPermiso;
	}



	@Override
	public String toString() {
		return "FepirPerfilPermiso [cvePerfil=" + cvePerfil + ", cvePermiso=" + cvePermiso + ", cveTipoFolio="
				+ cveTipoFolio + ", denegar=" + denegar + ", permitir=" + permitir + ", fepirCatPerfil="
				+ fepirCatPerfil + ", fepirCatPermiso=" + fepirCatPermiso + "]";
	}

	

}
