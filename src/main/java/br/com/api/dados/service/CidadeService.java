package br.com.api.dados.service;

import br.com.api.dados.dto.CidadeDTO;
import br.com.api.dados.model.Cidade;
import br.com.api.dados.repository.CidadeRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;


@Service
public class CidadeService {
    private final CidadeRepository cidadeRepository;

    public CidadeService(CidadeRepository cidadeRepository) {
        this.cidadeRepository = cidadeRepository;
    }

    public CidadeDTO registroOcorrencia(CidadeDTO dto){

        BigDecimal permissao = BigDecimal.valueOf(18);

        if (dto.idadeUsuario().compareTo(permissao) >= 0){

            Cidade ocorrencia = new Cidade();
            ocorrencia.setNomeUsuario(dto.nomeUsuario());
            ocorrencia.setIdadeUsuario(dto.idadeUsuario());
            ocorrencia.setOcorrenciaUsuario(dto.ocorrenciaUsuario());
            ocorrencia.setCidadeUsuario(dto.cidadeUsuario());
            ocorrencia.setBairroUsuario(dto.bairroUsuario());
            ocorrencia.setDataOcorrencia(LocalDateTime.now());

            var validar = cidadeRepository.save(ocorrencia);

            return new CidadeDTO(
                    validar.getNomeUsuario(),
                    validar.getIdadeUsuario(),
                    validar.getOcorrenciaUsuario(),
                    validar.getCidadeUsuario(),
                    validar.getBairroUsuario(),
                    validar.getDataOcorrencia()

            );
        }

        throw new IllegalArgumentException("Idade informada não é permitido pois é menor que 18 anos");
    }

    public Map<String, Long> contagemOcorrencia(){
        var resultado = cidadeRepository.contagemDeOcorrencia();

        Map<String, Long> contagem = new HashMap<>();
        for (Object[] dados : resultado){
            String cidade = (String) dados[0];
            Long total = (Long) dados[1];
            contagem.put(cidade, total);
        }
        return contagem;
    }
}
