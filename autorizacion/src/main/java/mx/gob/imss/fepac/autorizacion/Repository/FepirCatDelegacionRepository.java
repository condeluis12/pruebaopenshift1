package mx.gob.imss.fepac.autorizacion.Repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.gob.imss.fepac.autorizacion.bean.FepirUnidadMedicaProyection;
import mx.gob.imss.fepac.autorizacion.bean.model.FepirCatDelegacion;
@Repository
public interface FepirCatDelegacionRepository extends JpaRepository<FepirCatDelegacion,Long>{

	List<FepirCatDelegacion> findAllByOrderByNomDelegacionAsc();
	
	@Query(value="SELECT new mx.gob.imss.fepac.autorizacion.bean.model.FepirCatDelegacion(D.cveDelegacion,D.nomDelegacion) FROM FepirCatDelegacion D order by D.nomDelegacion")
	ArrayList<FepirCatDelegacion>  finddelegacion();
 
	
	
	

}
