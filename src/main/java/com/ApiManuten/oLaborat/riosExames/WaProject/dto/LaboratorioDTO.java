package com.ApiManuten.oLaborat.riosExames.WaProject.dto;

public class LaboratorioDTO {

	
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
}
