package com.lhst.springboot_project.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lhst.springboot_project.Exception.ServiceExeption;
import com.lhst.springboot_project.mapper.UserMapper;
import com.lhst.springboot_project.po.UserEntity;
import com.lhst.springboot_project.service.UserService;
import com.lhst.springboot_project.util.RedisUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;


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

        List<UserEntity> listUser=new ArrayList<>();
        if(!user.getPassword().equals(password)){
            throw new ServiceExeption("用户名或者密码错误");
        }
        Set<String> allKeys = redisUtil.getAllKeys();
        allKeys.stream().forEach(item->{
            String users = (String) redisUtil.get(item);
            listUser.add(JSON.parseObject(users, UserEntity.class));
        });
        List<String> allUsers = listUser.stream().map(item -> item.getUsername()).collect(Collectors.toList());
        if(allUsers.contains(user.getUsername())){
            throw new ServiceExeption("该用户已登录");
        }
        String token= UUID.randomUUID().toString();
        redisUtil.put(token, JSONObject.toJSONString(user));
        return token;
    }

    @Override
    public List<UserEntity> selectAllUsers() {

        return userMapper.selectAllUsers();
    }
}