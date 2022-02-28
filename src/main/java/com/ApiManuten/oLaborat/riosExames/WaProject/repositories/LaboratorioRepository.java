package com.ApiManuten.oLaborat.riosExames.WaProject.repositories;

import com.ApiManuten.oLaborat.riosExames.WaProject.entities.Laboratorio;
import com.ApiManuten.oLaborat.riosExames.WaProject.entities.Status;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaboratorioRepository extends JpaRepository<Laboratorio, Long> {

	/* realiza uma busca por Laboratorio diretamente na tabela */
	public List<Laboratorio> findByStatus(Status status);

	public Laboratorio findByIdLaboratorioAndStatus(Long idLaboratorio, Status status);
}
