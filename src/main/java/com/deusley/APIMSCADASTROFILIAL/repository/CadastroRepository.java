package com.deusley.APIMSCADASTROFILIAL.repository;

import com.deusley.APIMSCADASTROFILIAL.domain.Cadastro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository extends MongoRepository<Cadastro, String> {
}
