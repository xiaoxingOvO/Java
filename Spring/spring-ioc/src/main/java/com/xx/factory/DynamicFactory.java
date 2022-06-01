package com.xx.factory;

import com.xx.dao.UserDao;
import com.xx.dao.impl.UserDaoImpl;

public class DynamicFactory {

    public UserDao getUserDao(){
        return new UserDaoImpl();
    }

}
