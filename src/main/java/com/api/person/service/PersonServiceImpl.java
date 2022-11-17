package com.api.person.service;

import com.api.person.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonRepository personRepository;


}
