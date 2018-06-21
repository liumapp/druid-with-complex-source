package com.liumapp.demo.mybatis.complex.api.db.testa.service;

import com.liumapp.demo.mybatis.complex.api.db.testa.domain.ShippingAddress;

/**
 * @author liumapp
 * @file ShippingAddressService.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/19/18
 */
public interface ShippingAddressService {

    int insert (ShippingAddress shippingAddress);

    ShippingAddress selectByUserId (Long userId);

}
