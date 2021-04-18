package com.maldosia.mall.order.dao;

import com.maldosia.mall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author maldosia
 * @email maldosiaWL@gmail.com
 * @date 2021-04-18 23:24:19
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
