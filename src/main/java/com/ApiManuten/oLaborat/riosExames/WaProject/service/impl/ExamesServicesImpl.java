package com.ApiManuten.oLaborat.riosExames.WaProject.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.ApiManuten.oLaborat.riosExames.WaProject.dto.AtualizacaoExamesDTO;
import com.ApiManuten.oLaborat.riosExames.WaProject.dto.ExamesDTO;
import com.ApiManuten.oLaborat.riosExames.WaProject.dto.IdLabDTO;
import com.ApiManuten.oLaborat.riosExames.WaProject.entities.Exames;
import com.ApiManuten.oLaborat.riosExames.WaProject.entities.Laboratorio;
import com.ApiManuten.oLaborat.riosExames.WaProject.entities.Status;
import com.ApiManuten.oLaborat.riosExames.WaProject.excecao.ExamesNotFoundException;
import com.ApiManuten.oLaborat.riosExames.WaProject.excecao.LaboratorioNotFoundException;
import com.ApiManuten.oLaborat.riosExames.WaProject.repositories.ExamesRepository;
import com.ApiManuten.oLaborat.riosExames.WaProject.service.LaboratorioServices;

@Service
public class ExamesServicesImpl {
	
	@Autowired
	private ExamesRepository ExamesRepositorio;

	@Autowired
	private LaboratorioServices laboratorioService;

	@Autowired
	private ConversionService conversionService;

	public Exames cadastrarExames(ExamesDTO ExamesDTO) {
		Exames Exames = conversionService.convert(ExamesDTO, Exames.class);
		Exames.setStatus(Status.ATIVO);
		return ExamesRepositorio.save(Exames);
	}

	public List<Exames> listarExames() {
		return ExamesRepositorio.findByStatus(Status.ATIVO);
	}

	public Exames getExames(Long idExames) {
		Optional<Exames> Exames = ExamesRepositorio.findById(idExames);
		if (ObjectUtils.isEmpty(Exames)) {
			return null;
		}
		return Exames.orElse(null);
	}

	public Exames getExamesAtivo(Long idExames) {
		Exames Exames = ExamesRepositorio.findByIdExamesAndStatus(idExames, Status.ATIVO);
		return Exames;
	}

	public Exames atualizarExames(Long idExames, AtualizacaoExamesDTO ExamesDTO) {
		Exames Exames = getExames(idExames);
		if (ObjectUtils.isEmpty(Exames)) {
			return null;
		}
		Exames.setNome(ExamesDTO.getNome());
		Exames.setTipo(ExamesDTO.getTipo());
		Exames.setStatus(ExamesDTO.getStatus());
		return ExamesRepositorio.save(Exames);
	}

	public boolean removerExames(Long idExames) {
		Exames Exames = getExamesAtivo(idExames);
		if (ObjectUtils.isEmpty(Exames)) {
			return false;
		}
		Exames.setStatus(Status.INATIVO);
		ExamesRepositorio.save(Exames);
		return true;
	}

	public Exames associarExamesComLaboratorio(Long idExames, IdLabDTO idLab) {
		Exames Exames = getExames(idExames);
		if (ObjectUtils.isEmpty(Exames)) {
			throw new ExamesNotFoundException(idExames);
		}
		Laboratorio lab;
	
			lab = LaboratorioServices.getLaboratorio(idLab.getIdLaboratorio());
		if (ObjectUtils.isEmpty(lab)) {
			throw new LaboratorioNotFoundException(idLab.getIdLaboratorio());
		}
		Exames.getListaLaboratorios().add(lab);
		return ExamesRepositorio.save(Exames);
	}

	public List<Laboratorio> listarLaboratoriosAssociados(String nome) {
		Exames Exames = ExamesRepositorio.findByNome(nome);
		if (ObjectUtils.isEmpty(Exames)) {
			return null;
		}
		return Exames.getListaLaboratorios();
	}

	public Exames desassociarExamesDeLaboratorio(Long idExames, IdLabDTO idLab) {
		Exames Exames = getExames(idExames);
		if (ObjectUtils.isEmpty(Exames)) {
			throw new ExamesNotFoundException(idExames);
		}
		Laboratorio lab = null;
		for (Laboratorio l : Exames.getListaLaboratorios()) {
			if (l.getIdLaboratorio().equals(idLab.getIdLaboratorio())) {
				lab = l;
			}
		}
		if (ObjectUtils.isEmpty(lab)) {
			return null;
		}
		Exames.getListaLaboratorios().remove(lab);
		return ExamesRepositorio.save(Exames);
	}

}
