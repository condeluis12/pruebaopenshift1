package mx.gob.imss.fepac.autorizacion.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.gob.imss.fepac.autorizacion.bean.model.FepirMedico;

public interface FepirMedicoRepository extends JpaRepository<FepirMedico,String>{
	
	/*@Query("select new mx.gob.imss.fepac.autorizacion.bean.model.FepirMedico(p.matricula,p.cveEstatus,p.fecUsrUpdReg,p.jornada,p.materno,p.nombre,p.paterno,p.usrUpdReg,p.fechaAlta,p.fechaBaja) from FepirMedico p where p.matricula=?1")
	FepirMedico findMedico(String matricula);*/
	
	@Query("select p from FepirMedico p where p.matricula=?1")
	FepirMedico findMedico(String matricula);
	
	@Query("Select Count(*) from FepirMedico as FM  where FM.matricula =?1" )
			List<Integer>  contarMatriculas(String matricula);

}
