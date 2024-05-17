package com.dudarts.showcaseapp.port.inbound;

import com.dudarts.showcaseapp.domain.model.Person;

public interface PersonInputPort {
    Person createPerson(Person person);
}
