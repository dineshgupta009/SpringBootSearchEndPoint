package com.SpringBootSearch.Service;

import com.SpringBootSearch.Entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> searchProduct(String query);

    Product createProduct(Product product);

}
