package com.dudarts.showcaseapp.port.outbound;

import com.dudarts.showcaseapp.domain.model.Person;

public interface PersonOutputPort {
    Person savePerson(Person person);
}
