package com.lhst.springboot_project.service.impl;

import com.lhst.springboot_project.mapper.SysMenuMapper;
import com.lhst.springboot_project.mapper.SysRoleMapper;
import com.lhst.springboot_project.po.SysMenuEntity;
import com.lhst.springboot_project.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("sysMenuService")
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired
    SysMenuMapper sysMenuMapper;
    @Override
    public void save(SysMenuEntity sysMenu) {
        sysMenuMapper.save(sysMenu);
    }

    @Override
    public int updateById(SysMenuEntity sysMenu) {
        return sysMenuMapper.updateMenu(sysMenu);
    }

    @Override
    public int removeByIds(List<Long> asList) {
        return 0;
    }

    @Override
    public SysMenuEntity getMenuById(Long menuId) {
        return sysMenuMapper.getMenuById(menuId);
    }
}