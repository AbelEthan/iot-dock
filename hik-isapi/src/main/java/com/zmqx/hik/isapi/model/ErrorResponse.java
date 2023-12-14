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

package com.zmqx.hik.isapi.model;

import lombok.Data;

/**
 * @ClassName: {@link ErrorResponse}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/12/8 15:12
 * @Describes 错误响应对象
 */
@Data
public class ErrorResponse {
    /**
     * 请求接口
     */
    private String requestURL;

    /**
     * 状态码
     */
    private Integer statusCode;
    /**
     * 状态描述
     */
    private String statusString;
    /**
     * 子状态码
     */
    private String subStatusCode;
    /**
     * 错误码
     */
    private String errorCode;
    /**
     * 描述
     */
    private String errorMsg;
}
