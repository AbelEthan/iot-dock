package com.zmqx.hik.isapi.constants;

/**
 * @ClassName: {@link ApiIntelligentConstant}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/12/14 15:36
 * @Describes 智能相关接口常量
 */
public interface ApiIntelligentConstant {

    /**
     * 获取全部算法包信息
     */
    String GET_ALGORITHM_PACKAGES = "HTTP_REQUEST_IP/ISAPI/Intelligent/algorithmInfos/packages";

    /**
     * 获取智能调度支持算法版本信息
     */
    String GET_ALGORITHM_INFOS = "HTTP_REQUEST_IP/ISAPI/Intelligent/algorithmInfos";
}
