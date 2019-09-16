package com.einherjar.mango.backup.util;

import lombok.Data;

/**
 * HTTP 结果封装
 * @author :   einherjar
 * @date :   2019-09-16 20:25
 */
@Data
public class HttpResult {
    private int code = 200;

    private String msg;

    private Object data;

    public static HttpResult error() {
        return error(500, "");
    }

    public static HttpResult error(String msg) {
        return error(500, msg);
    }

    public static HttpResult error(int code, String msg) {
        HttpResult result= new HttpResult();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static HttpResult ok(String msg) {
        HttpResult result = new HttpResult();
        result.setMsg(msg);
        return result;
    }

    public static HttpResult ok(Object data) {
        HttpResult result = new HttpResult();
        result.setData(data);
        return result;
    }

    public static HttpResult ok() {
        return new HttpResult();
    }
}

