package com.stefanini.stfinancial.repository;

import com.stefanini.stfinancial.model.Posse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface PosseRepository extends JpaRepository<Posse, Long> {

    List<Posse> findByAtivo(Boolean ativo);

    @Modifying
    @Query("update Posse set ativo = false where posseId = :id")
    void alterarAtivo(Long id);
}