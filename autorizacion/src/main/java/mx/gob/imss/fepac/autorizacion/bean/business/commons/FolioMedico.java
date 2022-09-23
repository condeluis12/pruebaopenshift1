package mx.gob.imss.fepac.autorizacion.bean.business.commons;

import java.io.Serializable;



public class FolioMedico implements Serializable {
	
	
	private String matricula;
	private String paterno;
	private String materno;
	private String nombre;
	private int cveDelegacion;
	private String nomDelegacion;
	private String cvePresupuestal;
	private String nomUnidadMedica;
	private String numFolio;
	private String fechaRecuperacion;
	private String fechaCambioEstatus;
	private int programa;
	private int trimPrograma;
	private String cveBlock;
	
	public FolioMedico(){
		
	}
	
	public FolioMedico(String matricula, String paterno, String materno, String nombre, int cveDelegacion,String nomDelegacion, String cvePresupuestal, 
			String nomUnidadMedica, String numFolio, String fechaRecuperacion,int programa){
		this.matricula = matricula;
		this.paterno = paterno;
		this.materno = materno;
		this.nombre = nombre;
		this.cveDelegacion = cveDelegacion;
		this.nomDelegacion = nomDelegacion;
		this.cvePresupuestal = cvePresupuestal;
		this.nomUnidadMedica = nomUnidadMedica;
		this.numFolio = numFolio;
		this.fechaRecuperacion = fechaRecuperacion;
		this.programa = programa;
		
	}
	
	public FolioMedico(String matricula, String paterno, String materno, String nombre, Long cveDelegacion,String cvePresupuestal,Long programa){
		this.matricula = matricula;
		this.paterno = paterno;
		this.materno = materno;
		this.nombre = nombre;
		this.cveDelegacion = cveDelegacion.intValue();
		this.cvePresupuestal = cvePresupuestal;
		this.programa = programa.intValue();
		
	}
	
	//RecuperarFoliosExpedidosDAO
	
	public FolioMedico (String matricula, String paterno, String materno, String nombre, Long cveDelegacion,String cvePresupuestal,String folio,Long programa, Long trim , String cveBlock){
		super();
		this.matricula = matricula;
		this.paterno = paterno;
		this.materno = materno;
		this.nombre = nombre;
		this.cveDelegacion = cveDelegacion.intValue();
		this.cvePresupuestal = cvePresupuestal;
		this.numFolio = folio;
		this.programa = programa.intValue();
		this.trimPrograma = trim.intValue();
		this.cveBlock = cveBlock;
		
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCveDelegacion() {
		return cveDelegacion;
	}
	public void setCveDelegacion(int cveDelegacion) {
		this.cveDelegacion = cveDelegacion;
	}
	public String getNomDelegacion() {
		return nomDelegacion;
	}
	public void setNomDelegacion(String nomDelegacion) {
		this.nomDelegacion = nomDelegacion;
	}
	public String getCvePresupuestal() {
		return cvePresupuestal;
	}
	public void setCvePresupuestal(String cvePresupuestal) {
		this.cvePresupuestal = cvePresupuestal;
	}
	public String getNomUnidadMedica() {
		return nomUnidadMedica;
	}
	public void setNomUnidadMedica(String nomUnidadMedica) {
		this.nomUnidadMedica = nomUnidadMedica;
	}
	public String getNumFolio() {
		return numFolio;
	}
	public void setNumFolio(String numFolio) {
		this.numFolio = numFolio;
	}
	public int getPrograma() {
		return programa;
	}
	public void setPrograma(int programa) {
		this.programa = programa;
	}

	public String getFechaRecuperacion() {
		return fechaRecuperacion;
	}

	public void setFechaRecuperacion(String fechaRecuperacion) {
		this.fechaRecuperacion = fechaRecuperacion;
	}
	
	public String getFechaCambioEstatus() {
		return fechaCambioEstatus;
	}

	public void setFechaCambioEstatus(String fechaCambioEstatus) {
		this.fechaCambioEstatus = fechaCambioEstatus;
	}

	public int getTrimPrograma() {
		return trimPrograma;
	}

	public void setTrimPrograma(int trimPrograma) {
		this.trimPrograma = trimPrograma;
	}

	public String getCveBlock() {
		return cveBlock;
	}

	public void setCveBlock(String cveBlock) {
		this.cveBlock = cveBlock;
	}
	

}
