package com.zmqx.hik.isapi.model.face;

import com.zmqx.hik.isapi.constants.IsApiConstants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @ClassName: {@link CreateFDLibList}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/12/14 14:05
 * @Describes 创建人脸库信息列表对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "CreateFDLibList", namespace = IsApiConstants.ISAPI_NAMESPACE)
@XmlAccessorType(XmlAccessType.FIELD)
public class CreateFDLibList implements Serializable {

    /**
     * 创建人脸库
     */
    @XmlElement(name = "CreateFDLib", namespace = IsApiConstants.ISAPI_NAMESPACE)
    private CreateFDLib createFDLib;

    /**
     * 命名空间版本
     */
    @XmlAttribute(name = "version")
    private String version = IsApiConstants.ISAPI_VERSION;
}
