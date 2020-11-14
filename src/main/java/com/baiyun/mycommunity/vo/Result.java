package com.baiyun.mycommunity.vo;

public class Result<T> {
    //返回的状态码
    private int code;
    //数据
    private T data;
    //返回的描述信息
    private String message;
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    public Result(){
    }
    public Result(int code,T data,String message){
        this.code=code;
        this.data=data;
        this.message=message;
    }
}
