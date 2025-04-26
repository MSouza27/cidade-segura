package br.com.api.dados.controller;

import br.com.api.dados.dto.CidadeDTO;
import br.com.api.dados.service.CidadeService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/ocorrencia")
public class CidadeController {
    private final CidadeService cidadeService;

    public CidadeController(CidadeService cidadeService) {
        this.cidadeService = cidadeService;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<CidadeDTO> salvar(@RequestBody @Valid CidadeDTO dto){
        var dados = cidadeService.registroOcorrencia(dto);
        return ResponseEntity.status(201).body(dados);
    }

    @GetMapping("/dados")
    @Transactional
    public ResponseEntity<Map<String, Long>> listarEstatisticaOcorrencia(){
        return ResponseEntity.ok(cidadeService.contagemOcorrencia());
    }
}
