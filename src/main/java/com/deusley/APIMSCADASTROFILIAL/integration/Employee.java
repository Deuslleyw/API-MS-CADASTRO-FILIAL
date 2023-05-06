package com.deusley.APIMSCADASTROFILIAL.integration;

import com.deusley.providerClient.model.GetEmployeeResponseVOc;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Component
public class Employee {

    Gson gson = new Gson();

    @Autowired
    private RestTemplate rest;

    public GetEmployeeResponseVOc findBy(String id) {

        try {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));

            HttpEntity<String> entity = new HttpEntity<>(httpHeaders);
            String URL = "http://maia.us-east-2.elasticbeanstalk.com/api/v1/employees/";
            ResponseEntity<String> responseEntity = rest.exchange(URL.concat(id), HttpMethod.GET, entity, String.class);

            return gson.fromJson(responseEntity.getBody(), GetEmployeeResponseVOc.class);
        } catch (Exception err) {
            throw new HttpClientErrorException(HttpStatus.UNPROCESSABLE_ENTITY,
                    "Erro ao se comunicar Com servidor externo");
        }

    }
}