/**
 * Creado 04/11/07  
 * Clase legada, sistema anterior
 * Actulizacion Equipo CRS
 */
package mx.gob.imss.fepac.autorizacion.bean;

/**
 * @author Bernarda Albanesi
 */
public class CUnidadMedica {
	private String cveDelegacion;
	private String cvePresupuestal; //matias
	private String nomUnidadMedica; //matias
	private String nomDelegacion;
	private String cveRegion;
	private int cantBlocksDelegacion1 = 0;
	private int cantBlocksDelegacion2 = 0;
	private int cantBlocksDelegacion3 = 0;
	private int cantBlocksDelegacion4 = 0;
	private String cantBlocksDeleg1 = "0";
	private String cantBlocksDeleg2 = "0";
	private String cantBlocksDeleg3 = "0";
	private String cantBlocksDeleg4 = "0";
	private String serieIni1;
	private String serieIni2;
	private String serieIni3;
	private String serieIni4;
	private String serieFin1;
	private String serieFin2;
	private String serieFin3;
	private String serieFin4;


	/**
	 * @return clave delegacion
	 */
	public String getCveDelegacion() {
		return cveDelegacion;
	}

	/**
	 * @return region
	 */
	public String getCveRegion() {
		return cveRegion;
	}

	/**
	 * @return nombre delegacion
	 */
	public String getNomDelegacion() {
		return nomDelegacion;
	}

	/**
	 * @param clave delegacion
	 */
	public void setCveDelegacion(String string) {
		cveDelegacion = string;
	}

	/**
	 * @param clave region
	 */
	public void setCveRegion(String string) {
		cveRegion = string;
	}

	/**
	 * @param nombre delegacion
	 */
	public void setNomDelegacion(String string) {
		nomDelegacion = string;
	}
    /**
     * 
     * @return cantidad de blocks 
     */
	public int getCantBlocksDelegacion1() {
		return cantBlocksDelegacion1;
	}

	public void setCantBlocksDelegacion1(int cantBlocksDelegacion1) {
		this.cantBlocksDelegacion1 = cantBlocksDelegacion1;
		this.cantBlocksDeleg1 = Integer.toString( cantBlocksDelegacion1 );
	}
	 /**
     * 
     * @return cantidad de blocks 
     */
	public int getCantBlocksDelegacion2() {
		return cantBlocksDelegacion2;
	}

	public void setCantBlocksDelegacion2(int cantBlocksDelegacion2) {
		this.cantBlocksDelegacion2 = cantBlocksDelegacion2;
		this.cantBlocksDeleg2 = Integer.toString( cantBlocksDelegacion2 );
	}
	 /**
     * 
     * @return cantidad de blocks 
     */
	public int getCantBlocksDelegacion3() {
		return cantBlocksDelegacion3;
	}

	public void setCantBlocksDelegacion3( int cantBlocksDelegacion3 ) {
		this.cantBlocksDelegacion3 = cantBlocksDelegacion3;
		this.cantBlocksDeleg3 = Integer.toString( cantBlocksDelegacion3 );
	}
	 /**
     * 
     * @return cantidad de blocks 
     */
	public int getCantBlocksDelegacion4() {
		return cantBlocksDelegacion4;
	}

	public void setCantBlocksDelegacion4( int cantBlocksDelegacion4 ) {
		this.cantBlocksDelegacion4 = cantBlocksDelegacion4;
		this.cantBlocksDeleg4 = Integer.toString( cantBlocksDelegacion4 );
	}
	 /**
     * 
     * @return serie folio final trimestre 1 
     */
	public String getSerieFin1() {
		return serieFin1;
	}
	/**
     * 
     * @param serie folio final trimestre 1
     */
	public void setSerieFin1(String serieFin1) {
		this.serieFin1 = serieFin1;
	}
	 /**
     * 
     * @return serie folio final trimestre 2 
     */
	public String getSerieFin2() {
		return serieFin2;
	}
	/**
     * 
     * @param serie folio final trimestre 2
     */
	public void setSerieFin2(String serieFin2) {
		this.serieFin2 = serieFin2;
	}
	 /**
     * 
     * @return serie folio final trimestre 3 
     */
	public String getSerieFin3() {
		return serieFin3;
	}
	/**
     * 
     * @param serie folio final trimestre 3
     */
	public void setSerieFin3(String serieFin3) {
		this.serieFin3 = serieFin3;
	}
	 /**
     * 
     * @return serie folio final trimestre 4 
     */
	public String getSerieFin4() {
		return serieFin4;
	}
	/**
     * 
     * @param serie folio final trimestre 4
     */
	public void setSerieFin4(String serieFin4) {
		this.serieFin4 = serieFin4;
	}
	 /**
     * 
     * @return serie folio inicial trimestre 1 
     */
	public String getSerieIni1() {
		return serieIni1;
	}
	/**
     * 
     * @param serie folio inicial trimestre 1
     */
	public void setSerieIni1(String serieIni1) {
		this.serieIni1 = serieIni1;
	}
	/**
     * 
     * @return serie folio inicial trimestre 2
     */
	public String getSerieIni2() {
		return serieIni2;
	}
	/**
     * 
     * @param serie folio inicial trimestre 2
     */
	public void setSerieIni2(String serieIni2) {
		this.serieIni2 = serieIni2;
	}
	/**
     * 
     * @return serie folio inicial trimestre 3
     */
	public String getSerieIni3() {
		return serieIni3;
	}
	/**
     * 
     * @param serie folio inicial trimestre 3
     */
	public void setSerieIni3(String serieIni3) {
		this.serieIni3 = serieIni3;
	}
	/**
     * 
     * @return serie folio inicial trimestre 4
     */
	public String getSerieIni4() {
		return serieIni4;
	}
	/**
     * 
     * @param serie folio inicial trimestre 4
     */
	public void setSerieIni4(String serieIni4) {
		this.serieIni4 = serieIni4;
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

	public String getCantBlocksDeleg1() {
		return cantBlocksDeleg1;
	}

	public void setCantBlocksDeleg1(String cantBlocksDeleg1) {
		this.cantBlocksDeleg1 = cantBlocksDeleg1;
	}

	public String getCantBlocksDeleg2() {
		return cantBlocksDeleg2;
	}

	public void setCantBlocksDeleg2(String cantBlocksDeleg2) {
		this.cantBlocksDeleg2 = cantBlocksDeleg2;
	}

	public String getCantBlocksDeleg3() {
		return cantBlocksDeleg3;
	}

	public void setCantBlocksDeleg3(String cantBlocksDeleg3) {
		this.cantBlocksDeleg3 = cantBlocksDeleg3;
	}

	public String getCantBlocksDeleg4() {
		return cantBlocksDeleg4;
	}

	public void setCantBlocksDeleg4(String cantBlocksDeleg4) {
		this.cantBlocksDeleg4 = cantBlocksDeleg4;
	}

}
