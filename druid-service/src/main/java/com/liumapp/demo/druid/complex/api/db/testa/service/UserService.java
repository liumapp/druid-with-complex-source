package com.liumapp.demo.druid.complex.api.db.testa.service;

import com.liumapp.demo.druid.complex.api.db.testa.domain.User;

/**
 * @author liumapp
 * @file UserService.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/19/18
 */
public interface UserService {

    int insert (User user);

    User selectByPrimaryKey(Long userId);

}
