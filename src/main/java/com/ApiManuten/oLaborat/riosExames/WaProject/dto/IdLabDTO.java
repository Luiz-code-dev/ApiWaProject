package com.ApiManuten.oLaborat.riosExames.WaProject.dto;

import java.io.Serializable;

public class IdLabDTO implements Serializable{


	private static final long serialVersionUID = 1L;

	
	private Long idLaboratorio;

	public Long getIdLaboratorio() {
		return idLaboratorio;
	}

	public void setIdLaboratorio(Long idLaboratorio) {
		this.idLaboratorio = idLaboratorio;
	}

	@Override
	public String toString() {
		return "IdLabDTO [idLaboratorio=" + idLaboratorio + "]";
	}

	
}
