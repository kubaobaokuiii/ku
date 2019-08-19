package com.boms.guo.Exception;

import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * 统一返回结果定义
 * @author guo shuang
 */
public class ResponseData {

    private Boolean status = true;

    private int code = 200;

    private String message;

    private Object data;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
