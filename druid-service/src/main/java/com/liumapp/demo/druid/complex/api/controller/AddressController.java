package com.liumapp.demo.druid.complex.api.controller;

import com.alibaba.fastjson.JSON;
import com.liumapp.demo.druid.complex.api.db.testa.domain.ShippingAddress;
import com.liumapp.demo.druid.complex.api.db.testa.service.ShippingAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liumapp
 * @file AddressController.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/19/18
 */
@RestController
@RequestMapping("address")
public class AddressController {

    @Autowired
    private ShippingAddressService shippingAddressService;

    @RequestMapping("/add")
    public String addAddress (@RequestBody ShippingAddress shippingAddress) {
        shippingAddressService.insert(shippingAddress);
        return JSON.toJSONString("success");
    }

}
