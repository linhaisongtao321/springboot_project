package com.lhst.springboot_project.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.lhst.springboot_project.Exception.ServiceExeption;
import com.lhst.springboot_project.mapper.UserMapper;
import com.lhst.springboot_project.po.UserEntity;
import com.lhst.springboot_project.service.UserService;
import com.lhst.springboot_project.util.RedisUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    RedisUtil redisUtil;

    @Resource
    UserMapper userMapper;
    @Override
    public UserEntity getById(Long userId) {
        return userMapper.selectById(userId);
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

    @Override
    public String getUserByName(String username,String password) throws ServiceExeption {
        UserEntity user = userMapper.getUserByName(username);
        if(!user.getPassword().equals(password)){
            throw new ServiceExeption("用户名或者密码错误");
        }
//        List<String> tokens = (List<String>) redisUtil.get("*");

        String token= UUID.randomUUID().toString();
        redisUtil.put(token, JSONObject.toJSONString(user));
        return token;
    }

    @Override
    public List<UserEntity> selectAllUsers() {

        return userMapper.selectAllUsers();
    }
}