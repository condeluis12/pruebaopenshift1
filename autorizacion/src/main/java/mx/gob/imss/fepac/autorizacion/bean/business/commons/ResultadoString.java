package mx.gob.imss.fepac.autorizacion.bean.business.commons;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.NamedNativeQuery;


@NamedNativeQuery(		
		name="obtenerTrimestres",
				query="{? = call UTILES_FEPAC.OBTENER_TRIMESTRES (?,?)}",
				callable=true,
		resultClass=ResultadoString.class	
		)
@NamedNativeQuery(		
		name="obtenerTrimestresUMAE",
				query="{? = call UTILES_FEPAC.OBTENER_TRIMESTRES_UMAE (?,?,?)}",
				callable=true,
		resultClass=ResultadoString.class	
		)
@NamedNativeQuery(		
		name="obtenerCvePresupuestal",
				query="{? = call UTILES_FEPAC.OBTENER_CVE_PRESUPUESTAL (?)}",
				callable=true,
		resultClass=ResultadoString.class	
		)
@Entity
public class ResultadoString implements Serializable {
	@Id
	private String valor;

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public ResultadoString(){
		super();
	}

	public ResultadoString(String valor) {
		super();
		this.valor = valor;
	}
	
	
}
