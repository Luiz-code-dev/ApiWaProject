package com.ApiManuten.oLaborat.riosExames.WaProject.converter;

import org.springframework.core.convert.converter.Converter;

import com.ApiManuten.oLaborat.riosExames.WaProject.dto.LaboratorioDTO;
import com.ApiManuten.oLaborat.riosExames.WaProject.entities.Laboratorio;

public class LaboratorioDtoLaboratorio implements Converter<LaboratorioDTO, Laboratorio> {

	@Override
	public Laboratorio convert(LaboratorioDTO laboratorioDTO) {
		Laboratorio lab = new Laboratorio();
		lab.setNome(laboratorioDTO.getNome());
		lab.setEndereco(laboratorioDTO.getEndereco());
		return lab;
	}

}
