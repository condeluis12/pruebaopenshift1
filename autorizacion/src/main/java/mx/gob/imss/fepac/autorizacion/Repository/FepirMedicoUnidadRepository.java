package mx.gob.imss.fepac.autorizacion.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.gob.imss.fepac.autorizacion.bean.model.FepirMedicoUnidad;
import mx.gob.imss.fepac.autorizacion.bean.model.FepirUnidadMedica;
import mx.gob.imss.fepac.autorizacion.bean.model.FepirUnidadMedicaPK;
import mx.gob.imss.fepac.autorizacion.bean.model.FepirUsuarioAcceso;
import mx.gob.imss.fepac.autorizacion.bean.model.FepirUsuarioAccesoPK;

public interface FepirMedicoUnidadRepository extends JpaRepository<FepirMedicoUnidad,FepirUnidadMedicaPK>{
	
	@Query(value="SELECT w.matricula FROM FepirMedicoUnidad w WHERE w.cvePresupuestal=?1 AND w.cveDelegacion=?2 and w.fecBaja is null")
	List<String>  findmatricula(String cvePresupuestal,Long cveDelegacion);
	
	@Query(value="SELECT w.matricula FROM FepirMedicoUnidad w WHERE w.cvePresupuestal=?1 AND w.cveDelegacion=?2")
	List<String>  findmatricula2(String cvePresupuestal,Long cveDelegacion);

	/*@Query(value="SELECT new mx.gob.imss.fepac.autorizacion.bean.model.FepirMedicoUnidad(w.cveDelegacion,w.cvePresupuestal,w.matricula,w.consultorio,w.fecAsignacion,w.fecBaja) "
			+ "FROM FepirMedicoUnidad w WHERE w.cvePresupuestal=?3 AND w.cveDelegacion=?2 AND"
			+" w.matricula=?1")
	FepirMedicoUnidad findAllByMatriculaAndByCveDelegacionAndByCvePresupuestal(String matricula, Long cveDelegacion,
			String cvePresupuestal);*/
	
	@Query(value="SELECT w FROM FepirMedicoUnidad w WHERE w.cvePresupuestal=?3 AND w.cveDelegacion=?2 AND w.matricula=?1")
	FepirMedicoUnidad findAllByMatriculaAndByCveDelegacionAndByCvePresupuestal(String matricula, Long cveDelegacion,String cvePresupuestal);

	/*List<FepirMedicoUnidad> findByCvePresupuestalAndCveDelacionAndFecBajaIsNull(String cvePresupuestal,
			Long cveDelegacion);*/
	@Query("Select Count(*) from FepirMedicoUnidad as FMU  where FMU.matricula =?1 and "
	+ "FMU.cvePresupuestal =?2 and FMU.cveDelegacion =?3" )
	Integer  contarMatriculas(String matricula,String usuCvePresupuestal,Long usuCveDelegacion);
	
}
