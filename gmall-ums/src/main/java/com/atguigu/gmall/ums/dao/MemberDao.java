package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chbh
 * @email chbh@atguigu.com
 * @date 2020-02-18 21:34:33
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
