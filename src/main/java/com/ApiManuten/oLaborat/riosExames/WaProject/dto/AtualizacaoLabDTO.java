package com.ApiManuten.oLaborat.riosExames.WaProject.dto;

import com.ApiManuten.oLaborat.riosExames.WaProject.entities.Status;

public class AtualizacaoLabDTO {


	private String nome;

	private String endereco;

	private Status status;
	
	

	public AtualizacaoLabDTO(String nome, String endereco, Status status) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
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
