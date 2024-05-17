package com.dudarts.showcaseapp.infrastructure.persistence;

import com.dudarts.showcaseapp.domain.model.Person;
import com.dudarts.showcaseapp.port.outbound.PersonOutputPort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaPersonRepository extends JpaRepository<Person, Long>, PersonOutputPort {
}