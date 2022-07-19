package product.service;

import product.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void create(Product product);

    void delete(int id);

    Product findById(int id);

    List<Product> search(String nameProduct);
}
