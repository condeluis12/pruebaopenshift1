 package mx.gob.imss.fepac.autorizacion.bean;

import java.io.Serializable;


public class Usuario implements Serializable {
	
	
	
	 private String cveUsuario;
	
	   private String apPaterno;
	
	    private String apMaterno;
	
	    private String nombre;
	
	    private String cip;
	
	    private String cvePerfil;
	
	    private String nombrePerfil;
	
	    private String cveEstatus;
	
	    private String nombreEstatus;
	
	    private String cveDelegacion;

	    private String nombreDelegacion;
	
	    private String fechaAlta;
	
	    private String fechaBaja;
	
	    private String usrUpdReg;
	
		private String fecUsrUpdReg;
	
	    private String cvePresupuestal;

		private String nombreUnidadMedica;

		private String numeroUnidadMedica;
	    
	   
	    private boolean listarDeleg;
	
	    private boolean listarUM;
	
		private boolean altaUM;

		private boolean altaUsr;
	
		private boolean altaMedicos;
		
		private String password;
	    //Fecha del servidor del dia de hoy
	
		private String fechaHoydelServidor;
		
	public Usuario() {
			super();
		}

	

	public Usuario(String cveUsuario, String apPaterno, String apMaterno, String nombre, String cip, String cvePerfil,
			String nombrePerfil, String cveEstatus, String nombreEstatus, String cveDelegacion, String nombreDelegacion,
			String fechaAlta, String fechaBaja, String usrUpdReg, String fecUsrUpdReg, String cvePresupuestal,
			String nombreUnidadMedica, String numeroUnidadMedica, boolean listarDeleg, boolean listarUM, boolean altaUM,
			boolean altaUsr, boolean altaMedicos, String fechaHoydelServidor) {
		super();
		this.cveUsuario = cveUsuario;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.nombre = nombre;
		this.cip = cip;
		this.cvePerfil = cvePerfil;
		this.nombrePerfil = nombrePerfil;
		this.cveEstatus = cveEstatus;
		this.nombreEstatus = nombreEstatus;
		this.cveDelegacion = cveDelegacion;
		this.nombreDelegacion = nombreDelegacion;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.usrUpdReg = usrUpdReg;
		this.fecUsrUpdReg = fecUsrUpdReg;
		this.cvePresupuestal = cvePresupuestal;
		this.nombreUnidadMedica = nombreUnidadMedica;
		this.numeroUnidadMedica = numeroUnidadMedica;
		this.listarDeleg = listarDeleg;
		this.listarUM = listarUM;
		this.altaUM = altaUM;
		this.altaUsr = altaUsr;
		this.altaMedicos = altaMedicos;
		this.fechaHoydelServidor = fechaHoydelServidor;
	}
	
	
	

	public Usuario(String cveUsuario, String apPaterno, String apMaterno, String nombre, String cip, String cvePerfil,
			String nombrePerfil, String cveEstatus, String nombreEstatus, String cveDelegacion, String nombreDelegacion,
			String fechaAlta, String fechaBaja, String usrUpdReg, String fecUsrUpdReg, String cvePresupuestal,
			String nombreUnidadMedica, String numeroUnidadMedica, boolean listarDeleg, boolean listarUM, boolean altaUM,
			boolean altaUsr, boolean altaMedicos, String password, String fechaHoydelServidor) {
		super();
		this.cveUsuario = cveUsuario;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.nombre = nombre;
		this.cip = cip;
		this.cvePerfil = cvePerfil;
		this.nombrePerfil = nombrePerfil;
		this.cveEstatus = cveEstatus;
		this.nombreEstatus = nombreEstatus;
		this.cveDelegacion = cveDelegacion;
		this.nombreDelegacion = nombreDelegacion;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.usrUpdReg = usrUpdReg;
		this.fecUsrUpdReg = fecUsrUpdReg;
		this.cvePresupuestal = cvePresupuestal;
		this.nombreUnidadMedica = nombreUnidadMedica;
		this.numeroUnidadMedica = numeroUnidadMedica;
		this.listarDeleg = listarDeleg;
		this.listarUM = listarUM;
		this.altaUM = altaUM;
		this.altaUsr = altaUsr;
		this.altaMedicos = altaMedicos;
		this.password = password;
		this.fechaHoydelServidor = fechaHoydelServidor;
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

	public String getCip() {
		return cip;
	}

	public void setCip(String cip) {
		this.cip = cip;
	}

	public String getCvePerfil() {
		return cvePerfil;
	}

	public void setCvePerfil(String cvePerfil) {
		this.cvePerfil = cvePerfil;
	}

	public String getNombrePerfil() {
		return nombrePerfil;
	}

	public void setNombrePerfil(String nombrePerfil) {
		this.nombrePerfil = nombrePerfil;
	}

	public String getCveEstatus() {
		return cveEstatus;
	}

	public void setCveEstatus(String cveEstatus) {
		this.cveEstatus = cveEstatus;
	}

	public String getNombreEstatus() {
		return nombreEstatus;
	}

	public void setNombreEstatus(String nombreEstatus) {
		this.nombreEstatus = nombreEstatus;
	}

	public String getCveDelegacion() {
		return cveDelegacion;
	}

	public void setCveDelegacion(String cveDelegacion) {
		this.cveDelegacion = cveDelegacion;
	}

	public String getNombreDelegacion() {
		return nombreDelegacion;
	}

	public void setNombreDelegacion(String nombreDelegacion) {
		this.nombreDelegacion = nombreDelegacion;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(String fechaBaja) {
		this.fechaBaja = fechaBaja;
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

	public String getCvePresupuestal() {
		return cvePresupuestal;
	}

	public void setCvePresupuestal(String cvePresupuestal) {
		this.cvePresupuestal = cvePresupuestal;
	}

	public String getNombreUnidadMedica() {
		return nombreUnidadMedica;
	}

	public void setNombreUnidadMedica(String nombreUnidadMedica) {
		this.nombreUnidadMedica = nombreUnidadMedica;
	}

	public String getNumeroUnidadMedica() {
		return numeroUnidadMedica;
	}

	public void setNumeroUnidadMedica(String numeroUnidadMedica) {
		this.numeroUnidadMedica = numeroUnidadMedica;
	}

	public boolean isListarDeleg() {
		return listarDeleg;
	}

	public void setListarDeleg(boolean listarDeleg) {
		this.listarDeleg = listarDeleg;
	}

	public boolean isListarUM() {
		return listarUM;
	}

	public void setListarUM(boolean listarUM) {
		this.listarUM = listarUM;
	}

	public boolean isAltaUM() {
		return altaUM;
	}

	public void setAltaUM(boolean altaUM) {
		this.altaUM = altaUM;
	}

	public boolean isAltaUsr() {
		return altaUsr;
	}

	public void setAltaUsr(boolean altaUsr) {
		this.altaUsr = altaUsr;
	}

	public boolean isAltaMedicos() {
		return altaMedicos;
	}

	public void setAltaMedicos(boolean altaMedicos) {
		this.altaMedicos = altaMedicos;
	}

	public String getFechaHoydelServidor() {
		return fechaHoydelServidor;
	}

	public void setFechaHoydelServidor(String fechaHoydelServidor) {
		this.fechaHoydelServidor = fechaHoydelServidor;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "Usuario [cveUsuario=" + cveUsuario + ", apPaterno=" + apPaterno + ", apMaterno=" + apMaterno
				+ ", nombre=" + nombre + ", cip=" + cip + ", cvePerfil=" + cvePerfil + ", nombrePerfil=" + nombrePerfil
				+ ", cveEstatus=" + cveEstatus + ", nombreEstatus=" + nombreEstatus + ", cveDelegacion=" + cveDelegacion
				+ ", nombreDelegacion=" + nombreDelegacion + ", fechaAlta=" + fechaAlta + ", fechaBaja=" + fechaBaja
				+ ", usrUpdReg=" + usrUpdReg + ", fecUsrUpdReg=" + fecUsrUpdReg + ", cvePresupuestal=" + cvePresupuestal
				+ ", nombreUnidadMedica=" + nombreUnidadMedica + ", numeroUnidadMedica=" + numeroUnidadMedica
				+ ", listarDeleg=" + listarDeleg + ", listarUM=" + listarUM + ", altaUM=" + altaUM + ", altaUsr="
				+ altaUsr + ", altaMedicos=" + altaMedicos + ", fechaHoydelServidor=" + fechaHoydelServidor + "]";
	}

	

	
	
	
	

}
