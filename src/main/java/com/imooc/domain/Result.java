package com.imooc.domain;

/**
 * http请求返回的最外层对象
 * Created by 廖师兄
 * 2017-01-21 13:34
 */
public class Result<T> {

    /** 错误码. */
    private Integer status;

    /** 提示信息. */
    private String msg;

    /** 具体的内容. */
    private T data;

    public Integer getstatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
