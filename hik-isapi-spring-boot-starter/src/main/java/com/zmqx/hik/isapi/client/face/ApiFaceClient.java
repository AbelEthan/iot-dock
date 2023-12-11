package com.zmqx.hik.isapi.client.face;

import cn.hutool.http.HttpUtil;
import com.zmqx.iotdock.core.constants.ApiConstants;

import java.io.IOException;
import java.util.HashMap;

/**
 * @ClassName: {@link ApiFaceClient}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/12/11 16:54
 * @Describes
 */
public class ApiFaceClient {

    /**
     * 获取分析人脸图片能力集
     * 如果接口返回成功表示设备支持分析人脸图片功能。
     *
     * @param ip
     * @return
     * @throws IOException
     */
    public String getFacePicAnalysisCapabilities(String ip) {
        String requestUrl = ApiConstants.getRequestUrl(ip, ApiConstants.GET_SDT_FACE_PIC_ANALYSIS_CAPABILITY);
        return HttpUtil.get(requestUrl);
    }

    /**
     * 获取分析人脸图片能力集
     * 判断设备是否支持人脸批量检测和建模功能。
     *
     * @param ip
     * @return
     * @throws IOException
     */
    public String getFacePicAnalysisBatchCapabilities(String ip) {
        String requestUrl = ApiConstants.getRequestUrl(ip, ApiConstants.GET_SDT_FACE_PIC_ANALYSIS_BATCH_CAPABILITY);
        return HttpUtil.get(requestUrl);
    }

    /**
     * 分析人脸图片（建模）
     * 接口同步将分析结果返回给调用者
     *
     * @param ip
     * @return
     * @throws IOException
     */
    public String postFacePicAnalysis(String ip) {
        String requestUrl = ApiConstants.getRequestUrl(ip, ApiConstants.POST_SDT_FACE_PIC_ANALYSIS);
        return HttpUtil.post(requestUrl, new HashMap<>());
    }

    /**
     * 提交人脸批量检测和建模任务
     * 输入的图片只支持URL方式，需要提前将图片上传到服务器存储或者云存储；
     *
     * @param ip
     * @return
     * @throws IOException
     */
    public String postFacePicAnalysisBatch(String ip) {
        String requestUrl = ApiConstants.getRequestUrl(ip, ApiConstants.POST_SDT_FACE_PIC_ANALYSIS_BATCH);
        return HttpUtil.post(requestUrl, new HashMap<>());
    }

    /**
     * （可选）获取任务状态信息
     *
     * @param ip
     * @return
     * @throws IOException
     */
    public String getManagementTaskStatus(String ip) {
        String requestUrl = ApiConstants.getRequestUrl(ip, ApiConstants.GET_SDT_MANAGEMENT_TASK_STATUS);
        return HttpUtil.get(requestUrl);
    }
}
