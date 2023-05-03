package com.deusley.APIMSCADASTROFILIAL.service.impl;

import com.deusley.APIMSCADASTROFILIAL.domain.Cadastro;
import com.deusley.APIMSCADASTROFILIAL.exceptions.ObjectNotFoundException;
import com.deusley.APIMSCADASTROFILIAL.repository.CadastroRepository;
import com.deusley.APIMSCADASTROFILIAL.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CadastroServiceImpl implements CadastroService {

    @Autowired
    private CadastroRepository rep;

    @Override
    public Cadastro create(Cadastro cadastro) {
        findByCnpj(cadastro);
        return rep.save(cadastro);
    }

    @Override
    public Cadastro findById(String id) {
        Optional<Cadastro> obj = rep.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Não encontrado!"));
    }

    private void findByCnpj(Cadastro obj){
        Optional<Cadastro> cadastro = rep.findByCnpj(obj.getCnpj());
        if(cadastro.isPresent() && !cadastro.get().getId().equals(obj.getId())){
            throw new DataIntegrityViolationException("CNPJ JÁ CADASTRADO");
        }
    }

}
