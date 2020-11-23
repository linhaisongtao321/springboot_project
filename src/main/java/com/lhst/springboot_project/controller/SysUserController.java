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

import com.lhst.springboot_project.po.SysUserEntity;
import com.lhst.springboot_project.service.SysUserService;

import javax.annotation.Resource;


/**
 * 系统用户
 *
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:06
 */
@RestController
@RequestMapping("springboot_project/sysuser")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public ResponseVo list(@RequestParam Map<String, Object> params){
//        PageUtils page = sysUserService.queryPage(params);

        return ResponseResult.success(null);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{userId}")
    public ResponseVo info(@PathVariable("userId") Long userId){
		SysUserEntity sysUser = sysUserService.getById(userId);

        return ResponseResult.success(sysUser);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public ResponseVo save(@RequestBody SysUserEntity sysUser) {
        sysUserService.save(sysUser);

        return ResponseResult.success(null);
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public ResponseVo update(@RequestBody SysUserEntity sysUser){
		sysUserService.updateById(sysUser);

        return ResponseResult.success(null);
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public ResponseVo delete(@RequestBody Long[] userIds){
		sysUserService.removeByIds(Arrays.asList(userIds));

        return ResponseResult.success(null);
    }

}
