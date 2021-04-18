package com.maldosia.mall.coupon.dao;

import com.maldosia.mall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author maldosia
 * @email maldosiaWL@gmail.com
 * @date 2021-04-18 23:48:22
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
