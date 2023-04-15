package com.lld.im.common;

import com.lld.im.common.exception.ApplicationExceptionEnum;

/**
 * @Description: TODO
 * @Author: yuanhaosheng
 * @Version: 1.0
 */
public enum BaseErrorCode implements ApplicationExceptionEnum {

    SUCCESS(200, "success"),
    SYSTEM_ERROR(90000, "服务器内部错误，请联系管理员"),
    PARAMETER_ERROR(90001, "参数教研错误");

    BaseErrorCode(int i, String success) {

    }

    @Override
    public int getCode() {
        return 0;
    }

    @Override
    public String getError() {
        return null;
    }
}
