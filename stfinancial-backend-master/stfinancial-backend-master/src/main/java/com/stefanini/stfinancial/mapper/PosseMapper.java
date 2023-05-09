package com.stefanini.stfinancial.mapper;

import com.stefanini.stfinancial.dto.PosseDTO;
import com.stefanini.stfinancial.model.*;
import com.stefanini.stfinancial.repository.EquipamentoRepository;
import com.stefanini.stfinancial.repository.PosseRepository;
import com.stefanini.stfinancial.repository.ProfissionalRepository;
import com.stefanini.stfinancial.request.PosseRequest;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PosseMapper {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ProfissionalRepository profissionalRepository;

    @Autowired
    private EquipamentoRepository equipamentoRepository;


    public Posse toEntity(PosseRequest posseRequest) {
        Profissional profissional = profissionalRepository.findById(new ProfissionalId(posseRequest.getIdProfissional().getMatricula(), posseRequest.getIdProfissional().getHorasMes())).get();
        posseRequest.setProfissional(profissional);

        Equipamento equipamento = equipamentoRepository.findById(posseRequest.getIdEquipamento()).get();
        posseRequest.setEquipamento(equipamento);

        return modelMapper.map(posseRequest, Posse.class);
    }


    public Posse toDto(PosseDTO posseDTO) {
        return modelMapper.map(posseDTO, Posse.class);
    }
}
