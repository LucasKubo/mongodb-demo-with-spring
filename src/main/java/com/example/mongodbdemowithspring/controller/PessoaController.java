package com.example.mongodbdemowithspring.controller;

import com.example.mongodbdemowithspring.model.Pessoa;
import com.example.mongodbdemowithspring.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping
    public List<Pessoa> listarPessoas() {
        return pessoaRepository.findAll();
    }

    @PostMapping
    public Pessoa adicionarPessoa(@RequestBody Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }
}

