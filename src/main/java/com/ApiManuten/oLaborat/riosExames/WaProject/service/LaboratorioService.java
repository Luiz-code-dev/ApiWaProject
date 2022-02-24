package com.ApiManuten.oLaborat.riosExames.WaProject.service;

import com.ApiManuten.oLaborat.riosExames.WaProject.dto.LaboratorioDTO;
import com.ApiManuten.oLaborat.riosExames.WaProject.repositories.LaboratorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class LaboratorioService {

        @Autowired
        private LaboratorioRepository repository;

        public Page<LaboratorioDTO> findAll(Pageable pageable){

        }
}
