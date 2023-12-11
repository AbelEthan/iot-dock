package com.zmqx.hik.isapi.model.face;

import lombok.Data;

/**
 * @ClassName: {@link Age}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/12/8 17:00
 * @Describes opt, object, 人脸库聚类老化参数配置;当<autoUpdata>=true时生效
 */
@Data
public class Age {

    /**
     * req, enum,
     * 人脸库聚类数据老化判断周期时间类型,
     * subType:string,
     * [day#天,week#周,month#月,duration#按时长判断]
     */
    private String judgementCycleType;

    /**
     * req, enum,
     * 人脸库聚类比对成功统计周期时间类型能力,
     * subType:string,
     * [day#天,week#周,month#月]
     */
    private String statisticalCycleType;

    /**
     * req, int,
     * 比对成功的统计周期,
     * range:[0,99999]
     */
    private Integer statisticalCycle;


    /**
     * req, int,
     * 统计周期内最少人脸比对成功次数,
     * range:[0,99999]
     */
    private Integer minFMCount;

    /**
     * opt, bool,
     * 是否启用人脸比对成功总次数
     */
    private Boolean FMCountEnabled;

    /**
     * opt, int,
     * 人脸比对成功总次数,
     * range:[0,99999]
     */
    private Integer FMCount;

    /**
     * opt, int, 底图替换相似度阈值, range:[1,100]
     */
    private Integer backgroundPicThreshold;

    /**
     * opt, int,
     * 人脸库聚类数据老化判断周期时间范围,
     * range:[1,365],
     * unit:d, unitType:时间, dep:and,
     * {$.FDLibCap.CreateFDLibList[*].CreateFDLib.Age.judgementCycleType,eq,duration}
     */
    private Integer judgementCycle;

    /**
     * opt, time,
     * 聚类库老化执行时间
     */
    private String agingExecDataTime;

    /**
     * opt, bool,
     * 聚类库满自动清理使能
     */
    private Boolean automaticClearEnabled;
}
