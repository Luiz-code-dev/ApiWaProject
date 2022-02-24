package com.ApiManuten.oLaborat.riosExames.WaProject.converter;

import org.springframework.core.convert.converter.Converter;

import com.ApiManuten.oLaborat.riosExames.WaProject.dto.ExamesDTO;
import com.ApiManuten.oLaborat.riosExames.WaProject.entities.Exames;

public class ExamesDtoExames implements Converter<ExamesDTO, Exames> {

	@Override
	public Exames convert(ExamesDTO exameDTO) {
		Exames exame = new Exames();
		exame.setNome(exameDTO.getNome());
		exame.setTipo(exameDTO.getTipo());
		return exame;
	}

}
