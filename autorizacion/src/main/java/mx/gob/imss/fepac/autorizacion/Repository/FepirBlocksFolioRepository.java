package mx.gob.imss.fepac.autorizacion.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.gob.imss.fepac.autorizacion.bean.model.FepirBlocksFolio;
import mx.gob.imss.fepac.autorizacion.bean.model.FepirBlocksFolioPK;




public interface FepirBlocksFolioRepository extends  CrudRepository<FepirBlocksFolio,FepirBlocksFolioPK> {

	
	List<FepirBlocksFolio> findByNumFolio(String numFolio);

}
