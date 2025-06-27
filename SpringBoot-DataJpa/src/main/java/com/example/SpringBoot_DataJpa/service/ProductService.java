package com.example.SpringBoot_DataJpa.service;

import com.example.SpringBoot_DataJpa.dao.ProductRepository;
import com.example.SpringBoot_DataJpa.entity.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void callCustomQueries() {

        List<Product> products = productRepository.getAllProductsHQL();
        products.forEach(System.out::println);

        Product product = productRepository.getProductById(1);
        System.out.println(product.getName());

        List<Product> productsSql = productRepository.getAllProductsSQL();
        productsSql.forEach(System.out::println);
    }

    public Product getProductById(int id) {
        Optional<Product> product = productRepository.findById(id);
        return product.get();
    }

    public Product getProductByName(String name) {
        Optional<Product> product = productRepository.findByName(name);
        return product.get();
    }

    public void getProductGreaterthanPrice(double price) {
        List<Product> products = productRepository.findByPriceGreaterThanEqual(price);
        products.forEach(System.out::println);
    }

    public void getEmps() {
        List<Product> products = productRepository.findAll();
        products.forEach(System.out::println);
    }

    public void getEmps(List<Integer> ids) {
        Iterable<Product> products = productRepository.findAllById(ids);
        products.forEach(e -> System.out.println(e));
    }

    public void getEmp(Integer id) {
        Optional<Product> findById = productRepository.findById(id);

        if (findById.isPresent()) {
            Product product = findById.get();
            System.out.println(product);
        } else {
            System.out.println("Record Not Found");
        }
    }

    public void saveEmps() {

        Product p1 = Product.getBuilder().setName("Book").setDescription("DSA").setPrice(900).build();
        Product p2 = Product.getBuilder().setName("Watch").setDescription("Time").setPrice(1500).build();

        List<Product> products = Arrays.asList(p1, p2);

        productRepository.saveAll(products);

        System.out.println("Records saved.....");
    }
}
