package com.maldosia.mall.coupon;

import com.maldosia.mall.coupon.entity.SkuLadderEntity;
import com.maldosia.mall.coupon.service.SkuLadderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallCouponApplicationTests {

    @Autowired
    SkuLadderService skuLadderService;

    @Test
    public void contextLoads() {
        SkuLadderEntity skuLadderEntity = new SkuLadderEntity();
        skuLadderEntity.setSkuId(456456456l);
        skuLadderService.save(skuLadderEntity);
    }

}
