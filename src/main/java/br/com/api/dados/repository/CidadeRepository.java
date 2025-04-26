package br.com.api.dados.repository;

import br.com.api.dados.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {

   @Query("SELECT c.ocorrenciaUsuario, COUNT(c) FROM Cidade c GROUP BY c.ocorrenciaUsuario")
    List<Object[]>contagemDeOcorrencia();


}
