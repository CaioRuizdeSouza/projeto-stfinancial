package com.stefanini.stfinancial.request;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.stefanini.stfinancial.model.*;

import lombok.*;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PosseRequest implements Serializable{

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