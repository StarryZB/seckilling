package org.seckilling.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessMapperTest {

    @Autowired
    private SuccessMapper successMapper;

    @Test
    public void testSuccessMapper() {
        long seckillId = 1, userId = 2015040202012L;
        int num = successMapper.insertSuccess(seckillId,userId);
        System.out.println(num);
    }

    @Test
    public void testReduceNumber() {
        long seckillId = 1;
        int num = successMapper.reduceNumber(seckillId);
        System.out.println(num);
    }

}