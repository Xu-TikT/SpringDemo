package com.example.demo.service;

import com.example.demo.domain.Goods;
import org.apache.ibatis.annotations.*;

import java.util.Map;

/**
 * 创建Goods隐射的操作GoodsMapper,为了后续单元测试验证，实现插入和查询操作
 */
@Mapper
public interface GoodsMapper {

    @Select("SELECT * FROM GOODS WHERE NAME = #{name}")
    Goods findByName(@Param("name") String name);


    //使用Param传参
    @Insert("INSERT INTO GOODS(NAME,PRICE) VALUES(#{name}, #{price})")
    int insert(@Param("name") String name,@Param("price") Integer price);

    //使用Map传参
    @Insert("INSERT INTO GOODS(NAME,PRICE) VALUES(#{name,jdbcType=VARCHAR}, #{price,jdbcType=INTEGER})")
    int insertByMap(Map<String,Object> map);

    //使用对象传参
    @Insert("INSERT INTO GOODS(NAME,PRICE) VALUES(#{name,jdbcType=VARCHAR}, #{price,jdbcType=INTEGER})")
    int insertByGoods(Goods goods);

    @Update("UPDATE GOODS SET price = #{price} WHERE name = #{name}")
    void update(Goods goods);

    @Delete("DELETE FROM GOODS WHERE id = #{id}")
    void delete(Long id);
}
