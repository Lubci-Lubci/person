package com.api.person.service;

import com.api.person.model.Person;

import java.util.List;

public interface PersonService {
    Person savePerson(Person person);

    List<Person> getAllPersons();

    List<Person> getPersonByEmployed(boolean employed);


}
