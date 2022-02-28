package com.ApiManuten.oLaborat.riosExames.WaProject.dto;

import java.io.Serializable;

public class LaboratorioDTO implements Serializable{


	private static final long serialVersionUID = 1L;


	
	private String nome;
	
	private String endereco;
	
	
	public LaboratorioDTO(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereço(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "LaboratorioDTO [nome=" + nome + ", endereco=" + endereco + "]";
	}
	
	
}
