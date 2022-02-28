package com.ApiManuten.oLaborat.riosExames.WaProject.dto;

import java.io.Serializable;

import com.ApiManuten.oLaborat.riosExames.WaProject.entities.Status;
import com.ApiManuten.oLaborat.riosExames.WaProject.entities.TiposExames;

public class AtualizacaoExamesDTO implements Serializable{


	private static final long serialVersionUID = 1L;

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

	@Override
	public String toString() {
		return "AtualizacaoExamesDTO [nome=" + nome + ", tipo=" + tipo + ", status=" + status + "]";
	}
	
	
}
