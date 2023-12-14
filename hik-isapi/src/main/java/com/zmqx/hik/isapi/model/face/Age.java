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
 * @ClassName: {@link Age}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/12/8 17:00
 * @Describes opt, object, 人脸库聚类老化参数配置;当<autoUpdata>=true时生效
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "Age")
@XmlAccessorType(XmlAccessType.FIELD)
public class Age implements Serializable {

    /**
     * req, enum,
     * 人脸库聚类数据老化判断周期时间类型,
     * subType:string,
     * [day#天,week#周,month#月,duration#按时长判断]
     */
    @XmlElement(namespace = IsApiConstants.ISAPI_NAMESPACE)
    private String judgementCycleType;

    /**
     * req, enum,
     * 人脸库聚类比对成功统计周期时间类型能力,
     * subType:string,
     * [day#天,week#周,month#月]
     */
    @XmlElement(namespace = IsApiConstants.ISAPI_NAMESPACE)
    private String statisticalCycleType;

    /**
     * req, int,
     * 比对成功的统计周期,
     * range:[0,99999]
     */
    @XmlElement(namespace = IsApiConstants.ISAPI_NAMESPACE)
    private Integer statisticalCycle;


    /**
     * req, int,
     * 统计周期内最少人脸比对成功次数,
     * range:[0,99999]
     */
    @XmlElement(namespace = IsApiConstants.ISAPI_NAMESPACE)
    private Integer minCount;

    /**
     * opt, bool,
     * 是否启用人脸比对成功总次数
     */
    @XmlElement(name = "FMCountEnabled", namespace = IsApiConstants.ISAPI_NAMESPACE)
    private Boolean enabledCount;

    /**
     * opt, int,
     * 人脸比对成功总次数,
     * range:[0,99999]
     */
    @XmlElement(name = "FMCount", namespace = IsApiConstants.ISAPI_NAMESPACE)
    private Integer count;

    /**
     * opt, int, 底图替换相似度阈值, range:[1,100]
     */
    @XmlElement(namespace = IsApiConstants.ISAPI_NAMESPACE)
    private Integer backgroundPicThreshold;

    /**
     * opt, int,
     * 人脸库聚类数据老化判断周期时间范围,
     * range:[1,365],
     * unit:d, unitType:时间, dep:and,
     * {$.FDLibCap.CreateFDLibList[*].CreateFDLib.Age.judgementCycleType,eq,duration}
     */
    @XmlElement(namespace = IsApiConstants.ISAPI_NAMESPACE)
    private Integer judgementCycle;

    /**
     * opt, time,
     * 聚类库老化执行时间
     */
    @XmlElement(namespace = IsApiConstants.ISAPI_NAMESPACE)
    private String agingExecDataTime;

    /**
     * opt, bool,
     * 聚类库满自动清理使能
     */
    @XmlElement(namespace = IsApiConstants.ISAPI_NAMESPACE)
    private Boolean automaticClearEnabled;
}
