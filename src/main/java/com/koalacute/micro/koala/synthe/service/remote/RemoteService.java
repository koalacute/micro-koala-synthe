package com.koalacute.micro.koala.synthe.service.remote;

import com.koalacute.micro.koala.synthe.dto.FgSendMessageDto;
import com.koalacute.micro.koala.synthe.dto.response.FgResponse;
import com.koalacute.microkoala.utils.dto.HttpResponseNotOkException;
import com.koalacute.microkoala.utils.util.GsonUtils;
import com.koalacute.microkoala.utils.util.HttpClientUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class RemoteService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RemoteService.class);

    /**
     * 飞鸽-发送信息url
     */
    @Value("${fei.ge.url}")
    private String fgSendMessageUrl;

    private static final HttpClient client = HttpClients.createDefault();

    /**
     * 飞鸽-发送信息
     *
     * @param fgSendMessageDto
     * @return
     * @throws Exception
     */
    public FgResponse fgSendMessage(FgSendMessageDto fgSendMessageDto) throws Exception {
        String requestJson = GsonUtils.toJson(fgSendMessageDto);
        StringEntity entity = new StringEntity(requestJson, ContentType.APPLICATION_JSON);
        LOGGER.info("fgSendMessage-->request-->" + requestJson);
        String response = HttpClientUtils.getMethodPostResponse(fgSendMessageUrl, entity);
        LOGGER.info("fgSendMessage-->Response-->" + response);
        return GsonUtils.convertObj(response, FgResponse.class);
    }


    /**
     * 飞鸽-发送信息
     *
     * @param fgSendMessageDto
     * @return
     * @throws Exception
     */
    public FgResponse fgSendMessageZs(FgSendMessageDto fgSendMessageDto) throws Exception {
        String requestJson = GsonUtils.toJson(fgSendMessageDto);
        LOGGER.info("fgSendMessage-->request-->" + requestJson);
        HttpEntity entity = getHttpEntity(fgSendMessageDto);
        String response = new String(HttpClientUtils.convertEntityToBytes(entity), "utf-8");
        LOGGER.info("fgSendMessage-->Response-->" + response);
        return GsonUtils.convertObj(response, FgResponse.class);
    }

    /**
     * 获取请求体
     */
    private HttpEntity getHttpEntity(FgSendMessageDto fgSendMessageDto) throws IOException {
        HttpPost post = new HttpPost(fgSendMessageUrl);
        List<NameValuePair> formList = new ArrayList<>();
        formList.add(new BasicNameValuePair("secret", fgSendMessageDto.getSecret()));
        formList.add(new BasicNameValuePair("app_key", fgSendMessageDto.getAppKey()));
        formList.add(new BasicNameValuePair("template_id", fgSendMessageDto.getTemplateId()));
        formList.add(new BasicNameValuePair("data", GsonUtils.toJson(fgSendMessageDto.getData())));
        formList.add(new BasicNameValuePair("url", fgSendMessageDto.getUrl()));
        post.setEntity(new UrlEncodedFormEntity(formList, "utf-8"));
        HttpResponse response = client.execute(post);
        if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
            int code = response.getStatusLine().getStatusCode();
            throw new HttpResponseNotOkException(String.valueOf(code), "HttpPost Request Access Fail Return Code(" + code + ")");
        }
        HttpEntity entity = response.getEntity();
        if (entity == null) {
            throw new RuntimeException("HttpPost Request Access Fail Response Entity Is null");
        }
        return entity;
    }

}
