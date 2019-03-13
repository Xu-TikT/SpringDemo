package com.example.demo;


import com.example.demo.domain.Goods;
import com.example.demo.service.GoodsMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试逻辑：插入一条name=AAA,price=20的记录，然后根据name=AAA查询，并判断price是否为20
 * 测试结束回滚数据，保证每次单元测试的数据环境独立
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MyBatisTests {

    @Autowired
    private GoodsMapper goodsMapper;


    @Test
    public void findByName() throws Exception {
        goodsMapper.insert("AAA", 20);
        Goods goods = goodsMapper.findByName("AAA");
        Assert.assertEquals(20, goods.getPrice().intValue());

        goods.setPrice(100);
        goodsMapper.update(goods);
        goods = goodsMapper.findByName("AAA");
        Assert.assertEquals(100, goods.getPrice().intValue());

        goodsMapper.delete(goods.getId());
        goods = goodsMapper.findByName("AAA");
        Assert.assertEquals(null, goods);
    }

}
