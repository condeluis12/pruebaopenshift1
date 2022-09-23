package mx.gob.imss.fepac.autorizacion.auth;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import mx.gob.imss.fepac.autorizacion.ServiceImpl.AccesoServiceServiceImpl;
import mx.gob.imss.fepac.autorizacion.bean.FepirCatPerfilRespond;
import mx.gob.imss.fepac.autorizacion.bean.UnidadMedicaRespond;
import mx.gob.imss.fepac.autorizacion.bean.Usuariorespond;
import mx.gob.imss.fepac.autorizacion.bean.model.FepirUsuarioAcceso;
import mx.gob.imss.fepac.autorizacion.service.AcessoService;
@Component
public class InfoAdicionalToken implements TokenEnhancer{
	static Logger logger = Logger.getLogger(InfoAdicionalToken.class);
	@Autowired
	private AcessoService acessoService;
	
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		FepirUsuarioAcceso FepirUsuarioAcceso=acessoService.obtenernombreyapellido(authentication.getName());
		UnidadMedicaRespond unidadMedica=acessoService.obtenerUnidadMedica(authentication.getName());
		Usuariorespond delegacion=acessoService.obtenerdelegacion(authentication.getName());
		FepirCatPerfilRespond perfil=acessoService.obtenerPerfil(authentication.getName());
		Map<String,Object> info=new HashMap<>();
		info.put("cveDelegacion",delegacion.getCveDelegacion());
		info.put("nomDelegacion",delegacion.getNomDelegacion());
		try {
			info.put("cvePresupuestal",unidadMedica.getCvePresupuestal());
		}catch(Exception e) {
			info.put("cvePresupuestal",null);
		}
			try {
		info.put("nomUnidadMedica",unidadMedica.getNomUnidadMedica());
			}
			catch(Exception e) {
				info.put("nomUnidadMedica",null);
			}
			
		info.put("apPaterno",FepirUsuarioAcceso.getApPaterno());
		info.put("apMaterno",FepirUsuarioAcceso.getApMaterno());
		info.put("nombre",FepirUsuarioAcceso.getNombre());
		info.put("cvePerfil",perfil.getCvePerfil());
		info.put("nomPerfil",perfil.getNomPerfil());
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		return accessToken;
	}

}
