package com.example.SpringBoot_DI.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public UserDao() {
        System.out.println("UserDao::Constructor");
    }

    public String findName(int id) {

        if (id == 100) {
            return "John";
        } else {
            return "Smith";
        }
    }
}