package mx.gob.imss.fepac.autorizacion.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.gob.imss.fepac.autorizacion.Enums.EnumRoles;
import mx.gob.imss.fepac.autorizacion.Repository.FepirUsuarioAccesoRepository;
import mx.gob.imss.fepac.autorizacion.bean.FepirCatPerfilRespond;
import mx.gob.imss.fepac.autorizacion.bean.UnidadMedicaRespond;
import mx.gob.imss.fepac.autorizacion.bean.Usuariorespond;
import mx.gob.imss.fepac.autorizacion.bean.model.FepirUsuarioAcceso;
import mx.gob.imss.fepac.autorizacion.service.AcessoService;

@Service
public class AccesoServiceServiceImpl implements AcessoService, UserDetailsService {
	private static Logger logger = Logger.getLogger(AccesoServiceServiceImpl.class);
	@Autowired
	FepirUsuarioAccesoRepository fepirUsuarioAccesoRepository;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		FepirUsuarioAcceso usuario = fepirUsuarioAccesoRepository.findByCveUsuario(username);
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		if (usuario.getCvePerfil().equals(EnumRoles.ROLE_ADMINISTRADOR_DEL_SISTEMA_CUMAE.getCode()))
			authorities
					.add(new SimpleGrantedAuthority(EnumRoles.ROLE_ADMINISTRADOR_DEL_SISTEMA_CUMAE.getDescription()));
		else if (usuario.getCvePerfil().equals(EnumRoles.ROLE_ADMINISTRADOR_DEL_SISTEMA_EN_UNIDAD_ESPECIAL.getCode()))
			authorities.add(new SimpleGrantedAuthority(
					EnumRoles.ROLE_ADMINISTRADOR_DEL_SISTEMA_EN_UNIDAD_ESPECIAL.getDescription()));
		else if (usuario.getCvePerfil().equals(EnumRoles.ROLE_DIRECTIVO_DE_DELEGACION.getCode()))
			authorities.add(new SimpleGrantedAuthority(EnumRoles.ROLE_DIRECTIVO_DE_DELEGACION.getDescription()));
		else if (usuario.getCvePerfil().equals(EnumRoles.ROLE_DIRECTIVO_DE_UNIDAD.getCode()))
			authorities.add(new SimpleGrantedAuthority(EnumRoles.ROLE_DIRECTIVO_DE_UNIDAD.getDescription()));
		else if (usuario.getCvePerfil()
				.equals(EnumRoles.ROLE_ADMINISTRADOR_DEL_SISTEMA_EN_ALMACEN_DELEGACIONAL.getCode()))
			authorities.add(new SimpleGrantedAuthority(
					EnumRoles.ROLE_ADMINISTRADOR_DEL_SISTEMA_EN_ALMACEN_DELEGACIONAL.getDescription()));
		else if (usuario.getCvePerfil().equals(EnumRoles.ROLE_ADMINISTRADOR_DEL_SISTEMA_EN_UNIDAD.getCode())) {
			authorities.add(
					new SimpleGrantedAuthority(EnumRoles.ROLE_ADMINISTRADOR_DEL_SISTEMA_EN_UNIDAD.getDescription()));
		} else if (usuario.getCvePerfil().equals(EnumRoles.ROLE_MEDICO_AUTORIZADO_PARA_EXPEDIR_OCI.getCode()))
			authorities.add(
					new SimpleGrantedAuthority(EnumRoles.ROLE_MEDICO_AUTORIZADO_PARA_EXPEDIR_OCI.getDescription()));
		else if (usuario.getCvePerfil().equals(EnumRoles.ROLE_SISTEMA_TRAMITADOR_DE_FOLIOS.getCode()))
			authorities.add(new SimpleGrantedAuthority(EnumRoles.ROLE_SISTEMA_TRAMITADOR_DE_FOLIOS.getDescription()));
		else if (usuario.getCvePerfil().equals(EnumRoles.ROLE_SISTEMA_RECEPTOR_DE_FOLIOS.getCode()))
			authorities.add(new SimpleGrantedAuthority(EnumRoles.ROLE_SISTEMA_RECEPTOR_DE_FOLIOS.getDescription()));
		else if (usuario.getCvePerfil().equals(EnumRoles.ROLE_SISTEMA_TRAMITADOR_DE_FOLIOS.getCode()))
			authorities.add(new SimpleGrantedAuthority(EnumRoles.ROLE_SISTEMA_TRAMITADOR_DE_FOLIOS.getDescription()));
		else if (usuario.getCvePerfil().equals(EnumRoles.ROLE_SISTEMA_RECEPTOR_DE_FOLIOS.getCode()))
			authorities.add(new SimpleGrantedAuthority(EnumRoles.ROLE_SISTEMA_RECEPTOR_DE_FOLIOS.getDescription()));
		else if (usuario.getCvePerfil().equals(EnumRoles.ROLE_SISTEMA_HIBRIDO.getCode()))
			authorities.add(new SimpleGrantedAuthority(EnumRoles.ROLE_SISTEMA_HIBRIDO.getDescription()));
		else if (usuario.getCvePerfil().equals(EnumRoles.ROLE_ADMINISTRADOR_DEL_SISTEMA_TOTAL.getCode()))
			authorities
					.add(new SimpleGrantedAuthority(EnumRoles.ROLE_ADMINISTRADOR_DEL_SISTEMA_TOTAL.getDescription()));
		else if (usuario.getCvePerfil().equals(EnumRoles.ROLE_SECCIÓN_DELEGACIONAL_DE_CONTROL_DE_RECETARIOS.getCode()))
			authorities.add(new SimpleGrantedAuthority(
					EnumRoles.ROLE_SECCIÓN_DELEGACIONAL_DE_CONTROL_DE_RECETARIOS.getDescription()));
		else if (usuario.getCvePerfil().equals(EnumRoles.ROLE_ADMINISTRADOR_DEL_SISTEMA.getCode()))
			authorities.add(new SimpleGrantedAuthority(EnumRoles.ROLE_ADMINISTRADOR_DEL_SISTEMA.getDescription()));

		return new User(usuario.getCveUsuario(), usuario.getPassword(), true, true, true, true, authorities);

	}

	@Override
	public Usuariorespond obtenerdelegacion(String username) {
		// TODO Auto-generated method stub
		return fepirUsuarioAccesoRepository.findelegacionypresupuestal(username);
	}

	@Override
	public UnidadMedicaRespond obtenerUnidadMedica(String username) {
		// TODO Auto-generated method stub
		return fepirUsuarioAccesoRepository.findunidadmedica(username);
	}

	@Override
	public FepirCatPerfilRespond obtenerPerfil(String username) {
		// TODO Auto-generated method stub
		return fepirUsuarioAccesoRepository.findperfil(username);
	}

	@Override
	public FepirUsuarioAcceso obtenernombreyapellido(String username) {
		// TODO Auto-generated method stub
		return fepirUsuarioAccesoRepository.findByCveUsuario(username);
	}

}
