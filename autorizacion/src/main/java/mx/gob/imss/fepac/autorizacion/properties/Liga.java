package mx.gob.imss.fepac.autorizacion.properties;

public enum Liga {
	
	LIGA_REASIGNAR_BLOCKS("http://172.31.240.190:7001/FepacCimaWS/transferencia/"),
	LIGA_REASIGNAR_FOLIOS_MEDICO("http://172.31.240.190:7001/FepacCimaWS/reasignarFoliosMed/"),
	LIGA_REASIGNAR_FOLIOS_UNIDAD("http://172.31.240.190:7001/FepacCimaWS/reasignarBlocksUni/"),
	LIGA_REACTIVAR_FOLIOS("http://172.31.240.190:7001/FepacCimaWS/reactivaFolios/"),
	LIGA_REPORTE_TRANSFERENCIA("http://172.31.240.190:7001/FepacCimaWS/reporteTrans/"),
	LIGA_REPORTE_TRANSFERENCIA_DESCARGA("http://172.31.240.190:7001/FepacCimaWS/reporteTrans/guardarReporte/");
	
	private String lig;

	private Liga(String lig) {
		this.lig = lig;
	}

	public String getLig() {
		return lig;
	}

	public void setLig(String lig) {
		this.lig = lig;
	}

	

}
