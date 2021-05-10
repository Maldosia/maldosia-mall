package com.maldosia.mall.common.exception;

public enum BizCodeEnum {

    UNKNOW_EXCETPION(10000,"系统未知异常"),
    VALID_EXCEPTION(10001,"参数格式校验失败");

    private Integer code;
    private String message;

    BizCodeEnum(int code,String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
