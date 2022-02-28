package com.ApiManuten.oLaborat.riosExames.WaProject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiManuten.oLaborat.riosExames.WaProject.entities.Laboratorio;
import com.ApiManuten.oLaborat.riosExames.WaProject.entities.Status;


public interface LaboratorioRepository extends JpaRepository<Laboratorio, Long> {

	
	public List<Laboratorio> findByStatus(Status status);

	public Laboratorio findByIdLaboratorioAndStatus(Long idLaboratorio, Status status);
}
