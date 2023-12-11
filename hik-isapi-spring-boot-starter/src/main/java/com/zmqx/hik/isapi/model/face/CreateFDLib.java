/*
 * Copyright (c) 2023 AbelEthan Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zmqx.hik.isapi.model.face;

import lombok.Data;

/**
 * @ClassName: {@link CreateFDLib}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/12/8 15:45
 * @Describes opt, object, 创建人脸库
 */
@Data
public class CreateFDLib {

    /**
     * opt, int,
     * 表示list中子项个数;
     * 从1开始赋值;
     * 依次增加, range:[1,15]
     */
    private Integer id;

    /**
     * req, string,
     * 人脸库名称,
     * range:[1,64]
     */
    private String name;

    /**
     * opt,int,
     * 检测阈值,
     * range:[0,100]
     */
    private Integer thresholdValue;

    /**
     * opt, string,
     * 人脸库附加信息,
     * range:[1,128]
     */
    private String customInfo;

    /**
     * opt, string,
     * 自定义人脸库ID,
     * range:[1,64]
     */
    private String customFaceLibID;

    /**
     * opt, bool,
     * 人脸库自动更新库中底图使能
     */
    private Boolean autoUpdata;

    /**
     * opt, int,
     * 图片质量阈值,
     * range:[0,100]
     */
    private Integer qualityThreshold;

    /**
     * opt, int,
     * 入库相似度阈值, range:[0,100]
     */
    private Integer importFDThreshold;

    /**
     * opt, object,
     * 人脸库聚类老化参数配置;
     * 当<autoUpdata>=true时生效
     */
    private Age Age;

    /**
     * opt, object,
     * 人脸库比对客流统计去重配
     */
    private FaceCounting FaceCounting;

    /**
     * opt, enum,
     * 创建指定人脸库类型,
     * subType:string,
     * [ordinary#普通库,privacyMask#隐私遮蔽库],
     * desc:不传该节点，默认创建普通人脸库
     */
    private String faceLibType;
}
