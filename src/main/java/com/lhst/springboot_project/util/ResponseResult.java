package com.lhst.springboot_project.util;

import com.lhst.springboot_project.common.constant;
import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseResult implements Serializable {


    public static ResponseVo success(Object data){
        return new ResponseVo(constant.success,"success",data);
    }

    public static ResponseVo fail(Object data){
        return new ResponseVo(constant.failure,"failure",data);

    }
    public static ResponseVo fail(String message,Object data){
        return new ResponseVo(constant.failure,message,data);

    }
}
