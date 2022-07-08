package com.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lbs
 * @description 控制器层
 */
@RestController
public class OrderController {

    @RequestMapping(value = "/orderTest")
    public String orderTest() {
        return "this is order!";
    }
}
