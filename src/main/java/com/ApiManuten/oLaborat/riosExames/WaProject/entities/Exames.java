package com.ApiManuten.oLaborat.riosExames.WaProject.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name = "tb_Exames")
public class Exames {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idExame;
	private String nome;
	@Enumerated(EnumType.STRING)
	private TiposExames tipo;
	@Enumerated(EnumType.STRING)
	private Status status;
	@ManyToMany
	@JoinTable(name = "laboratorio_exame", joinColumns = {
			@JoinColumn(name = "idExame", referencedColumnName = "idExame") }, inverseJoinColumns = {
					@JoinColumn(name = "idLaboratorio", referencedColumnName = "idLaboratorio") })
	@JsonBackReference
	private List<Laboratorio> listaLaboratorios;

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

	public Long getIdExame() {
		return idExame;
	}

	public List<Laboratorio> getListaLaboratorios() {
		return listaLaboratorios;
	}

	public void setListaLaboratorios(List<Laboratorio> listaLaboratorios) {
		this.listaLaboratorios = listaLaboratorios;
	}

	@Override
	public String toString() {
		return "Exame [idExame=" + idExame + ", nome=" + nome + ", tipo=" + tipo + ", status=" + status + "]";
	}
}
