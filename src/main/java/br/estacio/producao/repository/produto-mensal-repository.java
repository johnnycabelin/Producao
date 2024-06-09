package com.empresa.producao.repository;

import com.empresa.producao.model.ProducaoMensal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducaoMensalRepository extends JpaRepository<ProducaoMensal, Long> {
}