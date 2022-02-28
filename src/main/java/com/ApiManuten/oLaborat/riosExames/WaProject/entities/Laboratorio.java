package com.ApiManuten.oLaborat.riosExames.WaProject.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "tb_laboratorios")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Laboratorio {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idLaboratorio;
	
	private String nome;
	
	private String endereco;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@ManyToMany(mappedBy = "listaLaboratorios")
	@JsonManagedReference
	private List<Exames> listaExames;
	
	public Laboratorio() {
		
	}

	public Long getIdLaboratorio() {
		return idLaboratorio;
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

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<Exames> getListaExames() {
		return listaExames;
	}

	public void setListaExames(List<Exames> listaExames) {
		this.listaExames = listaExames;
	}

	@Override
	public String toString() {
		return "Laboratorio [idLaboratorio=" + idLaboratorio + ", nome=" + nome + ", endereco=" + endereco + ", status="
				+ status + "]";
	}

	

	
}
