package com.stefanini.stfinancial.mapper;

import com.stefanini.stfinancial.dto.EquipamentoDTO;
import com.stefanini.stfinancial.model.Equipamento;
import com.stefanini.stfinancial.request.EquipamentoRequest;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EquipamentoMapper {

    @Autowired
    private ModelMapper modelMapper;


    public Equipamento toEntity(EquipamentoRequest equipamentoRequest) {
        return modelMapper.map(equipamentoRequest, Equipamento.class);
    }

    public Equipamento toDto(EquipamentoDTO equipamentoDTO) {
        return modelMapper.map(equipamentoDTO, Equipamento.class);
    }

}
