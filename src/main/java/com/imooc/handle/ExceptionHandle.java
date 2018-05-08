package com.imooc.handle;

import com.imooc.Utils.ResultUtil;
import com.imooc.domain.Result;
import com.imooc.exception.GirlException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public static Result handle(Exception e){
        if(e instanceof GirlException){
            GirlException girlException = (GirlException)e;
            return ResultUtil.error(girlException.getCode(),girlException.getMessage());
        }else{
            return ResultUtil.error(-1,e.getMessage());
        }
    }
}
