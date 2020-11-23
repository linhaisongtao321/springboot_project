package com.lhst.springboot_project.util;

import lombok.Data;

@Data
public class ResponseVo<T> {

    private String errorCode;

    private String errorMsg;

    private T result;

    public ResponseVo(String errorCode, String errorMsg, T result) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.result = result;
    }
}
