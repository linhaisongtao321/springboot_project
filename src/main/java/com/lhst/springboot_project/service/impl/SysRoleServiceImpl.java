package com.lhst.springboot_project.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lhst.springboot_project.po.SysRoleEntity;
import com.lhst.springboot_project.service.SysRoleService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;


@Service("sysRoleService")
public class SysRoleServiceImpl  implements SysRoleService {


    @Override
    public boolean save(SysRoleEntity entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<SysRoleEntity> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<SysRoleEntity> entityList, int batchSize) {
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
    public boolean remove(Wrapper<SysRoleEntity> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(SysRoleEntity entity) {
        return false;
    }

    @Override
    public boolean update(SysRoleEntity entity, Wrapper<SysRoleEntity> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<SysRoleEntity> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(SysRoleEntity entity) {
        return false;
    }

    @Override
    public SysRoleEntity getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<SysRoleEntity> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<SysRoleEntity> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public SysRoleEntity getOne(Wrapper<SysRoleEntity> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<SysRoleEntity> queryWrapper) {
        return null;
    }

    @Override
    public int count(Wrapper<SysRoleEntity> queryWrapper) {
        return 0;
    }

    @Override
    public List<SysRoleEntity> list(Wrapper<SysRoleEntity> queryWrapper) {
        return null;
    }

    @Override
    public IPage<SysRoleEntity> page(IPage<SysRoleEntity> page, Wrapper<SysRoleEntity> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<SysRoleEntity> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<SysRoleEntity> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<SysRoleEntity> page, Wrapper<SysRoleEntity> queryWrapper) {
        return null;
    }

    @Override
    public BaseMapper<SysRoleEntity> getBaseMapper() {
        return null;
    }
}