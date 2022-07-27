package com.example.cart.service;

import com.example.cart.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product findById(int id);
}

