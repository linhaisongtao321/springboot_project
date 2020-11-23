package com.lhst.springboot_project.controller;

import com.lhst.springboot_project.po.SysConfigEntity;
import com.lhst.springboot_project.service.SysConfigService;
import com.lhst.springboot_project.util.ResponseVo;
import com.lhst.springboot_project.util.ResponseResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    private SysConfigService sysConfigService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public ResponseVo list(@RequestParam Map<String, Object> params){

        return ResponseResult.success(new Object());
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public ResponseVo info(@PathVariable("id") Long id){
		SysConfigEntity sysConfig = sysConfigService.getById(id);

        return ResponseResult.success(sysConfig);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public ResponseVo save(@RequestBody SysConfigEntity sysConfig){
		sysConfigService.save(sysConfig);

        return ResponseResult.success(new Object());
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public ResponseVo update(@RequestBody SysConfigEntity sysConfig){
		sysConfigService.updateById(sysConfig);

        return ResponseResult.success(new Object());
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public ResponseVo delete(@RequestBody Long[] ids){
		sysConfigService.removeByIds(Arrays.asList(ids));

        return ResponseResult.success(new Object());
    }

}
