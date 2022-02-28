package com.ApiManuten.oLaborat.riosExames.WaProject.service;

import java.util.List;



import com.ApiManuten.oLaborat.riosExames.WaProject.dto.AtualizacaoLabDTO;
import com.ApiManuten.oLaborat.riosExames.WaProject.dto.LaboratorioDTO;
import com.ApiManuten.oLaborat.riosExames.WaProject.entities.Laboratorio;

public interface LaboratorioServices {
	
	public Laboratorio cadastrarLaboratorios(LaboratorioDTO laboratorioDTO); 

	public  List<Laboratorio> listarLaboratorio();
	public  Laboratorio getLaboratorio(Long idLaboratorio);

	public Laboratorio atualizarLaboratorio(AtualizacaoLabDTO laboratorioDTO, Long idLaboratorio);
	public  boolean deletarLaboratorio(Long idLaboratorio);

}
