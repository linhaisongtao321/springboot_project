package com.lhst.springboot_project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lhst.springboot_project.mapper.TokenMapper;
import com.lhst.springboot_project.po.TokenEntity;
import com.lhst.springboot_project.service.TokenService;
import org.springframework.stereotype.Service;


@Service("tokenService")
public class TokenServiceImpl extends ServiceImpl<TokenMapper, TokenEntity> implements TokenService {

}