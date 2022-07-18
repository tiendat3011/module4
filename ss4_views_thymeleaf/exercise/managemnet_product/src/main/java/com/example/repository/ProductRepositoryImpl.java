package com.example.repository;

import com.example.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private static final List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Note 9 ", 1000, "ok", "SamSung"));
        productList.add(new Product(2, "Note 10 ", 1000, "ok", "SamSung"));
        productList.add(new Product(3, "oppo A12s", 1000, "ok", "Oppo"));
        productList.add(new Product(4, "iphone 13 ", 1000, "ok", "Apple"));
        productList.add(new Product(5, "iphone X ", 1000, "ok", "Apple"));
        productList.add(new Product(6, "iphone 6 ", 1000, "ok", "Apple"));
    }
    @Override
    public List<Product> getData() {
        return productList;
    }
}
