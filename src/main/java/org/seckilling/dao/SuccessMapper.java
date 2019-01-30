package org.seckilling.dao;

import org.apache.ibatis.annotations.Param;

public interface SuccessMapper {
    int insertSuccess(@Param("seckillId") long seckillId, @Param("userId") long userId);

    int reduceNumber(long seckillId);
}
