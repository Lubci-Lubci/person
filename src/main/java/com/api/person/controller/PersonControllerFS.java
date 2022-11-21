package com.api.person.controller;

import com.api.person.model.Person;
import com.api.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonControllerFS {

    private PersonService personService;

    @Autowired
    public PersonControllerFS(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public String getAllPersons(Model model) {
        model.addAttribute("listOfPersons", personService.getAllPersons());

        return "persons/index";
    }

    @GetMapping("/persons/showNewPersonsForm")
    public String showNewPersonsForm(Model model) {
        model.addAttribute("person", new Person());

        return "persons/new";
    }

    @PostMapping("/persons/savePerson")
    public String savePerson(@ModelAttribute Person person) {
        personService.savePersonFS(person);

        return "redirect:/persons";
    }

    @GetMapping("/persons/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model){
        Person person = personService.getPersonById(id);

        model.addAttribute("person", person);

        return "persons/update";
    }

    @GetMapping("/employees/showFormForDelete/{id}")
    public String showFormForDelete(@PathVariable(value = "id") long id){
        personService.deletePersonById(id);

        return "redirect:/persons";
    }
}
