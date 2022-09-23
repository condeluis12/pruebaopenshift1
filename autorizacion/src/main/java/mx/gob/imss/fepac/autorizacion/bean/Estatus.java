package mx.gob.imss.fepac.autorizacion.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



public class Estatus {
	
	private Integer idEstatus;
	
	private String cveEstatus;
	
	private String nomEstatus;
	
	private String usrUpdReg;
	
	private String fecUsrUpdReg;
	public Estatus() {
		super();
	}
	public Estatus(Integer idEstatus, String cveEstatus, String nomEstatus, String usrUpdReg, String fecUsrUpdReg) {
		super();
		this.idEstatus = idEstatus;
		this.cveEstatus = cveEstatus;
		this.nomEstatus = nomEstatus;
		this.usrUpdReg = usrUpdReg;
		this.fecUsrUpdReg = fecUsrUpdReg;
	}
	public Estatus(String cveEstatus, String nomEstatus, String usrUpdReg, String fecUsrUpdReg) {
		super();
		this.cveEstatus = cveEstatus;
		this.nomEstatus = nomEstatus;
		this.usrUpdReg = usrUpdReg;
		this.fecUsrUpdReg = fecUsrUpdReg;
	}
	public Integer getIdEstatus() {
		return idEstatus;
	}
	public void setIdEstatus(Integer idEstatus) {
		this.idEstatus = idEstatus;
	}
	public String getCveEstatus() {
		return cveEstatus;
	}
	public void setCveEstatus(String cveEstatus) {
		this.cveEstatus = cveEstatus;
	}
	public String getNomEstatus() {
		return nomEstatus;
	}
	public void setNomEstatus(String nomEstatus) {
		this.nomEstatus = nomEstatus;
	}
	public String getUsrUpdReg() {
		return usrUpdReg;
	}
	public void setUsrUpdReg(String usrUpdReg) {
		this.usrUpdReg = usrUpdReg;
	}
	public String getFecUsrUpdReg() {
		return fecUsrUpdReg;
	}
	public void setFecUsrUpdReg(String fecUsrUpdReg) {
		this.fecUsrUpdReg = fecUsrUpdReg;
	}
	@Override
	public String toString() {
		return "Estatus [idEstatus=" + idEstatus + ", cveEstatus=" + cveEstatus + ", nomEstatus=" + nomEstatus
				+ ", usrUpdReg=" + usrUpdReg + ", fecUsrUpdReg=" + fecUsrUpdReg + "]";
	}
	
	

}
