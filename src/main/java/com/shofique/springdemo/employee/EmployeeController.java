package com.shofique.springdemo.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    private final EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }
    @PostMapping
    public Employee save(@RequestBody Employee employee)
    {
        return employeeService.save(employee);
    }

    @GetMapping("/{email}")
    public Employee findByEmail(@PathVariable("email") String email){
        return employeeService.findByEmail(email);
    }
    @GetMapping
    public List<Employee> findAllEmployees()
    {
        return employeeService.findAllEmployees();
    }

    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee){
        return  employeeService.update(employee);
    }

    @DeleteMapping("/{email}")
    public String delete(@PathVariable("email") String email){
        employeeService.delete(email);
        return "Successfully deleted";
    }
}
