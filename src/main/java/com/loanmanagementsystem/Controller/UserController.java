package com.loanmanagementsystem.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/login")
    public String userLogin() {
        return "user_login"; // Points to src/main/resources/templates/user_login.html
    }
}