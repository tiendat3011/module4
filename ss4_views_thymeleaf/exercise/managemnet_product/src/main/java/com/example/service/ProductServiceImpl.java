package com.example.service;

import com.example.model.Product;
import com.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

   @Autowired
   private ProductRepository productRepository;

   private List<Product> productList = new ArrayList<>();

    @Override
    public List<Product> findAll() {
        return productList=productRepository.getData();
    }

    @Override
    public void create(Product product) {
        productList.add(product);
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
                break;
            }
        }
    }

    @Override
    public Product findById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void update(int id, Product product) {

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.set(i, product);
                break;
            }
        }
    }

    @Override
    public List<Product> search(String nameProduct) {
        List<Product> productSearch = new ArrayList<>();

        for (Product product : productList) {
            if (product.getNameProduct().contains(nameProduct)) {
                productSearch.add(product);
            }
        }
        return productSearch;
    }
}