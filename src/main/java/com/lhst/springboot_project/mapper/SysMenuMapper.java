package com.lhst.springboot_project.mapper;

import com.lhst.springboot_project.po.SysMenuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 菜单管理
 * 
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
@Mapper
@Component
public interface SysMenuMapper extends BaseMapper<SysMenuEntity> {

    SysMenuEntity getMenuById(@Param("menuId") Long menuId);

    int updateMenu(@Param("sysMenu") SysMenuEntity sysMenu);

    void save(@Param("sysMenu") SysMenuEntity sysMenu);

    void saveList(@Param("sysMenuList") List<SysMenuEntity> sysMenuList);
}
