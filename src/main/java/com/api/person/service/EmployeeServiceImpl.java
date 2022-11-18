package com.api.person.service;

import com.api.person.model.Employee;
import com.api.person.model.Person;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public Employee saveEmployee(Employee employee) {
        return null;
    }

    @Override
    public Person getEmployeeById(long id) {
        return null;
    }

    @Override
    public void deleteEmployeeById(long id) {

    }

    @Override
    public boolean existsEmployeeById(long id) {
        return false;
    }

    @Override
    public void deleteByPersonId(long personId) {

    }
}
