package mx.gob.imss.fepac.autorizacion.bean;

import javax.persistence.Column;

public class Usuariorespond {

	private Long cveDelegacion;

	private String nomDelegacion;

	public Usuariorespond(Long cveDelegacion, String nomDelegacion) {
		super();
		this.cveDelegacion = cveDelegacion;
		this.nomDelegacion = nomDelegacion;
	}

	public Usuariorespond() {
		super();
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

	@Override
	public String toString() {
		return "Usuariorespond [cveDelegacion=" + cveDelegacion + ", nomDelegacion=" + nomDelegacion + "]";
	}
	
	

}
