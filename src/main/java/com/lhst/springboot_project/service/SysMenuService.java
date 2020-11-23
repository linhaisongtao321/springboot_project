package com.lhst.springboot_project.service;

import com.lhst.springboot_project.po.SysMenuEntity;

import java.util.List;

/**
 * 菜单管理
 *
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
public interface SysMenuService {

    void save(SysMenuEntity sysMenu);

    int updateById(SysMenuEntity sysMenu);

    int removeByIds(List<Long> asList);

    SysMenuEntity getById(Long menuId);
}

