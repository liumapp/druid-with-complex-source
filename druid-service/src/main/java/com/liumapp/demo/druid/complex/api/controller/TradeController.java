package com.liumapp.demo.druid.complex.api.controller;

import com.alibaba.fastjson.JSON;
import com.liumapp.demo.druid.complex.api.db.testb.domain.Trade;
import com.liumapp.demo.druid.complex.api.db.testb.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liumapp
 * @file OrderController.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/19/18
 */
@RestController
@RequestMapping("trade")
public class TradeController {

    @Autowired
    private TradeService tradeService;

    @RequestMapping("/add")
    public String addOrder (@RequestBody Trade trade) {
        tradeService.insert(trade);
        return JSON.toJSONString(trade.getId());
    }

    @RequestMapping("/detail")
    public String getOrderDetail (@RequestBody Trade trade) {
        return JSON.toJSONString(tradeService.selectOrderDetail(trade));
    }

}
