package mx.gob.imss.fepac.autorizacion.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.gob.imss.fepac.autorizacion.bean.model.FepirCatPerfil;

public interface FepirCatPerfilRepository  extends  JpaRepository<FepirCatPerfil,Long>{
	@Query("SELECT f FROM FepirCatPerfil f")
     List<FepirCatPerfil> findNomPefil();
	
	
	@Query("SELECT f.nomPerfil FROM FepirCatPerfil f")
   List<String> findNomPefil2();
	
	@Query("SELECT f.cvePerfil FROM FepirCatPerfil f")
   List<Long> findNomPefil3();
	
	@Query("SELECT f.cvePerfil ,f.nomPerfil FROM FepirCatPerfil f")
   List<FepirCatPerfil> findNomPefil4();
	
	
	@Query("SELECT f FROM FepirCatPerfil f")
	   List<String> findNomPefil5();
}
