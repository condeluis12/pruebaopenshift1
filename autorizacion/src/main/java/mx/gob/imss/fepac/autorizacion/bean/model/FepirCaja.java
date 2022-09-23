package mx.gob.imss.fepac.autorizacion.bean.model;


import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="FEPIR_CAJA")
public class FepirCaja implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_CAJA_BLOCK", nullable = false)
	private String cveCajaBlock;
	@Column(name = "FEC_USR_UPD_REG", nullable = false)
	private java.sql.Date fecUsrUpdReg;
	@Column(name = "USR_UPD_REG", nullable = false)
	private String usrUpdReg;
	@OneToMany(mappedBy="fepirCaja", cascade = CascadeType.ALL)
	private java.util.Set<FepirBlocksCaja> fepirBlocksCajas;

	public FepirCaja() {
		super();
	}

	public FepirCaja(String cveCajaBlock, Date fecUsrUpdReg, String usrUpdReg,
			Set<FepirBlocksCaja> fepirBlocksCajas) {
		super();
		this.cveCajaBlock = cveCajaBlock;
		this.fecUsrUpdReg = fecUsrUpdReg;
		this.usrUpdReg = usrUpdReg;
		this.fepirBlocksCajas = fepirBlocksCajas;
	}

	public String getCveCajaBlock() {
		return cveCajaBlock;
	}

	public void setCveCajaBlock(String cveCajaBlock) {
		this.cveCajaBlock = cveCajaBlock;
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

	public java.util.Set<FepirBlocksCaja> getFepirBlocksCajas() {
		return fepirBlocksCajas;
	}

	public void setFepirBlocksCajas(java.util.Set<FepirBlocksCaja> fepirBlocksCajas) {
		this.fepirBlocksCajas = fepirBlocksCajas;
	}

	@Override
	public String toString() {
		return "FepirCaja [cveCajaBlock=" + cveCajaBlock + ", fecUsrUpdReg=" + fecUsrUpdReg + ", usrUpdReg=" + usrUpdReg
				+ ", fepirBlocksCajas=" + fepirBlocksCajas + "]";
	}

	

}
