package mx.gob.imss.fepac.autorizacion.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import mx.gob.imss.fepac.autorizacion.bean.model.FepirBlocksFolio;
import mx.gob.imss.fepac.autorizacion.bean.model.FepirBlocksFolioPK;
import mx.gob.imss.fepac.autorizacion.bean.model.FepirCatEspecialidad;

public interface FepirCatEspecialidadRepository  extends  JpaRepository<FepirCatEspecialidad,Long> {
	@Query(value="select new mx.gob.imss.fepac.autorizacion.bean.model.FepirCatEspecialidad(e.cveEspecialidad,e.nomEspecialidad) from FepirCatEspecialidad e")
	List<FepirCatEspecialidad> listarEspecialidad();
}
