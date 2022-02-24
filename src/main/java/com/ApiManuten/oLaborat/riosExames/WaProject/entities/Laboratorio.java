package com.ApiManuten.oLaborat.riosExames.WaProject.entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_laboratorios")
public class Laboratorio {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;
    private Boolean status;

    public Laboratorio() {
    }

    public Laboratorio(Long id, String nome, String endereco, Boolean status) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
