package com.zmqx.hik.isapi.model.face;


import com.zmqx.hik.isapi.constants.IsApiConstants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @ClassName: {@link FaceCounting}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/12/8 17:10
 * @Describes opt, object, 人脸库比对客流统计去重配置
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "FaceCounting")
@XmlAccessorType(XmlAccessType.FIELD)
public class FaceCounting implements Serializable {

    /**
     * req, bool,
     * 人脸客流去重是否开启
     */
    @XmlElement(namespace = IsApiConstants.ISAPI_NAMESPACE)
    private Boolean enabled;

    /**
     * req, enum,
     * 人脸客流去重开启后的上报模式,
     * subType:string, [out_repetition#去重时间段外上报,noUpload#去重时间段外不上报]
     */
    @XmlElement(namespace = IsApiConstants.ISAPI_NAMESPACE)
    private String uploadType;
}
