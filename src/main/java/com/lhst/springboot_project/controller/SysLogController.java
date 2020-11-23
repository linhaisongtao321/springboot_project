package com.lhst.springboot_project.controller;

import com.lhst.springboot_project.po.SysLogEntity;
import com.lhst.springboot_project.service.SysLogService;
import com.lhst.springboot_project.util.ResponseVo;
import com.lhst.springboot_project.util.ResponseResult;
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
public class SysLogController {
    @Resource
    private SysLogService sysLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public ResponseVo list(@RequestParam Map<String, Object> params){
//       sysLogService.queryPage(params);

        return ResponseResult.success(new Object());
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public ResponseVo info(@PathVariable("id") Long id){
		SysLogEntity sysLog = sysLogService.getById(id);

        return ResponseResult.success(sysLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public ResponseVo save(@RequestBody SysLogEntity sysLog){
		sysLogService.save(sysLog);

        return ResponseResult.success(null);
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public ResponseVo update(@RequestBody SysLogEntity sysLog){
        int count = sysLogService.updateById(sysLog);

        return ResponseResult.success(count);
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public ResponseVo delete(@RequestBody Long[] ids){
        int count = sysLogService.removeByIds(Arrays.asList(ids));
        return ResponseResult.success(count);
    }

}
