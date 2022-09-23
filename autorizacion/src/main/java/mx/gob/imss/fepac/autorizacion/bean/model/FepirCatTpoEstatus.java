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
@Table(name="FEPIR_CAT_TPO_ESTATUS")
public class FepirCatTpoEstatus implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_TPO_ESTATUS", nullable = false)
	private String cveTpoEstatus;
	@Column(name = "DESC_USO_CATALOGO", nullable = false)
	private String descUsoCatalogo;
	@OneToMany( mappedBy="fepirCatTpoEstatus", cascade = CascadeType.ALL)
	private java.util.Set<FepirCatEstatusFolio> fepirCatEstatusFolios;

	public FepirCatTpoEstatus() {
		super();
	}

	public FepirCatTpoEstatus(String cveTpoEstatus, String descUsoCatalogo,
			Set<FepirCatEstatusFolio> fepirCatEstatusFolios) {
		super();
		this.cveTpoEstatus = cveTpoEstatus;
		this.descUsoCatalogo = descUsoCatalogo;
		this.fepirCatEstatusFolios = fepirCatEstatusFolios;
	}

	
	public String getCveTpoEstatus() {
		return cveTpoEstatus;
	}

	public void setCveTpoEstatus(String cveTpoEstatus) {
		this.cveTpoEstatus = cveTpoEstatus;
	}

	public String getDescUsoCatalogo() {
		return descUsoCatalogo;
	}

	public void setDescUsoCatalogo(String descUsoCatalogo) {
		this.descUsoCatalogo = descUsoCatalogo;
	}

	public java.util.Set<FepirCatEstatusFolio> getFepirCatEstatusFolios() {
		return fepirCatEstatusFolios;
	}

	public void setFepirCatEstatusFolios(java.util.Set<FepirCatEstatusFolio> fepirCatEstatusFolios) {
		this.fepirCatEstatusFolios = fepirCatEstatusFolios;
	}

	@Override
	public String toString() {
		return "FepirCatTpoEstatus [cveTpoEstatus=" + cveTpoEstatus + ", descUsoCatalogo=" + descUsoCatalogo
				+ ", fepirCatEstatusFolios=" + fepirCatEstatusFolios + "]";
	}

	

}
