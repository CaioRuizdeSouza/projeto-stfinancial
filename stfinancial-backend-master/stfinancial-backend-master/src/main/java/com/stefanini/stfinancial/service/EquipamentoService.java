package com.stefanini.stfinancial.service;

import java.util.List;
import java.util.Optional;

import com.stefanini.stfinancial.model.Equipamento;
import com.stefanini.stfinancial.model.Profissional;
import com.stefanini.stfinancial.repository.EquipamentoRepository;
import com.stefanini.stfinancial.request.EquipamentoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EquipamentoService {

    @Autowired
    private final EquipamentoRepository repo;

    public Equipamento findByIdEquipamento(Long id) {
        return repo.findById(id).get();
    }

    public String inserirEquipamento(Equipamento profissional) {
       boolean existe = repo.existsById(profissional.getIdEquipamento());

       if(existe == true){
           return "Equipamento já existe";
       }else{
           repo.save(profissional);
           return "Equipamento cadastrado";
       }
    }
    public List<Equipamento> listarEquipamentos() {
        return repo.findAll();
    }
    public Equipamento alterarEquipamento(Equipamento equipamento) {
        return repo.save(equipamento);
    }
    public String deletarEquipamento(Long id) {
        repo.deleteById(id);
        return "Equipamento deletado com sucesso";
    }

}
