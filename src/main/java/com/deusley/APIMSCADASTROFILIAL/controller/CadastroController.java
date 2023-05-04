package com.deusley.APIMSCADASTROFILIAL.controller;


import com.deusley.APIMSCADASTROFILIAL.integration.Employee;
import com.deusley.APIMSCADASTROFILIAL.mapper.RequestCadastroMapper;
import com.deusley.APIMSCADASTROFILIAL.service.CadastroService;
import com.deusley.provider.api.FiliaisApi;
import com.deusley.provider.model.CrateFilialRequestVO;
import com.deusley.provider.model.GetFilialResponseVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;


@RequestMapping(value = "/api/v1/")
@RestController
@RequiredArgsConstructor
public class CadastroController implements FiliaisApi {

    @Autowired
    private CadastroService cadastroService;

    @Autowired
    private Employee integration;

    @Override
    public ResponseEntity<Void> create(CrateFilialRequestVO body) {
        var mapperCad = RequestCadastroMapper.toCadastro(body);
        var cadastro = cadastroService.create(mapperCad);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}").buildAndExpand(cadastro.getId()).toUri();
        return ResponseEntity.created(uri).build();

    }

    @Override
    public ResponseEntity<GetFilialResponseVO> getById(String id){

        var cadastro = cadastroService.findById(id);
        var employee = integration.findBy(cadastro.getMatriculaGestor());
        var mapperResponse = RequestCadastroMapper.fromFilial(cadastro, employee);

        return ResponseEntity.status(HttpStatus.OK).body(mapperResponse);
    }
}
