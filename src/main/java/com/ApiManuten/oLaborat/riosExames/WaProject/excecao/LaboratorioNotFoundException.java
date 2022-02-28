package com.ApiManuten.oLaborat.riosExames.WaProject.excecao;

public class LaboratorioNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private Long idLaboratorio;

	public LaboratorioNotFoundException(Long idLaboratorio) {
		this.idLaboratorio = idLaboratorio;
	}

	public Long getIdLaboratorio() {
		return idLaboratorio;
	}

	public void setIdLaboratorio(Long idLaboratorio) {
		this.idLaboratorio = idLaboratorio;
	}

}
