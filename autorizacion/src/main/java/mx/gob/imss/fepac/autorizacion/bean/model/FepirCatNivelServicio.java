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
@Table(name="FEPIR_CAT_NIVEL_SERVICIO")
public class FepirCatNivelServicio implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_NIVEL_SERVICIO")
	private Long cveNivelServicio;
	@Column(name = "NOM_NIVEL_SERVICIO")
	private String nomNivelServicio;
	@OneToMany(fetch = FetchType.EAGER,mappedBy="fepirCatNivelServicio", cascade = CascadeType.ALL)
	private java.util.Set<FepirUnidadMedica> fepirUnidadMedicas;

	public FepirCatNivelServicio() {
		super();
	}


	public FepirCatNivelServicio(Long cveNivelServicio, String nomNivelServicio,
			Set<FepirUnidadMedica> fepirUnidadMedicas) {
		super();
		this.cveNivelServicio = cveNivelServicio;
		this.nomNivelServicio = nomNivelServicio;
		this.fepirUnidadMedicas = fepirUnidadMedicas;
	}

	


	public FepirCatNivelServicio(Long cveNivelServicio, String nomNivelServicio) {
		super();
		this.cveNivelServicio = cveNivelServicio;
		this.nomNivelServicio = nomNivelServicio;
	}


	public Long getCveNivelServicio() {
		return cveNivelServicio;
	}

	public void setCveNivelServicio(Long cveNivelServicio) {
		this.cveNivelServicio = cveNivelServicio;
	}

	public String getNomNivelServicio() {
		return nomNivelServicio;
	}

	public void setNomNivelServicio(String nomNivelServicio) {
		this.nomNivelServicio = nomNivelServicio;
	}

	public java.util.Set<FepirUnidadMedica> getFepirUnidadMedicas() {
		return fepirUnidadMedicas;
	}

	public void setFepirUnidadMedicas(java.util.Set<FepirUnidadMedica> fepirUnidadMedicas) {
		this.fepirUnidadMedicas = fepirUnidadMedicas;
	}


	@Override
	public String toString() {
		return "FepirCatNivelServicio [cveNivelServicio=" + cveNivelServicio + ", nomNivelServicio=" + nomNivelServicio
				+ ", fepirUnidadMedicas=" + fepirUnidadMedicas + "]";
	}

	

}
