package br.estacio.producao.repository;

import br.estacio.producao.model.ProducaoMensal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducaoMensalRepository extends JpaRepository<ProducaoMensal, Long> {
}