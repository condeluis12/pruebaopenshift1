package mx.gob.imss.fepac.autorizacion.Repository;

import java.util.List;
import java.util.Objects;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.gob.imss.fepac.autorizacion.bean.FepirUnidadMedicaProyection;
import mx.gob.imss.fepac.autorizacion.bean.model.FepirUnidadMedica;
import mx.gob.imss.fepac.autorizacion.bean.model.FepirUnidadMedicaPK;

public interface FepirUnidadMedicaRepository extends JpaRepository<FepirUnidadMedica,FepirUnidadMedicaPK>{
	
	@Query(value="SELECT new mx.gob.imss.fepac.autorizacion.bean.FepirUnidadMedicaProyection(w.cveDelegacion,w.cvePresupuestal,w.nomUnidadMedica) FROM FepirUnidadMedica w WHERE w.cveDelegacion=?1 AND w.cveNivelServicio<>2153 order by w.nomUnidadMedica")
	List<FepirUnidadMedicaProyection>  findfepirunidadmedica(Long cveDelegacion);
	
	 List <FepirUnidadMedica>  findByCveNivelServicioNotAndCveDelegacion(long cveNivelServicio ,long cveDelegacion);
	 
	 @Query(value="SELECT new mx.gob.imss.fepac.autorizacion.bean.FepirUnidadMedicaProyection(w.cveDelegacion,w.cvePresupuestal,w.nomUnidadMedica) FROM FepirUnidadMedica w WHERE w.cveNivelServicio=2153 order by w.nomUnidadMedica")
		List<FepirUnidadMedicaProyection>  findfepirunidadmedica2(Long cveDelegacion);
	 
	 @Query(value="SELECT new mx.gob.imss.fepac.autorizacion.bean.model.FepirUnidadMedica(w.cveDelegacion,w.cvePresupuestal,w.nomUnidadMedica) FROM FepirUnidadMedica w WHERE w.cveDelegacion=?1 order by w.nomUnidadMedica")
		List<FepirUnidadMedica>  findfepirunidadmedica3(Long cveDelegacion);
}
