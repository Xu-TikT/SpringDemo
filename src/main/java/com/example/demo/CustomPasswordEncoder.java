package com.example.demo;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 自定义的Spring Security加密方式，这里使用的是明文
 */
public class CustomPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}
