package com.maldosia.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.maldosia.mall.common.utils.PageUtils;
import com.maldosia.mall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author maldosia
 * @email maldosiaWL@gmail.com
 * @date 2021-04-18 20:58:35
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

