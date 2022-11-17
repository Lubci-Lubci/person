package com.api.person.controller;

import com.api.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PersonControllerFS {

    private PersonService personService;

    @Autowired

    public PersonControllerFS(PersonService personService) {
        this.personService = personService;
    }
}
