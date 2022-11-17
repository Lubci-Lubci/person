package com.api.person.service;

import com.api.person.model.Person;
import com.api.person.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonRepository personRepository;


    @Override
    public Person savePerson(Person person) {
        Person _person = personRepository.save(person);

        return _person;
    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @Override
    public List<Person> getPersonByEmployed(boolean employed) {
        return personRepository.findByEmployed(employed);
    }


}
