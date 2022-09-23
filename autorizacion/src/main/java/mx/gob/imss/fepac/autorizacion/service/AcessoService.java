package mx.gob.imss.fepac.autorizacion.service;

import mx.gob.imss.fepac.autorizacion.bean.FepirCatPerfilRespond;
import mx.gob.imss.fepac.autorizacion.bean.UnidadMedicaRespond;
import mx.gob.imss.fepac.autorizacion.bean.Usuariorespond;
import mx.gob.imss.fepac.autorizacion.bean.model.FepirUsuarioAcceso;

public interface AcessoService {
	public Usuariorespond obtenerdelegacion(String username);
	public UnidadMedicaRespond obtenerUnidadMedica(String username);
	public FepirCatPerfilRespond obtenerPerfil(String username);
	public FepirUsuarioAcceso obtenernombreyapellido(String username);
}
