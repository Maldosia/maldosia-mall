package com.maldosia.mall.ware.dao;

import com.maldosia.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author maldosia
 * @email maldosiaWL@gmail.com
 * @date 2021-04-19 00:00:33
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
