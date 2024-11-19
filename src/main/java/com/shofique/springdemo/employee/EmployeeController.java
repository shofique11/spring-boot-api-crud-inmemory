package com.shofique.springdemo.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
@GetMapping
    public List<String> findAllEmployees(){
        return List.of(
                "Shofiqul",
                "Salaudiin",
                "Habib"
        );
    }
}
