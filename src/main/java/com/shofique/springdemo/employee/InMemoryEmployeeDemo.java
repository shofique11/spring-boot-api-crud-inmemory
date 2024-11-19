package com.shofique.springdemo.employee;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryEmployeeDemo {
    private final  List<Employee> EMPLOYEES = new ArrayList<>();

    public Employee save(Employee employee) {
        EMPLOYEES.add(employee);
        return employee;
    }


    public List<Employee> findAllEmployees()
    {
        return EMPLOYEES;
    }


    public Employee findByEmail(String email) {
        return EMPLOYEES.stream()
                .filter(employee -> email.equals(employee.getEmail()))
                .findFirst()
                .orElse(null);
    }

    public Employee update(Employee employee){
        var employeeIndex = IntStream.range(0, EMPLOYEES.size())
                .filter(index -> EMPLOYEES.get(index).getEmail().equals(employee.getEmail()))
                .findFirst()
                .orElse(-1);
        if (employeeIndex > -1) {
            EMPLOYEES.set(employeeIndex, employee);
            return employee;
        }
        return null;
    }
    public void delete(String email) {
        var employee = findByEmail(email);
        if(employee !=null){
            EMPLOYEES.remove(employee);
        }
    }
}
