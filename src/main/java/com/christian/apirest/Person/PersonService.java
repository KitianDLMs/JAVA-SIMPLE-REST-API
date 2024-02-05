package com.christian.apirest.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {

    @Autowired
    private PersonRepository personRepo;
    
    public void createPerson(Person person) {
        personRepo.save(person);
    }
}
