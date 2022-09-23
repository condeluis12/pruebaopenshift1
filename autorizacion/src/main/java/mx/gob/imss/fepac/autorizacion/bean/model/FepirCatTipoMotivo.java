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
@Table(name="FEPIR_CAT_TIPO_MOTIVO")
public class FepirCatTipoMotivo implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_TIPO_MOTIVO", nullable = false)
	private Long cveTipoMotivo;
	@Column(name = "NOM_TIPO_MOTIVO", nullable = false)
	private String nomTipoMotivo;
	@OneToMany( mappedBy="fepirCatTipoMotivo", cascade = CascadeType.ALL)
	private java.util.Set<FepirFolioFepac> fepirFolioFepacs;

	public FepirCatTipoMotivo() {
		super();
	}

	

	public FepirCatTipoMotivo(Long cveTipoMotivo, String nomTipoMotivo, Set<FepirFolioFepac> fepirFolioFepacs) {
		super();
		this.cveTipoMotivo = cveTipoMotivo;
		this.nomTipoMotivo = nomTipoMotivo;
		this.fepirFolioFepacs = fepirFolioFepacs;
	}

	

	public Long getCveTipoMotivo() {
		return cveTipoMotivo;
	}

	public void setCveTipoMotivo(Long cveTipoMotivo) {
		this.cveTipoMotivo = cveTipoMotivo;
	}

	public String getNomTipoMotivo() {
		return nomTipoMotivo;
	}

	public void setNomTipoMotivo(String nomTipoMotivo) {
		this.nomTipoMotivo = nomTipoMotivo;
	}

	public java.util.Set<FepirFolioFepac> getFepirFolioFepacs() {
		return fepirFolioFepacs;
	}

	public void setFepirFolioFepacs(java.util.Set<FepirFolioFepac> fepirFolioFepacs) {
		this.fepirFolioFepacs = fepirFolioFepacs;
	}



	@Override
	public String toString() {
		return "FepirCatTipoMotivo [cveTipoMotivo=" + cveTipoMotivo + ", nomTipoMotivo=" + nomTipoMotivo
				+ ", fepirFolioFepacs=" + fepirFolioFepacs + "]";
	}

	

}
