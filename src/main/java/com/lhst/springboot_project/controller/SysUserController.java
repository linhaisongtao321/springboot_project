package com.lhst.springboot_project.controller;

import java.util.Arrays;
import java.util.Map;

import com.lhst.springboot_project.util.ResponseVo;
import com.lhst.springboot_project.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/sysuser")
@Api(value = "用户信息")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;

    /**
     * 列表
     */
    @ApiOperation(value = "查询用户列表")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ResponseVo list(@RequestParam("id") String id){
//        PageUtils page = sysUserService.queryPage(params);
        SysUserEntity sysUserEntity = sysUserService.getById(id);
        return ResponseResult.success(sysUserEntity);
    }


    /**
     * 信息
     */
    @RequestMapping(value = "/info",method = RequestMethod.POST)
    @ApiOperation(value = "根据id查询用户列表")
    public ResponseVo info(@PathVariable("userId") Long userId){
		SysUserEntity sysUser = sysUserService.getById(userId);
        return ResponseResult.success(sysUser);
    }

    /**
     * 保存
     */
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    @ApiOperation(value = "保存用户信息")
    public ResponseVo save(@RequestBody SysUserEntity sysUser) {
        sysUserService.save(sysUser);
        return ResponseResult.success(null);
    }

    /**
     * 修改
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value = "更新用户列表")
    public ResponseVo update(@RequestBody SysUserEntity sysUser){
		sysUserService.updateById(sysUser);
        return ResponseResult.success(null);
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value = "删除用户列表")
    public ResponseVo delete(@RequestBody Long[] userIds){
		sysUserService.removeByIds(Arrays.asList(userIds));

        return ResponseResult.success(null);
    }

}
