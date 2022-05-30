package com.nahidsohel.springbootthymeleafcrud.controller;

import com.nahidsohel.springbootthymeleafcrud.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private List<Employee> employeeList;

    @PostConstruct
    public void loadData() {

        Employee emp1 = new Employee(1, "Nahid", "Sohel", "nahid@gmail.com");
        Employee emp2 = new Employee(2, "Moon", "Mun", "mun@gmail.com");

        employeeList = new ArrayList<>();

        employeeList.add(emp1);
        employeeList.add(emp2);

    }

    @GetMapping("/list")
    public String listOfEmployees(Model model){

        model.addAttribute("employeeList", employeeList);

        return "employee-list";

    }

}
