package mx.gob.imss.fepac.autorizacion.properties;

public enum Estados {

	ASIGNADO_DELEGACION(108), RECIBIDO_SEDECOR(802), ASIGNADO_SEDECOR(808), CANCELADO_SEDECOR(103),
	ASIGNADO_MEDICO(110), RECIBIDO_COBCIR(804), ASIGNADO_A_MEDICO(110), EXPEDIDO(117), RECIBIDO_UMAE(814),
	PRECANCELADO_COBCIR(805), REASIGNADO_DELEGACION(808), REASIGNADO_UMAES(812), PRECANCELADO_UMAE(816),
	DEVOLUCION_PARCIAL(817);

	private int code;

	private Estados(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
}
