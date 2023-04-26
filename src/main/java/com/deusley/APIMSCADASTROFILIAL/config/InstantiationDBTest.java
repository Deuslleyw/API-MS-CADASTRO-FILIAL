package com.deusley.APIMSCADASTROFILIAL.config;

import com.deusley.APIMSCADASTROFILIAL.domain.Cadastro;
import com.deusley.APIMSCADASTROFILIAL.dto.GestorDTO;
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

        GestorDTO gestor1 = new GestorDTO("007710", "paulo", "00114477885", "teste@gestor.com");
        GestorDTO gestor2 = new GestorDTO("0077111", "paulo Guesdes", "00114477886", "teste@gestor2.com");

        cad1.getGestores().add(gestor1);
        cad2.getGestores().add(gestor2);
        cad3.getGestores().add(gestor1);

        cadRep.saveAll(List.of(cad1, cad2, cad3));











    }
}
