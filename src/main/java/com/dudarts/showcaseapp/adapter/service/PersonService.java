package com.dudarts.showcaseapp.adapter.service;


import com.dudarts.showcaseapp.domain.model.Person;
import com.dudarts.showcaseapp.port.inbound.PersonInputPort;
import com.dudarts.showcaseapp.port.outbound.PersonOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements PersonInputPort {

    @Autowired
    private PersonOutputPort personOutputPort;

    @Override
    public Person createPerson(Person person) {
        return personOutputPort.savePerson(person);
    }
}
