package mx.gob.imss.fepac.autorizacion.bean;

import java.io.Serializable;

import javax.persistence.Column;




public class FoliosPrograma implements Serializable {
	
	
	private Integer trimestre;
	
	private String folioIni;
	
	private String folioFin;
	
	private String motivo;
	
	private String origen;
	
	private String destino;
	@Column(name = "blocks", nullable = false)
	private Integer blocks;
	public FoliosPrograma() {
		super();
	}
	
	public FoliosPrograma(java.lang.Integer trimestre, java.lang.String folioIni, java.lang.String folioFin,
			java.lang.String motivo, java.lang.String origen, java.lang.String destino, java.lang.Integer blocks) {
		super();
		this.trimestre = trimestre;
		this.folioIni = folioIni;
		this.folioFin = folioFin;
		this.motivo = motivo;
		this.origen = origen;
		this.destino = destino;
		this.blocks = blocks;
	}
	
	public Integer getTrimestre() {
		return trimestre;
	}
	public void setTrimestre(Integer trimestre) {
		this.trimestre = trimestre;
	}
	public String getFolioIni() {
		return folioIni;
	}
	public void setFolioIni(String folioIni) {
		this.folioIni = folioIni;
	}
	public String getFolioFin() {
		return folioFin;
	}
	public void setFolioFin(String folioFin) {
		this.folioFin = folioFin;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Integer getBlocks() {
		return blocks;
	}
	public void setBlocks(Integer blocks) {
		this.blocks = blocks;
	}

	@Override
	public String toString() {
		return "FoliosPrograma [trimestre=" + trimestre + ", folioIni=" + folioIni + ", folioFin=" + folioFin
				+ ", motivo=" + motivo + ", origen=" + origen + ", destino=" + destino + ", blocks=" + blocks + "]";
	}
	

	


}
