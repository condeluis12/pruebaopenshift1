package mx.gob.imss.fepac.autorizacion.bean.business.commons;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class UnidadMedica implements Serializable {
	
	
	private String cveUMAE;
	private String cveDelegacion;
	private String cvePresupuestal;
	private String cveNivelServicio;
	private String nombreUM;
	private String numeroUM;
	private String cvePrei;
	
	private String usuario;
	private String fecha;
	private String nombreDelegacion;
	
	
	public UnidadMedica(){		
	}
	
	
	
	public UnidadMedica(String cveUMAE, String cveDelegacion, String cvePresupuestal, String cveNivelServicio,
			String nombreUM, String numeroUM, String cvePrei, String usuario, String fecha, String nombreDelegacion) {
		super();
		this.cveUMAE = cveUMAE;
		this.cveDelegacion = cveDelegacion;
		this.cvePresupuestal = cvePresupuestal;
		this.cveNivelServicio = cveNivelServicio;
		this.nombreUM = nombreUM;
		this.numeroUM = numeroUM;
		this.cvePrei = cvePrei;
		this.usuario = usuario;
		this.fecha = fecha;
		this.nombreDelegacion = nombreDelegacion;
	}



	public String getCvePrei() {
		return cvePrei;
	}


	public void setCvePrei(String cvePrei) {
		this.cvePrei = cvePrei;
	}


	public UnidadMedica(String nombreUmae, String clavDeleg, String clavPresup){
		this.cveUMAE = clavDeleg + "-"+ clavPresup ;
		this.cveDelegacion = clavDeleg;
		this.cvePresupuestal = clavPresup;
		this.nombreUM= nombreUmae;
	}
	/**
	 * @return
	 */
	public String getCveDelegacion() {
		return cveDelegacion;
	}

	/**
	 * @return
	 */
	public String getCveNivelServicio() {
		return cveNivelServicio;
	}

	/**
	 * @return
	 */
	public String getCvePresupuestal() {
		return cvePresupuestal;
	}

	/**
	 * @return
	 */
	public String getNombreUM() {
		return nombreUM;
	}

	/**
	 * @return
	 */
	public String getNumeroUM() {
		return numeroUM;
	}

	/**
	 * @param string
	 */
	public void setCveDelegacion(String string) {
		cveDelegacion = string;
	}

	/**
	 * @param string
	 */
	public void setCveNivelServicio(String string) {
		cveNivelServicio = string;
	}

	/**
	 * @param string
	 */
	public void setCvePresupuestal(String string) {
		cvePresupuestal = string;
	}

	/**
	 * @param string
	 */
	public void setNombreUM(String string) {
		nombreUM = string;
	}

	/**
	 * @param string
	 */
	public void setNumeroUM(String string) {
		numeroUM = string;
	}
	/**
	 * @return
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @return
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param string
	 */
	public void setFecha(String string) {
		fecha = string;
	}

	/**
	 * @param string
	 */
	public void setUsuario(String string) {
		usuario = string;
	}

	/**
	 * @return
	 */
	public String getNombreDelegacion() {
		return nombreDelegacion;
	}

	/**
	 * @param string
	 */
	public void setNombreDelegacion(String string) {
		nombreDelegacion = string;
	}

	public String getCveUMAE() {
		return cveUMAE;
	}

	public void setCveUMAE(String string) {
		cveUMAE = string;
	}

	
	
	

}
