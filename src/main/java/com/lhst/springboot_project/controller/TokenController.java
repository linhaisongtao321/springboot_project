package com.lhst.springboot_project.controller;

import com.lhst.springboot_project.po.TokenEntity;
import com.lhst.springboot_project.service.TokenService;
import com.lhst.springboot_project.util.ResponseResult;
import com.lhst.springboot_project.util.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Map;


/**
 * 用户Token
 *
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
@RestController
@RequestMapping("/token")
public class TokenController {
    @Resource
    private TokenService tokenService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public ResponseVo list(@RequestParam Map<String, Object> params){
//        PageUtils page = tokenService.queryPage(params);

        return ResponseResult.success(null);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{userId}")
    public ResponseVo info(@PathVariable("userId") Long userId){
		TokenEntity token = tokenService.getById(userId);

        return ResponseResult.success(null);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public ResponseVo save(@RequestBody TokenEntity token){
		tokenService.save(token);

        return ResponseResult.success(null);
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public ResponseVo update(@RequestBody TokenEntity token){
		tokenService.updateById(token);

        return ResponseResult.success(null);
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public ResponseVo delete(@RequestBody Long[] userIds){
		tokenService.removeByIds(Arrays.asList(userIds));

        return ResponseResult.success(null);
    }

}
