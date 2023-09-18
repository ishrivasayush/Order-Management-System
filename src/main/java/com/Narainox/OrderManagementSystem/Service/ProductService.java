package com.Narainox.OrderManagementSystem.Service;

import com.Narainox.OrderManagementSystem.Model.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);
    Product deleteProduct(Integer productId);
    Product updateProduct(Product product,Integer productId);
    Product viewProduct(Integer productId);
    List<Product> viewAllProduct();

}
