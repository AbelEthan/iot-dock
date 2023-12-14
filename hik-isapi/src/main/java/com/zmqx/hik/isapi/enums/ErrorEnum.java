/*
 * Copyright (c) 2023 AbelEthan Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zmqx.hik.isapi.enums;

/**
 * @ClassName: {@link ErrorEnum}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/12/8 15:01
 * @Describes 请求状态枚举
 */
public enum ErrorEnum {
    /**
     * 成功
     */
    OK(1, "成功"),
    /**
     * 设备忙
     */
    DEVICE_BUSY(2, "设备忙"),
    /**
     * 设备错误
     */
    DEVICE_ERROR(3, "设备错误"),
    /**
     * 操作错误
     */
    INVALID_OPERATION(4, "操作错误"),
    /**
     * 格式错误
     */
    INVALID_FORMAT(5, "格式错误"),
    /**
     * 内容错误
     */
    INVALID_CONTENT(6, "内容错误"),
    /**
     * 操作生效前需要重启
     */
    REBOOT_REQUIRED(7, "操作生效前需要重启"),
    /**
     * 批量操作
     */
    BATCH_OPERATION(8, "批量操作"),
    ;

    private Integer code;
    private String name;

    ErrorEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static ErrorEnum getEnumByCode(Integer code){
        ErrorEnum[] enums = values();
        for (ErrorEnum errorEnum : enums) {
            if (errorEnum.code.equals(code)){
                return errorEnum;
            }
        }
        return null;
    }
}
