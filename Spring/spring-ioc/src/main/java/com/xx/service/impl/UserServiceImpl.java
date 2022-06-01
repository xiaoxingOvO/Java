package com.xx.service.impl;

import com.xx.dao.UserDao;
import com.xx.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    /*public void setUserDao(UserDao userDao) {
                this.userDao = userDao;
            }*/
    public void save() {
        userDao.save();
    }
}
