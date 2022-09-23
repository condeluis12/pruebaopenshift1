package mx.gob.imss.fepac.autorizacion.bean.business.commons;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;



public class UsuarioConsulta implements Serializable {

	
	private String matricula;
	private String apPaterno;
	private String apMaterno;
	private String nombre;
	private String nombrePerfil;
	private Long cveDelegacion;
	private Long cvePerfil;
	private java.util.Date fecAlta;
	private java.util.Date fecBaja;
	private String fecAltaStr;
	private String fecBajaStr;
	private String cip;
	private String delegacion;
	private String nomDelegacion;
	private String cvePresupuestal;	
	private String nomUnidadMedica;
	private String password;
	

	
public UsuarioConsulta(String matricula , String apPaterno, String apMaterno, String nombre, Long cvePerfil, java.util.Date fecAlta, java.util.Date fecBaja,String cip,Long cveDelegacion,String nombreDelegacion,String cvePresupuestal,String password){
		super();
		this.matricula = matricula;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.nombre = nombre;
		this.cvePerfil = cvePerfil;	
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");		
		String strFecha = formato.format(fecAlta);	
		this.fecAltaStr = strFecha;		
		
		this.fecAlta = fecAlta;
		this.fecBaja = fecBaja;
		this.cip = cip;
		this.cveDelegacion = cveDelegacion;
		this.delegacion = Long.toString(cveDelegacion);
		this.nomDelegacion = nombreDelegacion;
		this.cvePresupuestal = cvePresupuestal;	
		this.password=password;
		//this.nomUnidadMedica = nomUnidadMedica;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNomUnidadMedica() {
		return nomUnidadMedica;
	}
	public void setNomUnidadMedica(String nomUnidadMedica) {
		this.nomUnidadMedica = nomUnidadMedica;
	}
	public String getDelegacion() {
		return delegacion;
	}
	public void setDelegacion(String delegacion) {
		this.delegacion = delegacion;
	}
	public String getCip() {
		return cip;
	}
	public void setCip(String cip) {
		this.cip = cip;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
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
	public String getNombrePerfil() {
		return nombrePerfil;
	}
	public void setNombrePerfil(String nombrePerfil) {
		this.nombrePerfil = nombrePerfil;
	}
	public java.util.Date getFecAlta() {
		return fecAlta;
	}
	public void setFecAlta(java.util.Date fechAlta) {
		this.fecAlta = fechAlta;
	}
	public java.util.Date getFecBaja() {
		return fecBaja;
	}
	public void setFecBaja(java.util.Date fechBaja) {
		this.fecBaja = fechBaja;
	}
	
	public Long getCvePerfil() {
		return cvePerfil;
	}
	public void setCvePerfil(Long cvePerfil) {
		this.cvePerfil = cvePerfil;
	}
	
	public Long getCveDelegacion() {
		return cveDelegacion;
	}
	
	public void setCveDelegacion(Long cveDelegacion) {
		this.cveDelegacion = cveDelegacion;
	}
	
	public String getFecAltaStr() {
		return fecAltaStr;
	}
	
	public void setFecAltaStr(String fecAltaStr) {
		this.fecAltaStr = fecAltaStr;
	}
	
	public String getFecBajaStr() {
		return fecBajaStr;
	}
	
	public void setFecBajaStr(String fecBajaStr) {
		this.fecBajaStr = fecBajaStr;
	}
	
	
	public UsuarioConsulta(String matricula, String apPaterno, String apMaterno,
			String nombre, String nombrePerfil,java.util.Date fecAlta,java.util.Date fecBaja) {
		super();
		this.matricula = matricula;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.nombre = nombre;
		this.nombrePerfil = nombrePerfil;
		this.fecAlta = fecAlta;
		this.fecAltaStr = this.fecAlta.toString();
		this.fecBaja = fecBaja;
		this.fecBajaStr = this.fecBaja.toString();
	}	
	 
	public UsuarioConsulta(String matricula , String apPaterno, String apMaterno, String nombre, Long cvePerfil, String nombrePerfil, java.util.Date fecAlta, java.util.Date fecBaja, Long cveDelegacion){
		super();
		this.matricula = matricula;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.nombre = nombre;
		this.cvePerfil = cvePerfil;
		this.nombrePerfil = nombrePerfil;
		this.fecAlta = fecAlta;
		this.fecBaja = fecBaja;
		this.cveDelegacion = cveDelegacion;
	}
	
	public UsuarioConsulta(String matricula , String apPaterno, String apMaterno, String nombre, Long cvePerfil, String nombrePerfil, java.util.Date fecAlta, java.util.Date fecBaja, Long cveDelegacion ,String cvePresupuestal){
		super();
		this.matricula = matricula;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.nombre = nombre;
		this.cvePerfil = cvePerfil;
		this.nombrePerfil = nombrePerfil;
		this.fecAlta = fecAlta;
		this.fecBaja = fecBaja;
		this.cveDelegacion = cveDelegacion;
		this.cvePresupuestal = cvePresupuestal;
	}
	
	/**
	 * Constructor agregado para CU 16 Modificacion de Usuario
	 * @param matricula
	 * @param apPaterno
	 * @param apMaterno
	 * @param nombre
	 * @param cvePerfil
	 * @param fecAlta
	 * @param fecBaja
	 * @param cip
	 * @param cveDelegacion	
	 */	
	public UsuarioConsulta(String matricula , String apPaterno, String apMaterno, String nombre, Long cvePerfil, java.util.Date fecAlta, java.util.Date fecBaja,String cip,Long cveDelegacion,String nombreDelegacion,String cvePresupuestal){
		super();
		this.matricula = matricula;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.nombre = nombre;
		this.cvePerfil = cvePerfil;	
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");		
		String strFecha = formato.format(fecAlta);	
		this.fecAltaStr = strFecha;		
		
		this.fecAlta = fecAlta;
		this.fecBaja = fecBaja;
		this.cip = cip;
		this.cveDelegacion = cveDelegacion;
		this.delegacion = Long.toString(cveDelegacion);
		this.nomDelegacion = nombreDelegacion;
		this.cvePresupuestal = cvePresupuestal;		
		//this.nomUnidadMedica = nomUnidadMedica;
	}
	
	public UsuarioConsulta(String matricula , String apPaterno, String apMaterno, String nombre, Long cvePerfil, java.util.Date fecAlta, java.util.Date fecBaja,String cip,Long cveDelegacion,String nomDelegacion)
	{
		super();
		this.matricula = matricula;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.nombre = nombre;
		this.cvePerfil = cvePerfil;		
		this.fecAlta = fecAlta;
		this.fecBaja = fecBaja;
		this.cip = cip;
		this.cveDelegacion = cveDelegacion;
		this.delegacion = Long.toString(cveDelegacion);
		this.nomDelegacion = nomDelegacion;
		
		
	}

	
	public UsuarioConsulta() {
		
	}
	
	public String toString(){
		return ( "matricula "+ this.matricula + " apPaterno " + this.apPaterno + " apMaterno " + this.apMaterno + " nombre " + this.nombre +
				" nombrePerfil " + this.nombrePerfil + " cvePerfil " + this.cvePerfil + " fechaAlta " + this.fecAlta + "-" + this.fecAltaStr +" fechaBaja " + this.fecBaja + "-" + this.fecBajaStr + " cveDelegacion " + cveDelegacion );
	}
	public String getCvePresupuestal() {
		return cvePresupuestal;
	}
	public void setCvePresupuestal(String cvePresupuestal) {
		this.cvePresupuestal = cvePresupuestal;
	}
	public String getNomDelegacion() {
		return nomDelegacion;
	}
	public void setNomDelegacion(String nomDelegacion) {
		this.nomDelegacion = nomDelegacion;
	}

	
	

}
