package org.seckilling.service.impl;

import org.seckilling.beans.Seckill;
import org.seckilling.beans.Success;
import org.seckilling.dao.SeckillMapper;
import org.seckilling.dao.SuccessMapper;
import org.seckilling.exception.ReduceException;
import org.seckilling.exception.RepeatException;
import org.seckilling.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SeckillServiceImpl implements SeckillService {

    @Autowired
    private SeckillMapper seckillMapper;

    @Autowired
    private SuccessMapper successMapper;

    @Override
    public Seckill getSeckill(long seckillId) {
        Seckill seckill = seckillMapper.getSeckillByid(seckillId);
        return seckill;
    }

    @Override
    @Transactional
    public int excuteSeckill(long seckillId, long userId) throws  ReduceException,RepeatException {
        int reduceSuccess = successMapper.reduceNumber(seckillId);
        if (reduceSuccess == 0) {
            throw new ReduceException();//库存不足
        }
        int insertSuccess = successMapper.insertSuccess(seckillId,userId);

        if (insertSuccess == 0) {
            throw new RepeatException();//重复秒杀
        }
        return 1; //秒杀成功
    }
}
