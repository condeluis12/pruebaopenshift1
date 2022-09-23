package mx.gob.imss.fepac.autorizacion.bean.business.commons;

import java.io.Serializable;


public class Profile implements Serializable {

	
	Long cvePerfil;
	String nomPerfil;
	
	public Long getCvePerfil() {
		return cvePerfil;
	}
	
	public void setCvePerfil(Long cvePerfil) {
		this.cvePerfil = cvePerfil;
	}
	
	public String getNomPerfil() {
		return nomPerfil;
	}
	
	public void setNomPerfil(String nomPerfil) {
		this.nomPerfil = nomPerfil;
	}
	
	public String toString(){
		return ( "cvePerfil " + this.cvePerfil +" nomPerfil " + this.nomPerfil );
	}
	
	public Profile(){
		
	}
	
	public Profile( Long cvePerfil, String nomPerfil){
		super();
		this.cvePerfil = cvePerfil;
		this.nomPerfil = nomPerfil;
	}
	
	
}