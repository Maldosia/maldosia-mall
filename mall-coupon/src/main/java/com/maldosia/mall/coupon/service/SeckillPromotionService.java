package com.maldosia.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.maldosia.mall.common.utils.PageUtils;
import com.maldosia.mall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author maldosia
 * @email maldosiaWL@gmail.com
 * @date 2021-04-18 23:48:21
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

