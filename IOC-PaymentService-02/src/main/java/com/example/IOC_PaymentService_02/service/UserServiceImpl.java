package com.example.IOC_PaymentService_02.service;

import com.example.IOC_PaymentService_02.dao.IUserDao;

public class UserServiceImpl implements UserService{

    private IUserDao userDao;

    public UserServiceImpl() {
        System.out.println("UserServiceImpl:Constructor");
    }

    public UserServiceImpl(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String getName(int id) {
        return userDao.findName(id);
    }
}
