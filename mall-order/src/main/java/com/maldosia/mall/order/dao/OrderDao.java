package com.maldosia.mall.order.dao;

import com.maldosia.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author maldosia
 * @email maldosiaWL@gmail.com
 * @date 2021-04-18 23:24:19
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
