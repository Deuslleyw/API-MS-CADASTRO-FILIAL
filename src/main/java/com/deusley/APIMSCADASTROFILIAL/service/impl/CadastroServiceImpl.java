package com.deusley.APIMSCADASTROFILIAL.service.impl;

import com.deusley.APIMSCADASTROFILIAL.domain.Cadastro;
import com.deusley.APIMSCADASTROFILIAL.repository.CadastroRepository;
import com.deusley.APIMSCADASTROFILIAL.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroServiceImpl implements CadastroService {

    @Autowired
    private CadastroRepository rep;

    @Override
    public void create(Cadastro cadastro) {

        try {
            rep.save(cadastro);

        } catch (Exception exception) {
            System.out.println("Ops! Não é possivel Cadastrar");


        }
    }
}