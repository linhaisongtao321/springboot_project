package com.lhst.springboot_project.controller;

import java.util.Arrays;
import java.util.Map;

import com.lhst.springboot_project.util.ResponseVo;
import com.lhst.springboot_project.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lhst.springboot_project.po.SysMenuEntity;
import com.lhst.springboot_project.service.SysMenuService;

import javax.annotation.Resource;


/**
 * 菜单管理
 *
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
@RestController
@RequestMapping("/sysmenu")
public class SysMenuController {
    @Resource
    private SysMenuService sysMenuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public ResponseVo list(@RequestParam Map<String, Object> params){
//        PageUtils page = sysMenuService.queryPage(params);

        return ResponseResult.success(null);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{menuId}")
    public ResponseVo info(@PathVariable("menuId") Long menuId){
		SysMenuEntity sysMenu = sysMenuService.getById(menuId);

        return ResponseResult.success(sysMenu);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public ResponseVo save(@RequestBody SysMenuEntity sysMenu){
		sysMenuService.save(sysMenu);

        return ResponseResult.success(null);
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public ResponseVo update(@RequestBody SysMenuEntity sysMenu){
        int count = sysMenuService.updateById(sysMenu);

        return ResponseResult.success(count);
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public ResponseVo delete(@RequestBody Long[] menuIds){
        int count = sysMenuService.removeByIds(Arrays.asList(menuIds));

        return ResponseResult.success(count);
    }

}
