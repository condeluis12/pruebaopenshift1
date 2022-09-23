package mx.gob.imss.fepac.autorizacion.bean;

public class FepirCatPerfilRespond {
	private String cveUsuario;
	private Long cvePerfil;
	private String nomPerfil;
	public FepirCatPerfilRespond(String cveUsuario, Long cvePerfil, String nomPerfil) {
		super();
		this.cveUsuario = cveUsuario;
		this.cvePerfil = cvePerfil;
		this.nomPerfil = nomPerfil;
	}
	public FepirCatPerfilRespond() {
		super();
	}
	public String getCveUsuario() {
		return cveUsuario;
	}
	public void setCveUsuario(String cveUsuario) {
		this.cveUsuario = cveUsuario;
	}
	public Long getCvePerfil() {
		return cvePerfil;
	}
	public void setCvePerfil(Long cvePerfil) {
		this.cvePerfil = cvePerfil;
	}
	public String getNomPerfil() {
		return nomPerfil;
	}
	public void setNomPerfil(String nomPerfil) {
		this.nomPerfil = nomPerfil;
	}
	@Override
	public String toString() {
		return "FepirCatPerfilRespond [cveUsuario=" + cveUsuario + ", cvePerfil=" + cvePerfil + ", nomPerfil="
				+ nomPerfil + "]";
	}


	
	
}
