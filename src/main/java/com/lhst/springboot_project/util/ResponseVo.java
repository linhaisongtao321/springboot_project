package com.lhst.springboot_project.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("相应结果")
public class ResponseVo<T> {

    @ApiModelProperty("响应码")
    private String errorCode;
    @ApiModelProperty("响应消息")
    private String errorMsg;
    @ApiModelProperty("响应内容")
    private T result;

    public ResponseVo(String errorCode, String errorMsg, T result) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.result = result;
    }
}
