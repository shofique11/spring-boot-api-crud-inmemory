package com.shofique.springdemo.employee;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


public interface EmployeeService {

     Employee save(Employee employee);
     List<Employee> findAllEmployees();
     Employee findByEmail(String email);
     Employee update(Employee employee);
     void delete(String email);
}
