package com.example.demo;

import com.example.demo.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * jdbc
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class JdbcTemplateTests   {

    @Autowired
    private UserService userService;

    @Before
    public void setUp(){
        //准备，情况USER表
        userService.deleteAllUsers();
    }


    @Test
    public void test() throws Exception{

        //插入5个用户
        userService.create("a",11);
        userService.create("b",12);
        userService.create("c",13);
        userService.create("d",14);
        userService.create("e",15);


        //查数据库，应该有5个用户
        Assert.assertEquals(5,userService.getAllUsers().intValue());


        //删除两个用户
        userService.deleteByName("a");
        userService.deleteByName("e");

        //查数据库，应该有3个用户
        Assert.assertEquals(3,userService.getAllUsers().intValue());


    }

}
