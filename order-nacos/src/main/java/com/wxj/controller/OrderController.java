package com.wxj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Value("${server.port}")
    private String port;

    @Autowired
    private RestTemplate restTemplate;
    public String add(){
        String msg = restTemplate.getForObject("http://stock-service/stock/reduce", String.class);
        return "订单+1"+"---"+msg+"----"+port;
    }
}
