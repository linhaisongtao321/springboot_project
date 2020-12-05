package com.lhst.springboot_project.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lhst.springboot_project.mapper.SysUserMapper;
import com.lhst.springboot_project.mapper.SysUserRoleMapper;
import com.lhst.springboot_project.po.SysUserEntity;
import com.lhst.springboot_project.po.SysUserRoleEntity;
import com.lhst.springboot_project.service.SysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("sysUserRoleService")
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRoleEntity> implements SysUserRoleService {


    @Autowired
    SysUserRoleMapper sysUserRoleMapper;


}