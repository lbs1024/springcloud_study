package com.profile.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lbs
 * @description 业务层借口
 */
@Service
@FeignClient(value = "order-server")
public interface OrderFeign {
    @RequestMapping("/orderTest")
    public String orderTest();
}
