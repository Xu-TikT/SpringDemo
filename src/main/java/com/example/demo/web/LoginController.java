package com.example.demo.web;


import com.example.demo.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {


    @RequestMapping("/login")
    public String login() throws MyException {
        return "login";
    }




}
