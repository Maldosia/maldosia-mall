package com.maldosia.mall.ware;

import com.maldosia.mall.ware.entity.WareSkuEntity;
import com.maldosia.mall.ware.service.WareSkuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallWareApplicationTests {

    @Autowired
    WareSkuService wareSkuService;

    @Test
    public void contextLoads() {
        WareSkuEntity wareSkuEntity = new WareSkuEntity();
        wareSkuEntity.setSkuId(12312312l);
        wareSkuService.save(wareSkuEntity);
    }

}
