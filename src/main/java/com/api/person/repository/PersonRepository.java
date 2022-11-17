package com.api.person.repository;

import com.api.person.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByEmployed(boolean employed); // it will basicly return all amplyees

}
