package com.lhst.springboot_project.service;

import com.lhst.springboot_project.po.SysRoleEntity;

import java.util.List;

/**
 * 角色
 *
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
public interface SysRoleService{

    SysRoleEntity getById(Long roleId);

    void save(SysRoleEntity sysRole);

    int updateById(SysRoleEntity sysRole);

    int removeByIds(List<Long> asList);
}

