package com.lhst.springboot_project.service.impl;

import com.lhst.springboot_project.po.SysOssEntity;
import com.lhst.springboot_project.service.SysOssService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("sysOssService")
public class SysOssServiceImpl implements SysOssService {


    @Override
    public void save(SysOssEntity sysOss) {

    }

    @Override
    public int updateById(SysOssEntity sysOss) {
        return 0;
    }

    @Override
    public int removeByIds(List<Long> asList) {
        return 0;
    }

    @Override
    public SysOssEntity getById(Long id) {
        return null;
    }
}