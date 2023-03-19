package com.belrose.microsvcone.service.impl;

import com.belrose.microsvcone.pojo.Person;
import com.belrose.microsvcone.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public Person sentPersonToServiceOne(Person person) throws Exception {
        try{
            log.info(String.format("{%s} well received by service one  .............",person));
        return person;
        }catch (Exception ex){
            throw new Exception("Error  to send data..............",ex);
        }
    }
}
