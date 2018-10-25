package com.dianchao.newmall.manager.service.impl;

import com.dianchao.newmall.common.bean.User;
import com.dianchao.newmall.manager.dao.UserDao;
import com.dianchao.newmall.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;


    public User queryLoginUser(User user) {
        return userDao.queryLoginUser(user);
    }
}
