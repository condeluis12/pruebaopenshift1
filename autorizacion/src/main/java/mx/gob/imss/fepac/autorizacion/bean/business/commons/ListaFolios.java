package mx.gob.imss.fepac.autorizacion.bean.business.commons;

import java.io.Serializable;



public class ListaFolios implements Serializable {
	

	
	String serieIni;

	String serieFin;
	public ListaFolios() {
		super();
	}
	
	public ListaFolios(String serieIni, String serieFin) {
		super();
		this.serieIni = serieIni;
		this.serieFin = serieFin;
	}
	
	public String getSerieIni() {
		return serieIni;
	}
	public void setSerieIni(String serieIni) {
		this.serieIni = serieIni;
	}
	public String getSerieFin() {
		return serieFin;
	}
	public void setSerieFin(String serieFin) {
		this.serieFin = serieFin;
	}

	@Override
	public String toString() {
		return "ListaFolios [serieIni=" + serieIni + ", serieFin=" + serieFin + "]";
	}
	
	



}
