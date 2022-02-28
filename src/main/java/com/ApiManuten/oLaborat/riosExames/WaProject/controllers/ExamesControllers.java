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

import com.ApiManuten.oLaborat.riosExames.WaProject.dto.AtualizacaoExamesDTO;
import com.ApiManuten.oLaborat.riosExames.WaProject.dto.ExamesDTO;
import com.ApiManuten.oLaborat.riosExames.WaProject.dto.IdLabDTO;
import com.ApiManuten.oLaborat.riosExames.WaProject.entities.Exames;
import com.ApiManuten.oLaborat.riosExames.WaProject.service.ExamesService;

public class ExamesControllers {
	
	@Autowired
	private ExamesService Exameservice;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Exames> cadastrarExames(@Validated @RequestBody ExamesDTO ExamesDTO) {
		return new ResponseEntity<Exames>(Exameservice.cadastrarExame(ExamesDTO), HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Exames>> listarExames() {
		List<Exames> lista = Exameservice.listarExames();
		if (ObjectUtils.isEmpty(lista)) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Exames>>(lista, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Exames> atualizarExames(@Validated @RequestBody AtualizacaoExamesDTO ExamesDTO,
			@PathVariable(value = "id") Long id) {
		Exames Exames = Exameservice.atualizarExames(id, ExamesDTO);
		if (ObjectUtils.isEmpty(Exames)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Exames>(Exames, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<Exames> buscarExames(@PathVariable(value = "id") Long idExames) {
		Exames Exames = Exameservice.getExame(idExames);
		if (ObjectUtils.isEmpty(Exames)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Exames>(Exames, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public ResponseEntity<Void> removerExames(@PathVariable(value = "id") Long idExames) {
		if (Exameservice.removerExames(idExames)) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@RequestMapping(value = "/{id}/laboratorios", method = RequestMethod.POST)
	public ResponseEntity<Exames> associarExamesComLaboratorio(@Validated @RequestBody IdLabDTO idLaboratorio,
			@PathVariable(value = "id") Long idExames) {
		Exames Exames = Exameservice.associarExamesComgLaboratorio(idExames, idLaboratorio);
		return new ResponseEntity<Exames>(Exames, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}/laboratorios", method = RequestMethod.DELETE)
	public ResponseEntity<Exames> desassociarExamesDeLaboratorio(@Validated @RequestBody IdLabDTO idLaboratorio,
			@PathVariable(value = "id") Long idExames) {
		Exames Exames = Exameservice.desassociarExamesDeLaboratorio(idExames, idLaboratorio);
		if (ObjectUtils.isEmpty(Exames)) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Exames>(Exames, HttpStatus.OK);
	}
}
