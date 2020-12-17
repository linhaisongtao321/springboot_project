package com.lhst.springboot_project.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

    @Resource
    RedisUtil redisUtil;

    @Resource
    UserMapper userMapper;


    public String getUserByName(String username,String password)  {
        UserEntity user = userMapper.getUserByName(username);

        List<UserEntity> listUser=new ArrayList<>();
        if(!user.getPassword().equals(password)){
            throw new RuntimeException("用户名或者密码错误");
        }
        Set<String> allKeys = redisUtil.getAllKeys();
        allKeys.stream().forEach(item->{
            String users = (String) redisUtil.get(item);
            listUser.add(JSON.parseObject(users, UserEntity.class));
        });
        List<String> allUsers = listUser.stream().map(item -> item.getUsername()).collect(Collectors.toList());
        if(allUsers.contains(user.getUsername())){
            throw new RuntimeException("该用户已登录");
        }
        String token= UUID.randomUUID().toString();
        redisUtil.put(token, JSONObject.toJSONString(user));
        return token;
    }

}