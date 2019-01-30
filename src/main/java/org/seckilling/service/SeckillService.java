package org.seckilling.service;

import org.seckilling.beans.Seckill;
import org.seckilling.beans.Success;

public interface SeckillService {

    Seckill getSeckill(long seckillId);

    /**
     * 减库存 + 秒杀
     * @param seckillId
     * @param userId
     * @return
     */
    int excuteSeckill(long seckillId, long userId) throws Exception;
}
