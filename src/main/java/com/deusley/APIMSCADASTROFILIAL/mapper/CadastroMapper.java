//package com.deusley.APIMSCADASTROFILIAL.mapper;
//
//import com.deusley.APIMSCADASTROFILIAL.domain.Cadastro;
//import com.deusley.provider.model.CrateFilialRequestVO;
//
//import java.util.UUID;
//
//public class CadastroMapper {
//
//    public static Cadastro toCadastro(CrateFilialRequestVO request){
//        String id = String.valueOf(UUID.randomUUID());
//        return Cadastro.builder()
//                .nome(request.getNome())
//                .cnpj(request.getCnpj())
//                .matriculaGestor(request.getMatriculaGestor())
//                .build();
//    }
//}
