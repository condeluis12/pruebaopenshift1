package mx.gob.imss.fepac.autorizacion.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.gob.imss.fepac.autorizacion.bean.model.FepirAsigFolioMedico;
import mx.gob.imss.fepac.autorizacion.bean.model.FepirAsigFolioMedicoPK;
@Repository
public interface FepirAsigFolioMedicoRepository extends JpaRepository<FepirAsigFolioMedico,FepirAsigFolioMedicoPK>{

	@Query( "Select COUNT(*) from FepirAsigFolioMedico as FAM where FAM.matricula =?1  "
			+ "AND FAM.cvePresupuestal =?2  "
			+ "AND FAM.cveDelegacion=?3  AND FAM.programa =?4  "
			+ "AND FAM.trimPrograma =?5 AND FAM.cveEstatus=?6")
	Integer contarFolios(String matricula,String cvePresupuestal,Long cveDelegacion,Long programa,Long trimPrograma,long cveEstatus);
	
	
	@Query( value="Select FAM.CVE_BLOCK_FOLIO as cveBlockFolio,FAM.CVE_DELEGACION as cveDelegacion from FEPIR_ASIG_FOLIO_MEDICO FAM where FAM.NUM_FOLIO=?1",nativeQuery=true)
	String contar(String numFolio);


	FepirAsigFolioMedico findAllByNumFolio(String folio);

	/*FepirAsigFolioMedico findByCveDelegacionAndCvePresupuestalAndNumFolioAndMatriculaAndProgramaAndTrimProgramaAndCveBlockFolio(
			Long cveDelegacion, String cvePresupuestal, String folio, String matricula, Long prog, Long trim,
			String cveBlock);*/


	
}
