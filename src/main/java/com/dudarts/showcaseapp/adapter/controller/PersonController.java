package com.dudarts.showcaseapp.adapter.controller;

import com.dudarts.showcaseapp.domain.model.Person;
import com.dudarts.showcaseapp.port.inbound.PersonInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonInputPort personInputPort;

    @PostMapping("/persons")
    public Person createPerson(@RequestBody Person person) {
        return personInputPort.createPerson(person);
    }
}