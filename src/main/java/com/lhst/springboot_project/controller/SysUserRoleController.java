package com.lhst.springboot_project.controller;

import java.util.Arrays;
import java.util.Map;

import com.lhst.springboot_project.util.ResponseResult;
import com.lhst.springboot_project.util.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lhst.springboot_project.po.SysUserRoleEntity;
import com.lhst.springboot_project.service.SysUserRoleService;



/**
 * 用户与角色对应关系
 *
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:06
 */
@RestController
@RequestMapping("springboot_project/sysuserrole")
public class SysUserRoleController {
    @Autowired
    private SysUserRoleService sysUserRoleService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public ResponseVo list(@RequestParam Map<String, Object> params){
//        PageUtils page = sysUserRoleService.queryPage(params);

        return ResponseResult.success(null);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public ResponseVo info(@PathVariable("id") Long id){
		SysUserRoleEntity sysUserRole = sysUserRoleService.getById(id);

        return ResponseResult.success(sysUserRole);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public ResponseVo save(@RequestBody SysUserRoleEntity sysUserRole){
		sysUserRoleService.save(sysUserRole);

        return ResponseResult.success(sysUserRole);
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public ResponseVo update(@RequestBody SysUserRoleEntity sysUserRole){
        int count=sysUserRoleService.updateById(sysUserRole);

        return ResponseResult.success(count);
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public ResponseVo delete(@RequestBody Long[] ids){
		int count=sysUserRoleService.removeByIds(Arrays.asList(ids));

        return ResponseResult.success(count);
    }

}
