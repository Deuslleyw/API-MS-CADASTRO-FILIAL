package com.deusley.APIMSCADASTROFILIAL.config;

import com.deusley.APIMSCADASTROFILIAL.domain.Cadastro;
import com.deusley.APIMSCADASTROFILIAL.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Profile(value = "test")
@Configuration
public class InstantiationDBTest implements CommandLineRunner {

    @Autowired
    private CadastroRepository cadRep;

    @Override
    public void run(String... args) throws Exception {

        cadRep.deleteAll();

        Cadastro cad1 = new Cadastro("002", "Dowglas", "29474994000201","007710");
        Cadastro cad2 = new Cadastro("007", "Diego", "29474994000202","007711");
        Cadastro cad3 = new Cadastro("0555", "joaquim", "29474994000203","007712");

        cadRep.saveAll(List.of(cad1, cad2, cad3));

    }
}
