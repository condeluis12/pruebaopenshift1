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
@Table(name = "FEPIR_ACCION_ADMON")
public class FepirAccionAdmon implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ACCION_ADMON")
	private Long idAccionAdmon;
	@Column(name = "DESC_ACCION_ADMON")
	private String descAccionAdmon;
	@OneToMany( mappedBy = "FepirAccionAdmon", cascade = CascadeType.ALL)
	private java.util.Set<FepirHistoricoAdmon> fepirHistoricoAdmon;
	public FepirAccionAdmon(Long idAccionAdmon, String descAccionAdmon, Set<FepirHistoricoAdmon> fepirHistoricoAdmon) {
		super();
		this.idAccionAdmon = idAccionAdmon;
		this.descAccionAdmon = descAccionAdmon;
		this.fepirHistoricoAdmon = fepirHistoricoAdmon;
	}
	public FepirAccionAdmon() {
		super();
	}
	public Long getIdAccionAdmon() {
		return idAccionAdmon;
	}
	public void setIdAccionAdmon(Long idAccionAdmon) {
		this.idAccionAdmon = idAccionAdmon;
	}
	public String getDescAccionAdmon() {
		return descAccionAdmon;
	}
	public void setDescAccionAdmon(String descAccionAdmon) {
		this.descAccionAdmon = descAccionAdmon;
	}
	public java.util.Set<FepirHistoricoAdmon> getFepirHistoricoAdmon() {
		return fepirHistoricoAdmon;
	}
	public void setFepirHistoricoAdmon(java.util.Set<FepirHistoricoAdmon> fepirHistoricoAdmon) {
		this.fepirHistoricoAdmon = fepirHistoricoAdmon;
	}
	@Override
	public String toString() {
		return "FepirAccionAdmon [idAccionAdmon=" + idAccionAdmon + ", descAccionAdmon=" + descAccionAdmon
				+ ", fepirHistoricoAdmon=" + fepirHistoricoAdmon + "]";
	}

	
}
