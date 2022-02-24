package com.ApiManuten.oLaborat.riosExames.WaProject.controllers;

import com.ApiManuten.oLaborat.riosExames.WaProject.dto.LaboratorioDTO;
import com.ApiManuten.oLaborat.riosExames.WaProject.repositories.LaboratorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/laboratorios")
public class LaboratorioControllers {


    @Autowired
    private LaboratorioRepository repository;

    @GetMapping
    public ResponseEntity<Page<LaboratorioDTO>> findAll(Pageable pageable){
        Page<LaboratorioDTO> list = service.findAll(pageable);
        return ResponseEntity.ok(list);
    }

}
