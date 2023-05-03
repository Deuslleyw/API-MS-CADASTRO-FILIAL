package com.deusley.APIMSCADASTROFILIAL.repository;

import com.deusley.APIMSCADASTROFILIAL.domain.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, String> {

    Optional<Cadastro> findByCnpj(String cnpj);
}
