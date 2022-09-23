package mx.gob.imss.fepac.autorizacion.bean;

import java.io.Serializable;



public class Perfil implements Serializable {
	
	
	private String cvePerfil;
	
	private String cvePerfilAutoriza;

	private String nomPerfil;
	public Perfil() {
		super();
	}
	
	public Perfil(String cvePerfil, String cvePerfilAutoriza, String nomPerfil) {
		super();
		this.cvePerfil = cvePerfil;
		this.cvePerfilAutoriza = cvePerfilAutoriza;
		this.nomPerfil = nomPerfil;
	}
	
	public String getCvePerfil() {
		return cvePerfil;
	}
	public void setCvePerfil(String cvePerfil) {
		this.cvePerfil = cvePerfil;
	}
	public String getCvePerfilAutoriza() {
		return cvePerfilAutoriza;
	}
	public void setCvePerfilAutoriza(String cvePerfilAutoriza) {
		this.cvePerfilAutoriza = cvePerfilAutoriza;
	}
	public String getNomPerfil() {
		return nomPerfil;
	}
	public void setNomPerfil(String nomPerfil) {
		this.nomPerfil = nomPerfil;
	}

	@Override
	public String toString() {
		return "Perfil [cvePerfil=" + cvePerfil + ", cvePerfilAutoriza=" + cvePerfilAutoriza + ", nomPerfil="
				+ nomPerfil + "]";
	}
	
	

}
