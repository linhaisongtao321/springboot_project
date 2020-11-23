package com.lhst.springboot_project.mapper;

import com.lhst.springboot_project.entity.SysLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 * 
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {
	
}