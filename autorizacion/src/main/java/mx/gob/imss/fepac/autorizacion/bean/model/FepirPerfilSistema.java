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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="FEPIR_PERFIL_SISTEMA")
@IdClass(value = FepirPerfilSistemaPK.class)
public class FepirPerfilSistema implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CVE_FOLIO_SISTEMA", nullable = false)
	private String cveFolioSistema;
	@Id
	@Column(name = "CVE_PERFIL", nullable = false)
	private Long cvePerfil;

	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_FOLIO_SISTEMA",insertable=false, updatable=false)
	@JsonIgnore
	private FepirCatFolioSistema fepirCatFolioSistema;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_PERFIL",referencedColumnName="CVE_PERFIL",insertable=false, updatable=false)
	@JsonIgnore
	private FepirCatPerfil fepirCatPerfil;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumns({@JoinColumn(name="CVE_PERMISO",referencedColumnName="CVE_PERMISO",insertable=false, updatable=false)
	,@JoinColumn(name="CVE_TIPO_FOLIO",referencedColumnName="CVE_TIPO_FOLIO",insertable=false, updatable=false)})
	@JsonIgnore
	private FepirCatPermiso fepirCatPermiso;

	public FepirPerfilSistema() {
		super();
	}

	public FepirPerfilSistema( FepirCatFolioSistema fepirCatFolioSistema,
			FepirCatPerfil fepirCatPerfil, FepirCatPermiso fepirCatPermiso) {
		super();
		this.fepirCatFolioSistema = fepirCatFolioSistema;
		this.fepirCatPerfil = fepirCatPerfil;
		this.fepirCatPermiso = fepirCatPermiso;
	}


	public FepirCatFolioSistema getFepirCatFolioSistema() {
		return fepirCatFolioSistema;
	}

	public void setFepirCatFolioSistema(FepirCatFolioSistema fepirCatFolioSistema) {
		this.fepirCatFolioSistema = fepirCatFolioSistema;
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
		return "FepirPerfilSistema [cveFolioSistema=" + cveFolioSistema + ", cvePerfil=" + cvePerfil
				+ ", fepirCatFolioSistema=" + fepirCatFolioSistema + ", fepirCatPerfil=" + fepirCatPerfil
				+ ", fepirCatPermiso=" + fepirCatPermiso + "]";
	}

	
}
