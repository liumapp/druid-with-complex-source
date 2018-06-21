package com.liumapp.demo.druid.complex.api.controller;

import com.alibaba.fastjson.JSON;
import com.liumapp.demo.druid.complex.api.db.testa.domain.User;
import com.liumapp.demo.druid.complex.api.db.testa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liumapp
 * @file UserController.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/17/18
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public String addUser (@RequestBody User user) {
        userService.insert(user);
        return JSON.toJSONString(user.getId());
    }

}

