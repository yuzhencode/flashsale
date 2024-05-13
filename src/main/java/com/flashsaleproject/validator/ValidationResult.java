package com.flashsaleproject.validator;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class ValidationResult {

    //校验结果是否有错
    private boolean hasError;

    //存放错误信息map
    private Map<String, String> errorMsgMaps = new HashMap<>();

    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public Map<String, String> getErrorMsgMaps() {
        return errorMsgMaps;
    }

    public void setErrorMsgMaps(Map<String, String> errorMsgMaps) {
        this.errorMsgMaps = errorMsgMaps;
    }

    //实现通用的通过格式化字符串信息获取错误结果的msg方法
    public String getErrMsg(){
        return StringUtils.join(errorMsgMaps.values().toArray(), ",");
    }

}
