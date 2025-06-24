package com.example.IOC_PaymentService_02.dao;

public class UserDaoImpl implements IUserDao{

    public UserDaoImpl() {
        System.out.println("UserDaoImpl::Constructor");
    }

    @Override
    public String findName(int id) {
        if(id == 1) {
            return "John";
        }
        else {
            return "paul";
        }
    }
}
