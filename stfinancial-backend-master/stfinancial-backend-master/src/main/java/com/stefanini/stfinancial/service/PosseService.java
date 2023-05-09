package com.stefanini.stfinancial.service;

import java.util.List;
import java.util.Optional;

import com.stefanini.stfinancial.model.Equipamento;
import com.stefanini.stfinancial.model.Posse;
import com.stefanini.stfinancial.model.Usuario;
import com.stefanini.stfinancial.repository.PosseRepository;
import com.stefanini.stfinancial.request.PosseRequest;
import com.stefanini.stfinancial.request.UsuarioRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PosseService {

    @Autowired
    private final PosseRepository repo;

    public Posse findByIdPosse(Long id) {
        return repo.findById(id).get();
    }
    public Posse inserirPosse(Posse posse) {
        return repo.save(posse);
    }
    public List<Posse> listarPosse() {
        return repo.findByAtivo(true);
    }
    public Posse alterarPosse(Posse posse) { return repo.save(posse); }

    public String deletarPosse(Long id) {
        repo.alterarAtivo(id);
        return "Posse desativada";
    }

}
