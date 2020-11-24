package com.lhst.springboot_project.service.impl;

import com.lhst.springboot_project.mapper.SysLogMapper;
import com.lhst.springboot_project.po.SysLogEntity;
import com.lhst.springboot_project.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("sysLogService")
public class SysLogServiceImpl implements SysLogService {

    @Autowired
    SysLogMapper sysLogMapper;
    @Override
    public SysLogEntity getById(Long id) {
        return sysLogMapper.selectById(id);
    }

    @Override
    public int save(SysLogEntity sysLog) {
        return sysLogMapper.update(sysLog,null);
    }

    @Override
    public int updateById(SysLogEntity sysLog) {
        return sysLogMapper.updateById(sysLog);
    }

    @Override
    public int removeByIds(List<Long> asList) {
        return sysLogMapper.deleteBatchIds(asList);
    }
}