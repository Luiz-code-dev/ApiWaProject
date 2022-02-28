package com.ApiManuten.oLaborat.riosExames.WaProject.dto;

import com.ApiManuten.oLaborat.riosExames.WaProject.entities.Status;
import com.ApiManuten.oLaborat.riosExames.WaProject.entities.TiposExames;

public class AtualizacaoExamesDTO {


	private String nome;

	private TiposExames tipo;
	
	private Status status;
	
	

	public AtualizacaoExamesDTO(String nome, TiposExames tipo, Status status) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.status = status;
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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
