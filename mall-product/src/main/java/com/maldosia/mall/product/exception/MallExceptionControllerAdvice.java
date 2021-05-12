package com.maldosia.mall.product.exception;

import com.maldosia.mall.common.exception.BizCodeEnum;
import com.maldosia.mall.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * 集中处理所有异常
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.maldosia.mall.product.controller")
public class MallExceptionControllerAdvice {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException e){
        log.error("数据校验出现问题：{},异常类型：{}",e.getMessage(),e.getClass());

        Map<String, String> errorMap = new HashMap<>();
        BindingResult bindingResult = e.getBindingResult();
        bindingResult.getFieldErrors().forEach((fieldError) -> {
            errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
        });
        return R.error(BizCodeEnum.VALID_EXCEPTION.getCode(),BizCodeEnum.VALID_EXCEPTION.getMessage()).put("data",errorMap);
    }


    @ExceptionHandler(value = Throwable.class)
    public R handleThrowable(Throwable throwable){

        log.error("错误异常{}",throwable);

        return R.error(BizCodeEnum.UNKNOW_EXCETPION.getCode(),BizCodeEnum.UNKNOW_EXCETPION.getMessage());
    }

}
