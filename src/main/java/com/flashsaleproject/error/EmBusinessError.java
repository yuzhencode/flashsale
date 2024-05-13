package com.flashsaleproject.error;

public enum EmBusinessError implements CommonError{
    //通用错误类型10001
    PARAMETER_VALIDATION_ERROR(10001,"Parameter does not validate"),
    UNKNOWN_ERROR(10002,"Unknown error"),
    //20000开头为用户信息相关错误
    USER_NOT_EXIST(20001,"User does not exsit"),
    USER_LOGIN_FAIF(20002,"User telephone number or password is not correct."),
    USER_NOT_LOGIN(20003,"User have not login"),

    //30000订单相关错误
    STOCK_NOT_ENOUGH(30001, "Item stock is not enough")
    ;

    private int errCode;
    private String errMsg;

    private EmBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }


    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}
