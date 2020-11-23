package com.lhst.springboot_project.mapper;

import com.lhst.springboot_project.po.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lhst.springboot_project.po.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 * 
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

    UserEntity selectbyname(String name);
}
