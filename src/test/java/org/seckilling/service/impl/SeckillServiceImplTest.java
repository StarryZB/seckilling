package org.seckilling.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckilling.beans.Seckill;
import org.seckilling.exception.ReduceException;
import org.seckilling.exception.RepeatException;
import org.seckilling.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class SeckillServiceImplTest {

    @Autowired
    private SeckillService seckillService;

    @Test
    public void testGetSeckill() {
        long seckillId = 1;
        Seckill seckill = seckillService.getSeckill(seckillId);
        System.out.println(seckill);
    }

    @Test
    public void testExcuteSeckill() {
        long seckillId = 1, userId = 20150402012L;
        int excuteSeckill = 0;
        try {
            excuteSeckill = seckillService.excuteSeckill(seckillId,userId);
        } catch (ReduceException e) {
            System.out.println("库存不足");
        } catch (RepeatException e) {
            System.out.println("重复秒杀");
        } catch (Exception e) {
            System.out.println("oters");
        }
        if (excuteSeckill == 1) {
            System.out.println("秒杀成功");
        }



    }
}