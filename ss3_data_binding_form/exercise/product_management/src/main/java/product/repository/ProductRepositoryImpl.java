package product.repository;

import org.springframework.stereotype.Repository;
import product.model.Product;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private static final List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Note 9 ", 1000, "ok", "SamSung"));
        productList.add(new Product(2, "Note 10 ", 1000, "ok", "SamSung"));
        productList.add(new Product(3, "oppo A12s", 1000, "ok", "Oppo"));
        productList.add(new Product(4, "Iphone 13 ", 1000, "ok", "Apple"));
        productList.add(new Product(5, "Iphone X ", 1000, "ok", "Apple"));
        productList.add(new Product(6, "Iphone 6 ", 1000, "ok", "Apple"));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void create(Product product) {
        productList.add(product);
    }

    @Override
    public void delete(int id) {
        for (Product item : productList) {
            if (item.getId() == id) {
                productList.remove(item);
            }
        }
    }

    @Override
    public Product findById(int id) {
        for (Product item : productList) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    @Override
    public void update(int id, Product product) {
        productList.add(id, product);
//        for (Product item : productList) {
//            if (item.getId() == id) {
//                productList.set(id,product);
//            }
//        }
    }

    @Override
    public List<Product> search(String nameProduct) {
        List<Product>productSearch = new ArrayList<>();
        for (Product item: productList) {
            if (item.getNameProduct().contains(nameProduct)){
                productSearch.add(item);
            }
        }
        return productSearch;
    }
}
