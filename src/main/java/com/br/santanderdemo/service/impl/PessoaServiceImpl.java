package com.br.santanderdemo.service.impl;

import com.br.santanderdemo.model.dto.PessoaDTO;
import com.br.santanderdemo.model.entity.PessoaEntity;
import com.br.santanderdemo.repository.PessoaRepository;
import com.br.santanderdemo.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    private PessoaRepository repository;

    public PessoaDTO cadastrar(PessoaDTO pessoaDTO) {
        PessoaEntity pessoa = new PessoaEntity();

        pessoa.setEmail(pessoaDTO.getEmail());
        pessoa.setNome(pessoaDTO.getNome());
        pessoa.setSenha(pessoaDTO.getSenha());
        pessoa.setTelefone(pessoaDTO.getTelefone());

        repository.save(pessoa);

        return pessoaDTO;
    }
}
