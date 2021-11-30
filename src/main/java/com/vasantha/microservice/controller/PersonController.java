package com.vasantha.microservice.controller;

import com.vasantha.microservice.dto.Person;
import com.vasantha.microservice.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/person/")
    public ResponseEntity<Person> personRecord(@RequestParam int personId){
        Person person=personService.personData(personId);
        return new ResponseEntity<Person>(person,HttpStatus.OK);
    }

//    @GetMapping("/person/list")
//    public ResponseEntity<List<Person>> personRecord(){
//        List<Person> person=personService.personList();
//        return new ResponseEntity<List<Person>>(person,HttpStatus.OK);
//    }
}
