package com.zmqx.hik.isapi.client.base;

import com.zmqx.iotdock.core.constants.ApiConstants;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName: {@link ApiBaseClient}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/12/11 16:58
 * @Describes
 */
public class ApiBaseClient {

    /**
     * 认证
     *
     * @param ip
     * @param username
     * @param password
     * @return
     * @throws IOException
     */
    public String auth(String ip, String username, String password) throws IOException {
        String requestUrl = ApiConstants.getRequestUrl(ip, ApiConstants.GET_SYSTEM_DEVICE_INFO);
        HttpClient client = new HttpClient();
        // 设置用户名和密码
        UsernamePasswordCredentials credentials = new UsernamePasswordCredentials("admin", "admin12345");
        client.getState().setCredentials(AuthScope.ANY, credentials);
        GetMethod method = new GetMethod(requestUrl);
        method.setDoAuthentication(true);
        int statusCode = client.executeMethod(method);
        byte[] responseData = method.getResponseBodyAsString().getBytes(method.getResponseCharSet());
        String strResponseData = new String(responseData, StandardCharsets.UTF_8);
        method.releaseConnection();
        return strResponseData;
    }
}
