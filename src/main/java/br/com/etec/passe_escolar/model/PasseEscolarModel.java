package br.com.etec.passe_escolar.model;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_passe_escolar")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PasseEscolarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_estudante", nullable = false, length = 100)
    private String nomeEstudante;

    @Column(name = "cpf", nullable = false, length = 14, unique = true)
    private String cpf;

    @Column(name = "instituicao_ensino", nullable = false, length = 100)
    private String instituicaoEnsino;

    @Column(name = "saldo_recarga", nullable = false, precision = 10, scale = 2)
    private BigDecimal saldoRecarga;

    @Column(name = "ativo", nullable = false, length = 10)
    private String ativo;

    @Column(name = "data_solicitacao", nullable = false)
    private LocalDateTime dataSolicitacao;
}