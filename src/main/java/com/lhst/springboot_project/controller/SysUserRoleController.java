package com.lhst.springboot_project.controller;

import com.lhst.springboot_project.po.SysUserRoleEntity;
import com.lhst.springboot_project.service.SysUserRoleService;
import com.lhst.springboot_project.util.ResponseResult;
import com.lhst.springboot_project.util.ResponseVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * 用户与角色对应关系
 *
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:06
 */
@RestController
@RequestMapping("/sysuserrole")
public class SysUserRoleController {
    @Resource
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
    public ResponseVo info(@RequestParam("id") Long id,@RequestParam("roleid")Long roleid){
		List<SysUserRoleEntity> sysUserRole = sysUserRoleService.getById(id,roleid);

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
        sysUserRoleService.updateById(sysUserRole);

        return ResponseResult.success(null);
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public ResponseVo delete(@RequestBody Long[] ids){
		sysUserRoleService.removeByIds(Arrays.asList(ids));

        return ResponseResult.success(null);
    }

}
