package com.shofique.springdemo.employee;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmployeeService {
    public List<Employee> findAllEmployees(){
        return List.of(
                new Employee(
                        "Shofiqul",
                        "Islam",
                        "programmingcode11@gmail.com",
                        35,
                        "Java developer",
                        2000.20,
                        LocalDateTime.now()
                ),
                new Employee(
                        "Habibullah",
                        "khan",
                        "khan@gmail.com",
                        34,
                        "PHP developer",
                        1500.20,
                        LocalDateTime.now()
                )
        );
    }
}
