package com.amap.demo.service;

import com.autonavi.socolframework.dynamicproperty.spring.DynamicValue;
import com.autonavi.socolframework.redis.JedisTemplate;
import com.taobao.hsf.app.spring.util.HSFSpringConsumerBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yucang.wzl
 * @Description
 * @Date 2021/6/18 5:42 下午
 */
@Service
public class DemoService {

    @Autowired
    private JedisTemplate jedisTemplate;


    @DynamicValue("${demo.test}")
    private Integer demoTest;

    public String getCache(String key) {
        return String.format("value:%s expire:%s", jedisTemplate.get(key), jedisTemplate.ttl(key));
    }

    public Boolean setCache(String key, Integer expire, String value) {
        return jedisTemplate.setex(key, expire, value);
    }

    public Integer getDemoTest() {
        return demoTest;
    }

}
