package mx.gob.imss.fepac.autorizacion.bean.business.commons;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;

import org.hibernate.annotations.NamedNativeQuery;
import org.springframework.stereotype.Repository;

//import javax.persistence.NamedNativeQuery;
@NamedNativeQuery(
		
		name="esPosibleAisgnar",
				query=" {? = call COBCIR_FEPAC.ES_POSIBLE_ASIGNAR_FOLIOS (?)}",
				callable=true,

		resultClass=ResultadoInteger.class
		
		)
@NamedNativeQuery(
		
		name="registrarRecepcionUMAE",
				query=" {? = call UMAE_FEPAC.REGISTRAR_RECEPCION_UMAE(?,?,?,?,?,?,?,?,?,?,?,?)}",
				callable=true,

		resultClass=ResultadoInteger.class
		
		)
@NamedNativeQuery(
		
		name="obtenerResultadoActualizarAsignacionFolioMedico",
				query="{? = call COBCIR_FEPAC.ACT_ASIG_FOL_MED(?,?,?,?,?,?,?,?,?,?)}",
				callable=true,

		resultClass=ResultadoInteger.class
		
		)
@NamedNativeQuery(
		
		name="registrarAsignacionAMedicos",
				query="{? = call COBCIR_FEPAC.ASIGNACION_BLOCK_MEDICO(?,?,?,?,?,?,?,?,?,?,?)}",
				callable=true,

		resultClass=ResultadoInteger.class
		
		)
@NamedNativeQuery(
		
		name="registrarRecepcionCobcir",
				query="{? = call COBCIR_FEPAC.REGISTRAR_RECEPCION(?,?,?,?,?,?,?,?,?,?)}",
				callable=true,

		resultClass=ResultadoInteger.class
		
		)
@NamedNativeQuery(
		
		name="ModificarMedicoMatricula",
				query="{? = call ADMINISTRACION.ModificarMedicoMatricula(?,?,?,?)}",
				callable=true,

		resultClass=ResultadoInteger.class
		
		)

@Entity
public class ResultadoInteger {
	@Id
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public ResultadoInteger(){}
	
	public ResultadoInteger(int valor) {
		super();
		this.valor = valor;
	}
	
}
