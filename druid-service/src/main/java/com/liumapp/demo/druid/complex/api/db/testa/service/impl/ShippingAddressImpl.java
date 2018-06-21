package com.liumapp.demo.druid.complex.api.db.testa.service.impl;

import com.liumapp.demo.druid.complex.api.db.testa.domain.ShippingAddress;
import com.liumapp.demo.druid.complex.api.db.testa.domain.ShippingAddressExample;
import com.liumapp.demo.druid.complex.api.db.testa.mapper.ShippingAddressMapper;
import com.liumapp.demo.druid.complex.api.db.testa.service.ShippingAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liumapp
 * @file ShippingAddressImpl.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/19/18
 */
@Service
@Transactional
public class ShippingAddressImpl implements ShippingAddressService {

    @Autowired
    private ShippingAddressMapper shippingAddressMapper;

    @Override
    public int insert(ShippingAddress shippingAddress) {
        return shippingAddressMapper.insert(shippingAddress);
    }

    @Override
    public ShippingAddress selectByUserId(Long userId) {
        ShippingAddressExample example = new ShippingAddressExample();
        ShippingAddressExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userId);
        return shippingAddressMapper.selectByExample(example).get(0);
    }
}
