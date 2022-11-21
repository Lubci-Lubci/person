package com.api.person.service;

import com.api.person.model.Employee;
import com.api.person.model.Person;
import com.api.person.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()){
            return employee.get();
        }
        return null;
    }

    @Override
    public void deleteEmployeeById(long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public boolean existsEmployeeById(long id) {
        return false;
    }

    @Override
    public void deleteByPersonId(long personId) {
        employeeRepository.deleteByPersonId(personId);
    }
}
