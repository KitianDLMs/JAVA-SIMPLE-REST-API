package com.christian.apirest.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    

    @Autowired
    private PersonService personService;
    
    @PostMapping
    public void createPersona(@RequestBody Person person) {
        personService.createPerson(person);
    }

    @GetMapping
    public String welcome() {
        return "Welcome Spring Security";
    }
}
