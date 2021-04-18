package com.maldosia.mall.member;

import com.maldosia.mall.member.entity.MemberLevelEntity;
import com.maldosia.mall.member.service.MemberLevelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallMemberApplicationTests {

    @Autowired
    MemberLevelService memberLevelService;

    @Test
    public void contextLoads() {
        MemberLevelEntity memberLevelEntity = new MemberLevelEntity();
        memberLevelEntity.setName("huawei");
        memberLevelService.save(memberLevelEntity);
    }

}
