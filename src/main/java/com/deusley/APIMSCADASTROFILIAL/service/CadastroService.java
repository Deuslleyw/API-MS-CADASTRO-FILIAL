package com.deusley.APIMSCADASTROFILIAL.service;

import com.deusley.APIMSCADASTROFILIAL.domain.Cadastro;

public interface CadastroService {

    Cadastro create (Cadastro cadastro);

    Cadastro findById(String id);

}
