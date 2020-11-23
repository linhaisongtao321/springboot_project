package com.lhst.springboot_project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lhst.springboot_project.po.SysUserRoleEntity;

import java.util.List;

/**
 * 用户与角色对应关系
 *
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:06
 */
public interface SysUserRoleService {
    SysUserRoleEntity getById(Long id);

    void save(SysUserRoleEntity sysUserRole);

    void updateById(SysUserRoleEntity sysUserRole);

    void removeByIds(List<Long> asList);

//    void save(SysUserRoleEntity sysUserRole);
//
//    int updateById(SysUserRoleEntity sysUserRole);
//
//    int removeByIds(List<Long> asList);

//    PageUtils queryPage(Map<String, Object> params);
}

