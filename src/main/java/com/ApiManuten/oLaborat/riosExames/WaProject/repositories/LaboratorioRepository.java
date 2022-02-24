package com.ApiManuten.oLaborat.riosExames.WaProject.repositories;

import com.ApiManuten.oLaborat.riosExames.WaProject.entities.Laboratorio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaboratorioRepository extends JpaRepository<Laboratorio, Long>{

    /* realiza uma busca por Laboratorio diretamente na tabela */
    Laboratorio findById(long id);
}
