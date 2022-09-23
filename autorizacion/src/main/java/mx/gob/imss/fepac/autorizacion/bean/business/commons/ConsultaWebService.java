package mx.gob.imss.fepac.autorizacion.bean.business.commons;

import java.util.ArrayList;

import mx.gob.imss.fepac.autorizacion.bean.Delegacion;
import mx.gob.imss.fepac.autorizacion.bean.Programa;



public class ConsultaWebService {
	
	
	int codigo;
	String descripcion;
	String nombreMedico;
	String folioInicial;
	String folioFinal;
	//String listaFolios;
	String detalle;
	ArrayList<FolioInicial> foliosInicial;
	ArrayList<DatosTransferencia> transferencias;
	ArrayList<UnidadMedica> unidadMedica;
	ArrayList<ListaFolios> listaFolios;
	ArrayList<Programa> programas;
	ArrayList<Delegacion> delegacion;
	
	String nombre;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public ArrayList<Delegacion> getDelegacion() {
		return delegacion;
	}
	public void setDelegacion(ArrayList<Delegacion> delegacion) {
		this.delegacion = delegacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getNombreMedico() {
		return nombreMedico;
	}
	public void setNombreMedico(String nombreMedico) {
		this.nombreMedico = nombreMedico;
	}
	
	
	public String getFolioInicial() {
		return folioInicial;
	}
	public void setFolioInicial(String folioInicial) {
		this.folioInicial = folioInicial;
	}
	
	
	public String getFolioFinal() {
		return folioFinal;
	}
	
	
	public void setFolioFinal(String folioFinal) {
		this.folioFinal = folioFinal;
	}
	
	public String getDetalle() {
		return detalle;
	}
	
	
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	/*public String getListaFolios() {
		return listaFolios;
	}
	
	
	public void setListaFolios(String listaFolios) {
		this.listaFolios = listaFolios;
	}*/
	
	public ArrayList<FolioInicial> getFoliosInicial() {
        return foliosInicial;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setFolioInicial(ArrayList<FolioInicial> foliosInicial) {
        this.foliosInicial = foliosInicial;
    }
    
    public ArrayList<DatosTransferencia> getTransferencias() {
		return transferencias;
	}
	public void setTransferencias(ArrayList<DatosTransferencia> transferencias) {
		this.transferencias = transferencias;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<UnidadMedica> getUnidadMedica() {
		return unidadMedica;
	}
	public void setUnidadMedica(ArrayList<UnidadMedica> unidadMedica) {
		this.unidadMedica = unidadMedica;
	}
	
	public ArrayList<ListaFolios> getListaFolios() {
		return listaFolios;
	}
	public void setListaFolios(ArrayList<ListaFolios> listaFolios) {
		this.listaFolios = listaFolios;
	}
	
	public ArrayList<Programa> getProgramas() {
		return programas;
	}
	public void setProgramas(ArrayList<Programa> programas) {
		this.programas = programas;
	}


}
