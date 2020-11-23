package com.lhst.springboot_project.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lhst.springboot_project.po.SysUserRoleEntity;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;


@Service("sysUserRoleService")
public class SysUserRoleServiceImpl implements IService<SysUserRoleEntity> {


    @Override
    public boolean save(SysUserRoleEntity entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<SysUserRoleEntity> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<SysUserRoleEntity> entityList, int batchSize) {
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
    public boolean remove(Wrapper<SysUserRoleEntity> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(SysUserRoleEntity entity) {
        return false;
    }

    @Override
    public boolean update(SysUserRoleEntity entity, Wrapper<SysUserRoleEntity> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<SysUserRoleEntity> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(SysUserRoleEntity entity) {
        return false;
    }

    @Override
    public SysUserRoleEntity getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<SysUserRoleEntity> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<SysUserRoleEntity> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public SysUserRoleEntity getOne(Wrapper<SysUserRoleEntity> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<SysUserRoleEntity> queryWrapper) {
        return null;
    }

    @Override
    public int count(Wrapper<SysUserRoleEntity> queryWrapper) {
        return 0;
    }

    @Override
    public List<SysUserRoleEntity> list(Wrapper<SysUserRoleEntity> queryWrapper) {
        return null;
    }

    @Override
    public IPage<SysUserRoleEntity> page(IPage<SysUserRoleEntity> page, Wrapper<SysUserRoleEntity> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<SysUserRoleEntity> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<SysUserRoleEntity> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<SysUserRoleEntity> page, Wrapper<SysUserRoleEntity> queryWrapper) {
        return null;
    }

    @Override
    public BaseMapper<SysUserRoleEntity> getBaseMapper() {
        return null;
    }
}