package com.deusley.APIMSCADASTROFILIAL.service.impl;

import com.deusley.APIMSCADASTROFILIAL.domain.Cadastro;
import com.deusley.APIMSCADASTROFILIAL.repository.CadastroRepository;
import com.deusley.APIMSCADASTROFILIAL.service.CadastroService;
import com.deusley.provider.model.CrateFilialRequestVO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CadastroServiceImpl implements CadastroService {

    @Autowired
    private CadastroRepository rep;

    @Autowired
    private ModelMapper mapper;


    @Override
    public Cadastro create(CrateFilialRequestVO obj) {

        return rep.save(mapper.map(obj, Cadastro.class));
    }
}
