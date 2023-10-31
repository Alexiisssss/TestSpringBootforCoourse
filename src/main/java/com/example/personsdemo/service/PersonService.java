package com.example.personsdemo.service;


import com.example.personsdemo.entity.Persons;
import com.example.personsdemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Persons> getAllPersons() {
        return (List<Persons>) personRepository.findAll();
    }

    public Optional<Persons> getPersonById(Long id) {
        return personRepository.findById(id);
    }

    public void addPerson(Persons person) {
        personRepository.save(person);
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

    public long countPersons() {
        return personRepository.count();
    }
}