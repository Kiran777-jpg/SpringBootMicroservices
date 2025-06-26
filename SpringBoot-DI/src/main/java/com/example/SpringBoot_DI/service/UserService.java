package com.example.SpringBoot_DI.service;

import com.example.SpringBoot_DI.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserService() {
        System.out.println("USerService:Constructor");
    }

    @Autowired
    public UserService(UserDao userDao) {
        System.out.println("USerService:Param Constructor");
        this.userDao = userDao;
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        System.out.println("USerService:Setter");
        this.userDao = userDao;
    }

    public void getName(int id) {
        String findName = userDao.findName(id);
        System.out.println("Name ::" + findName);
    }
}
