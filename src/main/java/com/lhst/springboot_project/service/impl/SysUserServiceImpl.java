package com.lhst.springboot_project.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lhst.springboot_project.po.SysUserEntity;
import com.lhst.springboot_project.service.SysUserService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;


@Service("sysUserService")
public class SysUserServiceImpl  implements SysUserService {


    @Override
    public boolean save(SysUserEntity entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<SysUserEntity> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<SysUserEntity> entityList, int batchSize) {
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
    public boolean remove(Wrapper<SysUserEntity> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(SysUserEntity entity) {
        return false;
    }

    @Override
    public boolean update(SysUserEntity entity, Wrapper<SysUserEntity> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<SysUserEntity> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(SysUserEntity entity) {
        return false;
    }

    @Override
    public SysUserEntity getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<SysUserEntity> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<SysUserEntity> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public SysUserEntity getOne(Wrapper<SysUserEntity> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<SysUserEntity> queryWrapper) {
        return null;
    }

    @Override
    public int count(Wrapper<SysUserEntity> queryWrapper) {
        return 0;
    }

    @Override
    public List<SysUserEntity> list(Wrapper<SysUserEntity> queryWrapper) {
        return null;
    }

    @Override
    public IPage<SysUserEntity> page(IPage<SysUserEntity> page, Wrapper<SysUserEntity> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<SysUserEntity> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<SysUserEntity> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<SysUserEntity> page, Wrapper<SysUserEntity> queryWrapper) {
        return null;
    }

    @Override
    public BaseMapper<SysUserEntity> getBaseMapper() {
        return null;
    }
}