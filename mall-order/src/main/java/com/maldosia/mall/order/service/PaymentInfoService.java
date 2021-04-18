package com.maldosia.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.maldosia.mall.common.utils.PageUtils;
import com.maldosia.mall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author maldosia
 * @email maldosiaWL@gmail.com
 * @date 2021-04-18 23:24:19
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

