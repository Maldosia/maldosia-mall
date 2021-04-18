package com.maldosia.mall.order;

import com.maldosia.mall.order.entity.RefundInfoEntity;
import com.maldosia.mall.order.service.RefundInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallOrderApplicationTests {

    @Autowired
    RefundInfoService refundInfoService;

    @Test
    public void contextLoads() {
        RefundInfoEntity refundInfoEntity = new RefundInfoEntity();
        refundInfoEntity.setRefund(new BigDecimal("20210418"));
        refundInfoService.save(refundInfoEntity);
    }

}
