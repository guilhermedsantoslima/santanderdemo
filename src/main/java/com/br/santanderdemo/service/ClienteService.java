package com.br.santanderdemo.service;

import com.br.santanderdemo.exception.ClienteNaoEncontradoException;
import com.br.santanderdemo.model.dto.ClienteDTO;

import java.util.List;

public interface ClienteService {
    ClienteDTO cadastro(ClienteDTO clienteDTO);
    List<ClienteDTO> listar();
    ClienteDTO atualiza(Long id, ClienteDTO clienteDTO) throws ClienteNaoEncontradoException;
    void deleta(Long id) throws ClienteNaoEncontradoException;

}
