package com.maldosia.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.maldosia.mall.common.utils.PageUtils;
import com.maldosia.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author maldosia
 * @email maldosiaWL@gmail.com
 * @date 2021-04-18 20:58:35
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

