package com.maldosia.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.maldosia.mall.common.utils.PageUtils;
import com.maldosia.mall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author maldosia
 * @email maldosiaWL@gmail.com
 * @date 2021-04-18 23:24:19
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

