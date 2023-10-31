package com.example.personsdemo.controller;

import com.example.personsdemo.entity.Persons;
import com.example.personsdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonsController {
    private final PersonService personService;

    @Autowired
    public PersonsController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Persons> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/{id}")
    public Optional<Persons> getPersonById(@PathVariable Long id) {
        return personService.getPersonById(id);
    }

    @PostMapping
    public void addPerson(@RequestBody Persons person) {
        personService.addPerson(person);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
    }

    @GetMapping("/count")
    public long countPersons() {
        return personService.countPersons();
    }
}
