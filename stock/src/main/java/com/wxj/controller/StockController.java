package com.wxj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {


    @RequestMapping("/reduce")
    public String reduce(){
        return "库存-1";
    }
}
