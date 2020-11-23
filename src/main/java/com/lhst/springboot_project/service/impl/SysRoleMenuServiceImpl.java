package com.lhst.springboot_project.service.impl;

import com.lhst.springboot_project.po.SysRoleMenuEntity;
import com.lhst.springboot_project.service.SysRoleMenuService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl implements SysRoleMenuService {


    @Override
    public SysRoleMenuEntity getById(Long id) {
        return null;
    }

    @Override
    public void save(SysRoleMenuEntity sysRoleMenu) {

    }

    @Override
    public int updateById(SysRoleMenuEntity sysRoleMenu) {
        return 0;
    }

    @Override
    public int removeByIds(List<Long> asList) {
        return 0;
    }
}