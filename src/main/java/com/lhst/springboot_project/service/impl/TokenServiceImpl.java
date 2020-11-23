package com.lhst.springboot_project.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lhst.common.utils.PageUtils;
import com.lhst.common.utils.Query;
import com.lhst.springboot_project.dao.TokenDao;
import com.lhst.springboot_project.po.TokenEntity;
import com.lhst.springboot_project.service.TokenService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("tokenService")
public class TokenServiceImpl extends ServiceImpl<TokenDao, TokenEntity> implements TokenService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TokenEntity> page = this.page(
                new Query<TokenEntity>().getPage(params),
                new QueryWrapper<TokenEntity>()
        );

        return new PageUtils(page);
    }

}