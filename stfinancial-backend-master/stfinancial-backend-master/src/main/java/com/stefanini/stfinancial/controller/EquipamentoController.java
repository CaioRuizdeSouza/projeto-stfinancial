package com.stefanini.stfinancial.controller;

import com.stefanini.stfinancial.mapper.EquipamentoMapper;
import com.stefanini.stfinancial.model.Equipamento;
import com.stefanini.stfinancial.request.EquipamentoRequest;
import com.stefanini.stfinancial.service.EquipamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/stfinancial/equipamento")
public class EquipamentoController {

    @Autowired
    private EquipamentoService service;

    @Autowired
    private EquipamentoMapper mapper;



    @GetMapping("/buscar/{id}")
    public Equipamento buscarPorId(@PathVariable Long id) {
        return service.findByIdEquipamento(id);
    }

    @RequestMapping(path = "/salvarEquipamento" , method = RequestMethod.POST)
    public ResponseEntity<?> salvarEquipamento(@RequestBody EquipamentoRequest request) {
        Equipamento equi = mapper.toEntity(request);
        return ResponseEntity.ok(service.inserirEquipamento(equi));
    }
    @RequestMapping(path = "/alterarEquipamento" , method = RequestMethod.PUT)
    public ResponseEntity<?> alterarEquipamento(@RequestBody EquipamentoRequest request) {
        Equipamento classe = mapper.toEntity(request);
        return ResponseEntity.ok(service.alterarEquipamento(classe));
    }
    @RequestMapping(path = "/deletarEquipamento/{id}" , method = RequestMethod.DELETE)
    public ResponseEntity<?> deletarEquipamento(@PathVariable Long id) {
//    	Equipamento classe = mapper.toEntity(req);
        return ResponseEntity.ok(service.deletarEquipamento(id));
    }
    @RequestMapping(path = "/listarEquipamentos" , method = RequestMethod.GET)
    public ResponseEntity<?> listar() {
        return ResponseEntity.ok(service.listarEquipamentos());
    }
}