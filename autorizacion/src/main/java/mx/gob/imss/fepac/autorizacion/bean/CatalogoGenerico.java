package mx.gob.imss.fepac.autorizacion.bean;

import java.io.Serializable;



public class CatalogoGenerico implements Serializable {
	
	
	
	private int id;

	private String descripcion;

	private String campoAdicional;
	
	public CatalogoGenerico() {
		super();
	}

	

	public CatalogoGenerico(int id, String descripcion, String campoAdicional) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.campoAdicional = campoAdicional;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCampoAdicional() {
		return campoAdicional;
	}

	public void setCampoAdicional(String campoAdicional) {
		this.campoAdicional = campoAdicional;
	}



	@Override
	public String toString() {
		return "CatalogoGenerico [id=" + id + ", descripcion=" + descripcion + ", campoAdicional=" + campoAdicional
				+ "]";
	}

	

	
}
