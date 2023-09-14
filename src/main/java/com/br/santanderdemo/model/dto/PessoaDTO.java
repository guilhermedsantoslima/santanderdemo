package com.br.santanderdemo.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDTO {

    @NotEmpty(message = "{campo.email.obrigatorio}")
    @Email(message = "{campo.email.inválido}")
    private String email;

    @NotEmpty(message = "{campo.nome.obrigatorio}")
    private String nome;

    @NotEmpty(message = "{campo.senha.obrigatorio}")
    private String senha;

    @NotEmpty(message = "{campo.telefone.obrigatorio}")
    private String telefone;

}
