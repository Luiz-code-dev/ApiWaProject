package com.ApiManuten.oLaborat.riosExames.WaProject.excecao;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ControleAdvice {
	
	@ExceptionHandler(ExamesNotFoundException.class)
	public ResponseEntity<Message<Long>> ExamesNotFoundException(ExamesNotFoundException ex) {
		Message<Long> mensagem = new Message<>("Exame não encontrado", ex.getIdExame());
		return new ResponseEntity<Message<Long>>(mensagem, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(LaboratorioNotFoundException.class)
	public ResponseEntity<Message<Long>> LaboratorioNotFoundException(LaboratorioNotFoundException ex) {
		Message<Long> mensagem = new Message<>("Laboratório não encontrado", ex.getIdLaboratorio());
		return new ResponseEntity<Message<Long>>(mensagem, HttpStatus.BAD_REQUEST);

	}
}
