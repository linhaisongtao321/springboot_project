package com.lhst.springboot_project.controller;

import com.lhst.springboot_project.po.SysMenuEntity;
import com.lhst.springboot_project.service.SysMenuService;
import com.lhst.springboot_project.util.ResponseResult;
import com.lhst.springboot_project.util.ResponseVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Map;


/**
 * 菜单管理O
 *
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
@RestController
@RequestMapping("/sysmenu")
@Api(description = "菜单信息")
public class SysMenuController {
    @Resource
    private SysMenuService sysMenuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @ApiOperation("查询菜单列表")
    public ResponseVo list(@RequestParam Map<String, Object> params){
//        PageUtils page = sysMenuService.queryPage(params);
        return ResponseResult.success(null);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{menuId}")
    @ApiOperation("根据id查询菜单")
    public ResponseVo info(@PathVariable("menuId") Long menuId){
		SysMenuEntity sysMenu = sysMenuService.getById(menuId);
        return ResponseResult.success(sysMenu);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @ApiOperation("保存菜单")
    public ResponseVo save(@RequestBody SysMenuEntity sysMenu){
		sysMenuService.save(sysMenu);

        return ResponseResult.success(null);
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @ApiOperation("更新菜单")
    public ResponseVo update(@RequestBody SysMenuEntity sysMenu){
        boolean b = sysMenuService.updateById(sysMenu);

        return ResponseResult.success(b);
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @ApiOperation("删除菜单")
    public ResponseVo delete(@RequestBody Long[] menuIds){
        boolean b = sysMenuService.removeByIds(Arrays.asList(menuIds));

        return ResponseResult.success(b);
    }

}
