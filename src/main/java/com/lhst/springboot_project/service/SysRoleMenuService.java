package com.lhst.springboot_project.service;

import com.lhst.springboot_project.po.SysRoleMenuEntity;

import java.util.List;

/**
 * 角色与菜单对应关系
 *
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
public interface SysRoleMenuService {

    SysRoleMenuEntity getById(Long id);

    void save(SysRoleMenuEntity sysRoleMenu);

    int updateById(SysRoleMenuEntity sysRoleMenu);

    int removeByIds(List<Long> asList);
}

