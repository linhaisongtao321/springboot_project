package com.lhst.springboot_project.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lhst.springboot_project.po.TokenEntity;
import com.lhst.springboot_project.service.TokenService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;


@Service("tokenService")
public class TokenServiceImpl implements TokenService {

    @Override
    public boolean save(TokenEntity entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<TokenEntity> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<TokenEntity> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean removeById(Serializable id) {
        return false;
    }

    @Override
    public boolean removeByMap(Map<String, Object> columnMap) {
        return false;
    }

    @Override
    public boolean remove(Wrapper<TokenEntity> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(TokenEntity entity) {
        return false;
    }

    @Override
    public boolean update(TokenEntity entity, Wrapper<TokenEntity> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<TokenEntity> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(TokenEntity entity) {
        return false;
    }

    @Override
    public TokenEntity getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<TokenEntity> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<TokenEntity> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public TokenEntity getOne(Wrapper<TokenEntity> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<TokenEntity> queryWrapper) {
        return null;
    }

    @Override
    public int count(Wrapper<TokenEntity> queryWrapper) {
        return 0;
    }

    @Override
    public List<TokenEntity> list(Wrapper<TokenEntity> queryWrapper) {
        return null;
    }

    @Override
    public IPage<TokenEntity> page(IPage<TokenEntity> page, Wrapper<TokenEntity> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<TokenEntity> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<TokenEntity> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<TokenEntity> page, Wrapper<TokenEntity> queryWrapper) {
        return null;
    }

    @Override
    public BaseMapper<TokenEntity> getBaseMapper() {
        return null;
    }
}