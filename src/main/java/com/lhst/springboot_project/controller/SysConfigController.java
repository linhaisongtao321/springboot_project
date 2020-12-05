package com.lhst.springboot_project.controller;

import com.lhst.springboot_project.po.SysConfigEntity;
import com.lhst.springboot_project.service.SysConfigService;
import com.lhst.springboot_project.util.ResponseVo;
import com.lhst.springboot_project.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Arrays;
import java.util.Map;

 

/**
 * 系统配置信息表
 *
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
@RestController
@RequestMapping("/sysconfig")
@Api(description = "系统配置信息表")
public class SysConfigController {
    @Resource
    private SysConfigService sysConfigService;

    /**
     * 列表
     */
    @GetMapping("/list")
    @ApiOperation(value = "获取系统信息配置表")
    public ResponseVo list(@RequestParam Map<String, Object> params){

        return ResponseResult.success(new Object());
    }


    /**
     * 信息
     */
    @RequestMapping(value = "/info/{id}",method = RequestMethod.GET)
    @ApiOperation(value = "根据用户id")
    public ResponseVo info(@PathVariable("根据id获取系统信息") Long id){
		SysConfigEntity sysConfig = sysConfigService.getById(id);

        return ResponseResult.success(sysConfig);
    }

    /**
     * 保存
     */
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    @ApiOperation(value = "保存系统信息配置表")
    public ResponseVo save(@RequestBody SysConfigEntity sysConfig){
		sysConfigService.save(sysConfig);

        return ResponseResult.success(new Object());
    }

    /**
     * 修改
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value = "修改系统信息配置表")
    public ResponseVo update(@RequestBody @Valid SysConfigEntity sysConfig){
		sysConfigService.updateById(sysConfig);

        return ResponseResult.success(new Object());
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value = "刪除系统信息配置表")
    public ResponseVo delete(@RequestBody Long[] ids){

		sysConfigService.removeByIds(Arrays.asList(ids));

        return ResponseResult.success(new Object());
    }

}
