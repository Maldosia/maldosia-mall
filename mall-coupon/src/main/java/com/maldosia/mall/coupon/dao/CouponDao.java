package com.maldosia.mall.coupon.dao;

import com.maldosia.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author maldosia
 * @email maldosiaWL@gmail.com
 * @date 2021-04-18 23:48:22
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
