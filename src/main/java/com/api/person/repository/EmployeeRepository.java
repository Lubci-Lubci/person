package com.api.person.repository;

import com.api.person.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Person, Long> {


}
