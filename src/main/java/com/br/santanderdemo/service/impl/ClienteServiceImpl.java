package com.br.santanderdemo.service.impl;

import com.br.santanderdemo.exception.ClienteNaoEncontradoException;
import com.br.santanderdemo.model.dto.ClienteDTO;
import com.br.santanderdemo.model.entity.ClienteEntity;
import com.br.santanderdemo.repository.ClienteRepository;
import com.br.santanderdemo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Override
    public List<ClienteDTO> listar() {
        List<ClienteEntity> clienteEntities = repository.findAll();

        List<ClienteDTO> clienteDTOS = new ArrayList<>();

        // teste teste teste

        clienteEntities.forEach(clienteEntity -> {
            ClienteDTO clienteDTO = new ClienteDTO();

            clienteDTO.setNome(clienteEntity.getNome());
            clienteDTO.setCpf(clienteEntity.getCpf());
            clienteDTO.setRg(clienteEntity.getRg());
            clienteDTO.setAgencia(clienteEntity.getAgencia());
            clienteDTO.setConta(clienteEntity.getConta());
            clienteDTO.setGerente(clienteEntity.getGerente());

            clienteDTOS.add(clienteDTO);
        });
        return clienteDTOS;
    }

    @Override
    public ClienteDTO atualiza(Long id, ClienteDTO clienteDTO) throws ClienteNaoEncontradoException {
        Optional<ClienteEntity> clienteEntitiy = repository.findById(id);

        ClienteEntity cliente = repository.findByCpf(clienteDTO.getCpf());


        if (!clienteEntitiy.isPresent()) {
            throw new ClienteNaoEncontradoException();
       }

        cliente.setNome(clienteDTO.getNome());
        cliente.setCpf(clienteDTO.getCpf());
        cliente.setRg(clienteDTO.getRg());
        cliente.setAgencia(clienteDTO.getAgencia());
        cliente.setConta(clienteDTO.getConta());
        cliente.setGerente(clienteDTO.getGerente());

        repository.save(cliente);

        return clienteDTO;
    }

    @Override
    public void deleta(Long id){
        repository.deleteById(id);
    }

    @Override
    public ClienteDTO cadastro(ClienteDTO clienteDTO) {
        ClienteEntity cliente = new ClienteEntity();

        cliente.setNome(clienteDTO.getNome());
        cliente.setCpf(clienteDTO.getCpf());
        cliente.setRg(clienteDTO.getRg());
        cliente.setAgencia(clienteDTO.getAgencia());
        cliente.setConta(clienteDTO.getConta());
        cliente.setGerente(clienteDTO.getGerente());

        repository.save(cliente);

        return clienteDTO;
    }
}
