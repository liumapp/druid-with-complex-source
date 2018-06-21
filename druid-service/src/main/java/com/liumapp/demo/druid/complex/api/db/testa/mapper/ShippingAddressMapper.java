package com.liumapp.demo.druid.complex.api.db.testa.mapper;

import com.liumapp.demo.druid.complex.api.db.testa.domain.ShippingAddressExample;
import com.liumapp.demo.druid.complex.api.db.testa.domain.ShippingAddress;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShippingAddressMapper {
    long countByExample(ShippingAddressExample example);

    int deleteByExample(ShippingAddressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ShippingAddress record);

    int insertSelective(ShippingAddress record);

    List<ShippingAddress> selectByExample(ShippingAddressExample example);

    ShippingAddress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ShippingAddress record, @Param("example") ShippingAddressExample example);

    int updateByExample(@Param("record") ShippingAddress record, @Param("example") ShippingAddressExample example);

    int updateByPrimaryKeySelective(ShippingAddress record);

    int updateByPrimaryKey(ShippingAddress record);
}