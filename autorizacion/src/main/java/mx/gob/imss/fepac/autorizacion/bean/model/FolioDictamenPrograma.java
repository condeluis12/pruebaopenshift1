package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="FOLIO_DICTAMEN_PROGRAMA")
@IdClass(value = FolioDictamenProgramaPK.class)
public class FolioDictamenPrograma implements Serializable {

	
	@Id
	@Column(name = "CVE_DELEGACION", nullable = false)
	private Long cveDelegacion;
	@Id
	@Column(name = "CVE_PRESUPUESTAL", nullable = false)
	private String cvePresupuestal;
	@Id
	@Column(name = "PROGRAMA", nullable = false)
	private Long programa;
	@Column(name = "FEC_ASIGNACION", nullable = false)
	private java.sql.Date fecAsignacion;
	@Column(name = "FOLIO_FIN_ALMACEN", nullable = false)
	private String folioFinAlmacen;
	@Column(name = "FOLIO_INI_ALMACEN", nullable = false)
	private String folioIniAlmacen;
	@OneToMany( mappedBy="folioDictamenPrograma", cascade = CascadeType.ALL)
	private java.util.Set<FolioDictamenIncapSt> folioDictamenIncapSts;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumns({
        @JoinColumn(name="CVE_DELEGACION", referencedColumnName="CVE_DELEGACION",insertable = false,updatable = false),
        @JoinColumn(name="CVE_PRESUPUESTAL", referencedColumnName="CVE_PRESUPUESTAL",insertable = false,updatable = false),
})
	@JsonIgnore
	private FepirUnidadMedica fepirUnidadMedica;

	public FolioDictamenPrograma() {
		super();
	}

	

	public FolioDictamenPrograma(Date fecAsignacion, String folioFinAlmacen,
			String folioIniAlmacen, Set<FolioDictamenIncapSt> folioDictamenIncapSts,
			FepirUnidadMedica fepirUnidadMedica) {
		super();
		this.fecAsignacion = fecAsignacion;
		this.folioFinAlmacen = folioFinAlmacen;
		this.folioIniAlmacen = folioIniAlmacen;
		this.folioDictamenIncapSts = folioDictamenIncapSts;
		this.fepirUnidadMedica = fepirUnidadMedica;
	}

	

	public java.sql.Date getFecAsignacion() {
		return fecAsignacion;
	}

	public void setFecAsignacion(java.sql.Date fecAsignacion) {
		this.fecAsignacion = fecAsignacion;
	}

	public String getFolioFinAlmacen() {
		return folioFinAlmacen;
	}

	public void setFolioFinAlmacen(String folioFinAlmacen) {
		this.folioFinAlmacen = folioFinAlmacen;
	}

	public String getFolioIniAlmacen() {
		return folioIniAlmacen;
	}

	public void setFolioIniAlmacen(String folioIniAlmacen) {
		this.folioIniAlmacen = folioIniAlmacen;
	}

	public java.util.Set<FolioDictamenIncapSt> getFolioDictamenIncapSts() {
		return folioDictamenIncapSts;
	}

	public void setFolioDictamenIncapSts(java.util.Set<FolioDictamenIncapSt> folioDictamenIncapSts) {
		this.folioDictamenIncapSts = folioDictamenIncapSts;
	}

	public FepirUnidadMedica getFepirUnidadMedica() {
		return fepirUnidadMedica;
	}

	public void setFepirUnidadMedica(FepirUnidadMedica fepirUnidadMedica) {
		this.fepirUnidadMedica = fepirUnidadMedica;
	}



	@Override
	public String toString() {
		return "FolioDictamenPrograma [cveDelegacion=" + cveDelegacion + ", cvePresupuestal=" + cvePresupuestal
				+ ", fecAsignacion=" + fecAsignacion + ", folioFinAlmacen=" + folioFinAlmacen + ", folioIniAlmacen="
				+ folioIniAlmacen + ", folioDictamenIncapSts=" + folioDictamenIncapSts + ", fepirUnidadMedica="
				+ fepirUnidadMedica + "]";
	}



	

	

}
