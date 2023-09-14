package com.br.santanderdemo.model.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {

    @NotEmpty(message = "{campo.nome.obrigatorio}")
    private String nome;

    @NotEmpty(message = "{campo.cpf.obrigatorio}")
    @CPF(message = "{campo.cpf.invalido}")
    private String cpf;

    @NotEmpty(message = "{campo.rg.obrigatorio}")
    private String rg;

    @NotEmpty(message = "{campo.agencia.obrigatorio}")
    private String agencia;

    @NotEmpty(message = "{campo.conta.obrigatorio}")
    private String conta;

    @NotEmpty(message = "{campo.gerente.obrigatorio}")
    private String gerente;
}
