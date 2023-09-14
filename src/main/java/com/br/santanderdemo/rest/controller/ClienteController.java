package com.br.santanderdemo.rest.controller;

import com.br.santanderdemo.exception.ClienteNaoEncontradoException;
import com.br.santanderdemo.model.dto.ClienteDTO;
import com.br.santanderdemo.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping("/listar")
    public List<ClienteDTO> listaClientes() {

        return service.listar();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteDTO cadastro(@RequestBody @Valid ClienteDTO clienteDTO) {
        return service.cadastro(clienteDTO);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<ClienteDTO> atualizar(@PathVariable("id") Long id, @RequestBody @Valid ClienteDTO clienteDTO) throws ClienteNaoEncontradoException {
        return ResponseEntity.ok(service.atualiza(id, clienteDTO));
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletaCliente(@PathVariable("id") Long id) throws ClienteNaoEncontradoException {
        service.deleta(id);
    }
}
