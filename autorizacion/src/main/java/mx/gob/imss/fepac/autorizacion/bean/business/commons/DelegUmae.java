package mx.gob.imss.fepac.autorizacion.bean.business.commons;

import java.io.Serializable;



public class DelegUmae implements Serializable {
	
	
	private String nomDelegUmae;
	
	private String cveConcat;
	
	
	public DelegUmae() {
		super();
	}


	public DelegUmae(String nomDelegUmae, String cveConcat) {
		super();
	
		this.nomDelegUmae = nomDelegUmae;
		this.cveConcat = cveConcat;
	}


	public String getNomDelegUmae() {
		return nomDelegUmae;
	}


	public void setNomDelegUmae(String nomDelegUmae) {
		this.nomDelegUmae = nomDelegUmae;
	}


	public String getCveConcat() {
		return cveConcat;
	}


	public void setCveConcat(String cveConcat) {
		this.cveConcat = cveConcat;
	}


	@Override
	public String toString() {
		return "DelegUmae [nomDelegUmae=" + nomDelegUmae + ", cveConcat=" + cveConcat + "]";
	}



	
	

}
