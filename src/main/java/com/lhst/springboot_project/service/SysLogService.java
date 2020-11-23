package com.lhst.springboot_project.service;

import com.lhst.springboot_project.po.SysLogEntity;

import java.util.List;

/**
 * 系统日志
 *
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
public interface SysLogService {

    SysLogEntity getById(Long id);

    void save(SysLogEntity sysLog);

    int updateById(SysLogEntity sysLog);

    int removeByIds(List<Long> asList);
}

