package com.qz.djmall.user.dao;

import com.qz.djmall.user.entity.UmsUserLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户登陆记录表
 * 
 * @author lby
 * @email lby@qz.com
 * @date 2020-12-01 11:42:13
 */
@Mapper
public interface UmsUserLoginLogDao extends BaseMapper<UmsUserLoginLogEntity> {
	
}
