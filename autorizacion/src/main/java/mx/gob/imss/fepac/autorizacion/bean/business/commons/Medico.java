package mx.gob.imss.fepac.autorizacion.bean.business.commons;

import java.util.Calendar;

public class Medico {

	private String matricula;
	private int cveCategoria;
	private int cveEstatus;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private String fechaBaja = "";
	
	public Medico() {
		super();	
	}
	
	public Medico(String matricula, Long cveCategoria, Long cveEstatus,
			String nombre, String apPaterno, String apMaterno) {
		super();
		this.matricula = matricula;
		this.cveCategoria = cveCategoria.intValue();
		this.cveEstatus = cveEstatus.intValue();
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
	}
	
	public Medico(String matricula, Long cveCategoria, Long cveEstatus,
			String nombre, String apPaterno, String apMaterno, java.util.Date fechaBaja) {
		super();
		this.matricula = matricula;
		this.cveCategoria = cveCategoria.intValue();
		this.cveEstatus = cveEstatus.intValue();
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;		
		if ( fechaBaja != null ){
			Calendar fecha = Calendar.getInstance();
			fecha.setTime( fechaBaja );			
			int diaActual = fecha.get( Calendar.DATE );
			int mesActual = fecha.get( Calendar.MONTH );
			int anioActual = fecha.get( Calendar.YEAR );
			if ( diaActual < 10){
				 this.fechaBaja = "0"+ diaActual;
			}
			else{
				this.fechaBaja = Integer.toString( diaActual );
			}
			if ( mesActual < 10){
				 this.fechaBaja = this.fechaBaja + "/"+ "0"+ Integer.toString( mesActual + 1 );
			}
			else{
				this.fechaBaja = this.fechaBaja + "/"+ Integer.toString( mesActual + 1);
			}			
			
			this.fechaBaja = this.fechaBaja + "/" + Integer.toString( anioActual ) ;
		}
		
	}
	
	public String getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(String fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public long getCveCategoria() {
		return cveCategoria;
	}
	
	public void setCveCategoria(int cveCategoria) {
		this.cveCategoria = cveCategoria;
	}
	
	public int getCveEstatus() {
		return cveEstatus;
	}
	
	public void setCveEstatus(int cveEstatus) {
		this.cveEstatus = cveEstatus;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
}
