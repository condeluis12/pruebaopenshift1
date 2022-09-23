package mx.gob.imss.fepac.autorizacion.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import mx.gob.imss.fepac.autorizacion.bean.model.FepirCatPerfil;
import mx.gob.imss.fepac.autorizacion.bean.model.FepirCatTurno;

public interface FepirCatTurnoRepository extends JpaRepository<FepirCatTurno,Long>{

	@Query(value="SELECT new mx.gob.imss.fepac.autorizacion.bean.model.FepirCatTurno(g.cveTurno,g.nomTurno) FROM FepirCatTurno g")
    List<FepirCatTurno> findCatTurno();
	
	
}
