-- 数据化初始化脚本

-- 创建数据库
create DATABASE seckilling;

-- 使用数据库
use seckilling;

-- 创建秒杀库存表
CREATE TABLE `seckill` (
  `seckill_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(120) NOT NULL,
  `number` int(11) NOT NULL,
  PRIMARY KEY (`seckill_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8

CREATE TABLE `success` (
  `seckill_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `state` int(4) DEFAULT NULL,
  PRIMARY KEY (`seckill_id`,`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
