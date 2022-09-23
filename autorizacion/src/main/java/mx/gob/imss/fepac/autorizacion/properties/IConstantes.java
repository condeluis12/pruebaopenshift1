package mx.gob.imss.fepac.autorizacion.properties;

/**
 * Proveerá el acceso a las variables globales de la aplicación.
 * @author malbanesi
 *
 */
public interface IConstantes {
	
	int VIGENCIA_ANTERIOR = 5; 
	
	int VIGENCIA_POSTERIOR = 5;
	
	String keyEstados = "108|808|800|811|812|813|809|802|103|804|805|110|117|814|816|110|117|818|815|";
	
	String valorEstados = "asignarCentral|corregirCentral|asignarExtraCentral|asignarCumae|corregirCumae|asignarExtraCumae|transferirSedecor|" +
			              "recibirSedecor|cancelarSedecor|asignarSedecor|" +
						  "recibirCobcir|cancelarCobcir|asignarMedicosCobcir|" +
						  "expedirCobcir|devolverCobcir|recibirUmae|cancelarUmae|" +
						  "asignarMedicosUmae|expedirUmae|devolverUmae|transferirUmae|";
	
	
	
}
