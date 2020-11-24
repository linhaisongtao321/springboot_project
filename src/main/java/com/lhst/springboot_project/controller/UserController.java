package com.lhst.springboot_project.controller;

import com.alibaba.fastjson.JSONObject;
import com.lhst.springboot_project.Exception.ControllerExeption;
import com.lhst.springboot_project.Exception.ServiceExeption;
import com.lhst.springboot_project.po.UserEntity;
import com.lhst.springboot_project.service.UserService;
import com.lhst.springboot_project.util.RedisUtil;
import com.lhst.springboot_project.util.ResponseResult;
import com.lhst.springboot_project.util.ResponseVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;


/**
 * 用户
 *
 * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
 */
@RestController
@RequestMapping("/user")
@Api("用户")
public class UserController {
    @Resource
    private UserService userService;

    @Resource
    RedisUtil redisUtil;

    //
    @RequestMapping("captcha.jpg")
    @ApiOperation("生成验证码")
    public void captcha(HttpServletResponse response)throws ServletException, IOException {
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");

//        //生成文字验证码
//        String text = producer.createText();
//        //生成图片验证码
//        BufferedImage image = producer.createImage(text);
//        //保存到shiro session
//        ShiroUtils.setSessionAttribute(Constants.KAPTCHA_SESSION_KEY, text);
//
//        ServletOutputStream out = response.getOutputStream();
//        ImageIO.write(image, "jpg", out);
//        out.flush();
    }
    /**
     * 登录
     */
    @RequestMapping(value = "/login",method= RequestMethod.GET)
    @ApiOperation("用戶登录")
    public ResponseVo login(@RequestParam("username") String username,String password) throws ControllerExeption {
        String token=null;
        try{
            token = userService.getUserByName(username,password);
            return ResponseResult.success(token);
        }catch (Exception e){
            throw new ControllerExeption(e.getMessage());
        }

    }
    /**
     * 列表
     */
    @RequestMapping(value = "/list",method= RequestMethod.GET)
    @ApiOperation("查询用户列表")
    public ResponseVo list() {
        List<UserEntity> userEntities = userService.selectAllUsers();
        return ResponseResult.success(userEntities);
    }


    /**
     * 信息
     */
    @RequestMapping(value = "/info",method= RequestMethod.GET)
    @ApiOperation("查询用户信息")
    public ResponseVo info(@RequestParam("userId") Long userId){
        UserEntity user = userService.getById(Long.valueOf(userId));

        return ResponseResult.success(user);
    }

    /**
     * 保存
     */
    @RequestMapping(value = "/save",method= RequestMethod.POST)
    @ApiOperation("保存用户信息")
    public ResponseVo save(@RequestBody UserEntity user){
		userService.save(user);
        return ResponseResult.success(null);
    }

    /**
     * 修改
     */
    @RequestMapping(value = "/update",method= RequestMethod.POST)
    @ApiOperation("更新用户信息")
    public ResponseVo update(@RequestBody UserEntity user){
		userService.updateById(user);

        return ResponseResult.success(null);
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/delete",method= RequestMethod.POST)
    @ApiOperation("删除用户信息")
    public ResponseVo delete(@RequestBody Long[] userIds){
		userService.removeByIds(Arrays.asList(userIds));

        return ResponseResult.success(null);
    }

}
