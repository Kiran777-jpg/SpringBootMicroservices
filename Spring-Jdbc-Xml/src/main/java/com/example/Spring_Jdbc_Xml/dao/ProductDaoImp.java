package com.example.Spring_Jdbc_Xml.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class ProductDaoImp implements ProductDao{

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean save() {
        String sql = "insert into product values(3, 'Java Notes', 'Book', 1000)";
        jdbcTemplate.execute(sql);
        return true;
    }
}
