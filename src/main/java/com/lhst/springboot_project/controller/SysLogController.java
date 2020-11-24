package com.lhst.springboot_project.controller;

import com.lhst.springboot_project.po.SysLogEntity;
import com.lhst.springboot_project.service.SysLogService;
import com.lhst.springboot_project.util.ResponseVo;
import com.lhst.springboot_project.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Map;



/**
 * 系统日志
 *
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
@RestController
@RequestMapping("/syslog")
@Api(description = "日志信息")
public class SysLogController {
    @Resource
    private SysLogService sysLogService;

    /**
     * 列表
     */
    @RequestMapping(value = "/list",method= RequestMethod.GET)
    @ApiOperation("查询日志列表")
    public ResponseVo list(){
//       sysLogService.queryPage(params);

        return ResponseResult.success(new Object());
    }


    /**
     * 信息
     */
    @RequestMapping(value = "/info",method= RequestMethod.GET)
    @ApiOperation("根据id查询日志列表")
    public ResponseVo info(@RequestParam("id") Long id){
		SysLogEntity sysLog = sysLogService.getById(id);
        return ResponseResult.success(sysLog);
    }

    /**
     * 保存
     */
    @RequestMapping(value = "/save",method= RequestMethod.POST)
    @ApiOperation("插入日志信息")
    public ResponseVo save(@RequestBody SysLogEntity sysLog){
		sysLogService.save(sysLog);

        return ResponseResult.success(null);
    }

    /**
     * 修改
     */
    @RequestMapping(value = "/update",method= RequestMethod.POST)
    @ApiOperation("更新日志")
    public ResponseVo update(@RequestBody SysLogEntity sysLog){
        int count = sysLogService.updateById(sysLog);

        return ResponseResult.success(count);
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/delete",method= RequestMethod.POST)
    @ApiOperation("删除日志")
    public ResponseVo delete(@RequestBody Long[] ids){
        int count = sysLogService.removeByIds(Arrays.asList(ids));
        return ResponseResult.success(count);
    }

}
