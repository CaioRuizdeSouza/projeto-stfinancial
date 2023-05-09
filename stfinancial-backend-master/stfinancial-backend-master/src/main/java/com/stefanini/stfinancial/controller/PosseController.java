package com.stefanini.stfinancial.controller;

import com.stefanini.stfinancial.mapper.PosseMapper;
import com.stefanini.stfinancial.model.Posse;
import com.stefanini.stfinancial.request.PosseRequest;
import com.stefanini.stfinancial.service.PosseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/stfinancial/posse")
public class PosseController {

    @Autowired
    private PosseService service;

    @Autowired
    private PosseMapper mapper;



    @GetMapping("/buscar/{id}")
    public Posse buscarPorId(@PathVariable Long id) {
        return service.findByIdPosse(id);
    }

    @RequestMapping(path = "/salvarPosse" , method = RequestMethod.POST)
    public ResponseEntity<?> salvarPosse(@RequestBody PosseRequest request) {
        Posse posse = mapper.toEntity(request);
        return ResponseEntity.ok(service.inserirPosse(posse));
    }
    @RequestMapping(path = "/alterarPosse" , method = RequestMethod.PUT)
    public ResponseEntity<?> alterarPosse(@RequestBody PosseRequest request) {
        Posse classe = mapper.toEntity(request);
        return ResponseEntity.ok(service.alterarPosse(classe));
    }
    @RequestMapping(path = "/deletarPosse/{id}" , method = RequestMethod.DELETE)
    public ResponseEntity<?> deletarPosse(@PathVariable Long id) {
//    	Posse classe = mapper.toEntity(req);
        return ResponseEntity.ok(service.deletarPosse(id));
    }
    @RequestMapping(path = "/listarPosse" , method = RequestMethod.GET)
    public ResponseEntity<?> listar() {
        return ResponseEntity.ok(service.listarPosse());
    }
}
