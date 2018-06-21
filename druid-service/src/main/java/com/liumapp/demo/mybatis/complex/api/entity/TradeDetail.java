package com.liumapp.demo.mybatis.complex.api.entity;

import com.liumapp.demo.mybatis.complex.api.db.testa.domain.ShippingAddress;
import com.liumapp.demo.mybatis.complex.api.db.testa.domain.User;
import com.liumapp.demo.mybatis.complex.api.db.testb.domain.Trade;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author liumapp
 * @file TradeDetail.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/19/18
 */
public class TradeDetail implements Serializable {

    private Long orderId;

    private Long userId;

    private String name;

    private String products;

    private BigDecimal price;

    private String province;

    private String city;

    private String area;

    public TradeDetail() {

    }

    public TradeDetail(Trade trade, User user, ShippingAddress shippingAddress) {
        this.orderId = trade.getId();
        this.userId = user.getId();
        this.name = user.getName();
        this.products = trade.getProduct();
        this.price = trade.getPrice();
        this.province = shippingAddress.getProvince();
        this.city = shippingAddress.getCity();
        this.area = shippingAddress.getArea();
    }

    public TradeDetail(Long orderId, Long userId, String name, String products, BigDecimal price, String province, String city, String area) {
        this.orderId = orderId;
        this.userId = userId;
        this.name = name;
        this.products = products;
        this.price = price;
        this.province = province;
        this.city = city;
        this.area = area;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
