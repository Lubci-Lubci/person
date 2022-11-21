package com.api.person.service;

import com.api.person.model.Employee;
import com.api.person.model.Person;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
    boolean existsEmployeeById(long id);
    void deleteByPersonId(long personId);
}
