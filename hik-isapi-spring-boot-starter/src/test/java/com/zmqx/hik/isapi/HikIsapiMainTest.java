package com.zmqx.hik.isapi;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.XmlUtil;
import com.zmqx.hik.isapi.model.face.CreateFDLib;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.w3c.dom.Document;

import java.io.InputStream;
import java.util.Map;

/**
 * @ClassName: {@link HikIsapiMainTest}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/12/8 16:15
 * @Describes
 */
@SpringBootTest
public class HikIsapiMainTest {
    @Test
    public void convertToObj() {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("createFDLib.xml");
        Document document = XmlUtil.readXML(inputStream);
        String xmlStr = XmlUtil.toStr(document);
        System.out.println("xmlStr:" + xmlStr);
        Map<String, Object> xmlMap = XmlUtil.xmlToMap(xmlStr);
        System.out.println("xmlMap:" + xmlMap);
        CreateFDLib createFDLib = BeanUtil.toBean(xmlMap, CreateFDLib.class);
        System.out.println("createFDLib:" + createFDLib);
    }
}
