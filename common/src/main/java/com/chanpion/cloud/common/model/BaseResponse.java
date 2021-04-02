package com.chanpion.cloud.common.model;

/**
 * @author April Chen
 * @date 2021/4/2 11:26
 */
public class BaseResponse<T> {
    private T data;
    private int statusCode = 0;
    private String statusMsg = "success";

    public BaseResponse() {
    }

    public BaseResponse(T data) {
        this.data = data;
    }

    public BaseResponse(T data, int statusCode, String statusMsg) {
        this.data = data;
        this.statusCode = statusCode;
        this.statusMsg = statusMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }
}
