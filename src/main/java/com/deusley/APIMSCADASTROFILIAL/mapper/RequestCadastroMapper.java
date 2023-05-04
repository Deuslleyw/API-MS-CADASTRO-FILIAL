package com.deusley.APIMSCADASTROFILIAL.mapper;

import com.deusley.APIMSCADASTROFILIAL.domain.Cadastro;
import com.deusley.provider.model.CrateFilialRequestVO;
import com.deusley.provider.model.GestorFilialResponseVO;
import com.deusley.provider.model.GetFilialResponseVO;
import com.deusley.providerClient.model.GetEmployeeResponseVOc;

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

    public static GetFilialResponseVO fromFilial(Cadastro cadastro, GetEmployeeResponseVOc employee){
        var responseVO = new GetFilialResponseVO();

        responseVO.setCnpj(cadastro.getCnpj());
        responseVO.setId(cadastro.getId());
        responseVO.setNome(cadastro.getNome());
        responseVO.setDataCriacao(cadastro.getDataCriacao());
        responseVO.setDataUpdate(cadastro.getDataAtualizacao());
        responseVO.setGestor(getGestorFilial(employee));
        return responseVO;

    }
    public static GestorFilialResponseVO getGestorFilial(GetEmployeeResponseVOc employee){
        var gestor = new GestorFilialResponseVO();

        gestor.setCpf(employee.getCpf());
        gestor.setNome(employee.getName());
        gestor.setEmail(employee.getEmail());
        gestor.setMatricula(employee.getEnroll());

        return gestor;

    }
}
