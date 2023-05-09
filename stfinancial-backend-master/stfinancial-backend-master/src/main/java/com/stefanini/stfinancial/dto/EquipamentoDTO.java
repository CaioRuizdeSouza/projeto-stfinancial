package com.stefanini.stfinancial.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EquipamentoDTO implements Serializable{

    private static final long serialVersionUID = 6017547239678754027L;

    private Long idEquipamento;
    private String tipoEquipamento;
    private String descricao;
    private Date dataCompra;
    private BigDecimal valorEquipamento;
}
