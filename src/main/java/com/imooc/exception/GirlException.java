package com.imooc.exception;

/**
 * 继承RuntimeException是因为Spring能对他进行事务回滚
 */
public class GirlException extends RuntimeException {
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public GirlException(int code, String msg){
        super(msg);
        this.code = code;
    }
}
