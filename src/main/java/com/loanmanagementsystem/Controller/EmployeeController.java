package com.loanmanagementsystem.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/login")
    public String employeeLogin() {
        return "employee_login"; // Points to src/main/resources/templates/employee_login.html
    }
}