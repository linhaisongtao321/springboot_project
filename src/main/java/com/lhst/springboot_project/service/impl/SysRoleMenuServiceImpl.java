package com.lhst.springboot_project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lhst.springboot_project.mapper.SysRoleMenuMapper;
import com.lhst.springboot_project.po.SysRoleMenuEntity;
import com.lhst.springboot_project.service.SysRoleMenuService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuMapper, SysRoleMenuEntity> implements SysRoleMenuService {

}