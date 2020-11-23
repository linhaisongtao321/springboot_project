package com.lhst.springboot_project.service;

import com.lhst.springboot_project.po.UserEntity;

import java.util.List;

/**
 * 用户
 *
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
public interface UserService {

    UserEntity getById(Long userId);

    void save(UserEntity user);

    void updateById(UserEntity user);

    void removeByIds(List<Long> asList);
}

