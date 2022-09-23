package mx.gob.imss.fepac.autorizacion.bean.business.commons;

import java.io.Serializable;



public class DatosTransferencia implements Serializable {
	

	String delegacionOrigen;
	
	String delegacionDestino;
	
	String fechaTraspaso;
	
	String folioOficio;

	String serieFolioInicial;

	String serieFolioFinal;
	

	public DatosTransferencia() {
		super();
	}


	public DatosTransferencia(String delegacionOrigen, String delegacionDestino, String fechaTraspaso,
			String folioOficio, String serieFolioInicial, String serieFolioFinal) {
		super();
		this.delegacionOrigen = delegacionOrigen;
		this.delegacionDestino = delegacionDestino;
		this.fechaTraspaso = fechaTraspaso;
		this.folioOficio = folioOficio;
		this.serieFolioInicial = serieFolioInicial;
		this.serieFolioFinal = serieFolioFinal;
	}


	public String getDelegacionOrigen() {
		return delegacionOrigen;
	}


	public void setDelegacionOrigen(String delegacionOrigen) {
		this.delegacionOrigen = delegacionOrigen;
	}


	public String getDelegacionDestino() {
		return delegacionDestino;
	}


	public void setDelegacionDestino(String delegacionDestino) {
		this.delegacionDestino = delegacionDestino;
	}


	public String getFechaTraspaso() {
		return fechaTraspaso;
	}


	public void setFechaTraspaso(String fechaTraspaso) {
		this.fechaTraspaso = fechaTraspaso;
	}


	public String getFolioOficio() {
		return folioOficio;
	}


	public void setFolioOficio(String folioOficio) {
		this.folioOficio = folioOficio;
	}


	public String getSerieFolioInicial() {
		return serieFolioInicial;
	}


	public void setSerieFolioInicial(String serieFolioInicial) {
		this.serieFolioInicial = serieFolioInicial;
	}


	public String getSerieFolioFinal() {
		return serieFolioFinal;
	}


	public void setSerieFolioFinal(String serieFolioFinal) {
		this.serieFolioFinal = serieFolioFinal;
	}


	@Override
	public String toString() {
		return "DatosTransferencia [delegacionOrigen=" + delegacionOrigen + ", delegacionDestino=" + delegacionDestino
				+ ", fechaTraspaso=" + fechaTraspaso + ", folioOficio=" + folioOficio + ", serieFolioInicial="
				+ serieFolioInicial + ", serieFolioFinal=" + serieFolioFinal + "]";
	}
	
	
}
