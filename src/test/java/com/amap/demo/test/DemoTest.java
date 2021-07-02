package com.amap.demo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author jiandong.xjd
 * @Description
 * @Date 2021/6/18 3:58 下午
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations= "classpath*:/spring-config.xml")
public class DemoTest {

    @Test
    public void test() {

    }
}
