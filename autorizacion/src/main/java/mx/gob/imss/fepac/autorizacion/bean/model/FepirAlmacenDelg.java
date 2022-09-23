package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="FEPIR_ALMACEN_DELG")
@IdClass(value = FepirAlmacenDelgPK.class)
public class FepirAlmacenDelg  implements Serializable {
	@Id
	@Column(name = "CVE_DELEGACION", nullable = false)
	private Long cveDelegacion;
	@Id
	@Column(name = "CVE_PRESUP_ALMACEN", nullable = false)
	private String cvePresupAlmacen;
	
	@Column(name = "CAPACIDAD", nullable = false)
	private Long capacidad;
	@Column(name = "DIRECCION", nullable = false)
	private String direccion;
	@Column(name = "FEC_USR_UPD_REG", nullable = false)
	private java.sql.Date fecUsrUpdReg;
	@Column(name = "USR_UPD_REG", nullable = false)
	private String usrUpdReg;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name="CVE_DELEGACION",referencedColumnName="CVE_DELEGACION", insertable=false, updatable=false)
	@JsonIgnore
	private FepirCatDelegacion fepirCatDelegacion;

	public FepirAlmacenDelg() {
		super();
	}

	

	public FepirAlmacenDelg( Long capacidad, String direccion, Date fecUsrUpdReg,
			String usrUpdReg, FepirCatDelegacion fepirCatDelegacion) {
		super();
		this.capacidad = capacidad;
		this.direccion = direccion;
		this.fecUsrUpdReg = fecUsrUpdReg;
		this.usrUpdReg = usrUpdReg;
		this.fepirCatDelegacion = fepirCatDelegacion;
	}



	

	public Long getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Long capacidad) {
		this.capacidad = capacidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public java.sql.Date getFecUsrUpdReg() {
		return fecUsrUpdReg;
	}

	public void setFecUsrUpdReg(java.sql.Date fecUsrUpdReg) {
		this.fecUsrUpdReg = fecUsrUpdReg;
	}

	public String getUsrUpdReg() {
		return usrUpdReg;
	}

	public void setUsrUpdReg(String usrUpdReg) {
		this.usrUpdReg = usrUpdReg;
	}

	public FepirCatDelegacion getFepirCatDelegacion() {
		return fepirCatDelegacion;
	}

	public void setFepirCatDelegacion(FepirCatDelegacion fepirCatDelegacion) {
		this.fepirCatDelegacion = fepirCatDelegacion;
	}

	@Override
	public String toString() {
		return "FepirAlmacenDelg [cveDelegacion=" + cveDelegacion + ", cvePresupAlmacen=" + cvePresupAlmacen
				+ ", capacidad=" + capacidad + ", direccion=" + direccion + ", fecUsrUpdReg=" + fecUsrUpdReg
				+ ", usrUpdReg=" + usrUpdReg + ", fepirCatDelegacion=" + fepirCatDelegacion + "]";
	}

	

}
