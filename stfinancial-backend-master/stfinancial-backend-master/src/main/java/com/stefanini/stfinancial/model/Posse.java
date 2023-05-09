package com.stefanini.stfinancial.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Columns;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Posse implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @EqualsAndHashCode.Include
    private Long posseId;
    @Column
    @NotNull
    private Date dtLiberacao;
    @Column
    private Date dtDevolucao;
    @ManyToOne
    @JoinColumn(name = "fkMesComp", insertable = false, updatable = false, referencedColumnName = "mesComp")
    @JoinColumn(name = "fkMatricula", insertable = false, updatable = false, referencedColumnName = "matricula")
    private Profissional profissional;
    @ManyToOne
    @JoinColumn(name = "fkEquipamento", insertable = false, updatable = false,  referencedColumnName = "idEquipamento")
    private Equipamento equipamento;
    @NotNull
    @Column
    private Long fkEquipamento;
    @NotNull
    @Column
    private Long fkMatricula;
    @NotNull
    @Column
    private LocalDate fkMesComp;
    @NotNull
    @Column
    private Boolean ativo;

}