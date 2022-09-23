package mx.gob.imss.fepac.autorizacion.bean;

import java.io.Serializable;



public class Error implements Serializable {

	private Integer idError;

	private String id;
	
	private String nombre;
	
	private String descripcion;

	private String totalBlocks;
	
	private String totalFolios;
	public Error() {
		super();
	}
	public Error(Integer idError, String id, String nombre, String descripcion, String totalBlocks,
			String totalFolios) {
		super();
		this.idError = idError;
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.totalBlocks = totalBlocks;
		this.totalFolios = totalFolios;
	}
	public Error(String id, String nombre, String descripcion, String totalBlocks, String totalFolios) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.totalBlocks = totalBlocks;
		this.totalFolios = totalFolios;
	}
	public Integer getIdError() {
		return idError;
	}
	public void setIdError(Integer idError) {
		this.idError = idError;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTotalBlocks() {
		return totalBlocks;
	}
	public void setTotalBlocks(String totalBlocks) {
		this.totalBlocks = totalBlocks;
	}
	public String getTotalFolios() {
		return totalFolios;
	}
	public void setTotalFolios(String totalFolios) {
		this.totalFolios = totalFolios;
	}
	@Override
	public String toString() {
		return "Error [idError=" + idError + ", id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", totalBlocks=" + totalBlocks + ", totalFolios=" + totalFolios + "]";
	}
	
}