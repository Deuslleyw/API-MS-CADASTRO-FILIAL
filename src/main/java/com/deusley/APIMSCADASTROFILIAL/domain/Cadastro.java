package com.deusley.APIMSCADASTROFILIAL.domain;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "CadastroFilial")
public class Cadastro {

    @Id
    private String id;
    private String nome;
    private String cnpj;
    private String matriculaGestor;

    }

