package com.stefanini.stfinancial.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import com.stefanini.stfinancial.model.Equipamento;
import com.stefanini.stfinancial.model.Profissional;
import com.stefanini.stfinancial.model.ProfissionalId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PosseDTO implements Serializable{

    private static final long serialVersionUID = 6017547239678754027L;

    private Long idPosse;
    private Long fkEquipamento;
    private Long fkMatricula;
    private LocalDate fkMesComp;
    private Date dtLiberacao;
    private Date dtDevolucao;
    private Profissional profissional;
    private ProfissionalId idProfissional;
    private Equipamento equipamento;
    private Long idEquipamento;
    private Boolean ativo;
}
