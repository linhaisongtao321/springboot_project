package com.lhst.springboot_project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lhst.springboot_project.mapper.SysOssMapper;
import com.lhst.springboot_project.po.SysOssEntity;
import com.lhst.springboot_project.service.SysOssService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("sysOssService")
public class SysOssServiceImpl extends ServiceImpl<SysOssMapper, SysOssEntity> implements SysOssService {


}