package mx.gob.imss.fepac.autorizacion.bean;

import java.io.Serializable;



public class TipoMotivo implements Serializable {
	
	
	private String claveTipoMotivo;

	private String nombreTipoMotivo;
	public TipoMotivo() {
		super();
	}
	
	public TipoMotivo(java.lang.String claveTipoMotivo, java.lang.String nombreTipoMotivo) {
		super();
		this.claveTipoMotivo = claveTipoMotivo;
		this.nombreTipoMotivo = nombreTipoMotivo;
	}
	
	public String getClaveTipoMotivo() {
		return claveTipoMotivo;
	}
	public void setClaveTipoMotivo(String claveTipoMotivo) {
		this.claveTipoMotivo = claveTipoMotivo;
	}
	public String getNombreTipoMotivo() {
		return nombreTipoMotivo;
	}
	public void setNombreTipoMotivo(String nombreTipoMotivo) {
		this.nombreTipoMotivo = nombreTipoMotivo;
	}

	@Override
	public String toString() {
		return "TipoMotivo [claveTipoMotivo=" + claveTipoMotivo + ", nombreTipoMotivo=" + nombreTipoMotivo + "]";
	}
	
	
	

}
