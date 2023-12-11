package com.zmqx.hik.isapi.model.face;

import lombok.Data;

/**
 * @ClassName: {@link FaceCounting}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/12/8 17:10
 * @Describes opt, object, 人脸库比对客流统计去重配置
 */
@Data
public class FaceCounting {

    /**
     * req, bool,
     * 人脸客流去重是否开启
     */
    private Boolean enabled;

    /**
     * req, enum,
     * 人脸客流去重开启后的上报模式,
     * subType:string, [out_repetition#去重时间段外上报,noUpload#去重时间段外不上报]
     */
    private String uploadType;
}
