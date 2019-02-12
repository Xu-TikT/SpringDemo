package com.example.demo.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlogProperties {

    @Value("${com.example.demo.name}")
    private String name;
    @Value("${com.example.demo.title}")
    private String title;

    @Value("${com.example.demo.value}")
    private String value;

    @Value("${com.example.demo.number}")
    private String number;

    @Value("${com.example.demo.bignumber}")
    private String bignumber;

    @Value("${com.example.demo.test1}")
    private String test1;
    @Value("${com.example.demo.test2}")
    private String test2;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBignumber() {
        return bignumber;
    }

    public void setBignumber(String bignumber) {
        this.bignumber = bignumber;
    }

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
