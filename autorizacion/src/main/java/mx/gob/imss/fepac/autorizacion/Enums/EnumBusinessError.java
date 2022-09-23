package mx.gob.imss.fepac.autorizacion.Enums;


public enum EnumBusinessError {
	SERVER_ERROR_INTERNAL(500, "Error interno."), SERVER_ERROR_UNIDADMEDICA(500, "Error en WS Contacto."),
	SERVER_ERROR_DELEGACION(500, "Error en WS Contacto."), SERVER_ERROR_VIGENCIA(500, "Error en vigencia.");

	
	private Integer codigo;

	private String descripcion;

	private EnumBusinessError(Integer codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
