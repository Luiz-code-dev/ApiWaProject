package com.ApiManuten.oLaborat.riosExames.WaProject.entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_Exames Analise_Clinica")
public class ExamesAnaliseClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Boolean status;
}
