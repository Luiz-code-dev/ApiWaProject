package com.ApiManuten.oLaborat.riosExames.WaProject.entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_Exames_Imagens")
public class ExamesImagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
