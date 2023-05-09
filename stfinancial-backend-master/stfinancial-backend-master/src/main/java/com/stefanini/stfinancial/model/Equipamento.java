package com.stefanini.stfinancial.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Equipamento implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEquipamento;
    @Column
    @NotNull
    private String tipoEquipamento;
    @Column
    @NotNull
    private String descricao;
    @Column
    @NotNull
    private Date dataCompra;
    @Column
    @NotNull
    private BigDecimal valorEquipamento;

    @OneToMany(fetch = FetchType.LAZY , mappedBy = "equipamento")
    @JsonIgnore
    private List<Posse> posses;
}