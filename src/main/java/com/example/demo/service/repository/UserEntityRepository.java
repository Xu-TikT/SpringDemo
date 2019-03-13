package com.example.demo.service.repository;

import com.example.demo.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * 对UserEntity实体创建对一个的Repository接口实现对该实体的数据访问
 */
public interface UserEntityRepository extends JpaRepository<UserEntity,Long> {


    //spring-data-jpa一大特点：通过解析方法名创建查询
    UserEntity findByName(String name);

    UserEntity findByNameAndAge(String name,Integer age);


    //通过使用@Query注解来创建查询，只需要编写JPQL语句，并通过类似":name"来映射@Param指定的参数
    @Query("from UserEntity u where u.name=:name")
    UserEntity findUserEntity(@Param("name") String name);


    /*
    在Spring-data-jpa中，只需要编写类似上面这样的接口就可实现数据访问。
    不再像以前编写接口的同时还要编写接口实现类
     */


    /**
     * 该接口继承自JpaRepository，JpaRepository接口本身已经实现了创建(save)，更新(update)，删除(delete)，查询
     * (findAll,findOne)等基本操作的函数，因此这些基本操作的数据访问就不需要我们自己定义
     */

}
