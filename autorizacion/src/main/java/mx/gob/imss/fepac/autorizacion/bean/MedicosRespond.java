package mx.gob.imss.fepac.autorizacion.bean;

import java.util.Date;

public class MedicosRespond {
	private String cveUsuario;
	private String apPaterno;
	private String apMaterno;
	private String nombre;
	private java.util.Date fecAlta;
	public MedicosRespond() {
		super();
	}
	public MedicosRespond(String cveUsuario, String apPaterno, String apMaterno, String nombre, Date fecAlta) {
		super();
		this.cveUsuario = cveUsuario;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.nombre = nombre;
		this.fecAlta = fecAlta;
	}
	public String getCveUsuario() {
		return cveUsuario;
	}
	public void setCveUsuario(String cveUsuario) {
		this.cveUsuario = cveUsuario;
	}
	public String getApPaterno() {
		return apPaterno;
	}
	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}
	public String getApMaterno() {
		return apMaterno;
	}
	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public java.util.Date getFecAlta() {
		return fecAlta;
	}
	public void setFecAlta(java.util.Date fecAlta) {
		this.fecAlta = fecAlta;
	}
	@Override
	public String toString() {
		return "MedicosRespond [cveUsuario=" + cveUsuario + ", apPaterno=" + apPaterno + ", apMaterno=" + apMaterno
				+ ", nombre=" + nombre + ", fecAlta=" + fecAlta + "]";
	}
	
}
