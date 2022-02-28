package com.ApiManuten.oLaborat.riosExames.WaProject.dto;

import java.io.Serializable;

import com.ApiManuten.oLaborat.riosExames.WaProject.entities.TiposExames;

public class ExamesDTO implements Serializable{


	private static final long serialVersionUID = 1L;

	
	
	private String nome;
	
	private TiposExames tipo;
	
	
	
	

	public ExamesDTO(String nome) {
		super();
		this.nome = nome;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TiposExames getTipo() {
		return tipo;
	}

	public void setTipo(TiposExames tipo) {
		this.tipo = tipo;
	}
}
