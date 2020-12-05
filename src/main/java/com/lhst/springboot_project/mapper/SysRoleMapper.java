package com.lhst.springboot_project.mapper;

import com.lhst.springboot_project.po.SysMenuEntity;
import com.lhst.springboot_project.po.SysRoleEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 角色
 * 
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
@Mapper
@Component
public interface SysRoleMapper extends BaseMapper<SysRoleEntity> {


}
