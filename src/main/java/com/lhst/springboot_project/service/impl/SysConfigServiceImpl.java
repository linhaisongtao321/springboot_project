package com.lhst.springboot_project.service.impl;

import com.lhst.springboot_project.po.SysConfigEntity;
import com.lhst.springboot_project.service.SysConfigService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("sysConfigService")
public class SysConfigServiceImpl implements SysConfigService {


    @Override
    public SysConfigEntity getById(Long id) {
        return null;
    }

    @Override
    public void save(SysConfigEntity sysConfig) {

    }

    @Override
    public void updateById(SysConfigEntity sysConfig) {

    }

    @Override
    public void removeByIds(List<Long> asList) {

    }
}