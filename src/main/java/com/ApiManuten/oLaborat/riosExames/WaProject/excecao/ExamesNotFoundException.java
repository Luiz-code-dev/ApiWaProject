package com.ApiManuten.oLaborat.riosExames.WaProject.excecao;

public class ExamesNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private Long idExame;

	public ExamesNotFoundException(Long idExame) {
		this.idExame = idExame;
	}

	public Long getIdExame() {
		return idExame;
	}

	public void setIdExame(Long idExame) {
		this.idExame = idExame;
	}
}
