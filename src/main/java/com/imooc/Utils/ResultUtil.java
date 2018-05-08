package com.imooc.Utils;

import com.imooc.domain.Girl;
import com.imooc.domain.Result;

public class ResultUtil {
    public static Result success(Girl girl){
        Result result = new Result<>();
        result.setCode(1);
        result.setMsg("success");
        result.setData(girl);
        return result;
    }
    public static Result success(){
        Result result = new Result<>();
        result.setCode(1);
        result.setMsg("success");
        result.setData(null);
        return result;
    }
    public static Result error(Integer code,String msg){
        Result result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }
}
