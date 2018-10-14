package com.dianchao.newmall.service.impl;

import com.dianchao.newmall.bean.User;
import com.dianchao.newmall.dao.UserDao;
import com.dianchao.newmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }
}
