package com.chanpion.cloud.common;

/**
 * @author April Chen
 * @date 2020/2/14 12:25
 */
public class CommonResponse<T> {
    private T data;
    private int statusCode = 0;
    private String statusMsg = "success";

    public CommonResponse() {
    }

    public CommonResponse(T data) {
        this.data = data;
    }

    public CommonResponse(T data, int statusCode, String statusMsg) {
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
