package com.lhst.springboot_project.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

@Configuration
public class RedisUtil {
    @Resource
    private StringRedisTemplate redisTemplate;

    /**
     * 判断key是否存在
     * @param key 键
     * @return true 存在 false不存在
     */
    public Object get(String key) {
        try {
            return redisTemplate.opsForValue().get("token");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public Object put(String key,String data) {
        try {
            return redisTemplate.opsForValue().append(key,data);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public Boolean haskey(String key) {
        try {
            return redisTemplate.hasKey(key);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
