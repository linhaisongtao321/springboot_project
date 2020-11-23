package com.lhst.springboot_project.controller;

import com.lhst.springboot_project.po.SysRoleMenuEntity;
import com.lhst.springboot_project.service.SysRoleMenuService;
import com.lhst.springboot_project.util.ResponseVo;
import com.lhst.springboot_project.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Map;



/**
 * 角色与菜单对应关系
 *
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
@RestController
@RequestMapping("/sysrolemenu")
public class SysRoleMenuController {
    @Resource
    private SysRoleMenuService sysRoleMenuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public ResponseVo list(@RequestParam Map<String, Object> params){
//        PageUtils page = sysRoleMenuService.queryPage(params);

      return  ResponseResult.success(null);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public ResponseVo info(@PathVariable("id") Long id){
		SysRoleMenuEntity sysRoleMenu = sysRoleMenuService.getById(id);

       return ResponseResult.success(null);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public ResponseVo save(@RequestBody SysRoleMenuEntity sysRoleMenu){
		sysRoleMenuService.save(sysRoleMenu);

        return ResponseResult.success(null);
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public ResponseVo update(@RequestBody SysRoleMenuEntity sysRoleMenu){
        int count=sysRoleMenuService.updateById(sysRoleMenu);

        return ResponseResult.success(count);
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public ResponseVo delete(@RequestBody Long[] ids){
		int count=sysRoleMenuService.removeByIds(Arrays.asList(ids));

        return ResponseResult.success(count);
    }

}
