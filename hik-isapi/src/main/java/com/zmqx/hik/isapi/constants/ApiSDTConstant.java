package com.zmqx.hik.isapi.constants;


/**
 * @ClassName: {@link ApiSDTConstant}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/12/11 16:46
 * @Describes 人脸相关接口常量
 */
public interface ApiSDTConstant {


    /**
     * 获取分析人脸图片能力集
     */
    String GET_FACE_PIC_ANALYSIS_CAPABILITY = "HTTP_REQUEST_IP/ISAPI/SDT/Face/pictureAnalysis/capabilities";

    /**
     * 获取人脸批量检测和建模能力集
     */
    String GET_FACE_PIC_ANALYSIS_BATCH_CAPABILITY = "HTTP_REQUEST_IP/ISAPI/SDT/Face/pictureAnalysis/batch/capabilities";

    /**
     * 分析人脸图片（建模）
     */
    String POST_FACE_PIC_ANALYSIS = "HTTP_REQUEST_IP/ISAPI/SDT/Face/pictureAnalysis";

    /**
     * 提交人脸批量检测和建模任务
     */
    String POST_FACE_PIC_ANALYSIS_BATCH = "HTTP_REQUEST_IP/ISAPI/SDT/Face/pictureAnalysis/batch";

    /**
     * （可选）获取任务状态信息
     */
    String GET_MANAGEMENT_TASK_STATUS = "HTTP_REQUEST_IP/ISAPI/SDT/Management/Task/status";
}
