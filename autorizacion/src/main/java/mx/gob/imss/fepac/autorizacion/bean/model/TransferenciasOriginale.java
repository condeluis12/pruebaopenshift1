package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;


public class TransferenciasOriginale   implements Serializable {

	

	private Long cveDelegacion;

	private String cvePresupuestal;

	private String matricula;

	private String nomDelegacion;

	private String nomMedico;

	private String nomUnidadMedica;
	
	private String numFolio;
	
	private Long programa;

	public TransferenciasOriginale() {
		super();
	}

	
	public TransferenciasOriginale(Long cveDelegacion, String cvePresupuestal, String matricula,
			String nomDelegacion, String nomMedico, String nomUnidadMedica, String numFolio, Long programa) {
		super();
		this.cveDelegacion = cveDelegacion;
		this.cvePresupuestal = cvePresupuestal;
		this.matricula = matricula;
		this.nomDelegacion = nomDelegacion;
		this.nomMedico = nomMedico;
		this.nomUnidadMedica = nomUnidadMedica;
		this.numFolio = numFolio;
		this.programa = programa;
	}

	

	public Long getCveDelegacion() {
		return cveDelegacion;
	}

	public void setCveDelegacion(Long cveDelegacion) {
		this.cveDelegacion = cveDelegacion;
	}

	public String getCvePresupuestal() {
		return cvePresupuestal;
	}

	public void setCvePresupuestal(String cvePresupuestal) {
		this.cvePresupuestal = cvePresupuestal;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNomDelegacion() {
		return nomDelegacion;
	}

	public void setNomDelegacion(String nomDelegacion) {
		this.nomDelegacion = nomDelegacion;
	}

	public String getNomMedico() {
		return nomMedico;
	}

	public void setNomMedico(String nomMedico) {
		this.nomMedico = nomMedico;
	}

	public String getNomUnidadMedica() {
		return nomUnidadMedica;
	}

	public void setNomUnidadMedica(String nomUnidadMedica) {
		this.nomUnidadMedica = nomUnidadMedica;
	}

	public String getNumFolio() {
		return numFolio;
	}

	public void setNumFolio(String numFolio) {
		this.numFolio = numFolio;
	}

	public Long getPrograma() {
		return programa;
	}

	public void setPrograma(Long programa) {
		this.programa = programa;
	}


	@Override
	public String toString() {
		return "TransferenciasOriginale [cveDelegacion=" + cveDelegacion + ", cvePresupuestal=" + cvePresupuestal
				+ ", matricula=" + matricula + ", nomDelegacion=" + nomDelegacion + ", nomMedico=" + nomMedico
				+ ", nomUnidadMedica=" + nomUnidadMedica + ", numFolio=" + numFolio + ", programa=" + programa + "]";
	}

	

}
