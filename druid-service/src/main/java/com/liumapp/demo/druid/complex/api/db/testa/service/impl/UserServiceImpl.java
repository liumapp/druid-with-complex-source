package com.liumapp.demo.druid.complex.api.db.testa.service.impl;

import com.liumapp.demo.druid.complex.api.db.testa.domain.User;
import com.liumapp.demo.druid.complex.api.db.testa.mapper.UserMapper;
import com.liumapp.demo.druid.complex.api.db.testa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liumapp
 * @file UserServiceImpl.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/19/18
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User selectByPrimaryKey(Long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

}
