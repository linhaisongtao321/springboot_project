package com.lhst.springboot_project.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lhst.springboot_project.po.SysMenuEntity;
import com.lhst.springboot_project.service.SysMenuService;
import com.lhst.springboot_project.util.ResponseResult;
import com.lhst.springboot_project.util.ResponseVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
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
@Api(tags = "菜单信息")
public class SysMenuController {
    @Resource
        private SysMenuService sysMenuService;

        /**
         * 列表
         */
        @GetMapping("/list")
        @ApiOperation("查询菜单列表")
        public ResponseVo list() {
            List<SysMenuEntity> allmenusList = sysMenuService.list();
            return ResponseResult.success(allmenusList);
        }


        /**
         * 信息
         */
        @GetMapping("/info/{menuId}")
        @ApiOperation("根据id查询菜单")
        public ResponseVo info(@RequestParam(name = "menuId",required = true) Long menuId){
            QueryWrapper<SysMenuEntity>query=new QueryWrapper<>();
            query.eq("menuId",0);

            SysMenuEntity sysMenu = sysMenuService.getById(menuId);
            return ResponseResult.success(sysMenu);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    @ApiOperation("保存菜单")
    public ResponseVo save(@RequestBody SysMenuEntity sysMenu){
		sysMenuService.save(sysMenu);

        return ResponseResult.success(null);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation("更新菜单")
    public ResponseVo update(@RequestBody SysMenuEntity sysMenu){
        boolean b = sysMenuService.updateById(sysMenu);

        return ResponseResult.success(b);
    }

    /**
     * 删除
     */
    @GetMapping("/delete")
    @ApiOperation("删除菜单")
    public ResponseVo delete(@RequestBody Long[] menuIds){
        boolean b = sysMenuService.removeByIds(Arrays.asList(menuIds));

        return ResponseResult.success(b);
    }

}
