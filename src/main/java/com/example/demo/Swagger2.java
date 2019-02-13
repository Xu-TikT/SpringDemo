package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger2配置类
 * 通过Configuration注解，让Spring加载改配置类，
 * 再通过EnableSwagger2注解来启用Swagger2
 */

@Configuration
@EnableSwagger2
public class Swagger2 {

    /**
     * 再通过createRestApi函数创建Docket的Bean之后
     * apiInfo()用来创建改Api的基本信息（这些基本信息会展现在文档页面中）
     * select()函数返回一个ApiSelectorBuilder实例用来控制哪些接口暴露给Swagger来展现
     * 本例采用制定扫描的包路径来定义，Swagger会扫描该包下所有Controller定义
     * 的API，并产生文档内容（除了被@ApiIgonre指定的请求）
     *
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo"))
                .paths(PathSelectors.regex("/users.*"))
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful API文档")
                .description("更多Spring Boot相关文档请关注：http://smallgarden.cn")
                .termsOfServiceUrl("http://smallgarden.cn")
                .contact(new Contact("爆炸奶糖","http://smallgarden.cn","skysafari@foxmail.com"))
                .version("1.0")
                .build();
    }

}
