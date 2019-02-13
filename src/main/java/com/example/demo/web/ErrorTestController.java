package com.example.demo.web;

import com.example.demo.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorTestController {

    @RequestMapping("/")
    public void getError() throws Exception {
        throw new Exception("发生错误");
    }

    @RequestMapping("/json")
    public void json() throws Exception {
        throw new MyException("发生错误json格式");
    }
}
