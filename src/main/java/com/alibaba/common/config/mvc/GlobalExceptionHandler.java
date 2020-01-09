package com.alibaba.common.config.mvc;

import com.alibaba.common.APIResponse;
import com.alibaba.common.exception.GlobalException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.BindException;
import java.util.List;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
    @ExceptionHandler(value=Exception.class) //该注解声明异常处理方法
    public APIResponse exceptionHandler(HttpServletRequest request, Exception e){
        e.printStackTrace();
        //对于自定义异常的处理
        if(e instanceof GlobalException) {
            GlobalException ex = (GlobalException)e;
            return APIResponse.instance(ex.getCm());
            //对于绑定异常的处理，使用jsr303中的自定义注解抛出的异常属于绑定异常
        }else{
            return APIResponse.instance(1,e.getMessage());
        }
    }
}
