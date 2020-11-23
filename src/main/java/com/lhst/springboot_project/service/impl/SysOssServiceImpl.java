package com.lhst.springboot_project.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lhst.common.utils.PageUtils;
import com.lhst.common.utils.Query;

import com.lhst.springboot_project.dao.SysOssDao;
import com.lhst.springboot_project.entity.SysOssEntity;
import com.lhst.springboot_project.service.SysOssService;


@Service("sysOssService")
public class SysOssServiceImpl extends ServiceImpl<SysOssDao, SysOssEntity> implements SysOssService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SysOssEntity> page = this.page(
                new Query<SysOssEntity>().getPage(params),
                new QueryWrapper<SysOssEntity>()
        );

        return new PageUtils(page);
    }

}