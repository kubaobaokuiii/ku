package com.boms.guo.Exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * 全局统一异常处理
 * @author guo shuang
 * @ControllerAdvice 作用是拦截异常并统一处理
 * Logger:org.slf4j.Logger包中;
 * ResponseData是我们返回格式的实体类
 * 也需要在spring boot的配置文件中加上代码
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ResponseData defaultErrorHandler(HttpServletResponse req,Exception e) throws Exception{

        logger.error("",e);

        ResponseData r = new ResponseData();

        r.setMessage(e.getMessage());

        if(e instanceof org.springframework.web.servlet.NoHandlerFoundException){

            r.setCode(404);

        }else{

            r.setCode(500);
        }

        r.setData(null);

        r.setStatus(false);

        return r;
    }


}
