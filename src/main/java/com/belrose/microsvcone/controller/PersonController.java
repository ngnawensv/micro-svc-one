package com.belrose.microsvcone.controller;


import com.belrose.microsvcone.pojo.Person;
import com.belrose.microsvcone.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping(path = "/person",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Mono<Person>> SendPerson(@RequestBody Person person){
        try{
            Mono<Person> response = personService.sentPersonToServiceOne(person);
            return ResponseEntity.ok(response);
        }catch (Exception ex){
            ex.getStackTrace();
            return null;
        }

    }
}
