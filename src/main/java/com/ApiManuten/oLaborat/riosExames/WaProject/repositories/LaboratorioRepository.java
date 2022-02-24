package com.ApiManuten.oLaborat.riosExames.WaProject.repositories;

import com.ApiManuten.oLaborat.riosExames.WaProject.dto.LaboratorioDTO;
import com.ApiManuten.oLaborat.riosExames.WaProject.entities.Laboratorio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LaboratorioRepository extends JpaRepository<Laboratorio, Long>{

    List<LaboratorioDTO> amountGroupedByLaboratorio();
}
