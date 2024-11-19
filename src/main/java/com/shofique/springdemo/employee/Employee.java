package com.shofique.springdemo.employee;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

public class Employee {
    private  String firstname;
    private String lastname;
    private String email;
    private int age;
    private String position;
    private double salary;
    private LocalDateTime dateOfJoin;

    public Employee(String firstname,
                    String lastname,
                    String email,
                    int age,
                    String position,
                    double salary,
                    LocalDateTime dateOfJoin){
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.dateOfJoin = dateOfJoin;

    }

    public Employee(){};
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDateTime getDateOfJoin() {
        return dateOfJoin;
    }

    public void setDateOfJoin(LocalDateTime dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }
}
