package com.lhst.springboot_project.controller;

import com.lhst.springboot_project.po.SysRoleEntity;
import com.lhst.springboot_project.service.SysRoleService;
import com.lhst.springboot_project.util.ResponseVo;
import com.lhst.springboot_project.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Map;


/**
 * 角色
 *
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
@RestController
@RequestMapping("springboot_project/sysrole")
public class SysRoleController {
    @Resource
    private SysRoleService sysRoleService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public ResponseVo list(@RequestParam Map<String, Object> params){
//        PageUtils page = sysRoleService.queryPage(params);

        return ResponseResult.success(null);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{roleId}")
    public ResponseVo info(@PathVariable("roleId") Long roleId){
		SysRoleEntity sysRole = sysRoleService.getById(roleId);

        return ResponseResult.success(null);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public ResponseVo save(@RequestBody SysRoleEntity sysRole){
		sysRoleService.save(sysRole);

        return ResponseResult.success(null);
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public ResponseVo update(@RequestBody SysRoleEntity sysRole){
		sysRoleService.updateById(sysRole);

        return ResponseResult.success(null);
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public ResponseVo delete(@RequestBody Long[] roleIds){
        boolean result = sysRoleService.removeByIds(Arrays.asList(roleIds));

        return ResponseResult.success(result);
    }

}
