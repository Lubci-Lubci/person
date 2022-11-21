package com.api.person.service;

import com.api.person.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;
//@Service
public interface PersonService {
    Person savePerson(Person person);

    List<Person> getAllPersons();

    List<Person> getPersonByEmployed(boolean employed);

    void savePersonFS(Person person);   //method for full-stack

    Person getPersonById(long id);

    Person updatePersonById(long id, Person person);

    void deletePersonById(long id);

}
