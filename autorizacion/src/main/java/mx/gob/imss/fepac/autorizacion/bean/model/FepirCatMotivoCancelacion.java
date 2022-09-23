package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FEPIR_CAT_MOTIVO_CANCELACION")
public class FepirCatMotivoCancelacion implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_CANCELACION", nullable = false)
	private Long cveCancelacion;
	@Column(name = "NOM_CANCELACION", nullable = false)
	private String nomCancelacion;

	public FepirCatMotivoCancelacion() {
		super();
	}

	

	public FepirCatMotivoCancelacion(Long cveCancelacion, String nomCancelacion) {
		super();
		this.cveCancelacion = cveCancelacion;
		this.nomCancelacion = nomCancelacion;
	}

	

	public Long getCveCancelacion() {
		return cveCancelacion;
	}

	public void setCveCancelacion(Long cveCancelacion) {
		this.cveCancelacion = cveCancelacion;
	}

	public String getNomCancelacion() {
		return nomCancelacion;
	}

	public void setNomCancelacion(String nomCancelacion) {
		this.nomCancelacion = nomCancelacion;
	}



	@Override
	public String toString() {
		return "FepirCatMotivoCancelacion [cveCancelacion=" + cveCancelacion + ", nomCancelacion=" + nomCancelacion
				+ "]";
	}

	

}
