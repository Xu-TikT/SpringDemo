# Spring boot 练习项目


在您第1次接触和学习Spring框架的时候，是否因为其繁杂的配置而退却了？在你第n次使用Spring框架的时候，是否觉得一堆反复黏贴的配置有一些厌烦？那么您就不妨来试试使用Spring Boot来让你更易上手，更简单快捷地构建Spring应用！

Spring Boot让我们的Spring应用变的更轻量化。比如：你可以仅仅依靠一个Java类来运行一个Spring引用。你也可以打包你的应用为jar并通过使用java -jar来运行你的Spring Web应用。

Spring Boot的主要优点：

    为所有Spring开发者更快的入门
    开箱即用，提供各种默认配置来简化项目配置
    内嵌式容器简化Web项目
    没有冗余代码生成和XML配置的要求
    
    
* 2019/3/13  
    - 多数据源暂时搁置
    - 使用MyBatis连接数据库
    
* 2019/3/1 
    - jdbcTemplate操作数据库并使用单元测试
    - 使用Spring-data-jpa让数据访问更简单，更优雅
    - 多数据源的配置和使用
    
* 2019/2/19 使用JdbcTemplate操作数据库

* 2019/2/18 使用JdbcTemplate访问数据库

* 2019/2/16 
    - 在Spring Security的例子中，对登录后增加了注销按钮
    - Spring Boot日志管理功能
    - 使用AOP统一处理Web请求日志
    
    
* 2019/2/15 使用Spring Security进行安全控制，本例中对除了访问 / 和 /home的路径都要去进行登录，登录成功后跳转页面。

* 2019/2/13  
    - 渲染web页面，使用了Thymeleaf模板引擎，渲染页面需要使用@Controller而不是@RESTController，否则无法渲染页面只能返回return中的值。
    - 自定义统一异常处理，分网页形式和json格式返回错误信息
    - 使用Swagger2构建RESTful API文档

* 2019/2/12  利⽤Spring MVC的功能，以⾮常简洁的代码完成了对User对象的RESTful API的创建以及单元测试的编写。其中同时介绍了Spring MVC中最为常⽤的⼏个核⼼注解：@Controller,@RestController,RequestMapping以及⼀些参数绑定的注解：@PathVariable,@ModelAttribute,@RequestParam等。


* 2019/2/1  主要目标完成Spring Boot基础项目的构建，并且实现一个简单的Http请求处理和单元测试，通过这个例子对Spring Boot有一个初步的了解，并体验其结构简单、开发快速的特性。
    