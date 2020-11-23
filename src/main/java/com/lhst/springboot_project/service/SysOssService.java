package com.lhst.springboot_project.service;


import com.lhst.springboot_project.po.SysOssEntity;

import java.util.List;
import java.util.Map;

/**
 * 文件上传
 *
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
public interface SysOssService {

    void save(SysOssEntity sysOss);

    int updateById(SysOssEntity sysOss);

    int removeByIds(List<Long> asList);

    SysOssEntity getById(Long id);
}

