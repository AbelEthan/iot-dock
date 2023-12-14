package com.zmqx.iotdock.core.util;

import com.zmqx.iotdock.core.constants.GlobalConstants;

/**
 * @ClassName: {@link RequestUtil}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/12/14 15:33
 * @Describes
 */
public class RequestUtil {

    /**
     * 获取请求地址
     *
     * @param ip
     * @param api
     * @return
     */
    public static String getRequestUrl(String ip, String api) {
        return api.replace(GlobalConstants.HTTP_REQUEST_IP, ip);
    }

    /**
     * 获取请求地址带json
     *
     * @param ip
     * @param api
     * @return
     */
    public static String getJsonRequestUrl(String ip, String api) {
        return api.replace(GlobalConstants.HTTP_REQUEST_IP, ip) + GlobalConstants.HTTP_TAIL_JSON;
    }
}
