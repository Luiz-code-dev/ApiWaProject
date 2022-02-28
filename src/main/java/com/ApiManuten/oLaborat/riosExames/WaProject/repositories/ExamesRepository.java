package com.ApiManuten.oLaborat.riosExames.WaProject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiManuten.oLaborat.riosExames.WaProject.entities.Exames;
import com.ApiManuten.oLaborat.riosExames.WaProject.entities.Status;



public interface ExamesRepository extends JpaRepository<Exames, Long> {

	public List<Exames> findByStatus(Status status);

	public Exames findByNome(String nome);

	public Exames findByIdExamesAndStatus(Long idExame, Status status);
}
