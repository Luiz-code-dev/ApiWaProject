package com.ApiManuten.oLaborat.riosExames.WaProject.dto;

import java.io.Serializable;

public class LaboratorioDTO implements Serializable {

    private static final long serialVersionUID = 1L;


      private Long id;;
      private String nome;
      private String endereco;
      private Boolean status;


    public LaboratorioDTO(Long id, String nome, String endereco, Boolean status) {
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
