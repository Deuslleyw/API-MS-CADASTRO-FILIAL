package com.deusley.APIMSCADASTROFILIAL.controller;

import com.deusley.APIMSCADASTROFILIAL.service.CadastroService;
import com.deusley.provider.model.CrateFilialRequestVO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;

@RequestMapping("/api/v1/filiais")
@RestController
@RequiredArgsConstructor
public class CadastroController {

    @Autowired
    private CadastroService cadastroService;

    @Autowired
    private ModelMapper mapper;

    @PostMapping
    public ResponseEntity<CrateFilialRequestVO> cadastro(@RequestBody CrateFilialRequestVO obj) {
        var serv = cadastroService.create(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand().toUri();
        return ResponseEntity.created(uri).build();
}


}