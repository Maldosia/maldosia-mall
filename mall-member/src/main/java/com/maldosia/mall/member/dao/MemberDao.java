package com.maldosia.mall.member.dao;

import com.maldosia.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author maldosia
 * @email maldosiaWL@gmail.com
 * @date 2021-04-18 23:56:22
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
