package com.example.demo;

/**
 * 自定义异常类，捕获异常并返回json
 */
public class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }


}
