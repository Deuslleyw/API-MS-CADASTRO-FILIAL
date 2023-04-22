package com.deusley.APIMSCADASTROFILIAL.repository;

import com.deusley.APIMSCADASTROFILIAL.domain.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, String> {
}