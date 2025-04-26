package br.com.api.dados.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "cidade")
@Getter
@Setter
public class Cidade {

    private final static String COMPO_OBRIGATORIO = "O campo não pode ser vazio!";
    private final static String TAMANHO_CAMPO = "O campo precisar ter de 3 até 20 caracteres!";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = COMPO_OBRIGATORIO)
    @Size(min = 3, max = 20, message = TAMANHO_CAMPO)
    private String nomeUsuario;

    @NotNull(message = COMPO_OBRIGATORIO)
    private BigDecimal idadeUsuario;

    @NotBlank(message = COMPO_OBRIGATORIO)
    @Size(min = 3, max = 20, message = TAMANHO_CAMPO)
    private String cidadeUsuario;

    @NotBlank(message = COMPO_OBRIGATORIO)
    @Size(min = 3, max = 20, message = TAMANHO_CAMPO)
    private String bairroUsuario;

    @NotBlank(message = COMPO_OBRIGATORIO)
    @Size(min = 3, max = 20, message = TAMANHO_CAMPO)
    private String ocorrenciaUsuario;

    @JsonFormat(pattern = "yyyy/MM/dd")
    @Column(nullable = false, updatable = false)
    private LocalDateTime dataOcorrencia;


}
