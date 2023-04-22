package com.deusley.APIMSCADASTROFILIAL.domain;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "TB_CADASTROS")
public class Cadastro {

    @Id
    private String id;
    private String nome;
    private String cnpj;
    private String matriculaGestor;

}
