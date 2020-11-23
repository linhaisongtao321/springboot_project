package com.lhst.springboot_project.controller;

import java.util.Arrays;
import java.util.Map;

import com.baomidou.mybatisplus.extension.api.R;
import com.lhst.springboot_project.service.UserService;
import com.lhst.springboot_project.util.ResponseResult;
import com.lhst.springboot_project.util.ResponseVo;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lhst.springboot_project.po.UserEntity;

import javax.annotation.Resource;


/**
 * 用户
 *
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
@RestController
@RequestMapping("springboot_project/user")
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public ResponseVo list(@RequestParam Map<String, Object> params){
//        PageUtils page = userService.queryPage(params);

        return ResponseResult.success(null);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{userId}")
    public ResponseVo info(@PathVariable("userId") Long userId){
		UserEntity user = userService.getById(userId);

        return ResponseResult.success(user);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public ResponseVo save(@RequestBody UserEntity user){
		userService.save(user);

        return ResponseResult.success(null);
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public ResponseVo update(@RequestBody UserEntity user){
		userService.updateById(user);

        return ResponseResult.success(null);
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public ResponseVo delete(@RequestBody Long[] userIds){
		userService.removeByIds(Arrays.asList(userIds));

        return ResponseResult.success(null);
    }

}
