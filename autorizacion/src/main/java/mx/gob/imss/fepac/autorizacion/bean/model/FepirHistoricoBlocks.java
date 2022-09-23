package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="FEPIR_HISTORICO_BLOCKS")
public class FepirHistoricoBlocks implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_HISTORICO_BLOCKS", nullable = false)
	private Long cveHistoricoBlocks;
	@Column(name = "FEC_HISTORICO_BLOCKS", nullable = false)
	private java.sql.Date fecHistoricoBlocks;
	@Column(name = "CVE_DELEG_DESTINO", nullable = false)
	private Long cveDelegDestino;
	@Column(name = "CVE_DELEG_ORIGEN", nullable = false)
	private Long cveDelegOrigen;
	@Column(name = "CVE_PRESUP_DESTINO", nullable = false)
	private String cvePresupDestino;
	@Column(name = "CVE_PRESUP_ORIGEN", nullable = false)
	private String cvePresupOrigen;
	@Column(name = "SERIE_FOLIO_INICIAL", nullable = false)
	private String serieFolioInicial;
	@Column(name = "SERIE_FOLIO_FINAL", nullable = false)
	private String serieFolioFinal;
	@Column(name = "CVE_USUARIO", nullable = false)
	private String cveUsuario;
	@Column(name = "CVE_ESTATUS_DESTINO", nullable = false)
	private Long cveEstatusDestino;
	@Column(name = "CVE_ESTATUS_ORIGEN", nullable = false)
	private Long cveEstatusOrigen;
	@Column(name = "PROGRAMA", nullable = false)
	private Long programa;
	@Column(name = "TRIMESTRE", nullable = false)
	private Long trimestre;
	@Column(name = "MOTIVO", nullable = false)
	private String motivo;
	@Column(name = "NRO_OFICIO", nullable = false)
	private String nroOficio;
	@Column(name = "CVE_OPERACION", nullable = false)
	private Long cveOperacion;
	@Column(name = "FEC_ASIGNACION", nullable = false)
	private java.sql.Date fecAsignacion;
	@Column(name = "MATRICULA_ORIGEN", nullable = false)
	private String matriculaOrigen;
	@Column(name = "MATRICULA_DESTINO", nullable = false)
	private String matriculaDestino;
	@Column(name = "ESTADOS_POSIBLES", nullable = false)
	private String estadosPosibles;
	@Column(name = "CANTIDAD_BLOCKS", nullable = false)
	private Long cantidadBlocks;

	public FepirHistoricoBlocks() {
		super();
	}


	public FepirHistoricoBlocks(Long cveHistoricoBlocks, Date fecHistoricoBlocks, Long cveDelegDestino,
			Long cveDelegOrigen, String cvePresupDestino, String cvePresupOrigen, String serieFolioInicial,
			String serieFolioFinal, String cveUsuario, Long cveEstatusDestino, Long cveEstatusOrigen, Long programa,
			Long trimestre, String motivo, String nroOficio, Long cveOperacion, Date fecAsignacion,
			String matriculaOrigen, String matriculaDestino, String estadosPosibles, Long cantidadBlocks) {
		super();
		this.cveHistoricoBlocks = cveHistoricoBlocks;
		this.fecHistoricoBlocks = fecHistoricoBlocks;
		this.cveDelegDestino = cveDelegDestino;
		this.cveDelegOrigen = cveDelegOrigen;
		this.cvePresupDestino = cvePresupDestino;
		this.cvePresupOrigen = cvePresupOrigen;
		this.serieFolioInicial = serieFolioInicial;
		this.serieFolioFinal = serieFolioFinal;
		this.cveUsuario = cveUsuario;
		this.cveEstatusDestino = cveEstatusDestino;
		this.cveEstatusOrigen = cveEstatusOrigen;
		this.programa = programa;
		this.trimestre = trimestre;
		this.motivo = motivo;
		this.nroOficio = nroOficio;
		this.cveOperacion = cveOperacion;
		this.fecAsignacion = fecAsignacion;
		this.matriculaOrigen = matriculaOrigen;
		this.matriculaDestino = matriculaDestino;
		this.estadosPosibles = estadosPosibles;
		this.cantidadBlocks = cantidadBlocks;
	}

	

	public Long getCveHistoricoBlocks() {
		return cveHistoricoBlocks;
	}

	public void setCveHistoricoBlocks(Long cveHistoricoBlocks) {
		this.cveHistoricoBlocks = cveHistoricoBlocks;
	}

	public java.sql.Date getFecHistoricoBlocks() {
		return fecHistoricoBlocks;
	}

	public void setFecHistoricoBlocks(java.sql.Date fecHistoricoBlocks) {
		this.fecHistoricoBlocks = fecHistoricoBlocks;
	}

	public Long getCveDelegDestino() {
		return cveDelegDestino;
	}

	public void setCveDelegDestino(Long cveDelegDestino) {
		this.cveDelegDestino = cveDelegDestino;
	}

	public Long getCveDelegOrigen() {
		return cveDelegOrigen;
	}

	public void setCveDelegOrigen(Long cveDelegOrigen) {
		this.cveDelegOrigen = cveDelegOrigen;
	}

	public String getCvePresupDestino() {
		return cvePresupDestino;
	}

	public void setCvePresupDestino(String cvePresupDestino) {
		this.cvePresupDestino = cvePresupDestino;
	}

	public String getCvePresupOrigen() {
		return cvePresupOrigen;
	}

	public void setCvePresupOrigen(String cvePresupOrigen) {
		this.cvePresupOrigen = cvePresupOrigen;
	}

	public String getSerieFolioInicial() {
		return serieFolioInicial;
	}

	public void setSerieFolioInicial(String serieFolioInicial) {
		this.serieFolioInicial = serieFolioInicial;
	}

	public String getSerieFolioFinal() {
		return serieFolioFinal;
	}

	public void setSerieFolioFinal(String serieFolioFinal) {
		this.serieFolioFinal = serieFolioFinal;
	}

	public String getCveUsuario() {
		return cveUsuario;
	}

	public void setCveUsuario(String cveUsuario) {
		this.cveUsuario = cveUsuario;
	}

	public Long getCveEstatusDestino() {
		return cveEstatusDestino;
	}

	public void setCveEstatusDestino(Long cveEstatusDestino) {
		this.cveEstatusDestino = cveEstatusDestino;
	}

	public Long getCveEstatusOrigen() {
		return cveEstatusOrigen;
	}

	public void setCveEstatusOrigen(Long cveEstatusOrigen) {
		this.cveEstatusOrigen = cveEstatusOrigen;
	}

	public Long getPrograma() {
		return programa;
	}

	public void setPrograma(Long programa) {
		this.programa = programa;
	}

	public Long getTrimestre() {
		return trimestre;
	}

	public void setTrimestre(Long trimestre) {
		this.trimestre = trimestre;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getNroOficio() {
		return nroOficio;
	}

	public void setNroOficio(String nroOficio) {
		this.nroOficio = nroOficio;
	}

	public Long getCveOperacion() {
		return cveOperacion;
	}

	public void setCveOperacion(Long cveOperacion) {
		this.cveOperacion = cveOperacion;
	}

	public java.sql.Date getFecAsignacion() {
		return fecAsignacion;
	}

	public void setFecAsignacion(java.sql.Date fecAsignacion) {
		this.fecAsignacion = fecAsignacion;
	}

	public String getMatriculaOrigen() {
		return matriculaOrigen;
	}

	public void setMatriculaOrigen(String matriculaOrigen) {
		this.matriculaOrigen = matriculaOrigen;
	}

	public String getMatriculaDestino() {
		return matriculaDestino;
	}

	public void setMatriculaDestino(String matriculaDestino) {
		this.matriculaDestino = matriculaDestino;
	}

	public String getEstadosPosibles() {
		return estadosPosibles;
	}

	public void setEstadosPosibles(String estadosPosibles) {
		this.estadosPosibles = estadosPosibles;
	}

	public Long getCantidadBlocks() {
		return cantidadBlocks;
	}

	public void setCantidadBlocks(Long cantidadBlocks) {
		this.cantidadBlocks = cantidadBlocks;
	}


	@Override
	public String toString() {
		return "FepirHistoricoBlocks [cveHistoricoBlocks=" + cveHistoricoBlocks + ", fecHistoricoBlocks="
				+ fecHistoricoBlocks + ", cveDelegDestino=" + cveDelegDestino + ", cveDelegOrigen=" + cveDelegOrigen
				+ ", cvePresupDestino=" + cvePresupDestino + ", cvePresupOrigen=" + cvePresupOrigen
				+ ", serieFolioInicial=" + serieFolioInicial + ", serieFolioFinal=" + serieFolioFinal + ", cveUsuario="
				+ cveUsuario + ", cveEstatusDestino=" + cveEstatusDestino + ", cveEstatusOrigen=" + cveEstatusOrigen
				+ ", programa=" + programa + ", trimestre=" + trimestre + ", motivo=" + motivo + ", nroOficio="
				+ nroOficio + ", cveOperacion=" + cveOperacion + ", fecAsignacion=" + fecAsignacion
				+ ", matriculaOrigen=" + matriculaOrigen + ", matriculaDestino=" + matriculaDestino
				+ ", estadosPosibles=" + estadosPosibles + ", cantidadBlocks=" + cantidadBlocks + "]";
	}

	

}
