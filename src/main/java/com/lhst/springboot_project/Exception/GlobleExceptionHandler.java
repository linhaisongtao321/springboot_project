package com.lhst.springboot_project.Exception;

import com.lhst.springboot_project.util.ResponseResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobleExceptionHandler {

    @ExceptionHandler(value = ControllerExeption.class) //这个注解，接受异常
    @ResponseBody //返回json
    public ResponseResult serviceHandler(HttpServletRequest req, ServiceExeption e) throws Exception {
        return null;
    }

    @ExceptionHandler(value = ServiceExeption.class) //这个注解，接受异常
    @ResponseBody //返回json
    public ResponseResult controllerHandler(HttpServletRequest req, ServiceExeption e) throws Exception {
        return null;
    }

    @ExceptionHandler(value = DaoExeption.class) //这个注解，接受异常
    @ResponseBody //返回json
    public ResponseResult daoHandler(HttpServletRequest req, ServiceExeption e) throws Exception {
        return null;
    }
}
