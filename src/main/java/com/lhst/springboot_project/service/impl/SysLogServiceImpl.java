package com.lhst.springboot_project.service.impl;

import com.lhst.springboot_project.po.SysLogEntity;
import com.lhst.springboot_project.service.SysLogService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("sysLogService")
public class SysLogServiceImpl implements SysLogService {


    @Override
    public SysLogEntity getById(Long id) {
        return null;
    }

    @Override
    public void save(SysLogEntity sysLog) {

    }

    @Override
    public int updateById(SysLogEntity sysLog) {
        return 0;
    }

    @Override
    public int removeByIds(List<Long> asList) {
        return 0;
    }
}