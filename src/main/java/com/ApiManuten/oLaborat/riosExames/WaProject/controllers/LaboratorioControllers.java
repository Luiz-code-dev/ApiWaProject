package com.ApiManuten.oLaborat.riosExames.WaProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ApiManuten.oLaborat.riosExames.WaProject.dto.AtualizacaoLabDTO;
import com.ApiManuten.oLaborat.riosExames.WaProject.dto.LaboratorioDTO;
import com.ApiManuten.oLaborat.riosExames.WaProject.entities.Laboratorio;
import com.ApiManuten.oLaborat.riosExames.WaProject.repositories.LaboratorioRepository;
import com.ApiManuten.oLaborat.riosExames.WaProject.service.ExamesService;
import com.ApiManuten.oLaborat.riosExames.WaProject.service.LaboratorioServices;

@RestController
@RequestMapping(value = "/laboratorios")
public class LaboratorioControllers {


	@Autowired
	private LaboratorioServices laboratorioServico;

	@Autowired
	private ExamesService exameService;
	
	@Autowired /* Injeção de Dependencia */
	private LaboratorioRepository laboratorioRepository;
	
	
	
	@RequestMapping(value = "/cadastrar/{name}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public String greetingText(@PathVariable String name) {

		Laboratorio laboratorio = new Laboratorio();
		laboratorio.setNome(name);

		laboratorioRepository.save(laboratorio);/* gravar no banco de dados */

		return "Laboratorio cadastrado " + name + "!";
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Laboratorio> cadastrarLaboratorio(@Validated @RequestBody LaboratorioDTO laboratorioDTO) {
		return new ResponseEntity<Laboratorio>(laboratorioServico.cadastrarLaboratorios(laboratorioDTO),
				HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Laboratorio>> listarLaboratorios(
			@RequestParam(name = "nome", required = false) String nomeExame) {
		List<Laboratorio> lista;
		if (!ObjectUtils.isEmpty(nomeExame)) {
			lista = exameService.listarLaboratoriosAssociados(nomeExame);
		} else {
			lista = laboratorioServico.listarLaboratorio();
		}
		if (ObjectUtils.isEmpty(lista)) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Laboratorio>>(lista, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<Laboratorio> buscarLaboratorio(@PathVariable(value = "id") Long id) {
		Laboratorio lab = laboratorioServico.getLaboratorio(id);
		if (ObjectUtils.isEmpty(lab)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Laboratorio>(lab, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Laboratorio> atualizarLaboratorio(@PathVariable(value = "id") Long id,
			@Validated @RequestBody AtualizacaoLabDTO laboratorioDTO) {
		Laboratorio lab = laboratorioServico.atualizarLaboratorio(laboratorioDTO, id);
		if (ObjectUtils.isEmpty(lab)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Laboratorio>(lab, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> removerLaboratorio(@PathVariable(value = "id") Long id) {
		if (!laboratorioServico.deletarLaboratorio(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
