package mx.gob.imss.fepac.autorizacion.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.gob.imss.fepac.autorizacion.bean.model.FepirFolioFepac;
@Repository
public interface FepirFolioFepacRepository  extends JpaRepository<FepirFolioFepac,String>{

	FepirFolioFepac findAllByNumFolio(String folio);
	
}
