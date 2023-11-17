package com.example.demojpa.service;

import com.example.demojpa.entity.Employee;
import com.example.demojpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public void addEmployee(Employee newEmployee) {
        repository.save(newEmployee);
    }
}
