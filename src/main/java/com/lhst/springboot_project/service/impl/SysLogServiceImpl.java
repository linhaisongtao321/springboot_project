package com.lhst.springboot_project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lhst.springboot_project.mapper.SysLogMapper;
import com.lhst.springboot_project.po.SysLogEntity;
import com.lhst.springboot_project.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("sysLogService")
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLogEntity> implements SysLogService {

    @Autowired
    SysLogMapper sysLogMapper;

}