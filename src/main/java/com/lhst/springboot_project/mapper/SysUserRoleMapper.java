package com.lhst.springboot_project.mapper;

import com.lhst.springboot_project.po.SysUserRoleEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户与角色对应关系
 * 
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:06
 */
@Mapper
public interface SysUserRoleMapper extends BaseMapper<SysUserRoleEntity> {
	
}
