package com.lhst.springboot_project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lhst.springboot_project.mapper.SysMenuMapper;
import com.lhst.springboot_project.po.SysMenuEntity;
import com.lhst.springboot_project.service.SysMenuService;
import org.springframework.stereotype.Service;


@Service("sysMenuService")
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenuEntity> implements SysMenuService {
}