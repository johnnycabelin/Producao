package br.estacio.producao.controller;

import br.estacio.producao.model.ProducaoMensal;
import br.estacio.producao.service.ProducaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/producoes")
public class ProdutoController {

    @Autowired
    private ProducaoService producaoService;

    @GetMapping
    public List<ProducaoMensal> listarProducoes() {
        return producaoService.listarProducoes();
    }

    @GetMapping("/{id}")
    public Optional<ProducaoMensal> obterProducao(@PathVariable Long id) {
        return producaoService.obterProducaoPorId(id);
    }

    @PostMapping
    public ProducaoMensal criarProducao(@RequestBody ProducaoMensal producao) {
        return producaoService.salvarProducao(producao);
    }

    @DeleteMapping("/{id}")
    public void deletarProducao(@PathVariable Long id) {
        producaoService.deletarProducao(id);
    }
}