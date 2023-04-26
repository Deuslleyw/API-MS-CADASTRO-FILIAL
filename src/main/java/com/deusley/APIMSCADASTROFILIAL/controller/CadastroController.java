package com.deusley.APIMSCADASTROFILIAL.controller;

import com.deusley.APIMSCADASTROFILIAL.service.CadastroService;
import com.deusley.provider.model.CrateFilialRequestVO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/api/v1/filiais")
@RestController
@RequiredArgsConstructor
public class CadastroController {

    public static final String ID = "/{id}";

    @Autowired
    private CadastroService cadastroService;

    @Autowired
    private ModelMapper mapper;

    @PostMapping
    public ResponseEntity<CrateFilialRequestVO> cadastro(@RequestBody CrateFilialRequestVO obj) {
        var serv = cadastroService.create(obj);
        return ResponseEntity.status(HttpStatus.CREATED).build();
}
}