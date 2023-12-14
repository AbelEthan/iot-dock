package com.zmqx.hik.isapi.client.system;

import com.zmqx.hik.isapi.constants.ApiSystemConstant;
import com.zmqx.iotdock.core.util.RequestUtil;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName: {@link ApiSystemClient}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/12/14 15:42
 * @Describes
 */
public class ApiSystemClient {
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
        String requestUrl = RequestUtil.getRequestUrl(ip, ApiSystemConstant.GET_DEVICE_INFO);
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
