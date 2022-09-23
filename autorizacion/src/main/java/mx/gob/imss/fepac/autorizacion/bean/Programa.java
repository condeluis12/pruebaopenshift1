package mx.gob.imss.fepac.autorizacion.bean;

import java.io.Serializable;



public class Programa implements Serializable {
	
	
	private int cvePrograma;
	
	private String nomPrograma;
	
	private int programa;
	
	private String detalle;
	public Programa() {
		super();
	}
	
	public Programa(int cvePrograma, String nomPrograma, int programa, String detalle) {
		super();
		this.cvePrograma = cvePrograma;
		this.nomPrograma = nomPrograma;
		this.programa = programa;
		this.detalle = detalle;
	}
	
	public int getCvePrograma() {
		return cvePrograma;
	}
	public void setCvePrograma(int cvePrograma) {
		this.cvePrograma = cvePrograma;
	}
	public String getNomPrograma() {
		return nomPrograma;
	}
	public void setNomPrograma(String nomPrograma) {
		this.nomPrograma = nomPrograma;
	}
	public int getPrograma() {
		return programa;
	}
	public void setPrograma(int programa) {
		this.programa = programa;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Programa [cvePrograma=" + cvePrograma + ", nomPrograma=" + nomPrograma + ", programa=" + programa
				+ ", detalle=" + detalle + "]";
	}
	
	
	


}
