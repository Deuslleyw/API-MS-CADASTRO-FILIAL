package com.deusley.APIMSCADASTROFILIAL.mapper;

import com.deusley.APIMSCADASTROFILIAL.domain.Cadastro;
import com.deusley.provider.model.CrateFilialRequestVO;

import java.util.UUID;

public class RequestCadastroMapper {

    public static Cadastro toCadastro(CrateFilialRequestVO bodyVO){
        var uid = String.valueOf(UUID.randomUUID());
        return Cadastro.builder()

                .id(uid)
                .nome(bodyVO.getNome())
                .cnpj(bodyVO.getCnpj())
                .matriculaGestor(bodyVO.getMatriculaGestor())
                .build();
    }
}
