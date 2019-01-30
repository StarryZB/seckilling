package org.seckilling.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckilling.beans.Seckill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillMapperTest {

    @Autowired
    private SeckillMapper seckillMapper;

    @Test
    public void testGetSeckillByid() {
        long id = 1;
        Seckill seckill = seckillMapper.getSeckillByid(id);
        System.out.println(seckill);
    }

}