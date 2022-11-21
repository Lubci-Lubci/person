package com.api.person.repository;

import com.api.person.model.Employee;
import com.api.person.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

//    @Transactional
//    void deleteById(long id);
//
//    @Transactional
//    void deleteByEmployeeId(long employeeId);

    @Transactional
    void deleteByPersonId(long personId);
}
