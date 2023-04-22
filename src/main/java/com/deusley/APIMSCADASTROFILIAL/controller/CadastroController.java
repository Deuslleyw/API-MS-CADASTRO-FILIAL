package com.deusley.APIMSCADASTROFILIAL.controller;

import com.deusley.APIMSCADASTROFILIAL.mapper.CadastroMapper;
import com.deusley.APIMSCADASTROFILIAL.service.CadastroService;
import com.deusley.provider.model.CrateFilialRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CadastroController {

    @Autowired
    private CadastroService cadastroService;

    public ResponseEntity<Void> cadastro(CrateFilialRequestVO cadastro){
        var cadastroMapper = CadastroMapper.toCadastro(cadastro);
        cadastroService.create(cadastroMapper);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
