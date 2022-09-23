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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="FEPIR_CAT_DELEGACION")
public class FepirCatDelegacion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_DELEGACION")
	private Long cveDelegacion;
	@Column(name = "NOM_DELEGACION")
	private String nomDelegacion;
	@Column(name = "CVE_REGION")
	private Long cveRegion;
	@OneToMany( mappedBy="fepirCatDelegacion", cascade = CascadeType.ALL)
	private java.util.Set<FepirAlmacenDelg> fepirAlmacenDelgs;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_REGION",referencedColumnName="CVE_REGION", insertable=false, updatable=false)
	@JsonIgnore
	private FepirCatRegion fepirCatRegion;
	@OneToMany( mappedBy="fepirCatDelegacion", cascade = CascadeType.ALL)
	private java.util.Set<FepirProgFolioIncap> fepirProgFolioIncaps;
	@OneToMany(mappedBy="fepirCatDelegacion", cascade = CascadeType.ALL,orphanRemoval = true)
	private java.util.Set<FepirUnidadMedica> fepirUnidadMedicas;
	@OneToMany(mappedBy="fepirCatDelegacion", cascade = CascadeType.ALL,orphanRemoval = true)
	private java.util.Set<FepirUsuarioAcceso> fepirUsuarioAccesos;
	@OneToMany(mappedBy="fepirCatDelegacions", cascade = CascadeType.ALL)
	private java.util.Set<FepirHistoricoAdmon> fepirHistoricoAdmon;
	
	

	public FepirCatDelegacion(Long cveDelegacion, String nomDelegacion) {
		super();
		this.cveDelegacion = cveDelegacion;
		this.nomDelegacion = nomDelegacion;
	}

	public FepirCatDelegacion() {
		super();
	}

	public FepirCatDelegacion( Long cveDelegacion, String nomDelegacion,
			Set<FepirAlmacenDelg> fepirAlmacenDelgs, FepirCatRegion fepirCatRegion,
			Set<FepirProgFolioIncap> fepirProgFolioIncaps, Set<FepirUnidadMedica> fepirUnidadMedicas,
			Set<FepirUsuarioAcceso> fepirUsuarioAccesos, Set<FepirHistoricoAdmon> fepirHistoricoAdmon) {
		super();
		
		this.cveDelegacion = cveDelegacion;
		this.nomDelegacion = nomDelegacion;
		this.fepirAlmacenDelgs = fepirAlmacenDelgs;
		this.fepirCatRegion = fepirCatRegion;
		this.fepirProgFolioIncaps = fepirProgFolioIncaps;
		this.fepirUnidadMedicas = fepirUnidadMedicas;
		this.fepirUsuarioAccesos = fepirUsuarioAccesos;
		this.fepirHistoricoAdmon = fepirHistoricoAdmon;
	}

	
	



	public FepirCatDelegacion(Long cveDelegacion, String nomDelegacion, Long cveRegion) {
		super();
		this.cveDelegacion = cveDelegacion;
		this.nomDelegacion = nomDelegacion;
		this.cveRegion = cveRegion;
	}

	public Long getCveDelegacion() {
		return cveDelegacion;
	}

	public void setCveDelegacion(Long cveDelegacion) {
		this.cveDelegacion = cveDelegacion;
	}

	public String getNomDelegacion() {
		return nomDelegacion;
	}

	public void setNomDelegacion(String nomDelegacion) {
		this.nomDelegacion = nomDelegacion;
	}

	public java.util.Set<FepirAlmacenDelg> getFepirAlmacenDelgs() {
		return fepirAlmacenDelgs;
	}

	public void setFepirAlmacenDelgs(java.util.Set<FepirAlmacenDelg> fepirAlmacenDelgs) {
		this.fepirAlmacenDelgs = fepirAlmacenDelgs;
	}

	public FepirCatRegion getFepirCatRegion() {
		return fepirCatRegion;
	}

	public void setFepirCatRegion(FepirCatRegion fepirCatRegion) {
		this.fepirCatRegion = fepirCatRegion;
	}

	public java.util.Set<FepirProgFolioIncap> getFepirProgFolioIncaps() {
		return fepirProgFolioIncaps;
	}

	public void setFepirProgFolioIncaps(java.util.Set<FepirProgFolioIncap> fepirProgFolioIncaps) {
		this.fepirProgFolioIncaps = fepirProgFolioIncaps;
	}

	public java.util.Set<FepirUnidadMedica> getFepirUnidadMedicas() {
		return fepirUnidadMedicas;
	}

	public void setFepirUnidadMedicas(java.util.Set<FepirUnidadMedica> fepirUnidadMedicas) {
		this.fepirUnidadMedicas = fepirUnidadMedicas;
	}

	public java.util.Set<FepirUsuarioAcceso> getFepirUsuarioAccesos() {
		return fepirUsuarioAccesos;
	}

	public void setFepirUsuarioAccesos(java.util.Set<FepirUsuarioAcceso> fepirUsuarioAccesos) {
		this.fepirUsuarioAccesos = fepirUsuarioAccesos;
	}

	public java.util.Set<FepirHistoricoAdmon> getFepirHistoricoAdmon() {
		return fepirHistoricoAdmon;
	}

	public void setFepirHistoricoAdmon(java.util.Set<FepirHistoricoAdmon> fepirHistoricoAdmon) {
		this.fepirHistoricoAdmon = fepirHistoricoAdmon;
	}

	
	public Long getCveRegion() {
		return cveRegion;
	}

	public void setCveRegion(Long cveRegion) {
		this.cveRegion = cveRegion;
	}

	@Override
	public String toString() {
		return "FepirCatDelegacion [cveDelegacion=" + cveDelegacion + ", nomDelegacion=" + nomDelegacion
				+ ", fepirAlmacenDelgs=" + fepirAlmacenDelgs + ", fepirCatRegion=" + fepirCatRegion
				+ ", fepirProgFolioIncaps=" + fepirProgFolioIncaps + ", fepirUnidadMedicas=" + fepirUnidadMedicas
				+ ", fepirUsuarioAccesos=" + fepirUsuarioAccesos + ", fepirHistoricoAdmon=" + fepirHistoricoAdmon + "]";
	}

	

}
