package com.br.santanderdemo.rest.controller;

import com.br.santanderdemo.model.dto.PessoaDTO;
import com.br.santanderdemo.service.PessoaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cadastrar")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PessoaDTO cadastro(@RequestBody @Valid PessoaDTO pessoaDTO) {
        return service.cadastrar(pessoaDTO);

    }
}
