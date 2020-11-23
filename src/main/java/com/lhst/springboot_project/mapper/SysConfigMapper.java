package com.lhst.springboot_project.mapper;

import com.lhst.springboot_project.po.SysConfigEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统配置信息表
 * 
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
@Mapper
public interface SysConfigMapper extends BaseMapper<SysConfigEntity> {
	
}
