package com.lhst.springboot_project.service.impl;

import com.lhst.springboot_project.po.UserEntity;
import com.lhst.springboot_project.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("userService")
public class UserServiceImpl implements UserService {


    @Override
    public UserEntity getById(Long userId) {
        return null;
    }

    @Override
    public void save(UserEntity user) {

    }

    @Override
    public void updateById(UserEntity user) {

    }

    @Override
    public void removeByIds(List<Long> asList) {

    }
}