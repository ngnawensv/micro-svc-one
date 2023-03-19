package com.belrose.microsvcone.service;

import com.belrose.microsvcone.pojo.Person;

public interface PersonService {
    Person sentPersonToServiceOne(Person person) throws Exception;
}
