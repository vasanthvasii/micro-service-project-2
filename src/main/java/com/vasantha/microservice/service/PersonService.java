package com.vasantha.microservice.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vasantha.microservice.dto.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Service
public class PersonService {

    @Value("${restapi.personById}")
    String personUrlByid;

    @Value("${restapi.personList}")
    String personUrlList;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ObjectMapper objectMapper;

    public Person personData(int personId){
        //step to make communicate
        //1 set uri variables

        HashMap<String,Integer> uriVariable=new HashMap<>();
        uriVariable.put("personId",personId);

        //2 set headers
        HttpHeaders header=new HttpHeaders();
        header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        //3. set entity
        HttpEntity<String> entity=new HttpEntity<>(header);

        //making call to another micro-service
        ResponseEntity<String> exchange=restTemplate.exchange(this.personUrlByid, HttpMethod.GET,entity,String.class,uriVariable);
        String body= exchange.getBody();

        //parsing data from json string
        Person readValue=null;
        try {
            readValue = objectMapper.readValue(body, Person.class);
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }

        return readValue;
    }

//    public List<Person> personList() {
//        ResponseEntity<String> person = restTemplate.exchange(this.personUrlList,HttpMethod.GET,entity,String.class);
//    return null;
//    }
}
