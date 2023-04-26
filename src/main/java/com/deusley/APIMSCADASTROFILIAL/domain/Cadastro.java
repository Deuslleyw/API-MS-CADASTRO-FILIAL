package com.deusley.APIMSCADASTROFILIAL.domain;

import com.deusley.APIMSCADASTROFILIAL.dto.GestorDTO;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.ArrayList;
import java.util.List;

@ToString
@NoArgsConstructor
@Setter
@Getter
@Document
public class Cadastro {

    @MongoId
    private String id;
    private String nome;
    private String cnpj;
    private String matriculaGestor;

    private List<GestorDTO> gestores = new ArrayList<>();

    public Cadastro(String id, String nome, String cnpj, String matriculaGestor) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.matriculaGestor = matriculaGestor;
    }
}
