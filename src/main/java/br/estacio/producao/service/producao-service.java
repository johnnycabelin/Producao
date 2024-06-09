package com.empresa.producao.service;

import com.empresa.producao.model.ProducaoMensal;
import com.empresa.producao.repository.ProducaoMensalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProducaoService {

    @Autowired
    private ProducaoMensalRepository producaoMensalRepository;

    public List<ProducaoMensal> listarProducoes() {
        return producaoMensalRepository.findAll();
    }

    public Optional<ProducaoMensal> obterProducaoPorId(Long id) {
        return producaoMensalRepository.findById(id);
    }

    public ProducaoMensal salvarProducao(ProducaoMensal producao) {
        return producaoMensalRepository.save(producao);
    }

    public void deletarProducao(Long id) {
        producaoMensalRepository.deleteById(id);
    }
}