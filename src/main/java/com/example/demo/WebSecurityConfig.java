package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Spring Security配置
 * 通过@EnableWebSecurity注解开启Spring Security的功能
 * 继承WebSecurityConfigurerAdapter,并重写它的方法来设置一些web安全细节
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * @param http
     * @throws Exception 通过authorizeRequests()定义哪些URL需要被保护，哪些不需要保护。
     *                   本例中指定了 / 和 /home不需要任何认证就可以访问，其他的路径都必须通过身份验证
     *                   通过 formLogin()定义当需要用户登录时，转到的登录页面
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/", "/home").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll();


    }


    /**
     * configureGlobal(AuthenticationManagerBuilder auth)方法，在内存中创建了一个用户，
     * 该用户的名称为user,密码为password,用户角色为USER
     *
     * @param auth
     * @throws Exception
     */
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("user")
                .password("password")
                .roles("USER")
                .and()
                .passwordEncoder(new CustomPasswordEncoder());//要有对密码的加密方式，这个自定义的加密方式为明文


    }


}
