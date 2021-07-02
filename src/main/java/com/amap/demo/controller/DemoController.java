package com.amap.demo.controller;

import com.amap.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jiandong.xjd
 * @Description
 * @Date 2021/6/18 5:38 下午
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @ResponseBody
    @RequestMapping(value = "/helloWorld", method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWorld(@RequestParam(value = "name", required = false) String name) {

        return String.format("hello world %s.", name);
    }


    @ResponseBody
    @RequestMapping(value = "/getCache", method = {RequestMethod.GET, RequestMethod.POST})
    public String getCache(@RequestParam("key") String key) {
        return demoService.getCache(key);
    }

    @ResponseBody
    @RequestMapping(value = "/setCache", method = {RequestMethod.GET, RequestMethod.POST})
    public Boolean getCache(@RequestParam("key") String key,
                           @RequestParam("value") String value,
                           @RequestParam("expire") Integer expire) {
        return demoService.setCache(key, expire, value);
    }

    @ResponseBody
    @RequestMapping(value = "/getDemoTest", method = {RequestMethod.GET, RequestMethod.POST})
    public Integer getDemoTest() {
        return demoService.getDemoTest();
    }

}
