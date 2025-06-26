package com.example.Spring_Jdbc_Xml.service;

import com.example.Spring_Jdbc_Xml.dao.ProductDao;

public class ProductServiceImp implements ProductService{

    private ProductDao productDao;

    public ProductServiceImp(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void saveProduct() {
        boolean status = productDao.save();
        if (status) {
            System.out.println("Record Inserted...");
        } else {
            System.out.println("Insertion Failed...");
        }
    }
}
