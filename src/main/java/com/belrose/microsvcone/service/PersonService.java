package com.belrose.microsvcone.service;

import com.belrose.microsvcone.pojo.Person;
import reactor.core.publisher.Mono;

public interface PersonService {
    Mono<Person> sentPersonToServiceOne(Person person) throws Exception;
}
