package com.lhst.springboot_project.service.impl;

import com.lhst.springboot_project.po.SysMenuEntity;
import com.lhst.springboot_project.service.SysMenuService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("sysMenuService")
public class SysMenuServiceImpl implements SysMenuService {


    @Override
    public void save(SysMenuEntity sysMenu) {

    }

    @Override
    public int updateById(SysMenuEntity sysMenu) {
        return 0;
    }

    @Override
    public int removeByIds(List<Long> asList) {
        return 0;
    }

    @Override
    public SysMenuEntity getById(Long menuId) {
        return null;
    }
}