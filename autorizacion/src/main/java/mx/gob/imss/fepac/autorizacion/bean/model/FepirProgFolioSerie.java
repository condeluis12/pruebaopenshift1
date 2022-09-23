package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="FEPIR_PROG_FOLIO_SERIE")
@IdClass(value = FepirProgFolioSeriePK.class)
public class FepirProgFolioSerie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CVE_DELEGACION", nullable = false)
	private Long cveDelegacion;
	@Id
	@Column(name = "CVE_FOLIOS_ASIGNADOS", nullable = false)
	private Long cveFoliosAsignados;
	@Id
	@Column(name = "PROGRAMA", nullable = false)
	private Long programa;
	@Id
	@Column(name = "TRIM_PROGRAMA", nullable = false)
	private Long trimPrograma;
	
	@Column(name = "CVE_ESTATUS", nullable = false)
	private long cveEstatus;
	@Column(name = "FIN_SERIE_FOLIO", nullable = false)
	private String finSerieFolio;
	@Column(name = "INI_SERIE_FOLIO", nullable = false)
	private String iniSerieFolio;
	@Column(name = "ULTIMO_FOLIO_ASIGNADO", nullable = false)
	private String ultimoFolioAsignado;
	@ManyToOne
	@JoinColumns({
        @JoinColumn(name="PROGRAMA", referencedColumnName="PROGRAMA",insertable = false,updatable = false),
        @JoinColumn(name="TRIM_PROGRAMA", referencedColumnName="TRIM_PROGRAMA",insertable = false,updatable = false),
        @JoinColumn(name="CVE_DELEGACION", referencedColumnName="CVE_DELEGACION",insertable = false,updatable = false)
	})
	@JsonIgnore
    private FepirProgFolioIncap fepirProgFolioIncap;

	public FepirProgFolioSerie() {
		super();
	}


	public FepirProgFolioSerie(FepirProgFolioSeriePK compId, long cveEstatus, String finSerieFolio,
			String iniSerieFolio, String ultimoFolioAsignado, FepirProgFolioIncap fepirProgFolioIncap) {
		super();
		this.cveEstatus = cveEstatus;
		this.finSerieFolio = finSerieFolio;
		this.iniSerieFolio = iniSerieFolio;
		this.ultimoFolioAsignado = ultimoFolioAsignado;
		this.fepirProgFolioIncap = fepirProgFolioIncap;
	}

	

	public long getCveEstatus() {
		return cveEstatus;
	}

	public void setCveEstatus(long cveEstatus) {
		this.cveEstatus = cveEstatus;
	}

	public String getFinSerieFolio() {
		return finSerieFolio;
	}

	public void setFinSerieFolio(String finSerieFolio) {
		this.finSerieFolio = finSerieFolio;
	}

	public String getIniSerieFolio() {
		return iniSerieFolio;
	}

	public void setIniSerieFolio(String iniSerieFolio) {
		this.iniSerieFolio = iniSerieFolio;
	}

	public String getUltimoFolioAsignado() {
		return ultimoFolioAsignado;
	}

	public void setUltimoFolioAsignado(String ultimoFolioAsignado) {
		this.ultimoFolioAsignado = ultimoFolioAsignado;
	}

	public FepirProgFolioIncap getFepirProgFolioIncap() {
		return fepirProgFolioIncap;
	}

	public void setFepirProgFolioIncap(FepirProgFolioIncap fepirProgFolioIncap) {
		this.fepirProgFolioIncap = fepirProgFolioIncap;
	}


	@Override
	public String toString() {
		return "FepirProgFolioSerie [cveDelegacion=" + cveDelegacion + ", cveFoliosAsignados=" + cveFoliosAsignados
				+ ", programa=" + programa + ", trimPrograma=" + trimPrograma + ", cveEstatus=" + cveEstatus
				+ ", finSerieFolio=" + finSerieFolio + ", iniSerieFolio=" + iniSerieFolio + ", ultimoFolioAsignado="
				+ ultimoFolioAsignado + ", fepirProgFolioIncap=" + fepirProgFolioIncap + "]";
	}

	

}
