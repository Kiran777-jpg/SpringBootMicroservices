package com.example.SpringBoot_DataJpa.dao;

import com.example.SpringBoot_DataJpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("from Product")
    public List<Product> getAllProductsHQL();

    @Query("from Product where id=:id")
    public Product getProductById(Integer id);

    @Query(value = "select * from product", nativeQuery = true)
    public List<Product> getAllProductsSQL();

    public Optional<Product> findByName(String name);

    public List<Product> findByPriceGreaterThanEqual(Double price);
}
