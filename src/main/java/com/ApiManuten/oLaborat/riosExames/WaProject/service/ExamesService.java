package com.ApiManuten.oLaborat.riosExames.WaProject.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ApiManuten.oLaborat.riosExames.WaProject.dto.AtualizacaoExamesDTO;
import com.ApiManuten.oLaborat.riosExames.WaProject.dto.ExamesDTO;
import com.ApiManuten.oLaborat.riosExames.WaProject.dto.IdLabDTO;
import com.ApiManuten.oLaborat.riosExames.WaProject.entities.Exames;
import com.ApiManuten.oLaborat.riosExames.WaProject.entities.Laboratorio;


public interface ExamesService {
	
	public Exames cadastrarExame(ExamesDTO examesDTO);

	public List<Exames> listarExames();

	public Exames getExame(Long idExame);

	public Exames atualizarExames(Long idExame, AtualizacaoExamesDTO exameDTO);

	public boolean removerExames(Long idExame);

	public Exames associarExamesComgLaboratorio(Long idExame, IdLabDTO idLab);

	public List<Laboratorio> listarLaboratoriosAssociados(String nome);

	public Exames desassociarExamesDeLaboratorio(Long idExame, IdLabDTO idLab);

}
