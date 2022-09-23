package mx.gob.imss.fepac.autorizacion.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.gob.imss.fepac.autorizacion.bean.model.FepirFolioFepac;
import mx.gob.imss.fepac.autorizacion.bean.model.FepirFolioHistorico;
import mx.gob.imss.fepac.autorizacion.bean.model.FepirFolioHistoricoPK;

public interface FepirFolioHistoricoRepository extends JpaRepository<FepirFolioHistorico,FepirFolioHistoricoPK>{

}
