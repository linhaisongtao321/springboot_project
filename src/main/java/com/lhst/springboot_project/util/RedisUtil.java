package com.lhst.springboot_project.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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
            return redisTemplate.opsForValue().get(key);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void put(String key,String data) {
        try {
            redisTemplate.opsForValue().set(key,data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void put(String key,String data,Long time) {
        try {
             redisTemplate.opsForValue().set(key,data,time, TimeUnit.MINUTES);
        } catch (Exception e) {
            e.printStackTrace();
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

    public Boolean remove(String key) {
        try {
            return redisTemplate.delete(key);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Set<String> getAllKeys(){
        return redisTemplate.keys("*");
    }

}
