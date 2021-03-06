package com.lhst.springboot_project.controller;

import com.lhst.springboot_project.po.UserEntity;
import com.lhst.springboot_project.service.UserService;
import com.lhst.springboot_project.util.RedisUtil;
import com.lhst.springboot_project.util.ResponseResult;
import com.lhst.springboot_project.util.ResponseVo;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 用户
 *
         * @author wangdj
 * @email ${email}
 * @date 2020-11-22 16:12:07
            */
@RestController
@RequestMapping("/user")
@Api(tags = "用户")
@Validated
public class UserController {
    @Resource
    private UserService userService;

    @Resource
    RedisUtil redisUtil;

    private final Logger logger = LoggerFactory.getLogger(UserController.class);
    //
    @GetMapping("captcha.jpg")
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

    @GetMapping(value = "/login")
    @ApiOperation("用戶登录")
    public ResponseVo login(@RequestParam("username") String username, @RequestParam("password") String password)  {
        logger.debug("用戶登录");
        String token=null;
        List<UserEntity> listUser=new ArrayList<>();
        try{


            token = userService.getUserByName(username,password);
            logger.debug("token:{}",token);
            return ResponseResult.success(token);

        }catch (Exception e){
            return ResponseResult.fail(e.getMessage());
        }
    }
    /**
     * 列表
     */
    @GetMapping(value = "/list")
    @ApiOperation("查询用户列表")
    public ResponseVo list() {
        List<UserEntity> userEntities = userService.list();
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
    @RequestMapping(value = "/saveUsers",method= RequestMethod.POST)
    @ApiOperation("保存用户信息")
    public ResponseVo save(@RequestBody @Validated() List<UserEntity> users){
        users.stream().forEach(user->{
            userService.save(user);
        });

        return ResponseResult.success(null);
    }


    @RequestMapping(value = "/save",method= RequestMethod.POST)
    @ApiOperation("保存用户信息")
    public ResponseVo saveUsers(@RequestBody @Valid UserEntity user){
        userService.save(user);
        return ResponseResult.success(null);
    }



    /**
     * 修改
     */
    @ApiResponses(value = {
                       @ApiResponse(code = 00, message = "接口返回成功状态"),
                       @ApiResponse(code = 01, message = "接口返回未知错误，请联系开发人员调试")})
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
