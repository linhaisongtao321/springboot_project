package com.lhst.springboot_project.service;

import com.lhst.springboot_project.po.SysConfigEntity;

import java.util.List;

/**
 * 系统配置信息表
 *
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
public interface SysConfigService {

    SysConfigEntity getById(Long id);

    void save(SysConfigEntity sysConfig);

    void updateById(SysConfigEntity sysConfig);

    void removeByIds(List<Long> asList);
}

