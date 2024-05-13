package com.flashsaleproject.response;

public class CommonReturnType {
//表明对应请求的返回处理结果“success“ or ”fail“
    private String status;

    //status=success，data返回前端所需数据
    //status=fail，data使用通用错误码格式
    private Object data;

    public static CommonReturnType creat(Object result){
        return CommonReturnType.creat(result,"success");
    }

    public static CommonReturnType creat(Object result, String status){
        CommonReturnType type = new CommonReturnType();
        type.setStatus(status);
        type.setData(result);
        return type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
