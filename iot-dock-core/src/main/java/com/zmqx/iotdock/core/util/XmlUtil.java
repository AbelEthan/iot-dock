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

package com.zmqx.iotdock.core.util;

import cn.hutool.core.util.StrUtil;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * @ClassName: {@link XmlUtil}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/12/8 15:20
 * @Describes xml工具类
 */
public class XmlUtil {
    /**
     * 将对象直接转换成String类型的 XML输出
     *
     * @param obj
     * @return
     */
    public static String convertToXml(Object obj){
        //创建输出流
        StringWriter sw = new StringWriter();
        sw.append(StrUtil.LF);
        try {
            //利用jdk中自带的转换类型实现
            JAXBContext context = JAXBContext.newInstance(obj.getClass());
            Marshaller marshaller = context.createMarshaller();
            //格式化xml输出的格式
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            //将对象转换成输出流形式的xml
            marshaller.marshal(obj, sw);
        }catch (JAXBException e){
            e.printStackTrace();
        }
        return sw.toString();
    }

    /**
     * 将对象根据路径转换成XML文件
     *
     * @param obj
     * @param filePath
     */
    @SuppressWarnings("unchecked")
    public static void convertToXml(Object obj,String filePath){
        try {
            //利用jdk中自带的转换类型实现
            JAXBContext context = JAXBContext.newInstance(obj.getClass());
            Marshaller marshaller = context.createMarshaller();
            //格式化xml输出的格式
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            // 将对象转换成输出流形式的xml
            // 创建输出流
            FileWriter fw = null;
            try {
                fw = new FileWriter(filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
            marshaller.marshal(obj, fw);
        }catch (JAXBException e){
            e.printStackTrace();
        }
    }

    /**
     * 将String类型的XML转换成对象
     *
     * @param clazz
     * @param xmlStr
     * @return
     */
    @SuppressWarnings("unchecked")
    public static Object convertStrToObj(Class<?> clazz, String xmlStr){
        Object xmlObj = null;
        try {
            JAXBContext context = JAXBContext.newInstance(clazz);
            // 进行将XML转成对象的核心接口
            Unmarshaller unmarshaller = context.createUnmarshaller();
            StringReader sr = new StringReader(xmlStr);
            xmlObj = unmarshaller.unmarshal(sr);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return xmlObj;
    }

    /**
     * 将XML文件转换成对象
     *
     * @param clazz
     * @param xmlPath
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T convertFileToObj(Class<T> clazz, String xmlPath){
        try {
            JAXBContext context = JAXBContext.newInstance(clazz);
            // 进行将XML转成对象的核心接口
            Unmarshaller unmarshaller = context.createUnmarshaller();
           try(FileInputStream fis = new FileInputStream(xmlPath)){
               return (T) unmarshaller.unmarshal(fis);
           }catch (IOException e){
               throw new RuntimeException("XML文件读取失败", e);
           }
        } catch (JAXBException e) {
            throw new RuntimeException("XML转换成对象失败", e);
        }
    }
}
