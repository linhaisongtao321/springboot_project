package com.lhst.springboot_project.util;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;

@Component
public class RestUtils {

//    private final static Logger logger= LoggerFactory.getLogger(RestUtils.class);
//
//    @Resource
//    private RestTemplate restTemplate;
//
//
//    public String postRequest(){
//        String url = "RemoteUrl" + "/id";
//        //设置Http的Header
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
//
//        //设置访问参数
//        HashMap<String, Object> params = new HashMap<>();
//        params.put("name", "name");
//
//        //设置访问的Entity
//        HttpEntity entity = new HttpEntity<>(params, headers);
//        ResponseEntity<String> result = null;
//        try {
//            //发起一个POST请求
//            result = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
//            JSONObject data = JSONObject.parseObject(result.getBody()).getJSONObject("data");
//            return data.getString("id");
//        } catch (Exception e) {
//            logger.error("获取id失败： " + e.getMessage());
//        }
//        return null;
//    }
}
