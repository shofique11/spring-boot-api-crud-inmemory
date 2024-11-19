package com.shofique.springdemo.employee;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class InMemoryEmployeeService implements EmployeeService{

    private final InMemoryEmployeeDemo demo;

    public InMemoryEmployeeService(InMemoryEmployeeDemo demo){
        this.demo = demo;
    }
    @Override
    public Employee save(Employee employee) {
        return demo.save(employee);
    }

    @Override
    public List<Employee> findAllEmployees()
    {
        return demo.findAllEmployees();
    }

    @Override
    public Employee findByEmail(String email) {
        return demo.findByEmail(email);
    }

    @Override
    public Employee update(Employee employee){
        return  demo.update(employee);
    }
    @Override
    public void delete(String email) {
        demo.delete(email);
    }
}
