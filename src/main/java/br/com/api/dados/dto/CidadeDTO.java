package br.com.api.dados.dto;


import java.math.BigDecimal;
import java.time.LocalDateTime;

public record CidadeDTO(
        String nomeUsuario,
        BigDecimal idadeUsuario,
        String cidadeUsuario,
        String bairroUsuario,
        String ocorrenciaUsuario,
        LocalDateTime dataOcorrencia
) {
}
