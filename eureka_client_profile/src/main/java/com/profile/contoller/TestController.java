package com.profile.contoller;

import com.profile.service.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
/**
 * @author lbs
 * @description 模拟控制器
 */
@RestController
public class TestController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderFeign orderFeign;

    @RequestMapping(value = "/test1")
    public String test1() {
        return restTemplate.getForObject("http://order-server/orderTest", String.class);
    }

    @RequestMapping(value = "/test2")
    public String test2() {
        return orderFeign.orderTest();
    }
}
