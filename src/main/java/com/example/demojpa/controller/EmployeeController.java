package com.example.demojpa.controller;

import com.example.demojpa.entity.Employee;
import com.example.demojpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/add")
    public String addEmployee(@RequestParam String name,
                              @RequestParam String surname,
                              @RequestParam String email) {
        Employee newEmployee = new Employee(name, surname, email);
        service.addEmployee(newEmployee);

        return "redirect:/";
    }
}
