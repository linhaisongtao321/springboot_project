package com.lhst.springboot_project.controller;

import com.lhst.springboot_project.po.SysOssEntity;
import com.lhst.springboot_project.service.SysOssService;
import com.lhst.springboot_project.util.ResponseVo;
import com.lhst.springboot_project.util.ResponseResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

 /**
 * 文件上传
 *
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
@RestController
@Api(tags = "文件管理")
public class SysOssController {
    @Autowired
    private SysOssService sysOssService;

        /**
     * 列表
     */
    @RequestMapping("/list")
    public ResponseVo list(@RequestParam Map<String, Object> params){
    //        PageUtils page = sysOssService.queryPage(params);

        return ResponseResult.success(null);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public ResponseVo info(@PathVariable("id") Long id){
        SysOssEntity sysOss = sysOssService.getById(id);

        return ResponseResult.success(sysOss);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public ResponseVo save(@RequestBody SysOssEntity sysOss){
        sysOssService.save(sysOss);

        return ResponseResult.success(null);
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public ResponseVo update(@RequestBody SysOssEntity sysOss){
        sysOssService.updateById(sysOss);

        return ResponseResult.success(null);
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public ResponseVo delete(@RequestBody Long[] ids){
        sysOssService.removeByIds(Arrays.asList(ids));

        return ResponseResult.success(null);
    }

}
