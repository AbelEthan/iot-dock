package com.zmqx.iotdock.core.constants;


/**
 * @ClassName: {@link ApiConstants}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/12/11 16:46
 * @Describes 接口常量
 */
public interface ApiConstants {


    /**基础**/

    /**
     * 获取设备信息
     */
    String GET_SYSTEM_DEVICE_INFO = "HTTP_REQUEST_IP/ISAPI/System/deviceInfo";


    /**人脸识别**/

    /**
     * 获取分析人脸图片能力集
     */
    String GET_SDT_FACE_PIC_ANALYSIS_CAPABILITY = "HTTP_REQUEST_IP/ISAPI/SDT/Face/pictureAnalysis/capabilities";

    /**
     * 获取人脸批量检测和建模能力集
     */
    String GET_SDT_FACE_PIC_ANALYSIS_BATCH_CAPABILITY = "HTTP_REQUEST_IP/ISAPI/SDT/Face/pictureAnalysis/batch/capabilities";

    /**
     * 分析人脸图片（建模）
     */
    String POST_SDT_FACE_PIC_ANALYSIS = "HTTP_REQUEST_IP/ISAPI/SDT/Face/pictureAnalysis";

    /**
     * 提交人脸批量检测和建模任务
     */
    String POST_SDT_FACE_PIC_ANALYSIS_BATCH = "HTTP_REQUEST_IP/ISAPI/SDT/Face/pictureAnalysis/batch";

    /**
     * （可选）获取任务状态信息
     */
    String GET_SDT_MANAGEMENT_TASK_STATUS = "/ISAPI/SDT/Management/Task/status";
    /**
     * 获取全部算法包信息
     */
    String GET_INTELLIGENT_ALGORITHM_PACKAGES = "HTTP_REQUEST_IP/ISAPI/Intelligent/algorithmInfos/packages";

    /**
     * 获取智能调度支持算法版本信息
     */
    String GET_INTELLIGENT_ALGORITHM_INFOS = "HTTP_REQUEST_IP/ISAPI/Intelligent/algorithmInfos";


    /**
     * 获取请求地址
     *
     * @param ip
     * @param apiConstants
     * @return
     */
    static String getRequestUrl(String ip, String apiConstants) {
        return apiConstants.replace(GlobalConstants.HTTP_REQUEST_IP, ip);
    }

    /**
     * 获取请求地址带json
     *
     * @param ip
     * @param apiConstants
     * @return
     */
    static String getJsonRequestUrl(String ip, String apiConstants) {
        return apiConstants.replace(GlobalConstants.HTTP_REQUEST_IP, ip) + GlobalConstants.HTTP_TAIL_JSON;
    }
}
