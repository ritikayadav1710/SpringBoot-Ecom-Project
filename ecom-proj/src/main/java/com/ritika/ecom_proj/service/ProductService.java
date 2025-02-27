package com.ritika.ecom_proj.service;

import com.ritika.ecom_proj.model.Product;
import com.ritika.ecom_proj.repo.ProductRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    @PostConstruct
    public void testDataLoading() {
        List<Product> products = repo.findAll();
        System.out.println("Products count: " + products.size());
        products.forEach(System.out::println);
    }

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

}
