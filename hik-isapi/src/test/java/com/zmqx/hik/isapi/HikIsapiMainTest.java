package com.zmqx.hik.isapi;

import com.zmqx.hik.isapi.model.face.CreateFDLibList;
import com.zmqx.iotdock.core.util.XmlUtil;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.InputStream;

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
        CreateFDLibList list = XmlUtil.convertFileToObj(CreateFDLibList.class, inputStream);
        System.out.println(list);
    }
}
