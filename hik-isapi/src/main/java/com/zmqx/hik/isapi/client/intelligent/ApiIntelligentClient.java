package com.zmqx.hik.isapi.client.intelligent;

import cn.hutool.http.HttpUtil;
import com.zmqx.hik.isapi.constants.ApiIntelligentConstant;
import com.zmqx.iotdock.core.util.RequestUtil;

/**
 * @ClassName: {@link ApiIntelligentClient}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/12/11 17:30
 * @Describes
 */
public class ApiIntelligentClient {

    /**
     * 获取全部算法包信息
     *
     * @param ip
     * @return
     */
    public String getAlgorithmPackages(String ip){
        String requestUrl = RequestUtil.getJsonRequestUrl(ip, ApiIntelligentConstant.GET_ALGORITHM_PACKAGES);
        return HttpUtil.get(requestUrl);
    }

    /**
     * 获取智能调度支持算法版本信息
     *
     * @param ip
     * @return
     */
    public String getAlgorithmInfos(String ip){
        String requestUrl = RequestUtil.getJsonRequestUrl(ip, ApiIntelligentConstant.GET_ALGORITHM_INFOS);
        return HttpUtil.get(requestUrl);
    }
}
