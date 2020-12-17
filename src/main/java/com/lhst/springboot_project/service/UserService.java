package com.lhst.springboot_project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lhst.springboot_project.po.UserEntity;

/**
 * 用户
 *
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
public interface UserService extends IService<UserEntity> {


    String getUserByName(String username, String password) ;
}

