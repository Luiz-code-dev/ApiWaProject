package com.ApiManuten.oLaborat.riosExames.WaProject.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.ApiManuten.oLaborat.riosExames.WaProject.dto.AtualizacaoLabDTO;
import com.ApiManuten.oLaborat.riosExames.WaProject.dto.LaboratorioDTO;
import com.ApiManuten.oLaborat.riosExames.WaProject.entities.Laboratorio;
import com.ApiManuten.oLaborat.riosExames.WaProject.entities.Status;
import com.ApiManuten.oLaborat.riosExames.WaProject.repositories.LaboratorioRepository;

@Service
public class LaboratorioService {
	
	@Autowired
	private LaboratorioRepository laboratorioRepositorio;

	@Autowired
	private ConversionService conversionService;

	public Laboratorio cadastrarLaboratorio(LaboratorioDTO laboratorioDTO) {
		Laboratorio laboratorio = conversionService.convert(laboratorioDTO, Laboratorio.class);
		laboratorio.setStatus(Status.ATIVO);
		return laboratorioRepositorio.save(laboratorio);
	}

	public List<Laboratorio> listarLaboratorio() {
		return laboratorioRepositorio.findByStatus(Status.ATIVO);
	}

	public Laboratorio getLaboratorio(Long idLaboratorio) {
		Optional<Laboratorio> lab;

		lab = laboratorioRepositorio.findById(idLaboratorio);
		return lab.orElse(null);
	}

	public Laboratorio getLaboratorioAtivo(Long idLaboratorio) {
		Laboratorio lab = laboratorioRepositorio.findByIdLaboratorioAndStatus(idLaboratorio, Status.ATIVO);
		return lab;
	}

	public Laboratorio atualizarLaboratorio(AtualizacaoLabDTO laboratorioDTO, Long idLaboratorio) {
		Laboratorio lab = getLaboratorio(idLaboratorio);
		if (ObjectUtils.isEmpty(lab)) {
			return null;
		}
		lab.setEndereco(laboratorioDTO.getEndereco());
		lab.setNome(laboratorioDTO.getNome());
		lab.setStatus(laboratorioDTO.getStatus());

		return laboratorioRepositorio.save(lab);
	}

	public boolean deletarLaboratorio(Long idLaboratorio) {
		Laboratorio lab = getLaboratorioAtivo(idLaboratorio);
		if (ObjectUtils.isEmpty(lab)) {
			return false;
		}
		lab.setStatus(Status.INATIVO);
		laboratorioRepositorio.save(lab);
		return true;
	}

}
