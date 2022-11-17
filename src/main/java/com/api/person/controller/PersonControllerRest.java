package com.api.person.controller;

import com.api.person.model.Person;
import com.api.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonControllerRest {

    @Autowired
    private PersonService personService;

    @PostMapping("/persons")
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        try {
            Person _person = personService.savePerson(new Person(person.getFirstName(), person.getLastName(),
                    person.getAge(), person.getCountry(), person.getNationality(), person.isEmployed()));

            return new ResponseEntity<>(_person, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/persons")
    public ResponseEntity<List<Person>> getAllPersons(@RequestParam(required = false) String lastName){
        try{
            List<Person> persons = new ArrayList<>();

            if (lastName == null){
                persons = personService.getAllPersons();
                // I HAVE TO RE DO AND FINISH THIS ELSE create getPersonByLastName
            }else {
                System.out.println("");
//                persons = personService.getPersonByLastName;
            }

            if (persons.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(persons, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }



}
