package com.lhst.springboot_project.mapper;

import com.lhst.springboot_project.po.SysMenuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 菜单管理
 * 
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
@Mapper
public interface SysMenuMapper extends BaseMapper<SysMenuEntity> {
	
}
