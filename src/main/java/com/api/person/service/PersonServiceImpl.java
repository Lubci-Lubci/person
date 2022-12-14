package com.api.person.service;

import com.api.person.model.Person;
import com.api.person.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
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

    @Override
    public void savePersonFS(Person person) {
        this.personRepository.save(person);
    }

    @Override
    public Person updatePersonById(long id, Person person) {
        return null;
    }

    @Override
    public void deletePersonById(long id) {
        personRepository.deletePersonById(id);
    }

    @Override
    public Person getPersonById(long id) {
        Optional<Person> optional = this.personRepository.findById(id);
        Person person = null;

        if(optional.isPresent()){
            person = optional.get();
        }else{
            throw new RuntimeException("Employee with id " + id + " was not found");
        }

        return person;
    }
}
