package mx.gob.imss.fepac.autorizacion.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mx.gob.imss.fepac.autorizacion.bean.FepirCatPerfilRespond;
import mx.gob.imss.fepac.autorizacion.bean.MedicosRespond;
import mx.gob.imss.fepac.autorizacion.bean.UnidadMedicaRespond;
import mx.gob.imss.fepac.autorizacion.bean.Usuariorespond;
import mx.gob.imss.fepac.autorizacion.bean.model.FepirCatDelegacion;
import mx.gob.imss.fepac.autorizacion.bean.model.FepirUsuarioAcceso;
import mx.gob.imss.fepac.autorizacion.bean.model.FepirUsuarioAccesoPK;


public interface FepirUsuarioAccesoRepository extends JpaRepository<FepirUsuarioAcceso,FepirUsuarioAccesoPK> {
	@Query(value="  SELECT ACCESO_FEPAC.VALIDAR_ACCESO(:matricula,:password) FROM dual",nativeQuery = true)
	Integer validaracceso(String matricula,String password);
	
	/*@Query(value="  SELECT ACCESO_FEPAC.OBTENER_USUARIO_ACCESO(:matricula,:password) FROM dual",nativeQuery = true)
	UsuarioBean obtenerusuarioacceso(String matricula,String password);*/
	
	FepirUsuarioAcceso findByCveUsuario(String matricula);

	@Query(value="SELECT new mx.gob.imss.fepac.autorizacion.bean.Usuariorespond(a.cveDelegacion , a.nomDelegacion) FROM FepirCatDelegacion a JOIN a.fepirUsuarioAccesos b WHERE b.cveUsuario=?1" )
	Usuariorespond findelegacionypresupuestal(String matricula);
	
	@Query(value="SELECT new mx.gob.imss.fepac.autorizacion.bean.UnidadMedicaRespond(z.cvePresupuestal,z.nomUnidadMedica,c.apPaterno,c.apMaterno,c.nombre) FROM FepirUnidadMedica z JOIN z.fepirUsuarioAcceso c WHERE c.cveUsuario=?1" )
	UnidadMedicaRespond findunidadmedica(String matricula);
	
	@Query(value="SELECT new mx.gob.imss.fepac.autorizacion.bean.FepirCatPerfilRespond(c.cveUsuario,z.cvePerfil,z.nomPerfil) FROM FepirCatPerfil z JOIN z.fepirUsuarioAccesos c WHERE c.cveUsuario=?1" )
	FepirCatPerfilRespond findperfil(String matricula);
	
	@Query(value="SELECT new mx.gob.imss.fepac.autorizacion.bean.MedicosRespond(c.cveUsuario,c.apPaterno,c.apMaterno,c.nombre,c.fecAlta) FROM FepirUsuarioAcceso c" )
	MedicosRespond findMedicos();
	
	@Query(value="SELECT new mx.gob.imss.fepac.autorizacion.bean.model.FepirUsuarioAcceso(c.cveDelegacion,c.cvePresupuestal) FROM FepirUsuarioAcceso c WHERE c.cveUsuario=?1" )
	FepirUsuarioAcceso findCveDelegacionandCvePresupuestal(String matricula);
	
	@Query(value="SELECT new mx.gob.imss.fepac.autorizacion.bean.model.FepirUsuarioAcceso(c.cveDelegacion,c.cveUsuario,c.cvePresupuestal) FROM FepirUsuarioAcceso c WHERE c.cveUsuario=?1" )
	FepirUsuarioAcceso findCveDelegacionandCvePresupuestalandCveUsuario(String matricula);
	
	/*@Modifying
	@Query("UPDATE FepirUsuarioAcceso FUA set FUA.cveDelegacion = :newCveDelegacion , FUA.apMaterno = :newApMaterno, FUA.apPaterno = :newApPaterno , \" +\r\n"
			+ "					\" FUA.cip = :newCip, FUA.fecAlta = :newFecAlta, FUA.nombre = :newNombre, FUA.cvePresupuestal = :newCvePresupuestal ,\" +\r\n"
			+ "					\" FUA.fepirCatPerfil.cvePerfil = :newCvePerfil where FUA.cveUsuario = :oldCveUsuario AND FUA.cveDelegacion = :oldCveDelegacion ")
	void updateUser(@Param("newCveDelegacion") Long n1,@Param("newApMaterno") String n2,@Param("newApPaterno") String n3,@Param("newCip") String n4,@Param("newFecAlta") Date n5,@Param("newNombre") String n6,@Param("newCvePresupuestal") String n7,@Param("newCvePerfil") Long n8,@Param("oldCveUsuario") String n9 ,@Param("oldCveDelegacion") Long n10); 
	*/

	
}
