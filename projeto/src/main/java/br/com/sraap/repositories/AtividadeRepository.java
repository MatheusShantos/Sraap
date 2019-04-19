package br.com.sraap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.sraap.models.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade, Integer> {

}
