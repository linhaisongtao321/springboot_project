package com.lhst.springboot_project.mapper;

import com.lhst.springboot_project.po.SysUserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 系统用户
 * 
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:06
 */
@Mapper
@Component
public interface SysUserMapper extends BaseMapper<SysUserEntity> {
	
}
