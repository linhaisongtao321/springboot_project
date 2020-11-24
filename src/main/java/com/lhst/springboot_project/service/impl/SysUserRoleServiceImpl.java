package com.lhst.springboot_project.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lhst.springboot_project.mapper.SysUserMapper;
import com.lhst.springboot_project.mapper.SysUserRoleMapper;
import com.lhst.springboot_project.po.SysUserEntity;
import com.lhst.springboot_project.po.SysUserRoleEntity;
import com.lhst.springboot_project.service.SysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("sysUserRoleService")
public class SysUserRoleServiceImpl implements SysUserRoleService {


    @Autowired
    SysUserRoleMapper sysUserRoleMapper;

    @Override
    public List<SysUserRoleEntity> getById(Long id, Long roleid) {
        QueryWrapper<SysUserRoleEntity> query=new QueryWrapper();
        query.eq("user_id",2);
        query.eq("role_id",2);
        query.lambda().eq(SysUserRoleEntity::getRoleId,2);
        return sysUserRoleMapper.selectList(query);
    }

    @Override
    public void save(SysUserRoleEntity sysUserRole) {

    }

    @Override
    public void updateById(SysUserRoleEntity sysUserRole) {

    }

    @Override
    public void removeByIds(List<Long> asList) {

    }
}