package com.lhst.springboot_project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lhst.springboot_project.mapper.SysConfigMapper;
import com.lhst.springboot_project.po.SysConfigEntity;
import com.lhst.springboot_project.service.SysConfigService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("sysConfigService")
public class SysConfigServiceImpl extends ServiceImpl<SysConfigMapper, SysConfigEntity> implements SysConfigService {


}