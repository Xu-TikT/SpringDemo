package com.example.demo;

import com.example.demo.domain.BlogProperties;
import com.example.demo.web.HelloController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }


    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders
                .standaloneSetup(new HelloController())
                .build();
    }

    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders
                .get("/hello")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello World")));
    }


    /*
    测试自定义属性与加载
     */
    @Autowired
    private BlogProperties blogProperties;

    @Test
    public void getBlogName() throws Exception {
        Assert.assertEquals(blogProperties.getName(), "tikt");
        Assert.assertEquals(blogProperties.getTitle(), "Spring Boot Learning");
        System.out.println(blogProperties.getValue());
        System.out.println(blogProperties.getNumber());
        System.out.println(blogProperties.getBignumber());
        System.out.println(blogProperties.getTest1());
        System.out.println(blogProperties.getTest2());
    }







}

