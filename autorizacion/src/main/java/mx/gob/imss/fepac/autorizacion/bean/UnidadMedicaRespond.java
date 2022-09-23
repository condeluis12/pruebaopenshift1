package mx.gob.imss.fepac.autorizacion.bean;

public class UnidadMedicaRespond {
	private String cvePresupuestal;
	private String nomUnidadMedica;
	private String apPaterno;
	private String apMaterno;
	private String nombre;
	public UnidadMedicaRespond(String cvePresupuestal, String nomUnidadMedica, String apPaterno, String apMaterno,
			String nombre) {
		super();
		this.cvePresupuestal = cvePresupuestal;
		this.nomUnidadMedica = nomUnidadMedica;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.nombre = nombre;
	}
	public UnidadMedicaRespond() {
		super();
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
	@Override
	public String toString() {
		return "UnidadMedicaRespond [cvePresupuestal=" + cvePresupuestal + ", nomUnidadMedica=" + nomUnidadMedica
				+ ", apPaterno=" + apPaterno + ", apMaterno=" + apMaterno + ", nombre=" + nombre + "]";
	}
	

}
