package com.javago.base.chapter7;

public class BaseException extends Exception{
    private String errorCode;
    private String errorMessage;

    public BaseException(String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrCode() {
        return errorCode;
    }

    public void setErrCode(String errCode) {
        this.errorCode = errCode;
    }

    public String getErrMessage() {
        return errorMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errorMessage = errMessage;
    }
}
