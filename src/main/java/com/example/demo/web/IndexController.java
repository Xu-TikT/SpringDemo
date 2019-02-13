package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 来通过Thymeleaf渲染⼀个⻚⾯。
 * 这里使用@Controller而不用@RESTController是因为这里返回一个页面而不是一个值，
 * 如果只是使用@RestController注解Controller，则Controller中的方法无法返回jsp页面，
 * 配置的视图解析器InternalResourceViewResolver不起作用，
 * 返回的内容就是Return 里的内容。
 */
@Controller
@RequestMapping("/index")
public class IndexController {


    //来通过Thymeleaf渲染⼀个⻚⾯。
    @RequestMapping("/")
    public String index(ModelMap map) throws Exception{

        //加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://smallgarden.cn");
        //return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";





    }


}
