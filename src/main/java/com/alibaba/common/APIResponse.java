package com.alibaba.common;

import com.alibaba.common.constant.CodeMsg;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class APIResponse {

    private int code;
    private String message;
    private Object data;

    public APIResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static APIResponse instance(int code, String message){
        return new APIResponse(code,message,null);
    }

    public static APIResponse instance(int code,String message,Object data){
        return new APIResponse(code, message, data);
    }

    public static APIResponse instance(Object data){
        return new APIResponse(0,"操作成功",data);
    }

    public static APIResponse instance(CodeMsg msg){
        return APIResponse.instance(msg.getCode(),msg.getMsg());
    }
}
