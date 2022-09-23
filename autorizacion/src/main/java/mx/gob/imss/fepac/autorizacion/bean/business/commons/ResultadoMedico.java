package mx.gob.imss.fepac.autorizacion.bean.business.commons;
import java.util.Date;

public class ResultadoMedico {
	
	private String matricula;
	private String nombre;
	private String materno;
	private String paterno; 
	private Long cveEstatus;
	private String nomEstatus;
	private Long cveEspecialidad;
	private String nomEspecialidad;
	private String nomDelegacion;
	private String nomUnidadMedica;
	private Long cveTurno;
	private String nomTurno;
	private Long cveCategoria;
	private String nomCategoria;
	private Date fechaAlta;
	private Date fechaBaja;	
	private Long jornada;
	
	public Long getCveCategoria() {
		return cveCategoria;
	}
	public void setCveCategoria(Long cveCategoria) {
		this.cveCategoria = cveCategoria;
	}
	public Long getCveEspecialidad() {
		return cveEspecialidad;
	}
	public void setCveEspecialidad(Long cveEspecialidad) {
		this.cveEspecialidad = cveEspecialidad;
	}
	public String getNomDelegacion() {
		return nomDelegacion;
	}
	public void setNomDelegacion(String nomDelegacion) {
		this.nomDelegacion = nomDelegacion;
	}
	public String getNomUnidadMedica() {
		return nomUnidadMedica;
	}
	public void setNomUnidadMedica(String nomUnidadMedica) {
		this.nomUnidadMedica = nomUnidadMedica;
	}
	public Long getCveEstatus() {
		return cveEstatus;
	}
	public void setCveEstatus(Long cveEstatus) {
		this.cveEstatus = cveEstatus;
	}
	public Long getCveTurno() {
		return cveTurno;
	}
	public void setCveTurno(Long cveTurno) {
		this.cveTurno = cveTurno;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Date getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	public Long getJornada() {
		return jornada;
	}
	public void setJornada(Long jornada) {
		this.jornada = jornada;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNomCategoria() {
		return nomCategoria;
	}
	public void setNomCategoria(String nomCategoria) {
		this.nomCategoria = nomCategoria;
	}
	public String getNomEspecialidad() {
		return nomEspecialidad;
	}
	public void setNomEspecialidad(String nomEspecialidad) {
		this.nomEspecialidad = nomEspecialidad;
	}
	public String getNomEstatus() {
		return nomEstatus;
	}
	public void setNomEstatus(String nomEstatus) {
		this.nomEstatus = nomEstatus;
	}
	public String getNomTurno() {
		return nomTurno;
	}
	public void setNomTurno(String nomTurno) {
		this.nomTurno = nomTurno;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public ResultadoMedico() {
		super();
	}
	
	public ResultadoMedico(String matricula, String nombre, String materno, String paterno, Long cveEspecialidad, String nomEspecialidad, Long cveTurno, String nomTurno, Date fechaAlta, Date fechaBaja ) {
		super();
		this.matricula = matricula;
		this.nombre = nombre;
		this.materno = materno;
		this.paterno = paterno;
		this.cveEspecialidad = cveEspecialidad;
		this.nomEspecialidad = nomEspecialidad;
		this.cveTurno = cveTurno;
		this.nomTurno = nomTurno;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
	}
	
	public ResultadoMedico(String nombre, String materno, String paterno, String nomEspecialidad, String nomDelegacion, String nomUnidadMedica, Date fechaAlta, Date fechaBaja){
		super();		
		this.nombre = nombre+" "+paterno+" "+materno;			
		this.nomEspecialidad = nomEspecialidad;
		this.nomDelegacion = nomDelegacion;
		this.nomUnidadMedica = nomUnidadMedica;		
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		
	}
	
	
	
		

}
