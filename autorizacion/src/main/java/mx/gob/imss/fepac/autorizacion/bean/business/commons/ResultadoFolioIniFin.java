package mx.gob.imss.fepac.autorizacion.bean.business.commons;

import java.io.Serializable;



public class ResultadoFolioIniFin implements Serializable {
	
	
	private String serieini;
	private String seriefin;
	private long cantFolios;
	
	public ResultadoFolioIniFin(){
		super();
	}
	
	public ResultadoFolioIniFin(String serieini, String seriefin) {
		super();
		this.serieini = serieini;
		this.seriefin = seriefin;
	}
	
	public ResultadoFolioIniFin(String serieini, String seriefin, long cantFolios) {
		super();
		this.serieini = serieini;
		this.seriefin = seriefin;
		this.cantFolios = cantFolios;
	}
	
	public long getCantFolios() {
		return cantFolios;
	}
	
	public void setCantFolios(int cantFolios) {
		this.cantFolios = cantFolios;
	}
	
	public String getSerieini() {
		return serieini;
	}
	
	public void setSerieini(String serieini) {
		this.serieini = serieini;
	}
	
	public String getSeriefin() {
		return seriefin;
	}
	
	public void setSeriefin(String seriefin) {
		this.seriefin = seriefin;
	}	
	
	
	
}
